import math
from antlr4 import *
from ipdrawParser import ipdrawParser
from ipdrawVisitor import ipdrawVisitor
import sys
import time
from lib import *
# TODO FAZER VERIFICADOR SEMANTICO


class SymbolTable:
    def __init__(self):
        self.variables = {}

    def add_variable(self, name, value):

        self.variables[name] = value

    def get_variable(self, name):
        try:
            return self.variables[name]
        except:
            print("Variable '" + name + "' not found")

    def update_variable(self, name, value):
        try:
            self.variables[name] = value
        except:
            print("Variable '" + name + "' not found")

    def __str__(self):
        return str(self.variables)


# Funcrions Scope TODO
class Scope:
    def __init__(self, name, parent=None):
        self.symbols: SymbolTable = SymbolTable()
        self.parent = parent
        self.name = name


class Interpreter(ipdrawVisitor):

    def __init__(self, pen: Pen):
        self.symbols: SymbolTable = SymbolTable()
        self.pen = pen

    def visitMain(self, ctx: ipdrawParser.MainContext):
        return self.visitChildren(ctx)

    def visitStatement(self, ctx: ipdrawParser.StatementContext):
        return self.visitChildren(ctx)

    def visitIfStatement(self, ctx: ipdrawParser.IfStatementContext):
        condition = self.visit(ctx.condition())
        if condition:
            for statement in ctx.statement():
                self.visit(statement)
        elif ctx.elseBlock():
            self.visit(ctx.elseBlock())

        return None  # TODO

    def visitElseBlock(self, ctx: ipdrawParser.ElseBlockContext):
        for statement in ctx.statement():
            self.visit(statement)

        return None  # TODO

    def visitWhileLoop(self, ctx: ipdrawParser.WhileLoopContext):
      cicle = ctx.cicle.text == 'while'
      
      """
         se for um while, ele vai executar enquanto a condição for verdadeira
         se for um until, ele vai executar enquanto a condição for falsa
      """
      while self.visit(ctx.condition()) == cicle:
         for statement in ctx.statement():
               self.visit(statement)

      return None  # TODO

    def visitForLoop(self, ctx: ipdrawParser.ForLoopContext):
        self.visit(ctx.assignment(0))

        while self.visit(ctx.condition()):
            for statement in ctx.statement():
                self.visit(statement)

            self.visit(ctx.assignment(1))

        return None  # TODO

    # TODO implementar breaks, continue e ...
    def visitFinallyBlock(self, ctx: ipdrawParser.FinallyBlockContext):

        return None  # TODO

    def visitConditionNot(self, ctx: ipdrawParser.ConditionNotContext):
        return not self.visit(ctx.condition())

    def visitConditionEquals(self, ctx: ipdrawParser.ConditionEqualsContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        return exp1 == exp2

    def visitConditionNotEquals(self, ctx: ipdrawParser.ConditionNotEqualsContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        return exp1 != exp2

    def visitConditionLessThan(self, ctx: ipdrawParser.ConditionLessThanContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        
        return exp1 < exp2

    def visitConditionGreaterThan(self, ctx: ipdrawParser.ConditionGreaterThanContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        return exp1 > exp2

    def visitConditionLessEqual(self, ctx: ipdrawParser.ConditionLessEqualContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        return exp1 <= exp2

    def visitConditionGreaterEqual(self, ctx: ipdrawParser.ConditionGreaterEqualContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        return exp1 >= exp2

    def visitConditionAnd(self, ctx: ipdrawParser.ConditionAndContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        return exp1 and exp2

    def visitConditionOr(self, ctx: ipdrawParser.ConditionOrContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        return exp1 or exp2

    def visitConditionParentheses(self, ctx: ipdrawParser.ConditionParenthesesContext):
        return self.visit(ctx.condition())

    def visitInstructionMoveAction(self, ctx: ipdrawParser.InstructionMoveActionContext):
        move = ctx.moveAction().getText()
        if move == 'forward':
            self.pen.forward(self.visit(ctx.expression()))
        elif move == 'backward':
            self.pen.backward(self.visit(ctx.expression()))

        return None

    def visitInstructionRotateAction(self, ctx: ipdrawParser.InstructionRotateActionContext):
        rotate = ctx.rotateAction().getText()

        if rotate == 'left':
            self.pen.left(self.visit(ctx.angle()))
        elif rotate == 'right':
            self.pen.right(self.visit(ctx.angle()))

        return None

    def visitInstructionPenAction(self, ctx: ipdrawParser.InstructionPenActionContext):
        action = ctx.penAction().getText()
        if action == 'down':
            self.pen.down()
        elif action == 'up':
            self.pen.up()

        return None

    def visitInstructionArrowProps(self, ctx: ipdrawParser.InstructionArrowPropsContext):

        return self.visit(ctx.arrowProps())

    def visitAssignmentVar(self, ctx: ipdrawParser.AssignmentVarContext):
        var_name = ctx.variable().getText()
        value = self.visit(ctx.expression())
        self.symbols.add_variable(var_name, value)
        return value

    def visitReAssignmentVar(self, ctx: ipdrawParser.ReAssignmentVarContext):
        var_name = ctx.variable().getText()
        value = self.visit(ctx.expression())
        self.symbols.update_variable(var_name, value)

        return value

    def visitStdin(self, ctx: ipdrawParser.StdinContext):

        return input(self.visit(ctx.expression()))

    def visitPause(self, ctx: ipdrawParser.PauseContext):
        pause_time = int(self.visit(ctx.expression()))
        time.sleep(pause_time / 1_000_000)  # Convert microseconds to seconds

        return None

    def visitStdout(self, ctx: ipdrawParser.StdoutContext):
        print(self.visit(ctx.expression()))

        return None

    def visitStderr(self, ctx: ipdrawParser.StderrContext):
        print(self.visit(ctx.expression()), file=sys.stderr)

        return None

    def visitVariable(self, ctx: ipdrawParser.VariableContext):

        return self.symbols.get_variable(ctx.getText())

    def visitExprAddSub(self, ctx: ipdrawParser.ExprAddSubContext):
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))
      
        if ctx.op.text == '+':
            return left + right
        elif ctx.op.text == '-':
            return left - right

    def visitExprPow(self, ctx: ipdrawParser.ExprPowContext):
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        return left ** right

    def visitExprString(self, ctx: ipdrawParser.ExprStringContext):
        return ctx.STRING().getText()[1:-1]

    def visitExprCast(self, ctx: ipdrawParser.ExprCastContext):
        return self.visit(ctx.typeCast())

    def visitExprParent(self, ctx: ipdrawParser.ExprParentContext):

        return self.visit(ctx.expression())

    def visitExprUnary(self, ctx: ipdrawParser.ExprUnaryContext):

        return - self.visit(ctx.expression()) if ctx.op.text == '-' else self.visit(ctx.expression())

    def visitExprFloat(self, ctx: ipdrawParser.ExprFloatContext):

        return float(ctx.FLOAT().getText())

    def visitExprStdIn(self, ctx: ipdrawParser.ExprStdInContext):

        return self.visit(ctx.stdin())

    def visitExprInteger(self, ctx: ipdrawParser.ExprIntegerContext):
        return int(ctx.INT().getText())

    def visitExprBool(self, ctx: ipdrawParser.ExprBoolContext):

        return ctx.BOOL().getText() == 'true'

    def visitExprVariable(self, ctx: ipdrawParser.ExprVariableContext):

        return self.visit(ctx.variable())

    def visitExprMultDivMod(self, ctx: ipdrawParser.ExprMultDivModContext):
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))

        if ctx.op.text == '*':
            return left * right
        elif ctx.op.text == '/':
            return left / right
        elif ctx.op.text == '%':
            return left % right
        elif ctx.op.text == '//':
            return left // right

    def visitTuple(self, ctx: ipdrawParser.TupleContext):
        expr1 = self.visit(ctx.expression(0))
        expr2 = self.visit(ctx.expression(1))

        return (expr1, expr2)

    def visitDegree(self, ctx: ipdrawParser.DegreeContext):

        return self.visit(ctx.expression())

    def visitRadian(self, ctx: ipdrawParser.RadianContext):

        return math.degrees(self.visit(ctx.expression()))

    def visitArrowColor(self, ctx: ipdrawParser.ArrowColorContext):
        self.pen.set_color(ctx.getText().replace('color', ''))

        return None

    def visitArrowPosition(self, ctx: ipdrawParser.ArrowPositionContext):
        self.pen.set_position(self.visit(ctx.tuple_()))

        return None

    def visitArrowOrientation(self, ctx: ipdrawParser.ArrowOrientationContext):
        self.pen.set_orientation(self.visit(ctx.angle()))

        return None

    def visitArrowPressure(self, ctx: ipdrawParser.ArrowPressureContext):
        self.pen.set_pressure(self.visit(ctx.expression()))

        return None

    def visitArrowThickness(self, ctx: ipdrawParser.ArrowThicknessContext):
        self.pen.set_thickness(self.visit(ctx.expression()))

        return None

    def visitTypeCast(self, ctx: ipdrawParser.TypeCastContext):

        tipo = ctx.Type().getText()

        if tipo == 'int':
            return int(self.visit(ctx.expression()))
        elif tipo == 'real':
            return float(self.visit(ctx.expression()))
        elif tipo == 'bool':
            return bool(self.visit(ctx.expression()))
        else:
            return str(self.visit(ctx.expression()))
