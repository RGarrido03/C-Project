import math
from numbers import Number
from antlr4 import *
from ipdrawParser import ipdrawParser
from ipdrawVisitor import ipdrawVisitor
import sys
import time
from lib import *
from ErrorHandler import ErrorHandling


def parseType(type_):
    if type_ == 'int':
        return int
    elif type_ == 'real':
        return float
    elif type_ == 'bool':
        return bool
    elif type_ == 'string':
        return str


def handleCondition(ctx,exp1, exp2):
    if not ((isinstance(exp1, Number) and isinstance(exp2, Number)) or (
        isinstance(exp1, type(exp2)))):

        ErrorHandling.print_error_ctx(ctx,f"Values '{exp1}' and '{\
                                exp2}' are not of the same type")
        sys.exit(1)
    return True


class SymbolTable:
    def __init__(self):
        self.variables = {}

    def add_variable(self,ctx, name, value, type_):

        if name in self.variables:
            ErrorHandling.print_error_ctx(ctx,f"Variable '{name}' already exists")
            sys.exit(1)


        elif isinstance(value,list):
            self.variables[name] = value

        elif isinstance(value, parseType(type_)):
            self.variables[name] = value
        

        else:
            ErrorHandling.print_error_ctx(ctx,f"Variable '{name}' and value '{\
                                    value}' are not of the same type")
            sys.exit(1)

    def get_variable(self,ctx, name):
        try:
            return self.variables[name]
        except:
            ErrorHandling.print_error_ctx(ctx,f"Variable '{name}' not found")
            sys.exit(1)

    def update_variable(self,ctx, name, value):
        if name in self.variables:
            if isinstance(type(self.variables[name]), list):
                self.variables[name]=value
            elif isinstance(self.variables[name], type(value)):
                self.variables[name] = value
            else:
                ErrorHandling.print_error_ctx(ctx,f"Variable '{name}' and value '{\
                                        value}' are not of the same type")
                sys.exit(1)
        else:
            ErrorHandling.print_error_ctx(ctx,f"Variable '{name}' not found")
            sys.exit(1)

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
    
    def visitRemoveArray(self, ctx: ipdrawParser.RemoveArrayContext):
        variable = ctx.variable().getText()
        index = self.visit(ctx.expression())
        buff = self.symbols.get_variable(ctx,variable)

        if not isinstance(index, Number):
            ErrorHandling.print_error_ctx(ctx,f"Index '{index}' must be a number")
            sys.exit(1)
        elif index < 0 or index >= len(buff)-1:
            ErrorHandling.print_error_ctx(ctx,f"Index '{index}' out of range")
            sys.exit(1)
        elif not isinstance(buff, list):
            ErrorHandling.print_error_ctx(ctx,f"Variable '{variable}' is not an array")
            sys.exit(1)

        buff.pop(index)
        self.symbols.update_variable(ctx,variable, buff)
        
        return None


    def visitAddArray(self, ctx: ipdrawParser.AddArrayContext):
        variable = ctx.variable().getText()
        index = self.visit(ctx.expression(0))
        value = self.visit(ctx.expression(1))

        buff = self.symbols.get_variable(ctx,variable)
        type_ = buff[-1]

        if not isinstance(index, Number):
            ErrorHandling.print_error_ctx(ctx,f"Index '{index}' must be a number")
            sys.exit(1)
        elif index < 0:
            ErrorHandling.print_error_ctx(ctx,f"Index '{index}' must be greater than 0")
            sys.exit(1)
        elif not isinstance(buff, list):
            ErrorHandling.print_error_ctx(ctx,f"Variable '{variable}' is not an array")
            sys.exit(1)
        
        elif not isinstance(value, parseType(type_)):
            ErrorHandling.print_error_ctx(ctx,f"Value '{value}' is not of type '{type_}'")
            sys.exit(1)
        
        buff.pop()
        if index >= len(buff):
            buff.append(value)
        else:
            buff[index] = value
        buff.append(type_)
        self.symbols.update_variable(ctx,variable, buff)
        
        return None
    
    def visitArray(self, ctx: ipdrawParser.ArrayContext):
        type_ = ctx.Type().getText()
        variable = ctx.variable().getText()
        buff=[]

        for expression in ctx.expression():
            value = self.visit(expression)
            if not isinstance(value, parseType(type_)):
                ErrorHandling.print_error_ctx(ctx,f"In the Array '{variable}'\n Value '{value}' is not of type '{type_}'")
                sys.exit(1)
            buff.append(value)
        buff.append(type_)

        self.symbols.add_variable(ctx,variable, buff, type_)
        return None



    def visitIfStatement(self, ctx: ipdrawParser.IfStatementContext):
        condition = self.visit(ctx.condition())
        if condition:
            for statement in ctx.statement():
                self.visit(statement)
            return None
        
        if ctx.elseIfBlock():
            for elifBlock in ctx.elseIfBlock():
                if self.visit(elifBlock):
                    return None

        if ctx.elseBlock():
            self.visit(ctx.elseBlock())

        return None

    def visitElseBlock(self, ctx: ipdrawParser.ElseBlockContext):
        for statement in ctx.statement():
            self.visit(statement)

        return None
    
    def visitElseIfBlock(self, ctx: ipdrawParser.ElseIfBlockContext):
        condition = self.visit(ctx.condition())
        if condition:
            for statement in ctx.statement():
                self.visit(statement)
            return True

        return False

    def visitWhileLoop(self, ctx: ipdrawParser.WhileLoopContext):
        cicle = ctx.cicle.text == 'while'

        """
        se for um while, ele vai executar enquanto a condição for verdadeira
        se for um until, ele vai executar enquanto a condição for falsa
        """
        while self.visit(ctx.condition()) == cicle:
            for statement in ctx.statement():
                self.visit(statement)

        return None

    def visitForLoop(self, ctx: ipdrawParser.ForLoopContext):
        self.visit(ctx.assignment(0))

        while self.visit(ctx.condition()):
            for statement in ctx.statement():
                self.visit(statement)

            self.visit(ctx.assignment(1))

        return None

    # TODO implementar breaks, continue e ...
    def visitFinallyBlock(self, ctx: ipdrawParser.FinallyBlockContext):

        return None
    
    def visitConditionNot(self, ctx: ipdrawParser.ConditionNotContext):
        return not self.visit(ctx.condition())

    def visitConditionEquals(self, ctx: ipdrawParser.ConditionEqualsContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        if handleCondition(ctx,exp1, exp2):
            return exp1 == exp2

    def visitConditionNotEquals(self, ctx: ipdrawParser.ConditionNotEqualsContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        if handleCondition(ctx,exp1, exp2):
            return exp1 != exp2

    def visitConditionLessThan(self, ctx: ipdrawParser.ConditionLessThanContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        if handleCondition(ctx,exp1, exp2):
            return exp1 < exp2

    def visitConditionGreaterThan(self, ctx: ipdrawParser.ConditionGreaterThanContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        if handleCondition(ctx,exp1, exp2):
            return exp1 > exp2

    def visitConditionLessEqual(self, ctx: ipdrawParser.ConditionLessEqualContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        if handleCondition(ctx,exp1, exp2):
            return exp1 <= exp2

    def visitConditionGreaterEqual(self, ctx: ipdrawParser.ConditionGreaterEqualContext):
        exp1 = self.visit(ctx.expression(0))
        exp2 = self.visit(ctx.expression(1))
        if handleCondition(ctx,exp1, exp2):
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
        amount = self.visit(ctx.expression())
        if not isinstance(amount, Number):
            ErrorHandling.print_error_ctx(ctx,f"Value '{amount}' is not a number")
            sys.exit(1)
            
        if move == 'forward':
            self.pen.forward(amount)
        elif move == 'backward':
            self.pen.backward(amount)

        return None

    def visitInstructionWriteAction(self, ctx: ipdrawParser.InstructionWriteActionContext):
        text = self.visit(ctx.expression(0))
        fontSize = self.visit(ctx.expression(1))
        if not isinstance(fontSize, Number):
            ErrorHandling.print_error_ctx(ctx,f"Value '{fontSize}' is not a number")
            sys.exit(1)
        
        if not isinstance(text, str):
            ErrorHandling.print_error_ctx(ctx,f"Value '{text}' is not a string")
            sys.exit(1)

        self.pen.write(text,fontSize)

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

    def visitIncdec(self, ctx: ipdrawParser.IncdecContext):
        variable = ctx.variable().getText()
        value = self.symbols.get_variable(ctx,variable)
        if not isinstance(value, Number):
            ErrorHandling.print_error_ctx(ctx,f"Variable '{variable}' is not a number")
            sys.exit(1)
        
        if ctx.op.text == '++':
            value += 1
        elif ctx.op.text == '--':
            value -= 1
        
        self.symbols.update_variable(ctx,variable, value)
        return value

    def visitAssignmentVar(self, ctx: ipdrawParser.AssignmentVarContext):
        tipo = ctx.Type().getText()
        i = 0
        
        for i, var in enumerate(ctx.variable()):
            value = self.visit(ctx.expression(i))
            self.symbols.add_variable(ctx,var.getText(), value, tipo)


        return None

    def visitReAssignmentVar(self, ctx: ipdrawParser.ReAssignmentVarContext):
        var_name = ctx.variable().getText()
        value = self.visit(ctx.expression())
        self.symbols.update_variable(ctx,var_name, value)

        return value

    def visitStdin(self, ctx: ipdrawParser.StdinContext):

        return input(self.visit(ctx.expression()))

    def visitPause(self, ctx: ipdrawParser.PauseContext):
        pause_time = self.visit(ctx.expression())
        if not isinstance(pause_time, Number):
            ErrorHandling.print_error_ctx(ctx,f"Value '{pause_time}' is not a number")
            sys.exit(1)

        time.sleep(pause_time / 1_000_000)  # Convert microseconds to seconds

        return None

    def visitStdout(self, ctx: ipdrawParser.StdoutContext):
        print(self.visit(ctx.expression()))

        return None

    def visitStderr(self, ctx: ipdrawParser.StderrContext):
        print(self.visit(ctx.expression()), file=sys.stderr)

        return None

    def visitVariable(self, ctx: ipdrawParser.VariableContext):

        return self.symbols.get_variable(ctx,ctx.getText())

    def visitExprAddSub(self, ctx: ipdrawParser.ExprAddSubContext):
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))
        if not (isinstance(left, Number) and isinstance(right, Number)):
            ErrorHandling.print_error_ctx(ctx,f"Values '{left}' and '{right}' are not numbers")
            sys.exit(1)

        if ctx.op.text == '+':
            return left + right
        elif ctx.op.text == '-':
            return left - right
        
    def visitExprArray(self, ctx: ipdrawParser.ExprArrayContext):
        return self.visit(ctx.getArray())
    
    def visitGetArray(self, ctx: ipdrawParser.GetArrayContext):
        variable = ctx.variable().getText()
        index = self.visit(ctx.expression())
        buff = self.symbols.get_variable(ctx,variable)

        if not isinstance(index, Number):
            ErrorHandling.print_error_ctx(ctx,f"Index '{index}' must be a number")
            sys.exit(1)
        elif index < 0 or index >= len(buff)-1:
            ErrorHandling.print_error_ctx(ctx,f"Index '{index}' out of range")
            sys.exit(1)
        elif not isinstance(buff, list):
            ErrorHandling.print_error_ctx(ctx,f"Variable '{variable}' is not an array")
            sys.exit(1)

        return buff[index]

    def visitExprLength(self, ctx: ipdrawParser.ExprLengthContext):
        return self.visit(ctx.getLength())
    
    def visitGetLength(self, ctx: ipdrawParser.GetLengthContext):
        variable = ctx.variable().getText()
        buff = self.symbols.get_variable(ctx,variable)
        if not isinstance(buff, list):
            ErrorHandling.print_error_ctx(ctx,f"Variable '{variable}' is not an array")
            sys.exit(1)

        return len(buff)-1

    def visitExprPow(self, ctx: ipdrawParser.ExprPowContext):
        left = self.visit(ctx.expression(0))
        right = self.visit(ctx.expression(1))
        if not (isinstance(left, Number) and isinstance(right, Number)):
            ErrorHandling.print_error_ctx(ctx,f"Values '{left}' and '{right}' are not numbers")
            sys.exit(1)
        try:
            return left ** right
        except:
            ErrorHandling.print_error_ctx(ctx,f"Value '{left}' cannot be raised to the power of '{right}'")
            sys.exit(1)

    def visitExprIncDec(self, ctx: ipdrawParser.ExprIncDecContext):
        return self.visit(ctx.incdec())

    def visitExprString(self, ctx: ipdrawParser.ExprStringContext):
        finalString = ""
        for string in ctx.STRING():
            finalString += string.getText()[1:-1]
        
        return finalString

    def visitExprCast(self, ctx: ipdrawParser.ExprCastContext):
        return self.visit(ctx.typeCast())

    def visitExprParent(self, ctx: ipdrawParser.ExprParentContext):

        return self.visit(ctx.expression())

    def visitExprUnary(self, ctx: ipdrawParser.ExprUnaryContext):
        expr = self.visit(ctx.expression())
        if not isinstance(expr, Number):
            ErrorHandling.print_error_ctx(ctx,f"Value '{expr}' is not a number")
            sys.exit(1)

        return - expr if ctx.op.text == '-' else expr

    def visitExprFloat(self, ctx: ipdrawParser.ExprFloatContext):

        return float(ctx.FLOAT().getText())

    def visitExprConst(self, ctx: ipdrawParser.ExprConstContext):
        match ctx.Constant().getText():
            case 'PI':
                return math.pi
            case 'E':
                return math.e
            case 'TAU':
                return math.tau
            case _:
                # Code never reaches here because of grammar
                return 1

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
        if not (isinstance(left, Number) and isinstance(right, Number)):
            ErrorHandling.print_error_ctx(ctx,f"Values '{left}' and '{right}' are not numbers")
            sys.exit(1)
        try:
            if ctx.op.text == '*':
                return left * right
            elif ctx.op.text == '/':
                return left / right
            elif ctx.op.text == 'mod':
                return left % right
            elif ctx.op.text == '//':
                return left // right
        except:
            ErrorHandling.print_error_ctx(ctx,f"Value '{left}' and '{right}' cannot be {ctx.op.text}")
            sys.exit(1)

    def visitTuple(self, ctx: ipdrawParser.TupleContext):
        expr1 = self.visit(ctx.expression(0))
        expr2 = self.visit(ctx.expression(1))
        if not (isinstance(expr1, Number) and isinstance(expr2, Number)):
            ErrorHandling.print_error_ctx(ctx,f"Values '{expr1}' and '{expr2}' are not numbers")
            sys.exit(1)
        return (expr1, expr2)

    def visitDegree(self, ctx: ipdrawParser.DegreeContext):
        expr = self.visit(ctx.expression())
        if not isinstance(expr, Number):
            ErrorHandling.print_error_ctx(ctx,f"Value '{expr}' is not a number")
            sys.exit(1)
        return expr

    def visitRadian(self, ctx: ipdrawParser.RadianContext):
        expr = self.visit(ctx.expression())
        if not isinstance(expr, Number):
            ErrorHandling.print_error_ctx(ctx,f"Value '{expr}' is not a number")
            sys.exit(1)

        return math.degrees(expr)

    def visitArrowColor(self, ctx: ipdrawParser.ArrowColorContext):
        self.pen.set_color(ctx.getText().replace('color', ''))
        #TODO cor meio estranha tipo ser um hexa com coisas extras, ou uma cor por inventar
        return None

    def visitArrowPosition(self, ctx: ipdrawParser.ArrowPositionContext):
        self.pen.set_position(self.visit(ctx.tuple_()))

        return None
    def visitArrowPosition(self, ctx: ipdrawParser.ArrowPositionContext):
        self.pen.set_speed(self.visit(ctx.expression()))

        return None

    def visitArrowOrientation(self, ctx: ipdrawParser.ArrowOrientationContext):
        self.pen.set_orientation(self.visit(ctx.angle()))

        return None

    def visitArrowPressure(self, ctx: ipdrawParser.ArrowPressureContext):
        expr = self.visit(ctx.expression())
        if not isinstance(expr, Number):
            ErrorHandling.print_error_ctx(ctx,f"Value '{expr}' is not a number")
            sys.exit(1)
        self.pen.set_pressure(expr)

        return None

    def visitArrowThickness(self, ctx: ipdrawParser.ArrowThicknessContext):
        expr = self.visit(ctx.expression())
        if not isinstance(expr, Number):
            ErrorHandling.print_error_ctx(ctx,f"Value '{expr}' is not a number")
            sys.exit(1)
        self.pen.set_thickness(expr)

        return None

    def visitTypeCast(self, ctx: ipdrawParser.TypeCastContext):

        tipo = ctx.Type().getText()
        try:
            if tipo == 'int':
                return int(self.visit(ctx.expression()))
            elif tipo == 'real':
                return float(self.visit(ctx.expression()))
            elif tipo == 'bool':
                return bool(self.visit(ctx.expression()))
            else:
                return str(self.visit(ctx.expression()))
        except:
            ErrorHandling.print_error_ctx(ctx,f"Value '{self.visit(ctx.expression())}' cannot be cast to '{tipo}'")
            sys.exit(1)
