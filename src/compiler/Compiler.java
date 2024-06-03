import java.util.ArrayList;
import java.util.List;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import types.RealType;
import types.Symbol;

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
      // ver em cada elemento da lista se contem createPenClass
      for (Object obj : myst) {
        if (obj != null) {
          String s = obj.toString();
          if (s.contains("createPenClass")) {
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
    // return res;
  }

  @Override
  public ST visitFunctionDefinition(pdrawParser.FunctionDefinitionContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public ST visitFunctionName(pdrawParser.FunctionNameContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public ST visitParameters(pdrawParser.ParametersContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public ST visitParameter(pdrawParser.ParameterContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public ST visitReturnStatement(pdrawParser.ReturnStatementContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public ST visitInstructionMoveRotateAction(
    pdrawParser.InstructionMoveRotateActionContext ctx
  ) {
    ST main = pdrawTemplate.getInstanceOf("instructionPipeline");

    for (int a = 1; a < ctx.children.size(); a++) {
      if (visit(ctx.children.get(a)).render().startsWith("time.sleep")) {
        main.add("statements", visit(ctx.children.get(a)).render());
        continue;
      }
      main.add(
        "statements",
        visit(ctx.variable()).render() + visit(ctx.children.get(a)).render()
      );
    }

    return main;
  }

  @Override
  public ST visitMove(pdrawParser.MoveContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("instruction");
    res.add("action", ctx.moveAction().getText());
    res.add("value", visit(ctx.expression()));
    return res;
  }

  @Override
  public ST visitWrite(pdrawParser.WriteContext ctx) {
    // write: 	'write' expression ',' expression;
    ST res = pdrawTemplate.getInstanceOf("instruction");
    res.add("action", "write");
    res.add("value", visit(ctx.expression(0)));
    res.add("fontsize", visit(ctx.expression(1)));
    return res;
  }

  @Override
  public ST visitAddOrSubPointToPen(pdrawParser.AddOrSubPointToPenContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("addOrSubPoint");
    res.add("variable", visit(ctx.variable(0)));
    if (ctx.op.getText().equals("+")) {
      res.add("value1", "add");
    } else {
      res.add("value1", "sub");
    }

    res.add("value2", visit(ctx.tuple()).render());

    return res;
  }

  @Override
  public ST visitRotate(pdrawParser.RotateContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("instruction");
    res.add("action", ctx.rotateAction().getText());

    if (ctx.angle() != null) {
      res.add("value", "math.degrees(" + visit(ctx.angle()).render() + ")");
    }
    return res;
  }

  @Override
  public ST visitInstructionPenAction(
    pdrawParser.InstructionPenActionContext ctx
  ) {
    ST res = pdrawTemplate.getInstanceOf("instruction");
    res.add("variable", visit(ctx.variable()));
    res.add("action", ctx.penAction().getText());
    return res;
  }

  @Override
  public ST visitInstructionArrowProps(
    pdrawParser.InstructionArrowPropsContext ctx
  ) {
    ST res = pdrawTemplate.getInstanceOf("arrowProps");
    res.add("variable", visit(ctx.variable()));
    res.add("value1", visit(ctx.arrowProps()));

    return res;
  }

  @Override
  public ST visitAssignmentVar(pdrawParser.AssignmentVarContext ctx) {
    ST assignment = pdrawTemplate.getInstanceOf("assignment");
    assignment.add("assignVar", "true");
    assignment.add("variable", visit(ctx.variable()));
    assignment.add("expression", visit(ctx.expression()));
    assignment.add("type", (parseType(ctx.Type().getText())));

    return assignment;
  }

  @Override
  public ST visitAssignmentMultipleVars(
    pdrawParser.AssignmentMultipleVarsContext ctx
  ) {
    String type = ctx.Type().getText();
    ST buffer = pdrawTemplate.getInstanceOf("other");
    System.out.println("VisitAssignmentMultipleVars");
    ArrayList<String> vars = new ArrayList<>();
    for (int i = 1; i < ctx.getChildCount(); i += 1) {
      if (ctx.getChild(i).getText().equals(",")) {
        continue;
      }
      // se o i for impar
      if (!(i % 2 == 0)) {
        vars.add(visit(ctx.getChild(i)).render());
      } else vars.add(ctx.getChild(i).getText());
    }

    for (int i = 0; i < vars.size(); i += 3) {
      ST res = pdrawTemplate.getInstanceOf("assignment");

      res.add("assignVar", "true");
      res.add("variable", vars.get(i));
      res.add("type", parseType(type));
      res.add("expression", vars.get(i + 2));

      buffer.add("text", res.render() + "\n");
    }
    return buffer;
  }

  @Override
  public ST visitAssignmentVarsNoValue(
    pdrawParser.AssignmentVarsNoValueContext ctx
  ) {
    String type = ctx.Type().getText();

    ST res = pdrawTemplate.getInstanceOf("assignment");
    System.out.println("VisitAssignmentVarNoValue");
    ArrayList<String> vars = new ArrayList<>();
    for (int i = 1; i < ctx.getChildCount(); i += 1) {
      if (ctx.getChild(i).getText().equals(",")) {
        continue;
      }
      // se o i for impar
      if (!(i % 2 == 0)) {
        vars.add(visit(ctx.getChild(i)).render());
      } else vars.add(ctx.getChild(i).getText());
    }

    for (int i = 0; i < vars.size(); i += 1) {
      res.add("assignVar", "true");
      res.add("variable", vars.get(i));
      res.add("expression", defaultType(type));

      res.add("type", parseType(type));
    }
    return res;
  }

  @Override
  public ST visitAssignmentPen(pdrawParser.AssignmentPenContext ctx) {
    ST res = null;

    return visitChildren(ctx);
    // return res;
  }

  @Override
  public ST visitSetCanvas(pdrawParser.SetCanvasContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("instructionCanvas");

    res.add("canvasName", visit(ctx.variable()));
    res.add("setActive", "true");

    return res;
  }

  @Override
  public ST visitReAssignmentVar(pdrawParser.ReAssignmentVarContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("assignment");
    res.add("reassignVar", "true");
    res.add("variable", visit(ctx.variable()));
    res.add("expression", visit(ctx.expression()));

    return res;
  }

  @Override
  public ST visitPause(pdrawParser.PauseContext ctx) {
    ST pause = pdrawTemplate.getInstanceOf("pause");
    int sec = Integer.parseInt(ctx.INT().getText());

    pause.add("INT", sec);
    return pause;
  }

  @Override
  public ST visitStdout(pdrawParser.StdoutContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("print");
    res.add("expression", visit(ctx.expression()));
    return res;
  }

  @Override
  public ST visitStderr(pdrawParser.StderrContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("print");
    res.add("stdErr", "true");
    res.add("expression", visit(ctx.expression()));
    return res;
  }

  @Override
  public ST visitExecute(pdrawParser.ExecuteContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public ST visitCreateCanvas(pdrawParser.CreateCanvasContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("createCanvasClass");
    res.add("canvasName", visit(ctx.variable()));
    //TODO STring title can dar asneira
    res.add("title", ctx.STRING().getText());
    if (ctx.tuple() != null) {
      res.add("tuple", visit(ctx.tuple()));
    }
    return res;
  }

  @Override
  public ST visitBackgroundCanvas(pdrawParser.BackgroundCanvasContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("instructionCanvas");
    res.add("canvasName", visit(ctx.variable()));
    if (ctx.HexaColor() != null) {
      res.add("color", ctx.HexaColor().getText());
    } else res.add("color", ctx.Word().getText());

    return res;
  }

  @Override
  public ST visitCreatePen(pdrawParser.CreatePenContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("createPenClass");
    res.add("className", visit(ctx.variable()));
    ctx.classProps().forEach(prop -> res.add("classProps", visit(prop)));
    return res;
  }

  @Override
  public ST visitClassProps(pdrawParser.ClassPropsContext ctx) {
    ST res = classTemplate.getInstanceOf("classProps");
    res.add("prop", ctx.getText().split("=")[0]);
    if (ctx.expression() != null) {
      res.add("expression", visit(ctx.expression()));
    }
    if (ctx.HexaColor() != null) {
      res.add("expression", "\"" + ctx.HexaColor().getText() + "\"");
    }
    if (ctx.angle() != null) {
      res.add("expression", visit(ctx.angle()));
    }
    if (ctx.Word() != null) {
      res.add("expression", "\"" + ctx.Word().getText() + "\"");
    }
    if (ctx.tuple() != null) {
      res.add("expression", visit(ctx.tuple()));
    }
    return res;
  }

  @Override
  public ST visitArrowProps(pdrawParser.ArrowPropsContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    if (ctx.expression() != null) {
      res.add(
        "text",
        ctx.op.getText() + "(" + visit(ctx.expression()).render() + ")"
      );
    } else if (ctx.angle() != null) {
      res.add(
        "text",
        ctx.op.getText() + "(" + visit(ctx.angle()).render() + ")"
      );
    } else if (ctx.tuple() != null) {
      res.add(
        "text",
        ctx.op.getText() + "(" + visit(ctx.tuple()).render() + ")"
      );
    } else if (ctx.Word() != null) {
      res.add("text", ctx.op.getText() + "(\"" + ctx.Word().getText() + "\")");
    } else res.add(
      "text",
      ctx.op.getText() + "(" + visit(ctx.HexaColor()).render() + ")"
    );

    return res;
  }

  @Override
  public ST visitObject(pdrawParser.ObjectContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("object");
    res.add("variable", visit(ctx.variable(0)));

    if (ctx.variable(1) != null) res.add("penType", visit(ctx.variable(1)));
    return res;
  }

  @Override
  public ST visitVariable(pdrawParser.VariableContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    if (ctx.Name() == null) {
      res.add("text", ctx.Word().getText() + "__");
      return res;
    }
    res.add("text", ctx.Name().getText() + "__");
    return res;
  }

  @Override
  public ST visitExprCast(pdrawParser.ExprCastContext ctx) {
    return visit(ctx.typeCast());
  }

  @Override
  public ST visitExprIncDec(pdrawParser.ExprIncDecContext ctx) {
    return visit(ctx.incdec());
  }

  @Override
  public ST visitExprParent(pdrawParser.ExprParentContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("parent");
    res.add("expression", visit(ctx.expression()));
    return res;
  }

  @Override
  public ST visitExprUnary(pdrawParser.ExprUnaryContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    String signal = ctx.op.getText().equals("-") ? "-" : "";
    res.add("text", signal + visit(ctx.e2).render());
    return res;
  }

  @Override
  public ST visitExprFloat(pdrawParser.ExprFloatContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    res.add("text", ctx.FLOAT().getText());
    return res;
  }

  @Override
  public ST visitExprStdIn(pdrawParser.ExprStdInContext ctx) {
    return visit(ctx.stdin());
  }

  @Override
  public ST visitExprString(pdrawParser.ExprStringContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    res.add("text", ctx.STRING().getText());
    return res;
  }

  @Override
  public ST visitExprInteger(pdrawParser.ExprIntegerContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    res.add("text", ctx.INT().getText());
    return res;
  }

  @Override
  public ST visitExprBool(pdrawParser.ExprBoolContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    String str = ctx.BOOL().getText();
    res.add(
      "text",
      str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase()
    );
    return res;
  }

  @Override
  public ST visitExprAddSubMultDivModPow(
    pdrawParser.ExprAddSubMultDivModPowContext ctx
  ) {
    ST res = pdrawTemplate.getInstanceOf("expression");
    res.add("e1", visit(ctx.expression(0)).render());
    res.add("op", ctx.op.getText());
    res.add("e2", visit(ctx.expression(1)).render());
    return res;
  }

  @Override
  public ST visitExprConst(pdrawParser.ExprConstContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("constants");
    res.add("constName", ctx.getText().toLowerCase());

    return res;
  }

  @Override
  public ST visitStdin(pdrawParser.StdinContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("input");
    ST str = visit(ctx.expression());
    System.out.println(str.render() + "STDIN TESTE");
    res.add("text", str);
    return res;
  }

  @Override
  public ST visitIncdec(pdrawParser.IncdecContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("incdec");
    ST str = visit(ctx.variable());
    String op = ctx.op.getText();
    if (op.equals("++")) op = "+";
    if (op.equals("--")) op = "-";

    res.add("variable", str);
    res.add("op", op);
    return res;
  }

  @Override
  public ST visitTuple(pdrawParser.TupleContext ctx) {
    ST res = elementsTemplate.getInstanceOf("tuple");
    res.add("e1", visit(ctx.expression(0)));
    res.add("e2", visit(ctx.expression(1)));
    return res;
  }

  @Override
  public ST visitDegree(pdrawParser.DegreeContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");

    res.add("text", "math.radians(" + visit(ctx.expression()).render() + ")");
    return res;
  }

  @Override
  public ST visitRadian(pdrawParser.RadianContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    res.add("text", (visit(ctx.expression()).render()));
    return res;
  }

  @Override
  public ST visitForward(pdrawParser.ForwardContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public ST visitBackward(pdrawParser.BackwardContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public ST visitLeft(pdrawParser.LeftContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public ST visitRight(pdrawParser.RightContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public ST visitDown(pdrawParser.DownContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public ST visitUp(pdrawParser.UpContext ctx) {
    ST res = null;
    return visitChildren(ctx);
    // return res;
  }

  @Override
  public ST visitTypeCast(pdrawParser.TypeCastContext ctx) {
    ST temp = pdrawTemplate.getInstanceOf("cast");
    temp.add("Type", parseType(ctx.Type().getText()));
    temp.add("expression", visit(ctx.expression()));
    return temp;
  }

  @Override
  public ST visitIf(pdrawParser.IfContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("if");
    res.add("condition", visit(ctx.expression()));
    ctx
      .statement()
      .forEach(statement -> res.add("statements", visit(statement)));

    if (ctx.elseif() != null) {
      ctx.elseif().forEach(elseif -> res.add("elif", visit(elseif)));
    }

    if (ctx.else_() != null) {
      res.add("elseStat", visit(ctx.else_()));
    }
    return res;
  }

  @Override
  public ST visitElseif(pdrawParser.ElseifContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("elif");
    res.add("condition", visit(ctx.expression()));
    ctx
      .statement()
      .forEach(statement -> res.add("statements", visit(statement)));
    return res;
  }

  @Override
  public ST visitElse(pdrawParser.ElseContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("else");
    ctx
      .statement()
      .forEach(statement -> res.add("statements", visit(statement)));
    return res;
  }

  @Override
  public ST visitFor(pdrawParser.ForContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("while");
    res.add("assignment", visit(ctx.assignment(0)));
    res.add("condition", visit(ctx.expression()));
    ctx
      .statement()
      .forEach(statement -> res.add("statements", visit(statement)));
    res.add("statements", visit(ctx.assignment(1)));
    return res;
  }

  @Override
  public ST visitWhile(pdrawParser.WhileContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("while");
    System.out.println(ctx.op.getText());
    if (ctx.op.getText().equals("until")) res.add("isUntil", "true");
    res.add("condition", visit(ctx.expression()));
    ctx
      .statement()
      .forEach(statement -> res.add("statements", visit(statement)));
    return res;
  }

  @Override
  public ST visitExprConditionOrderRelation(
    pdrawParser.ExprConditionOrderRelationContext ctx
  ) {
    ST res = pdrawTemplate.getInstanceOf("expression");
    res.add("e1", visit(ctx.expression(0)));
    res.add("op", ctx.op.getText());
    res.add("e2", visit(ctx.expression(1)));
    return res;
  }

  @Override
  public ST visitExprConditionAndOr(pdrawParser.ExprConditionAndOrContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("expression");
    res.add("e1", visit(ctx.expression(0)));
    res.add("op", ctx.op.getText());
    res.add("e2", visit(ctx.expression(1)));
    return res;
  }

  @Override
  public ST visitExprConditionEquals(
    pdrawParser.ExprConditionEqualsContext ctx
  ) {
    ST res = pdrawTemplate.getInstanceOf("expression");
    res.add("e1", visit(ctx.expression(0)));
    res.add("op", ctx.op.getText());
    res.add("e2", visit(ctx.expression(1)));
    return res;
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

  private Object defaultType(String type) {
    switch (type.toLowerCase()) {
      case "int":
        return 0;
      case "real":
        return 0.0;
      case "string":
        return "";
      case "bool":
        return false;
      default:
        return null;
    }
  }
}
