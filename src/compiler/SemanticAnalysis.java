import java.util.HashMap;
import java.util.Iterator;
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
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitInstructionPenAction(
    pdrawParser.InstructionPenActionContext ctx
  ) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitAssignmentVar(pdrawParser.AssignmentVarContext ctx) {
    Boolean res = null;

    String type = ctx.Type().getText();
    String name = ctx.variable().getText();
    String value = ctx.expression().getText(); // desnecessario para o analisador

    if (!symbolTable.containsKey(name)) {
      if (!value.getClass().getSimpleName().equals(type)) {
        res = false;
        ErrorHandling.printError(
          ctx,
          String.format(
            "Variable %s has wrong type. Expected %s, got %s",
            name,
            type,
            value.getClass().getSimpleName()
          )
        );
        // o tipo bate certo?
        //
      } else {
        switch (type) {
          case "int":
            symbolTable.put(name, new Symbol(new IntType(), name));
            break;
          case "real":
            symbolTable.put(name, new Symbol(new RealType(), name));
            break;
          case "string":
            symbolTable.put(name, new Symbol(new StringType(), name));
            break;
          case "bool":
            symbolTable.put(name, new Symbol(new BoolType(), name));
            break;
          default:
            // TODO: throw exception

            break;
        }
      }
    } else {
      res = false;
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s already defined", name)
      );
    }
    return visitChildren(ctx);
    // return res;
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
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitCast(pdrawParser.CastContext ctx) {
    Boolean res = null;
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
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitStderr(pdrawParser.StderrContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExecute(pdrawParser.ExecuteContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitCreateCanvas(pdrawParser.CreateCanvasContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitCreatePen(pdrawParser.CreatePenContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitClassProps(pdrawParser.ClassPropsContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitObject(pdrawParser.ObjectContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitVariable(pdrawParser.VariableContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprAddSub(pdrawParser.ExprAddSubContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprPow(pdrawParser.ExprPowContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprCast(pdrawParser.ExprCastContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprParent(pdrawParser.ExprParentContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprUnary(pdrawParser.ExprUnaryContext ctx) {
    Boolean res = null;
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
    Boolean res = null;
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
  public Boolean visitExprId(pdrawParser.ExprIdContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitStdin(pdrawParser.StdinContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitTuple(pdrawParser.TupleContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitDegree(pdrawParser.DegreeContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitRadian(pdrawParser.RadianContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitForward(pdrawParser.ForwardContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitBackward(pdrawParser.BackwardContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitLeft(pdrawParser.LeftContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitRight(pdrawParser.RightContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitDown(pdrawParser.DownContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitUp(pdrawParser.UpContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public Boolean visitTypeCast(pdrawParser.TypeCastContext ctx) {
    Boolean res = null;
    return visitChildren(ctx);
    // return res;
  }
}
