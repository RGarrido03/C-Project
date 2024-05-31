from antlr4 import *
from ipdrawParser import ipdrawParser
from ipdrawVisitor import ipdrawVisitor
import sys
import time

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
   
   
#Funcrions Scope TODO
class Scope:
   def __init__(self, name, parent=None):
      self.symbols: SymbolTable = SymbolTable()
      self.parent = parent
      self.name = name



class Interpreter(ipdrawVisitor):
   
   def __init__(self):
      self.symbol_table = SymbolTable()
      
      
   
   def visitMain(self, ctx:ipdrawParser.MainContext):
      print("visitMain") 
      return self.visitChildren(ctx)

   def visitStatement(self, ctx:ipdrawParser.StatementContext):
      return self.visitChildren(ctx)

   def visitIfStatement(self, ctx:ipdrawParser.IfStatementContext):
      return self.visitChildren(ctx)

   def visitWhileLoop(self, ctx:ipdrawParser.WhileLoopContext):
      return self.visitChildren(ctx)

   def visitForLoop(self, ctx:ipdrawParser.ForLoopContext):
      return self.visitChildren(ctx)

   def visitConditionNot(self, ctx:ipdrawParser.ConditionNotContext):
      return self.visitChildren(ctx)

   def visitConditionEquals(self, ctx:ipdrawParser.ConditionEqualsContext):
      return self.visitChildren(ctx)

   def visitConditionNotEquals(self, ctx:ipdrawParser.ConditionNotEqualsContext):
      return self.visitChildren(ctx)

   def visitConditionLessThan(self, ctx:ipdrawParser.ConditionLessThanContext):
      return self.visitChildren(ctx)

   def visitConditionGreaterThan(self, ctx:ipdrawParser.ConditionGreaterThanContext):
      return self.visitChildren(ctx)

   def visitConditionLessEqual(self, ctx:ipdrawParser.ConditionLessEqualContext):
      return self.visitChildren(ctx)

   def visitConditionGreaterEqual(self, ctx:ipdrawParser.ConditionGreaterEqualContext):
      return self.visitChildren(ctx)

   def visitConditionAnd(self, ctx:ipdrawParser.ConditionAndContext):
      return self.visitChildren(ctx)

   def visitConditionOr(self, ctx:ipdrawParser.ConditionOrContext):
      return self.visitChildren(ctx)

   def visitConditionParentheses(self, ctx:ipdrawParser.ConditionParenthesesContext):
      return self.visitChildren(ctx)

   def visitInstructionMoveAction(self, ctx:ipdrawParser.InstructionMoveActionContext):
      return self.visitChildren(ctx)

   def visitInstructionRotateAction(self, ctx:ipdrawParser.InstructionRotateActionContext):
      return self.visitChildren(ctx)

   def visitInstructionPenAction(self, ctx:ipdrawParser.InstructionPenActionContext):
      return self.visitChildren(ctx)

   def visitInstructionArrowProps(self, ctx:ipdrawParser.InstructionArrowPropsContext):
      return self.visitChildren(ctx)

   def visitAssignmentVar(self, ctx:ipdrawParser.AssignmentVarContext):
      var_type = ctx.Type().getText()
      var_name = ctx.variable().getText()
      value = self.visit(ctx.expression())
      self.symbols.define(var_name, value)
      
      return value

   def visitReAssignmentVar(self, ctx:ipdrawParser.ReAssignmentVarContext):      
      var_name = ctx.variable().getText()
      value = self.visit(ctx.expression())
      self.symbols.update(var_name, value)
      
      return value

   def visitStdin(self, ctx:ipdrawParser.StdinContext):
      return self.visitChildren(ctx)

   def visitPause(self, ctx:ipdrawParser.PauseContext):
      pause_time = int(ctx.INT().getText())
      time.sleep(pause_time / 1_000_000)  # Convert microseconds to seconds
      return None

   def visitStdout(self, ctx:ipdrawParser.StdoutContext):
      value = self.visit(ctx.expression())
      print(value)
      
      return value

   def visitStderr(self, ctx:ipdrawParser.StderrContext):
      value = self.visit(ctx.expression())
      print(value, file=sys.stderr)
      
      return value

   def visitVariable(self, ctx:ipdrawParser.VariableContext):
      return self.visitChildren(ctx)

   def visitExprAddSub(self, ctx:ipdrawParser.ExprAddSubContext):
      return self.visitChildren(ctx)

   def visitExprPow(self, ctx:ipdrawParser.ExprPowContext):
      return self.visitChildren(ctx)

   def visitExprString(self, ctx:ipdrawParser.ExprStringContext):
      return self.visitChildren(ctx)

   def visitExprCast(self, ctx:ipdrawParser.ExprCastContext):
      return self.visitChildren(ctx)

   def visitExprParent(self, ctx:ipdrawParser.ExprParentContext):
      return self.visit(ctx.expression())

   def visitExprUnary(self, ctx:ipdrawParser.ExprUnaryContext):
      return self.visitChildren(ctx)

   def visitExprFloat(self, ctx:ipdrawParser.ExprFloatContext):
      return self.visitChildren(ctx)

   def visitExprStdIn(self, ctx:ipdrawParser.ExprStdInContext):
      return self.visitChildren(ctx)

   def visitExprInteger(self, ctx:ipdrawParser.ExprIntegerContext):
      return self.visitChildren(ctx)

   def visitExprBool(self, ctx:ipdrawParser.ExprBoolContext):
      return ctx.BOOL().getText() == 'true'


   def visitExprVariable(self, ctx:ipdrawParser.ExprVariableContext):
      var_name = ctx.variable().getText()
      return self.symbols.lookup(var_name)

   def visitExprMultDivMod(self, ctx:ipdrawParser.ExprMultDivModContext):
      left = self.visit(ctx.expression(0))
      right = self.visit(ctx.expression(1))
      if ctx.op.type == ipdrawParser.MUL:
         return left * right
      elif ctx.op.type == ipdrawParser.DIV:
         return left / right
      elif ctx.op.type == ipdrawParser.MOD:
         return left % right

   def visitTuple(self, ctx:ipdrawParser.TupleContext):
      expr1 = self.visit(ctx.expression(0))
      expr2 = self.visit(ctx.expression(1))
      return (expr1, expr2)

   def visitDegree(self, ctx:ipdrawParser.DegreeContext):
      return self.visitChildren(ctx)

   def visitRadian(self, ctx:ipdrawParser.RadianContext):
      return self.visitChildren(ctx)

   def visitLeft(self, ctx:ipdrawParser.LeftContext):
      return self.visitChildren(ctx)

   def visitRight(self, ctx:ipdrawParser.RightContext):
      return self.visitChildren(ctx)

   def visitForward(self, ctx:ipdrawParser.ForwardContext):
      return self.visitChildren(ctx)

   def visitBackward(self, ctx:ipdrawParser.BackwardContext):
      return self.visitChildren(ctx)

   def visitDown(self, ctx:ipdrawParser.DownContext):
      return self.visitChildren(ctx)

   def visitUp(self, ctx:ipdrawParser.UpContext):
      return self.visitChildren(ctx)

   def visitArrowProps(self, ctx:ipdrawParser.ArrowPropsContext):
      return self.visitChildren(ctx)

   def visitTypeCast(self, ctx:ipdrawParser.TypeCastContext):
      return self.visitChildren(ctx)





