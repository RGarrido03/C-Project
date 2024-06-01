import java.util.List;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import types.PenTAD;

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
  public ST visitInstructionMoveAction(
    pdrawParser.InstructionMoveActionContext ctx
  ) {
    System.out.println("VisitInstructionMoveAction");
    ST res = pdrawTemplate.getInstanceOf("instruction");
    res.add("variable", visit(ctx.variable()));
    res.add("action", ctx.moveAction().getText());
    res.add("value", visit(ctx.expression()));
    return res;
  }

  @Override
  public ST visitInstructionRotateAction(
    pdrawParser.InstructionRotateActionContext ctx
  ) {
    System.out.println("VisitInstructionRotateAction");
    ST res = pdrawTemplate.getInstanceOf("instruction");
    res.add("variable", visit(ctx.variable()));
    res.add("action", ctx.rotateAction().getText());
    if (ctx.angle() != null) {
      res.add("value", visit(ctx.angle()));
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
      pdrawParser.InstructionArrowPropsContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("arrowProps");
    System.out.println("Variable, value1, value2: " + ctx.getText());
    
    res.add("variable", visit(ctx.variable()));
    if (ctx.getText().contains("color")) {
      res.add("value1", "color");
      res.add("value2", '"' + ctx.getText().split("color")[1] + '"');
    } else {
      res.add("value1", ctx.getText().split("<-")[1].split(" ")[0]);
      res.add("value2", ctx.getText().split("<-")[1].split(" ")[2]);
    }
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
  public ST visitAssignmentPen(pdrawParser.AssignmentPenContext ctx) {
    ST res = null;

    return visitChildren(ctx);
    // return res;
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
    ST res = pdrawTemplate.getInstanceOf("arrowProps");
    res.add("variable", ctx.getText().split("<-")[0]);
    if (ctx.HexaColor() != null) {
      res.add("value1", ctx.getText().split("<-")[1].split(" ")[0]);
      res.add("value2", ctx.HexaColor().getText());
    } else {
      res.add("value1", ctx.getText().split("<-")[1].split(" ")[0]);
      res.add("value2", ctx.getText().split("<-")[1].split(" ")[2]);
    }
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
  public ST visitExprPow(pdrawParser.ExprPowContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("pow");
    res.add("e1", visit(ctx.expression(0)).render());
    res.add("e2", visit(ctx.expression(1)).render());
    return res;
  }

  @Override
  public ST visitExprCast(pdrawParser.ExprCastContext ctx) {
    return visit(ctx.typeCast());
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
  public ST visitExprAddSub(pdrawParser.ExprAddSubContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("expression");
    res.add("e1", visit(ctx.expression(0)).render());
    res.add("op", ctx.op.getText());
    res.add("e2", visit(ctx.expression(1)).render());
    return res;
  }

  @Override
  public ST visitExprMultDivMod(pdrawParser.ExprMultDivModContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("expression");

    // 0 as denominator
    if (
      ctx.op.getText().equals("/") &&
      visit(ctx.expression(1)).render().equals("0")
    ) {
      throw new ArithmeticException("Division by zero is not allowed");
    }

    res.add("e1", visit(ctx.expression(0)).render());
    res.add("op", ctx.op.getText());
    res.add("e2", visit(ctx.expression(1)).render());
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
  public ST visitTuple(pdrawParser.TupleContext ctx) {
    ST res = elementsTemplate.getInstanceOf("tuple");
    res.add("e1", visit(ctx.expression(0)));
    res.add("e2", visit(ctx.expression(1)));
    return res;
  }

  @Override
  public ST visitDegree(pdrawParser.DegreeContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");

    res.add("text", (Double.parseDouble(visit(ctx.expression()).render())));
    return res;
  }

  @Override
  public ST visitRadian(pdrawParser.RadianContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    res.add(
      "text",
      Math.toDegrees(Double.parseDouble(visit(ctx.expression()).render()))
    );
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
    res.add("condition", visit(ctx.condition()));
    ctx.statement().forEach(statement -> res.add("statements", visit(statement)));

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
    res.add("condition", visit(ctx.condition()));
    ctx.statement().forEach(statement -> res.add("statements", visit(statement)));
    return res;
  }

  @Override
  public ST visitElse(pdrawParser.ElseContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("else");
    ctx.statement().forEach(statement -> res.add("statements", visit(statement)));
    return res;
  }

  @Override
  public ST visitWhile(pdrawParser.WhileContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("while");
    res.add("condition", visit(ctx.condition()));
    ctx
            .statement()
            .forEach(statement -> res.add("statements", visit(statement)));
    return res;
  }

  @Override
  public ST visitConditionExpression(pdrawParser.ConditionExpressionContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("other");
    res.add("text", visit(ctx.expression()));
    return res;
  }

  @Override
  public ST visitConditionEquals(pdrawParser.ConditionEqualsContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("condition");
    res.add("e1", visit(ctx.expression(0)));
    res.add("e2", visit(ctx.expression(1)));
    res.add("equals", "true");
    return res;
  }

  @Override
  public ST visitConditionNotEquals(pdrawParser.ConditionNotEqualsContext ctx) {
    ST res = pdrawTemplate.getInstanceOf("condition");
    res.add("e1", visit(ctx.expression(0)));
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
}
