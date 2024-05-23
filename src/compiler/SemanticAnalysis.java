import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import types.*;

@SuppressWarnings("CheckReturnValue")
public class SemanticAnalysis extends pdrawBaseVisitor<Boolean> {

  private final Map<String, Symbol> symbolTable = new HashMap<>();

  @Override
  public Boolean visitMain(pdrawParser.MainContext ctx) {
    for (pdrawParser.StatementContext statementContext : ctx.statement()) {
      if (!visit(statementContext)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Boolean visitStatement(pdrawParser.StatementContext ctx) {
    Boolean res = visit(ctx.getChild(0));
    return res;
  }

  @Override
  public Boolean visitInstructionMoveAction(
    pdrawParser.InstructionMoveActionContext ctx
  ) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitInstructionPenAction(
    pdrawParser.InstructionPenActionContext ctx
  ) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitAssignmentVar(pdrawParser.AssignmentVarContext ctx) {
    Boolean res = false;
    String type = ctx.Type().getText();
    String name = ctx.variable().getText();
    String valueStr = ctx.expression().getText();
    Object value = null;

    try {
      switch (type) {
        case "int":
          value = Integer.parseInt(valueStr);
          break;
        case "real":
          value = Double.parseDouble(valueStr);
          break;
        case "string":
          value = valueStr;
          break;
        case "bool":
          value = Boolean.parseBoolean(valueStr);
          break;
        default:
          throw new IllegalArgumentException(
            String.format("Unsupported type: %s", type)
          );
      }
    } catch (NumberFormatException e) {
      ErrorHandling.printError(
        ctx,
        String.format(
          "Variable %s has wrong type. Expected %s but got value %s",
          name,
          type,
          valueStr
        )
      );
      return res;
    } catch (IllegalArgumentException e) {
      ErrorHandling.printError(ctx, e.getMessage());
      return res;
    }

    System.out.println(type + " " + name + " " + value);

    if (!symbolTable.containsKey(name)) {
      if (!isTypeMatching(value, type)) {
        res = false;
        ErrorHandling.printError(
          ctx,
          String.format(
            "Variable %s has wrong type. Expected %s, got %s",
            name,
            type,
            value != null ? value.getClass().getSimpleName() : "null"
          )
        );
      } else {
        symbolTable.put(name, new Symbol(createType(type), name));
        res = true;
      }
    } else {
      res = false;
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s already defined", name)
      );
    }

    return res;
  }

  // our made not antlr
  private boolean isTypeMatching(Object value, String type) {
    return switch (type.toLowerCase()) {
      case "int" -> value instanceof Integer;
      case "real" -> value instanceof Double;
      case "string" -> value instanceof String;
      case "bool" -> value instanceof Boolean;
      default -> false;
    };
  }

  // our made not antlr
  private Type createType(String type) {
    switch (type.toLowerCase()) {
      case "int":
        return new IntType();
      case "real":
        return new RealType();
      case "string":
        return new StringType();
      case "bool":
        return new BoolType();
      default:
        throw new IllegalArgumentException(
          String.format("Unsupported type: %s", type)
        );
    }
  }

  @Override
  public Boolean visitAssignmentPen(pdrawParser.AssignmentPenContext ctx) {
    String name = ctx.object().getText();
    Boolean res = symbolTable.containsKey(name);

    if (res) {
      if (!(symbolTable.get(name).getName().equals("pen"))) {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a pen", name)
        );
      } else {
        // object: 'pen' variable '=' 'new' variable?;
        res = visit((ParseTree) ctx.object().variable()); // had to cast, dont know if this is the way
      }
    } else {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s not defined", name)
      );
    }
    return res;
  }

  @Override
  public Boolean visitReAssignmentVar(pdrawParser.ReAssignmentVarContext ctx) {
    Boolean res = false;
    String name = ctx.variable().getText();
    String valueStr = ctx.expression().getText();

    if (symbolTable.containsKey(name)) {
      Symbol symbol = symbolTable.get(name);
      String type = symbol.getType().toString();
      Object value = null;

      try {
        switch (type.toLowerCase()) {
          case "int":
            value = Integer.parseInt(valueStr);
            break;
          case "real":
            System.out.println(valueStr + "pila");
            value = Double.parseDouble(valueStr);
            break;
          case "string":
            value = valueStr;
            break;
          case "bool":
            value = Boolean.parseBoolean(valueStr);
            break;
          default:
            ErrorHandling.printError(
              ctx,
              String.format("Unsupported type: %s", type)
            );
        }
      } catch (NumberFormatException e) {
        ErrorHandling.printError(
          ctx,
          String.format(
            "Variable %s has wrong type. Expected %s but got value %s",
            name,
            type,
            valueStr
          )
        );
        return res;
      }

      if (isTypeMatching(value, type)) {
        // Update the value in the symbol table (assuming Symbol class has a setValue method)
        symbol.setValue(value);
        res = true;
      } else {
        ErrorHandling.printError(
          ctx,
          String.format(
            "Variable %s has wrong type. Expected %s, got %s",
            name,
            type,
            value != null ? value.getClass().getSimpleName() : "null"
          )
        );
      }
    } else {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is not defined", name)
      );
    }

    return res;
  }

  @Override
  public Boolean visitCast(pdrawParser.CastContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitPause(pdrawParser.PauseContext ctx) {
    try {
      Integer.parseInt(ctx.INT().getText());
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  @Override
  public Boolean visitStdout(pdrawParser.StdoutContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitStderr(pdrawParser.StderrContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExecute(pdrawParser.ExecuteContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitCreateCanvas(pdrawParser.CreateCanvasContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitCreatePen(pdrawParser.CreatePenContext ctx) {
    Boolean res = false;
    String penTAD = ctx.variable().getText();
    List<pdrawParser.ClassPropsContext> props = ctx.classProps();
    if (!symbolTable.containsKey(penTAD)) {
      if (/*symbolTable.get(penTAD).getType() instanceof PenTAD*/true) {
        for (pdrawParser.ClassPropsContext prop : props) {
          if (!visit(prop)) {
            return false;
          }
        }
        return true;
      } else {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a pen", penTAD)
        );
      }
    } else {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s not defined", penTAD)
      );
    }
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitClassProps(pdrawParser.ClassPropsContext ctx) {
    Boolean res = false;
    System.out.println(
      ctx.getText() +
      ctx.HexaColor() +
      " " +
      ctx.Word() +
      " " +
      ctx.expression() +
      " " +
      ctx.tuple() +
      " " +
      ctx.angle() +
      "PILA\n"
    );
    String prop = ctx.getText().split("=")[0].trim();
    switch (prop) {
      case "color":
        // TODO check if it's a color
        return true;

        break;
      case "position":
        // TODO check if it's a position

        break;
      case "orientation":
        // TODO check if it's an orientation

        break;
      case "thickness":
        // TODO check if it's a thickness
        break;
      case "pressure":
        // TODO check if it's a pressure

        break;
      default:
        break;
    }
    // possible props
    // color, position, orientation, thickness, pressure

    return visitChildren(ctx); //TODO see if we should visit variable
    // we can visit tuple, expression, or angle
    // return res;
  }

  @Override
  public Boolean visitObject(pdrawParser.ObjectContext ctx) {
    Boolean res = false;
    String[] vars = new String[ctx.getChildCount()];
    // for( pdrawParser.VariableContext var: ctx.variable()) {
    // };
    for (int i = 0; i < ctx.getChildCount(); i++) {
      vars[i] = ((pdrawParser.VariableContext) ctx.getChild(i)).getText(); // this was harder to get
    }
    System.out.println(vars);

    return false;
    // return res;
  }

  @Override
  public Boolean visitVariable(pdrawParser.VariableContext ctx) {
    Boolean res = false;
    ctx.getText();
    return false;
    // return res;
  }

  @Override
  public Boolean visitExprAddSub(pdrawParser.ExprAddSubContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprPow(pdrawParser.ExprPowContext ctx) {
    Boolean res = false;

    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprCast(pdrawParser.ExprCastContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprParent(pdrawParser.ExprParentContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprUnary(pdrawParser.ExprUnaryContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprFloat(pdrawParser.ExprFloatContext ctx) {
    Boolean res = true;
    FloatType x = (FloatType) ctx.FLOAT();
    new Symbol(new FloatType(), x.toString());
    return res;
  }

  @Override
  public Boolean visitExprStdIn(pdrawParser.ExprStdInContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprInteger(pdrawParser.ExprIntegerContext ctx) {
    Boolean res = true;
    IntType x = (IntType) ctx.INT();
    new Symbol(new IntType(), x.toString());
    return res;
  }

  @Override
  public Boolean visitExprString(pdrawParser.ExprStringContext ctx) {
    Boolean res = true;
    StringType x = (StringType) ctx.String();
    new Symbol(new StringType(), x.toString());
    return res;
  }

  @Override
  public Boolean visitExprId(pdrawParser.ExprIdContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitStdin(pdrawParser.StdinContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitTuple(pdrawParser.TupleContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitDegree(pdrawParser.DegreeContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitRadian(pdrawParser.RadianContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitForward(pdrawParser.ForwardContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitBackward(pdrawParser.BackwardContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitLeft(pdrawParser.LeftContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitRight(pdrawParser.RightContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitDown(pdrawParser.DownContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitUp(pdrawParser.UpContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitTypeCast(pdrawParser.TypeCastContext ctx) {
    Boolean res = false;
    return visitChildren(ctx);
    // return res;
  }
}
