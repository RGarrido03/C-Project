# Generated from ipdraw.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ipdrawParser import ipdrawParser
else:
    from ipdrawParser import ipdrawParser

# This class defines a complete generic visitor for a parse tree produced by ipdrawParser.

class ipdrawVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ipdrawParser#main.
    def visitMain(self, ctx:ipdrawParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#statement.
    def visitStatement(self, ctx:ipdrawParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#array.
    def visitArray(self, ctx:ipdrawParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#addArray.
    def visitAddArray(self, ctx:ipdrawParser.AddArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#removeArray.
    def visitRemoveArray(self, ctx:ipdrawParser.RemoveArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#getLength.
    def visitGetLength(self, ctx:ipdrawParser.GetLengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#getArray.
    def visitGetArray(self, ctx:ipdrawParser.GetArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ifStatement.
    def visitIfStatement(self, ctx:ipdrawParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#elseIfBlock.
    def visitElseIfBlock(self, ctx:ipdrawParser.ElseIfBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#elseBlock.
    def visitElseBlock(self, ctx:ipdrawParser.ElseBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#whileLoop.
    def visitWhileLoop(self, ctx:ipdrawParser.WhileLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#forLoop.
    def visitForLoop(self, ctx:ipdrawParser.ForLoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#finallyBlock.
    def visitFinallyBlock(self, ctx:ipdrawParser.FinallyBlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionNot.
    def visitConditionNot(self, ctx:ipdrawParser.ConditionNotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionEquals.
    def visitConditionEquals(self, ctx:ipdrawParser.ConditionEqualsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionNotEquals.
    def visitConditionNotEquals(self, ctx:ipdrawParser.ConditionNotEqualsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionLessThan.
    def visitConditionLessThan(self, ctx:ipdrawParser.ConditionLessThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionGreaterThan.
    def visitConditionGreaterThan(self, ctx:ipdrawParser.ConditionGreaterThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionLessEqual.
    def visitConditionLessEqual(self, ctx:ipdrawParser.ConditionLessEqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionGreaterEqual.
    def visitConditionGreaterEqual(self, ctx:ipdrawParser.ConditionGreaterEqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionAnd.
    def visitConditionAnd(self, ctx:ipdrawParser.ConditionAndContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionOr.
    def visitConditionOr(self, ctx:ipdrawParser.ConditionOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ConditionParentheses.
    def visitConditionParentheses(self, ctx:ipdrawParser.ConditionParenthesesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#InstructionMoveAction.
    def visitInstructionMoveAction(self, ctx:ipdrawParser.InstructionMoveActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#InstructionWriteAction.
    def visitInstructionWriteAction(self, ctx:ipdrawParser.InstructionWriteActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#InstructionRotateAction.
    def visitInstructionRotateAction(self, ctx:ipdrawParser.InstructionRotateActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#InstructionPenAction.
    def visitInstructionPenAction(self, ctx:ipdrawParser.InstructionPenActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#InstructionArrowProps.
    def visitInstructionArrowProps(self, ctx:ipdrawParser.InstructionArrowPropsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#AssignmentVar.
    def visitAssignmentVar(self, ctx:ipdrawParser.AssignmentVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ReAssignmentVar.
    def visitReAssignmentVar(self, ctx:ipdrawParser.ReAssignmentVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#stdin.
    def visitStdin(self, ctx:ipdrawParser.StdinContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#pause.
    def visitPause(self, ctx:ipdrawParser.PauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#stdout.
    def visitStdout(self, ctx:ipdrawParser.StdoutContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#stderr.
    def visitStderr(self, ctx:ipdrawParser.StderrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#variable.
    def visitVariable(self, ctx:ipdrawParser.VariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#incdec.
    def visitIncdec(self, ctx:ipdrawParser.IncdecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprString.
    def visitExprString(self, ctx:ipdrawParser.ExprStringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprParent.
    def visitExprParent(self, ctx:ipdrawParser.ExprParentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprLength.
    def visitExprLength(self, ctx:ipdrawParser.ExprLengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprFloat.
    def visitExprFloat(self, ctx:ipdrawParser.ExprFloatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprIncDec.
    def visitExprIncDec(self, ctx:ipdrawParser.ExprIncDecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprArray.
    def visitExprArray(self, ctx:ipdrawParser.ExprArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprMultDivMod.
    def visitExprMultDivMod(self, ctx:ipdrawParser.ExprMultDivModContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprAddSub.
    def visitExprAddSub(self, ctx:ipdrawParser.ExprAddSubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprPow.
    def visitExprPow(self, ctx:ipdrawParser.ExprPowContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprCast.
    def visitExprCast(self, ctx:ipdrawParser.ExprCastContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprUnary.
    def visitExprUnary(self, ctx:ipdrawParser.ExprUnaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprStdIn.
    def visitExprStdIn(self, ctx:ipdrawParser.ExprStdInContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprInteger.
    def visitExprInteger(self, ctx:ipdrawParser.ExprIntegerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprBool.
    def visitExprBool(self, ctx:ipdrawParser.ExprBoolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ExprVariable.
    def visitExprVariable(self, ctx:ipdrawParser.ExprVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#tuple.
    def visitTuple(self, ctx:ipdrawParser.TupleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#Degree.
    def visitDegree(self, ctx:ipdrawParser.DegreeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#Radian.
    def visitRadian(self, ctx:ipdrawParser.RadianContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#rotateAction.
    def visitRotateAction(self, ctx:ipdrawParser.RotateActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#moveAction.
    def visitMoveAction(self, ctx:ipdrawParser.MoveActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#penAction.
    def visitPenAction(self, ctx:ipdrawParser.PenActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ArrowColor.
    def visitArrowColor(self, ctx:ipdrawParser.ArrowColorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ArrowPosition.
    def visitArrowPosition(self, ctx:ipdrawParser.ArrowPositionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ArrowOrientation.
    def visitArrowOrientation(self, ctx:ipdrawParser.ArrowOrientationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ArrowThickness.
    def visitArrowThickness(self, ctx:ipdrawParser.ArrowThicknessContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#ArrowPressure.
    def visitArrowPressure(self, ctx:ipdrawParser.ArrowPressureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ipdrawParser#typeCast.
    def visitTypeCast(self, ctx:ipdrawParser.TypeCastContext):
        return self.visitChildren(ctx)



del ipdrawParser