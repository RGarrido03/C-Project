import com.sun.tools.javac.Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import types.BoolType;
import types.IntType;
import types.RealType;
import types.StringType;

@SuppressWarnings("CheckReturnValue")
public class Compiler extends pdrawBaseVisitor<ST> {

  private final STGroup classTemplate = new STGroupFile("st/Class.stg");
  private final STGroup elementsTemplate = new STGroupFile("st/Elements.stg");
  private final STGroup pdrawTemplate = new STGroupFile("st/pdraw.stg");

  @Override
  public ST visitMain(pdrawParser.MainContext ctx) {
    ST main = pdrawTemplate.getInstanceOf("main");
    for (pdrawParser.StatementContext stat : ctx.statement()) {
      ST temp = visit(stat);
      List<?> myst = (List<?>) temp.getAttribute("something");
      // ver em cada elemento da lista se contem createPenAndCreateClass
      for (Object obj : myst) {
        if (obj != null) {
          String s = obj.toString();
          if (s.contains("createPenAndCreateClass")) {
            main.add("classes", obj);
          } else {
            main.add("statements", obj);
          }
        }
      }
    }

    return main;
  }

  @Override
  public ST visitStatement(pdrawParser.StatementContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("statement");
    for (int i = 0; i < ctx.getChildCount(); i++) {
      res.add("something", visit(ctx.getChild(i)));
    }
    // res.add("statement", visit(ctx.getChild(0)));
    return res;
    //return res;
  }

  @Override
  public ST visitInstructionMoveAction(
    pdrawParser.InstructionMoveActionContext ctx
  ) {
    System.out.println("VisitInstructionMoveAction");
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitInstructionPenAction(
    pdrawParser.InstructionPenActionContext ctx
  ) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitAssignmentVar(pdrawParser.AssignmentVarContext ctx) {
    ST assignment = pdrawTemplate.getInstanceOf("assignment");
    assignment.add("assignVar", "true");
    assignment.add("variable", ctx.variable().getText());
    assignment.add("expression", ctx.expression().getText());
    assignment.add("type", (parseType(ctx.Type().getText())));

    return assignment;
  }

  @Override
  public ST visitAssignmentPen(pdrawParser.AssignmentPenContext ctx) {
    ST res = null;

    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitReAssignmentVar(pdrawParser.ReAssignmentVarContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("assignment");
    res.add("reassignVar", "true");
    res.add("variable", ctx.variable().getText());
    res.add("expression", ctx.expression().getText());

    return res;
  }

  @Override
  public ST visitPause(pdrawParser.PauseContext ctx) {
    ST pause = pdrawTemplate.getInstanceOf("pause");
    int sec = Integer.parseInt(ctx.INT().getText());

    pause.add("seconds", sec);
    return pause;
  }

  @Override
  public ST visitStdout(pdrawParser.StdoutContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitStderr(pdrawParser.StderrContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExecute(pdrawParser.ExecuteContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitCreateCanvas(pdrawParser.CreateCanvasContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitCreatePen(pdrawParser.CreatePenContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("createPenAndCreateClass");
    ArrayList<String> classProps = new ArrayList<>();
    for (pdrawParser.ClassPropsContext prop : ctx.classProps()) {
      classProps.add(prop.getText());
    }
    res.add("className", ctx.variable().getText());
    for (String value : classProps) {
      String propName = value.split("=")[0];
      value = value.split("=")[1].replace(";", "");
      switch (propName) {
        case "color":
          res.add("color", value);
          break;
        case "thickness":
          res.add("thickness", value);
          break;
        case "position":
          res.add("position", value);
          break;
        case "orientation":
          // TODO passar de graus para radianos

          res.add("orientation", value);
          break;
        default:
          break;
      }
    }

    // return visitChildren(ctx);
    return res;
  }

  @Override
  public ST visitClassProps(pdrawParser.ClassPropsContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitObject(pdrawParser.ObjectContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitVariable(pdrawParser.VariableContext ctx) {
    System.out.println("VisitVariable");
    ST res = pdrawTemplate.getInstanceOf("assignment");
    res.add("assgnVar", "true");
    res.add("variable", ctx.Word().getText());
    // res.add("type", visit(ctx.expression));
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprAddSub(pdrawParser.ExprAddSubContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprPow(pdrawParser.ExprPowContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprCast(pdrawParser.ExprCastContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprParent(pdrawParser.ExprParentContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprUnary(pdrawParser.ExprUnaryContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprFloat(pdrawParser.ExprFloatContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprStdIn(pdrawParser.ExprStdInContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprInteger(pdrawParser.ExprIntegerContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitStdin(pdrawParser.StdinContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitTuple(pdrawParser.TupleContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitDegree(pdrawParser.DegreeContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitRadian(pdrawParser.RadianContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitForward(pdrawParser.ForwardContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitBackward(pdrawParser.BackwardContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitLeft(pdrawParser.LeftContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitRight(pdrawParser.RightContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitDown(pdrawParser.DownContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitUp(pdrawParser.UpContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  @Override
  public ST visitTypeCast(pdrawParser.TypeCastContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    //return res;
  }

  private String parseType(String type) {
    return switch (type.toLowerCase()) {
      case "int" -> "int";
      case "real" -> "float";
      case "string" -> "str";
      case "bool" -> "bool";
      default -> "";
    };
  }
}
