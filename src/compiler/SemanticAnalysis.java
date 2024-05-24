import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.Token;
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
    pdrawParser.ExpressionContext expressionCtx = ctx.expression();

    Boolean expressionResult = visit(expressionCtx);

    if (!expressionResult) {
      ErrorHandling.printError(ctx, "Expression is not valid");
      return false;
    }
    if (!symbolTable.containsKey(name)) {
      System.out.println(
        expressionCtx.symbol.getType().toString() + " " + type
      );
      if (!expressionCtx.symbol.getType().toString().equals(type)) {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not of type %s. ", name, type)
        );
        return false;
      } else {
        System.out.println(createType(type).toString());
        symbolTable.put(name, new Symbol(createType(type), name));
        return true;
      }
    } else {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s already defined", name)
      );
      return false;
    }
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

    if (!symbolTable.containsKey(name)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s not defined", name)
      );
      return false;
    } else {
      pdrawParser.ExpressionContext expressionCtx = ctx.expression();
      Boolean expressionResult = visit(expressionCtx);
      if (!expressionResult) {
        ErrorHandling.printError(ctx, "Expression is not valid");
        return false;
      }
      return true;
    }
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

    String prop = ctx.getText().split("=")[0].trim();
    switch (prop) {
      case "color":
        // TODO check if it's a color
        break;
      case "position":
        // TODO check if it's a position
        return visitTuple(ctx.tuple());
      case "orientation":
        // TODO check if it's an orientation
        return visit(ctx.angle());
      case "thickness":
        // TODO check if it's a thickness
        return visit(ctx.expression());
      case "pressure":
        // TODO check if it's a pressure
        return visit(ctx.expression());
      default:
        break;
    }
    // possible props
    return res;
    //return visitChildren(ctx); //TODO see if we should visit variable
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
    // para verficar se a conta da para fazer ele nao pode aceitar string+string
    // por exemplo

    Boolean leftResult = visit(ctx.expression(0));
    Boolean rightResult = visit(ctx.expression(1));

    if (!leftResult || !rightResult) {
      ErrorHandling.printError(
        ctx,
        String.format(
          "Expression %s or %s are not valid",
          ctx.expression(0).getText(),
          ctx.expression(1).getText()
        )
      ); // TODO improve this
      return false;
    }
    pdrawParser.ExpressionContext left_ctx = ctx.expression(0);
    pdrawParser.ExpressionContext right_ctx = ctx.expression(1);
    String left = left_ctx.getText();
    String right = right_ctx.getText();

    // preciso de saber se é uma variavel ou nao
    if (symbolTable.containsKey(left)) {
      // TODO: fazer verificação de tipos
      Type leftType = symbolTable.get(left).getType();
      if (!leftType.isNumeric()) {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a number", left)
        );
        return false;
      }
    }
    if (symbolTable.containsKey(right)) {
      // TODO: fazer verificação de tipos
      Type rightType = symbolTable.get(right).getType();
      if (!rightType.isNumeric()) {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a number", right)
        );
        return false;
      }
    }
    // ja verifico as variaveis agora significa que passaram pelo if e se nao for variavel?
    // tenho de ver o seu tipo
    if (
      left_ctx.symbol.getType().isNumeric() &&
      right_ctx.symbol.getType().isNumeric()
    ) {
      ctx.symbol = new Symbol(left_ctx.symbol.getType(), left); // o da esquerda define o tipo final
      return true;
    } else {
      ErrorHandling.printError(
        ctx,
        String.format(
          "Expression %s or %s are not valid",
          ctx.expression(0).getText(),
          ctx.expression(1).getText()
        )
      ); // TODO improve this
      return false;
    }
  }

  @Override
  public Boolean visitExprPow(pdrawParser.ExprPowContext ctx) {
    Boolean baseResult = visit(ctx.expression(0)); // Base
    Boolean exponentResult = visit(ctx.expression(1)); // Expoente

    // Verificação semântica para operações de potência
    if (!baseResult || !exponentResult) {
      return false; // Se algum dos operandos for inválido, retorne false
    }

    return true; // Se a verificação for bem-sucedida, retorne true
  }

  @Override
  public Boolean visitExprCast(pdrawParser.ExprCastContext ctx) {
    Boolean res = false;

    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprParent(pdrawParser.ExprParentContext ctx) {
    Boolean res = visit(ctx.expression());
    ctx.symbol = ctx.expression().symbol;
    return res;
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
    String x = ctx.FLOAT().getText();
    ctx.symbol = new Symbol(new RealType(), x);
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
    String x = ctx.INT().getText();
    ctx.symbol = new Symbol(new IntType(), x.toString());
    return res;
  }

  @Override
  public Boolean visitExprString(pdrawParser.ExprStringContext ctx) {
    Boolean res = true;
    String x = ctx.String().getText();
    ctx.symbol = new Symbol(new StringType(), (x)); // TODO this should be a random string
    return res;
  }

  @Override
  public Boolean visitExprBool(pdrawParser.ExprBoolContext ctx) {
    Boolean res = true;
    String x = ctx.BOOL().getText();
    ctx.symbol = new Symbol(new BoolType(), (x)); // TODO this should be a random string
    return res;
  }

  @Override
  public Boolean visitExprVariable(pdrawParser.ExprVariableContext ctx) {
    System.out.println("PILA");
    Boolean res = true;
    if (!symbolTable.containsKey(ctx.getText())) {
      return false;
    }
    ctx.symbol = symbolTable.get(ctx.getText()); // TODO this should be a random string
    return res;
  }

  public Boolean visitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx) {
    Boolean leftResult = visit(ctx.expression(0));
    Boolean rightResult = visit(ctx.expression(1));

    if (!leftResult || !rightResult) {
      ErrorHandling.printError(
        ctx,
        String.format(
          "Expression %s or %s are not valid",
          ctx.expression(0).getText(),
          ctx.expression(1).getText()
        )
      ); // TODO improve this
      return false;
    }
    pdrawParser.ExpressionContext left_ctx = ctx.expression(0);
    pdrawParser.ExpressionContext right_ctx = ctx.expression(1);
    String left = left_ctx.getText();
    String right = right_ctx.getText();

    // preciso de saber se é uma variavel ou nao
    if (symbolTable.containsKey(left)) {
      // TODO: fazer verificação de tipos
      Type leftType = symbolTable.get(left).getType();
      if (!leftType.isNumeric()) {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a number", left)
        );
        return false;
      }
    }
    if (symbolTable.containsKey(right)) {
      // TODO: fazer verificação de tipos
      Type rightType = symbolTable.get(right).getType();
      if (!rightType.isNumeric()) {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a number", right)
        );
        return false;
      }
    }
    // ja verifico as variaveis agora significa que passaram pelo if e se nao for variavel?
    // tenho de ver o seu tipo
    if (
      left_ctx.symbol.getType().isNumeric() &&
      right_ctx.symbol.getType().isNumeric()
    ) {
      if (ctx.op.getText() == "/") {
        ctx.symbol = new Symbol(new RealType(), left); // o da esquerda define o tipo final
      } else ctx.symbol = new Symbol(left_ctx.symbol.getType(), left); // o da esquerda define o tipo final
      return true;
    } else {
      ErrorHandling.printError(
        ctx,
        String.format(
          "Expression %s or %s are not valid",
          ctx.expression(0).getText(),
          ctx.expression(1).getText()
        )
      ); // TODO improve this
      return false;
    }
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

    if (visitChildren(ctx)) {
      return true;
    } else {
      ErrorHandling.printError(ctx, "Tuple has errors");
      return false;
    }
    // return visitChildren(ctx);
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
