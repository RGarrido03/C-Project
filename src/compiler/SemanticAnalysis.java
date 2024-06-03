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
  // function symbol table
  private final Map<String, Map<String, Symbol>> functionsTable = new HashMap<>();

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
  public Boolean visitInstructionMoveRotateAction(
    pdrawParser.InstructionMoveRotateActionContext ctx
  ) {
    String variable = ctx.variable().getText();

    if (!symbolTable.containsKey(variable)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s not defined", variable)
      );
      return false;
    }

    Type type = symbolTable.get(variable).getType();

    if (!(type instanceof PenTAD)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is not a pen", variable)
      );
      return false;
    }

    if (ctx.move() != null) {
      for (pdrawParser.MoveContext moveContext : ctx.move()) {
        if (!visit(moveContext.expression())) {
          return false;
        }

        String text = moveContext.moveAction().getText();
        if (!(text.equals("forward") || text.equals("backward"))) {
          ErrorHandling.printError(
            ctx,
            text + " is not 'forward' or 'backward'"
          );
          return false;
        }
      }
    }

    if (ctx.rotate() != null) {
      for (pdrawParser.RotateContext rotateContext : ctx.rotate()) {
        if (!visit(rotateContext.angle())) {
          return false;
        }

        String text = rotateContext.rotateAction().getText();
        if (!(text.equals("left") || text.equals("right"))) {
          ErrorHandling.printError(ctx, text + " is not 'left' or 'right'");
          return false;
        }
      }
    }

    if (ctx.pause() != null) {
      for (pdrawParser.PauseContext pauseContext : ctx.pause()) {
        if (!visit(pauseContext)) {
          return false;
        }
      }
    }

    if (ctx.write() != null) {
      for (pdrawParser.WriteContext writeContext : ctx.write()) {
        if (!visit(writeContext)) {
          return false;
        }
      }
    }
    return true;
  }

  public Boolean visitWrite(pdrawParser.WriteContext ctx) {
    String text = ctx.expression(0).getText();

    if (text.startsWith("\"") && text.endsWith("\"")) {
      // it means i is a String
      try {
        int fontSize = Integer.parseInt(ctx.expression(1).getText());
      } catch (NumberFormatException e) {
        ErrorHandling.printError(ctx, "Font size must be an integer");
        return false;
      }

      return true;
    }

    ErrorHandling.printError(ctx, "Text to write must be a string");
    return false;
  }

  @Override
  public Boolean visitInstructionPenAction(
    pdrawParser.InstructionPenActionContext ctx
  ) {
    String variable = ctx.variable().getText();
    if (!symbolTable.containsKey(variable)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s not defined", variable)
      );
      return false;
    } else {
      Type type = symbolTable.get(variable).getType();
      if (type instanceof PenTAD) {
        Boolean penAction =
          ctx.penAction().getText().equals("down") ||
          ctx.penAction().getText().equals("up");
        if (penAction) {
          return true;
        } else {
          ErrorHandling.printError(ctx, "Instructions are not valid");
          return false;
        }
      } else {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a pen", variable)
        );
        return false;
      }
    }
  }

  @Override
  public Boolean visitInstructionArrowProps(
    pdrawParser.InstructionArrowPropsContext ctx
  ) {
    Boolean res = false;
    String variable = ctx.variable().getText();
    if (!symbolTable.containsKey(variable)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s not defined", variable)
      );
      return false;
    } else {
      Type type = symbolTable.get(variable).getType();
      if (type instanceof PenTAD) {
        return true;
      } else {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a pen", variable)
        );
        return false;
      }
    }
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
      ErrorHandling.printInfo(expressionCtx.getText());
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
        System.out.println(createType(type));
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

  @Override
  public Boolean visitAssignmentMultipleVars(
    pdrawParser.AssignmentMultipleVarsContext ctx
  ) {
    Boolean res = false;
    String type = ctx.Type().getText();

    List<pdrawParser.VariableContext> variables = ctx.variable();
    List<pdrawParser.ExpressionContext> expressions = ctx.expression();

    if (variables.size() != expressions.size()) {
      ErrorHandling.printError(
        ctx,
        "Invalid number of variables and expressions"
      );
      return false;
    }

    for (int i = 0; i < variables.size(); i += 1) {
      String name = variables.get(i).getText();
      pdrawParser.ExpressionContext expressionCtx = expressions.get(i);

      Boolean expressionResult = visit(expressionCtx);

      System.out.println(createType(type).toString() + " " + name + " pILOXa");

      if (!expressionResult) {
        ErrorHandling.printError(ctx, "Expression is not valid");
        return false;
      }
      if (!symbolTable.containsKey(name)) {
        ErrorHandling.printInfo(expressionCtx.getText());
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
          symbolTable.put(name, new Symbol(createType(type), name));

          res = true;
        }
      } else {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s already defined", name)
        );
        return false;
      }
    }
    return res;
  }

  @Override
  public Boolean visitAssignmentVarsNoValue(
    pdrawParser.AssignmentVarsNoValueContext ctx
  ) {
    Boolean res = false;
    List<pdrawParser.VariableContext> variables = ctx.variable();
    String type = ctx.Type().getText();

    for (pdrawParser.VariableContext var : variables) {
      String name = var.getText();
      if (!symbolTable.containsKey(name)) {
        symbolTable.put(name, new Symbol(createType(type), name));
        res = true;
      } else {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s already defined", name)
        );
        return false;
      }
    }

    return res;
  }

  // our made not antlr
  private Type createType(String type) {
    return switch (type.toLowerCase()) {
      case "int" -> new IntType();
      case "real" -> new RealType();
      case "string" -> new StringType();
      case "bool" -> new BoolType();
      default -> throw new IllegalArgumentException(
        String.format("Unsupported type: %s", type)
      );
    };
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
  public Boolean visitAddOrSubPointToPen(
    pdrawParser.AddOrSubPointToPenContext ctx
  ) {
    if (
      !symbolTable.containsKey(ctx.variable(0).getText()) ||
      !symbolTable.containsKey(ctx.variable(1).getText())
    ) {
      ErrorHandling.printError(
        ctx,
        String.format(
          "Variables %s or %s not defined",
          ctx.variable(0).getText(),
          ctx.variable(1).getText()
        )
      );
      return false;
    } else if (!ctx.variable(0).getText().equals(ctx.variable(1).getText())) {
      ErrorHandling.printError(ctx, String.format("Variables aren't the same"));
      return false;
    }

    return visit(ctx.tuple());
  }

  @Override
  public Boolean visitStdout(pdrawParser.StdoutContext ctx) {
    return visit(ctx.expression());
  }

  @Override
  public Boolean visitStderr(pdrawParser.StderrContext ctx) {
    return visit(ctx.expression());
  }

  @Override
  public Boolean visitExecute(pdrawParser.ExecuteContext ctx) {
    String var = ctx.variable().getText();

    if (!symbolTable.containsKey(var)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s not defined", var)
      );
      return false;
    }

    Type type = symbolTable.get(var).getType();
    if (type instanceof PenTAD) {
      return true;
    }

    ErrorHandling.printError(
      ctx,
      String.format("Variable %s is not a pen", var)
    );
    return false;
  }

  @Override
  public Boolean visitCreateCanvas(pdrawParser.CreateCanvasContext ctx) {
    Boolean res = false;
    String canvas_especifico = ctx.variable().getText();
    if (!symbolTable.containsKey(canvas_especifico)) {
      symbolTable.put(
        canvas_especifico,
        new Symbol(new CanvasType(canvas_especifico), canvas_especifico)
      );
      return true;
    } else {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is already defined", canvas_especifico)
      );
      return false;
    }
  }

  @Override
  public Boolean visitSetCanvas(pdrawParser.SetCanvasContext ctx) {
    Boolean res = null;
    String canvas_especifico = ctx.variable().getText();
    if (!symbolTable.containsKey(canvas_especifico)) {
      ErrorHandling.printError(
        ctx,
        String.format("Canvas '%s' isn't defined", canvas_especifico)
      );
      return false;
    }

    return true;
  }

  @Override
  public Boolean visitBackgroundCanvas(
    pdrawParser.BackgroundCanvasContext ctx
  ) {
    Boolean res = false;
    String canvas_especifico = ctx.variable().getText();
    if (symbolTable.containsKey(canvas_especifico)) {
      // Verificar se a cor é valida
      if (ctx.HexaColor() != null) {
        String color = ctx.HexaColor().getText();
        if (!isHexColor(color)) {
          ErrorHandling.printError(
            ctx,
            String.format("Color %s is not valid", color)
          );
          return false;
        }
      } else if (ctx.Word() != null) {
        String color = ctx.Word().getText();
        // ver se cabe nas cores html
        if (!isColorWord(color)) {
          ErrorHandling.printError(
            ctx,
            String.format("Color %s is not valid", color)
          );
          return false;
        }
      }

      return true;
    } else {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is not defined", canvas_especifico)
      );
      return false;
    }
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
        Boolean isColorValid = isColorWord(value) || isHexColor(value);
        if (!isColorValid) {
          ErrorHandling.printError(
            ctx,
            String.format("The value %s is not a color", value)
          );
        }
        return isColorValid;
      case "position":
        return visitTuple(ctx.tuple());
      case "orientation":
        return visit(ctx.angle());
      case "thickness", "pressure":
        return visit(ctx.expression());
      default:
        break;
    }
    return res;
  }

  @Override
  public Boolean visitArrowProps(pdrawParser.ArrowPropsContext ctx) {
    Boolean res = false;

    String prop = ctx.getText();

    Boolean containsColor = prop.contains("color");

    if (containsColor) {
      prop = prop.split("color")[1];
      Boolean isColorValid = isColorWord(prop) || isHexColor(prop);
      if (!isColorValid) {
        ErrorHandling.printError(
          ctx,
          String.format("The value %s is not a color", prop)
        );
      }
      return isColorValid;
    } else if (prop.contains("position")) {
      return visitTuple(ctx.tuple());
    } else if (prop.contains("orientation")) {
      return visit(ctx.angle());
    } else if (prop.contains("thickness")) {
      return visit(ctx.expression());
    } else if (prop.contains("pressure")) {
      return visit(ctx.expression());
    }

    return res;
  }

  @Override
  public Boolean visitObject(pdrawParser.ObjectContext ctx) {
    Boolean res = false;
    String var_left = ctx.variable(0).getText();
    if (ctx.variable(1) != null) {
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
    } else {
      // TODO duvidoso
      symbolTable.put(var_left, new Symbol(new PenTAD(var_left), var_left));

      return true;
    }
  }

  @Override
  public Boolean visitExprAddSubMultDivModPow(
    pdrawParser.ExprAddSubMultDivModPowContext ctx
  ) {
    if (!visit(ctx.expression(0)) || !visit(ctx.expression(1))) {
      ErrorHandling.printError(
        ctx,
        String.format(
          "Expression %s or %s are not valid",
          ctx.expression(0).getText(),
          ctx.expression(1).getText()
        )
      );
      return false;
    }
    pdrawParser.ExpressionContext left_ctx = ctx.expression(0);
    pdrawParser.ExpressionContext right_ctx = ctx.expression(1);

    // preciso de saber se é uma variavel ou nao
    for (int i = 0; i < 2; i++) {
      String text = ctx.expression(i).getText();
      if (
        symbolTable.containsKey(text) &&
        !symbolTable.get(text).getType().isNumeric()
      ) {
        ErrorHandling.printError(
          ctx,
          String.format("Variable %s is not a number", text)
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
      ctx.symbol =
        new Symbol(
          ctx.op.getText().equals("/")
            ? new RealType()
            : left_ctx.symbol.getType(),
          left_ctx.getText()
        ); // o da esquerda define o tipo final
      return true;
    }

    if (
      left_ctx.symbol.getType().isTuple() &&
      right_ctx.symbol.getType().isTuple() &&
      ctx.op.getText().equals("+")
    ) {
      ctx.symbol =
        new Symbol(
          new TupleType(),
          left_ctx.symbol.getValue() + "+" + right_ctx.symbol.getValue()
        );

      return true;
    }

    // Concatenação de strings
    if (
      ctx.op.getText().equals("+") &&
      left_ctx.symbol.getType().isString() &&
      right_ctx.symbol.getType().isString()
    ) {
      ctx.symbol =
        new Symbol(new StringType(), left_ctx.getText() + right_ctx.getText());
      return true;
    }

    ErrorHandling.printError(
      ctx,
      String.format(
        "Expression %s or %s are not valid",
        ctx.expression(0).getText(),
        ctx.expression(1).getText()
      )
    );

    return false;
  }

  @Override
  public Boolean visitExprCast(pdrawParser.ExprCastContext ctx) {
    String castType = ctx.typeCast().Type().getText();
    String expr = ctx.typeCast().expression().getText();

    ctx.symbol = new Symbol(createType(castType), expr);
    return true;
  }

  @Override
  public Boolean visitExprParent(pdrawParser.ExprParentContext ctx) {
    Boolean res = visit(ctx.expression());
    ctx.symbol = ctx.expression().symbol;
    return res;
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
  public Boolean visitExprConst(pdrawParser.ExprConstContext ctx) {
    Boolean res = true;
    ctx.symbol = new Symbol(new RealType(), ctx.getText());
    return res;
  }

  @Override
  public Boolean visitExprIncDec(pdrawParser.ExprIncDecContext ctx) {
    Boolean res = true;
    String var = ctx.incdec().variable().getText();
    if (!symbolTable.containsKey(var)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is not defined", var)
      );

      return false;
    }
    if (!symbolTable.get(var).getType().isNumeric()) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is not a number", var)
      );
      return false;
    }

    ctx.symbol =
      new Symbol(symbolTable.get(var).getType(), ctx.incdec().getText());
    return true;
    // ctx.symbol = new Symbol(ctx.incdec().variable().getText(), ctx.incdec().getText());

    // return visitChildren(ctx);
  }

  @Override
  public Boolean visitIncdec(pdrawParser.IncdecContext ctx) {
    String var = ctx.variable().getText();
    if (!symbolTable.containsKey(var)) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is not defined", var)
      );

      return false;
    }
    if (!symbolTable.get(var).getType().isNumeric()) {
      ErrorHandling.printError(
        ctx,
        String.format("Variable %s is not a number", var)
      );
      return false;
    }
    return true;
  }

  @Override
  public Boolean visitExprInteger(pdrawParser.ExprIntegerContext ctx) {
    Boolean res = true;
    String x = ctx.INT().getText();
    ErrorHandling.printInfo(ctx.getText());
    ctx.symbol = new Symbol(new IntType(), x);
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
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitBackward(pdrawParser.BackwardContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitLeft(pdrawParser.LeftContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitRight(pdrawParser.RightContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitDown(pdrawParser.DownContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitUp(pdrawParser.UpContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitFunctionDefinition(
    pdrawParser.FunctionDefinitionContext ctx
  ) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitFunctionName(pdrawParser.FunctionNameContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitParameters(pdrawParser.ParametersContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitParameter(pdrawParser.ParameterContext ctx) {
    return visitChildren(ctx);
  }

  @Override
  public Boolean visitReturnStatement(pdrawParser.ReturnStatementContext ctx) {
    return visitChildren(ctx);
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
          ErrorHandling.printError(
            ctx,
            "Type " + ctx.Type().getText() + " is not castable"
          );
          return false;
        }
      }
      return true;
    } catch (IllegalArgumentException e) {
      ErrorHandling.printError(ctx, e.getMessage());
      return false;
    }
  }

  @Override
  public Boolean visitIf(pdrawParser.IfContext ctx) {
    if (!visit(ctx.expression())) {
      ErrorHandling.printError(ctx, "Condition is not valid");
      return false;
    }

    if (!ctx.statement().stream().allMatch(this::visit)) {
      return false;
    }

    if (ctx.elseif() != null && !ctx.elseif().stream().allMatch(this::visit)) {
      return false;
    }

    if (ctx.else_() != null && !visit(ctx.else_())) {
      return false;
    }
    return ctx.statement().stream().allMatch(this::visit);
  }

  @Override
  public Boolean visitElseif(pdrawParser.ElseifContext ctx) {
    if (!visit(ctx.expression())) {
      ErrorHandling.printError(ctx, "Condition is not valid");
      return false;
    }
    return ctx.statement().stream().allMatch(this::visit);
  }

  @Override
  public Boolean visitElse(pdrawParser.ElseContext ctx) {
    return ctx.statement().stream().allMatch(this::visit);
  }

  @Override
  public Boolean visitFor(pdrawParser.ForContext ctx) {
    if (!visit(ctx.assignment(0))) {
      ErrorHandling.printError(
        ctx,
        "Assignment " + ctx.assignment(0).getText() + " is not valid"
      );
      return false;
    }

    if (!visit(ctx.expression())) {
      ErrorHandling.printError(ctx, "Condition is not valid");
      return false;
    }

    if (!visit(ctx.assignment(1))) {
      ErrorHandling.printError(
        ctx,
        "Assignment " + ctx.assignment(1).getText() + " is not valid"
      );
      return false;
    }

    return ctx.statement().stream().allMatch(this::visit);
  }

  @Override
  public Boolean visitWhile(pdrawParser.WhileContext ctx) {
    if (!visit(ctx.expression())) {
      ErrorHandling.printError(ctx, "Condition is not valid");
      return false;
    }
    return ctx.statement().stream().allMatch(this::visit);
  }

  @Override
  public Boolean visitExprConditionOrderRelation(
    pdrawParser.ExprConditionOrderRelationContext ctx
  ) {
    if (!visit(ctx.expression(0)) || !visit(ctx.expression(1))) {
      return false;
    }

    for (int i = 0; i < 2; i++) {
      if (!(ctx.expression(i).symbol.getType().isNumeric())) {
        ErrorHandling.printError(
          ctx,
          ctx.expression(i).getText() + " is not numeric"
        );
        return false;
      }
    }

    return true;
  }

  @Override
  public Boolean visitExprConditionAndOr(
    pdrawParser.ExprConditionAndOrContext ctx
  ) {
    if (!visit(ctx.expression(0)) || !visit(ctx.expression(1))) {
      return false;
    }

    for (int i = 0; i < 2; i++) {
      if (!(ctx.expression(i).symbol.getType() instanceof BoolType)) {
        ErrorHandling.printError(
          ctx,
          ctx.expression(i).getText() + " is not a bool"
        );
        return false;
      }
    }

    return true;
  }

  @Override
  public Boolean visitExprConditionEquals(
    pdrawParser.ExprConditionEqualsContext ctx
  ) {
    if (!visit(ctx.expression(0)) || !visit(ctx.expression(1))) {
      return false;
    }

    List<Type> types = ctx
      .expression()
      .stream()
      .map(exp -> exp.symbol.getType())
      .toList();

    if (checkConditionTypes(types)) {
      ctx.symbol = new Symbol(new BoolType(), ctx.getText());
      return true;
    }

    String sb =
      "Symbols " +
      ctx.expression(0).getText() +
      " and " +
      ctx.expression(1).getText() +
      " are of different types (" +
      ctx.expression(0).symbol.getType().toString() +
      ", " +
      ctx.expression(1).symbol.getType().toString() +
      ")";
    ErrorHandling.printError(ctx, sb);
    return false;
  }

  private Boolean checkConditionTypes(List<Type> types) {
    // All numbers
    if (types.stream().allMatch(Type::isNumeric)) {
      return true;
    }

    // All bool
    if (types.stream().allMatch(BoolType.class::isInstance)) {
      return true;
    }

    // All string
    if (types.stream().allMatch(StringType.class::isInstance)) {
      return true;
    }

    // A bool and a number
    return (
      types.stream().anyMatch(Type::isNumeric) &&
      types.stream().anyMatch(BoolType.class::isInstance)
    );
  }
}
