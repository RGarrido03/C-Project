def visitMain(self, ctx):
    return self.visitChildren(ctx)

def visitAssignmentVar(self, ctx):
    var_type = ctx.Type().getText()
    var_name = ctx.variable().getText()
    value = self.visit(ctx.expression())
    self.symbols.define(var_name, value)
    return value

def visitReAssignmentVar(self, ctx):
    var_name = ctx.variable().getText()
    value = self.visit(ctx.expression())
    self.symbols.update(var_name, value)
    return value

def visitPrintStdout(self, ctx):
    value = self.visit(ctx.expression())
    print(value)
    return value

def visitPrintStderr(self, ctx):
    value = self.visit(ctx.expression())
    print(value, file=sys.stderr)
    return value

def visitPause(self, ctx):
    pause_time = int(ctx.INT().getText())
    time.sleep(pause_time / 1_000_000)  # Convert microseconds to seconds
    return None

def visitIfStatement(self, ctx):
    condition = self.visit(ctx.condition())
    if condition:
        for statement in ctx.statement():
            self.visit(statement)
    elif ctx.elseStatement():
        for statement in ctx.elseStatement().statement():
            self.visit(statement)
    return None

def visitWhileLoop(self, ctx):
    while self.visit(ctx.condition()):
        for statement in ctx.statement():
            self.visit(statement)
    return None

def visitForLoop(self, ctx):
    self.visit(ctx.assignment(0))  # Initial assignment
    while self.visit(ctx.condition()):  # Condition
        for statement in ctx.statement():
            self.visit(statement)
        self.visit(ctx.assignment(1))  # Increment assignment
    if ctx.finallyBlock():  # Finally block
        for statement in ctx.finallyBlock().statement():
            self.visit(statement)
    return None

def visitInstructionMoveAction(self, ctx):
    action = ctx.moveAction().getText()
    value = self.visit(ctx.expression())
    print(f"Move {action} by {value}")
    return None

def visitInstructionRotateAction(self, ctx):
    action = ctx.rotateAction().getText()
    value = self.visit(ctx.angle().expression())
    print(f"Rotate {action} by {value}")
    return None

def visitInstructionPenAction(self, ctx):
    action = ctx.penAction().getText()
    print(f"Pen {action}")
    return None

def visitInstructionArrowProps(self, ctx):
    prop = ctx.arrowProps().getText()
    if prop.startswith('color'):
        color = ctx.Word() or ctx.HexaColor()
        print(f"Set color to {color.getText()}")
    elif prop.startswith('position'):
        position = self.visit(ctx.tuple())
        print(f"Set position to {position}")
    elif prop.startswith('orientation'):
        orientation = self.visit(ctx.angle())
        print(f"Set orientation to {orientation}")
    elif prop.startswith('thickness'):
        thickness = self.visit(ctx.expression())
        print(f"Set thickness to {thickness}")
    elif prop.startswith('pressure'):
        pressure = self.visit(ctx.expression())
        print(f"Set pressure to {pressure}")
    return None

def visitExprAddSub(self, ctx):
    left = self.visit(ctx.expression(0))
    right = self.visit(ctx.expression(1))
    if ctx.op.type == ipdrawParser.ADD:
        return left + right
    elif ctx.op.type == ipdrawParser.SUB:
        return left - right

def visitExprMultDivMod(self, ctx):
    left = self.visit(ctx.expression(0))
    right = self.visit(ctx.expression(1))
    if ctx.op.type == ipdrawParser.MUL:
        return left * right
    elif ctx.op.type == ipdrawParser.DIV:
        return left / right
    elif ctx.op.type == ipdrawParser.MOD:
        return left % right

def visitExprAndOr(self, ctx):
    left = self.visit(ctx.expression(0))
    right = self.visit(ctx.expression(1))
    if ctx.op.type == ipdrawParser.AND:
        return left and right
    elif ctx.op.type == ipdrawParser.OR:
        return left or right

def visitExprComparison(self, ctx):
    left = self.visit(ctx.expression(0))
    right = self.visit(ctx.expression(1))
    if ctx.op.type == ipdrawParser.EQ:
        return left == right
    elif ctx.op.type == ipdrawParser.NE:
        return left != right
    elif ctx.op.type == ipdrawParser.LT:
        return left < right
    elif ctx.op.type == ipdrawParser.GT:
        return left > right
    elif ctx.op.type == ipdrawParser.LE:
        return left <= right
    elif ctx.op.type == ipdrawParser.GE:
        return left >= right

def visitExprUnary(self, ctx):
    value = self.visit(ctx.expression())
    if ctx.op.type == ipdrawParser.ADD:
        return value
    elif ctx.op.type == ipdrawParser.SUB:
        return -value

def visitExprNot(self, ctx):
    value = self.visit(ctx.condition())
    return not value

def visitExprPow(self, ctx):
    left = self.visit(ctx.expression(0))
    right = self.visit(ctx.expression(1))
    return left ** right

def visitExprCast(self, ctx):
    value = self.visit(ctx.expression())
    target_type = ctx.Type().getText()
    if target_type == 'int':
        return int(value)
    elif target_type == 'real':
        return float(value)
    elif target_type == 'string':
        return str(value)
    elif target_type == 'bool':
        return bool(value)

def visitExprStdIn(self, ctx):
    return input(self.visit(ctx.expression()))

def visitExprInteger(self, ctx):
    return int(ctx.INT().getText())

def visitExprFloat(self, ctx):
    return float(ctx.FLOAT().getText())

def visitExprString(self, ctx):
    return ctx.STRING().getText()[1:-1]  # Strip the quotes

def visitExprBool(self, ctx):
    return ctx.BOOL().getText() == 'true'

def visitExprVariable(self, ctx):
    var_name = ctx.variable().getText()
    return self.symbols.lookup(var_name)

def visitExprParent(self, ctx):
    return self.visit(ctx.expression())

def visitTuple(self, ctx):
    expr1 = self.visit(ctx.expression(0))
    expr2 = self.visit(ctx.expression(1))
    return (expr1, expr2)

def visitAngle(self, ctx):
    value = self.visit(ctx.expression())
    if ctx.d and ctx.d.text in ['º', 'deg']:
        return value  # Assuming it's already in degrees
    return value  # Assuming it's in radians if not specified otherwise