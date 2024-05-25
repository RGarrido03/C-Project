import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import types.*;

@SuppressWarnings("CheckReturnValue")
public class SemanticAnalysis extends pdrawBaseVisitor<Boolean> {

  private static final Set<String> htmlColorNames = new HashSet<>();
  private final Map<String, Symbol> symbolTable = new HashMap<>();
  private static final Pattern hexPattern = Pattern.compile("#[a-fA-F0-9]{6}");

  static {
    // Adicionar todas as cores nomeadas do HTML
    String[] colors = {
      "AliceBlue",
      "AntiqueWhite",
      "Aqua",
      "Aquamarine",
      "Azure",
      "Beige",
      "Bisque",
      "Black",
      "BlanchedAlmond",
      "Blue",
      "BlueViolet",
      "Brown",
      "BurlyWood",
      "CadetBlue",
      "Chartreuse",
      "Chocolate",
      "Coral",
      "CornflowerBlue",
      "Cornsilk",
      "Crimson",
      "Cyan",
      "DarkBlue",
      "DarkCyan",
      "DarkGoldenRod",
      "DarkGray",
      "DarkGreen",
      "DarkKhaki",
      "DarkMagenta",
      "DarkOliveGreen",
      "DarkOrange",
      "DarkOrchid",
      "DarkRed",
      "DarkSalmon",
      "DarkSeaGreen",
      "DarkSlateBlue",
      "DarkSlateGray",
      "DarkTurquoise",
      "DarkViolet",
      "DeepPink",
      "DeepSkyBlue",
      "DimGray",
      "DodgerBlue",
      "FireBrick",
      "FloralWhite",
      "ForestGreen",
      "Fuchsia",
      "Gainsboro",
      "GhostWhite",
      "Gold",
      "GoldenRod",
      "Gray",
      "Green",
      "GreenYellow",
      "HoneyDew",
      "HotPink",
      "IndianRed",
      "Indigo",
      "Ivory",
      "Khaki",
      "Lavender",
      "LavenderBlush",
      "LawnGreen",
      "LemonChiffon",
      "LightBlue",
      "LightCoral",
      "LightCyan",
      "LightGoldenRodYellow",
      "LightGray",
      "LightGreen",
      "LightPink",
      "LightSalmon",
      "LightSeaGreen",
      "LightSkyBlue",
      "LightSlateGray",
      "LightSteelBlue",
      "LightYellow",
      "Lime",
      "LimeGreen",
      "Linen",
      "Magenta",
      "Maroon",
      "MediumAquaMarine",
      "MediumBlue",
      "MediumOrchid",
      "MediumPurple",
      "MediumSeaGreen",
      "MediumSlateBlue",
      "MediumSpringGreen",
      "MediumTurquoise",
      "MediumVioletRed",
      "MidnightBlue",
      "MintCream",
      "MistyRose",
      "Moccasin",
      "NavajoWhite",
      "Navy",
      "OldLace",
      "Olive",
      "OliveDrab",
      "Orange",
      "OrangeRed",
      "Orchid",
      "PaleGoldenRod",
      "PaleGreen",
      "PaleTurquoise",
      "PaleVioletRed",
      "PapayaWhip",
      "PeachPuff",
      "Peru",
      "Pink",
      "Plum",
      "PowderBlue",
      "Purple",
      "RebeccaPurple",
      "Red",
      "RosyBrown",
      "RoyalBlue",
      "SaddleBrown",
      "Salmon",
      "SandyBrown",
      "SeaGreen",
      "SeaShell",
      "Sienna",
      "Silver",
      "SkyBlue",
      "SlateBlue",
      "SlateGray",
      "Snow",
      "SpringGreen",
      "SteelBlue",
      "Tan",
      "Teal",
      "Thistle",
      "Tomato",
      "Turquoise",
      "Violet",
      "Wheat",
      "White",
      "WhiteSmoke",
      "Yellow",
      "YellowGreen",
    }; // SEE ME this can't be hard coded :cry:

    for (String color : colors) {
      htmlColorNames.add(color.toLowerCase());
    }
  }

  private boolean isColorWord(String color) {
    return htmlColorNames.contains(color.toLowerCase());
  }

  private boolean isHexColor(String color) {
    return hexPattern.matcher(color).matches();
  }

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
    return visitObject(ctx.object());
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
    String penTAD_especifico = ctx.variable().getText();
    List<pdrawParser.ClassPropsContext> props = ctx.classProps();
    if (!symbolTable.containsKey(penTAD_especifico)) {
      for (pdrawParser.ClassPropsContext prop : props) {
        if (!visit(prop)) {
          ErrorHandling.printError(ctx, "ClassProps is not valid");
          return false;
        }
      }
      symbolTable.put(
        penTAD_especifico,
        new Symbol(new PenTAD(penTAD_especifico), penTAD_especifico)
      );
      return true;
    } else {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is already defined", penTAD_especifico)
      );
      return false;
    }
  }

  @Override
  public Boolean visitClassProps(pdrawParser.ClassPropsContext ctx) {
    Boolean res = false;

    String prop = ctx.getText().split("=")[0].trim();
    String value = ctx.getText().split("=")[1].replace(";", "");
    switch (prop) {
      case "color":
        // TODO check if it's a color
        Boolean isColorValid = isColorWord(value) || isHexColor(value);
        if (!isColorValid) {
          ErrorHandling.printError(
            ctx,
            String.format("The value %s is not a color", value)
          );
        }
        return isColorValid;
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
    String var_left = ctx.variable(0).getText();
    String penTAD_right = ctx.variable(1).getText();

    if (!symbolTable.containsKey(penTAD_right)) {
      ErrorHandling.printError(
        ctx,
        String.format("Pen type %s not defined", penTAD_right)
      );
      return false;
    } else if (symbolTable.containsKey(var_left)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is already defined", penTAD_right)
      );
      return false;
    } else {
      symbolTable.put(var_left, symbolTable.get(penTAD_right));
      return true;
    }
  }

  // @Override
  // public Boolean visitVariable(pdrawParser.VariableContext ctx) {
  //   Boolean res = false;
  //   ctx.getText();
  //   return false;
  //   // return res;
  // }

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
    String castType = ctx.typeCast().Type().getText();
    String expr = ctx.typeCast().expression().getText();

    ctx.symbol = new Symbol(createType(castType), expr);

    return true;
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
    Boolean res = visit(ctx.expression());
    ctx.symbol = ctx.expression().symbol;
    return res;
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
    Boolean res = true;
    ctx.symbol = new Symbol(new StringType(), "stdin");
    return res;
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
    String x = ctx.STRING().getText();
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
    return true;
  }

  @Override
  public Boolean visitTuple(pdrawParser.TupleContext ctx) {
    Boolean res = false;
    Boolean left = visit(ctx.expression(0));
    Boolean right = visit(ctx.expression(1));
    if (left && right) {
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
    Boolean res = visit(ctx.expression());
    if (!res) {
      ErrorHandling.printError(ctx, "Degree has errors");
      return false;
    }
    return res;
  }

  @Override
  public Boolean visitRadian(pdrawParser.RadianContext ctx) {
    Boolean res = visit(ctx.expression());
    if (!res) {
      ErrorHandling.printError(ctx, "Radian has errors");
      return false;
    }
    return res;
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
    Symbol toBeCast = ctx.expression().symbol;

    try {
      switch (ctx.Type().getText()) {
        case "string" -> toBeCast.castToString();
        case "bool" -> toBeCast.castToBoolean();
        case "real" -> toBeCast.castToReal();
        case "int" -> toBeCast.castToInteger();
        default -> {
          ErrorHandling.printError(ctx, "Type " + ctx.Type().getText() + " is not castable");
          return false;
        }
      }
      return true;
    } catch (IllegalArgumentException e) {
      ErrorHandling.printError(ctx, e.getMessage());
      return false;
    }
  }
}
