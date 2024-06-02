# Generated from ipdraw.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ipdrawParser import ipdrawParser
else:
    from ipdrawParser import ipdrawParser

# This class defines a complete listener for a parse tree produced by ipdrawParser.
class ipdrawListener(ParseTreeListener):

    # Enter a parse tree produced by ipdrawParser#main.
    def enterMain(self, ctx:ipdrawParser.MainContext):
        pass

    # Exit a parse tree produced by ipdrawParser#main.
    def exitMain(self, ctx:ipdrawParser.MainContext):
        pass


    # Enter a parse tree produced by ipdrawParser#statement.
    def enterStatement(self, ctx:ipdrawParser.StatementContext):
        pass

    # Exit a parse tree produced by ipdrawParser#statement.
    def exitStatement(self, ctx:ipdrawParser.StatementContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ifStatement.
    def enterIfStatement(self, ctx:ipdrawParser.IfStatementContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ifStatement.
    def exitIfStatement(self, ctx:ipdrawParser.IfStatementContext):
        pass


    # Enter a parse tree produced by ipdrawParser#elseIfBlock.
    def enterElseIfBlock(self, ctx:ipdrawParser.ElseIfBlockContext):
        pass

    # Exit a parse tree produced by ipdrawParser#elseIfBlock.
    def exitElseIfBlock(self, ctx:ipdrawParser.ElseIfBlockContext):
        pass


    # Enter a parse tree produced by ipdrawParser#elseBlock.
    def enterElseBlock(self, ctx:ipdrawParser.ElseBlockContext):
        pass

    # Exit a parse tree produced by ipdrawParser#elseBlock.
    def exitElseBlock(self, ctx:ipdrawParser.ElseBlockContext):
        pass


    # Enter a parse tree produced by ipdrawParser#whileLoop.
    def enterWhileLoop(self, ctx:ipdrawParser.WhileLoopContext):
        pass

    # Exit a parse tree produced by ipdrawParser#whileLoop.
    def exitWhileLoop(self, ctx:ipdrawParser.WhileLoopContext):
        pass


    # Enter a parse tree produced by ipdrawParser#forLoop.
    def enterForLoop(self, ctx:ipdrawParser.ForLoopContext):
        pass

    # Exit a parse tree produced by ipdrawParser#forLoop.
    def exitForLoop(self, ctx:ipdrawParser.ForLoopContext):
        pass


    # Enter a parse tree produced by ipdrawParser#finallyBlock.
    def enterFinallyBlock(self, ctx:ipdrawParser.FinallyBlockContext):
        pass

    # Exit a parse tree produced by ipdrawParser#finallyBlock.
    def exitFinallyBlock(self, ctx:ipdrawParser.FinallyBlockContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionNot.
    def enterConditionNot(self, ctx:ipdrawParser.ConditionNotContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionNot.
    def exitConditionNot(self, ctx:ipdrawParser.ConditionNotContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionEquals.
    def enterConditionEquals(self, ctx:ipdrawParser.ConditionEqualsContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionEquals.
    def exitConditionEquals(self, ctx:ipdrawParser.ConditionEqualsContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionNotEquals.
    def enterConditionNotEquals(self, ctx:ipdrawParser.ConditionNotEqualsContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionNotEquals.
    def exitConditionNotEquals(self, ctx:ipdrawParser.ConditionNotEqualsContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionLessThan.
    def enterConditionLessThan(self, ctx:ipdrawParser.ConditionLessThanContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionLessThan.
    def exitConditionLessThan(self, ctx:ipdrawParser.ConditionLessThanContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionGreaterThan.
    def enterConditionGreaterThan(self, ctx:ipdrawParser.ConditionGreaterThanContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionGreaterThan.
    def exitConditionGreaterThan(self, ctx:ipdrawParser.ConditionGreaterThanContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionLessEqual.
    def enterConditionLessEqual(self, ctx:ipdrawParser.ConditionLessEqualContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionLessEqual.
    def exitConditionLessEqual(self, ctx:ipdrawParser.ConditionLessEqualContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionGreaterEqual.
    def enterConditionGreaterEqual(self, ctx:ipdrawParser.ConditionGreaterEqualContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionGreaterEqual.
    def exitConditionGreaterEqual(self, ctx:ipdrawParser.ConditionGreaterEqualContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionAnd.
    def enterConditionAnd(self, ctx:ipdrawParser.ConditionAndContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionAnd.
    def exitConditionAnd(self, ctx:ipdrawParser.ConditionAndContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionOr.
    def enterConditionOr(self, ctx:ipdrawParser.ConditionOrContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionOr.
    def exitConditionOr(self, ctx:ipdrawParser.ConditionOrContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ConditionParentheses.
    def enterConditionParentheses(self, ctx:ipdrawParser.ConditionParenthesesContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ConditionParentheses.
    def exitConditionParentheses(self, ctx:ipdrawParser.ConditionParenthesesContext):
        pass


    # Enter a parse tree produced by ipdrawParser#InstructionMoveAction.
    def enterInstructionMoveAction(self, ctx:ipdrawParser.InstructionMoveActionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#InstructionMoveAction.
    def exitInstructionMoveAction(self, ctx:ipdrawParser.InstructionMoveActionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#InstructionWriteAction.
    def enterInstructionWriteAction(self, ctx:ipdrawParser.InstructionWriteActionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#InstructionWriteAction.
    def exitInstructionWriteAction(self, ctx:ipdrawParser.InstructionWriteActionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#InstructionRotateAction.
    def enterInstructionRotateAction(self, ctx:ipdrawParser.InstructionRotateActionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#InstructionRotateAction.
    def exitInstructionRotateAction(self, ctx:ipdrawParser.InstructionRotateActionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#InstructionPenAction.
    def enterInstructionPenAction(self, ctx:ipdrawParser.InstructionPenActionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#InstructionPenAction.
    def exitInstructionPenAction(self, ctx:ipdrawParser.InstructionPenActionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#InstructionArrowProps.
    def enterInstructionArrowProps(self, ctx:ipdrawParser.InstructionArrowPropsContext):
        pass

    # Exit a parse tree produced by ipdrawParser#InstructionArrowProps.
    def exitInstructionArrowProps(self, ctx:ipdrawParser.InstructionArrowPropsContext):
        pass


    # Enter a parse tree produced by ipdrawParser#AssignmentVar.
    def enterAssignmentVar(self, ctx:ipdrawParser.AssignmentVarContext):
        pass

    # Exit a parse tree produced by ipdrawParser#AssignmentVar.
    def exitAssignmentVar(self, ctx:ipdrawParser.AssignmentVarContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ReAssignmentVar.
    def enterReAssignmentVar(self, ctx:ipdrawParser.ReAssignmentVarContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ReAssignmentVar.
    def exitReAssignmentVar(self, ctx:ipdrawParser.ReAssignmentVarContext):
        pass


    # Enter a parse tree produced by ipdrawParser#stdin.
    def enterStdin(self, ctx:ipdrawParser.StdinContext):
        pass

    # Exit a parse tree produced by ipdrawParser#stdin.
    def exitStdin(self, ctx:ipdrawParser.StdinContext):
        pass


    # Enter a parse tree produced by ipdrawParser#pause.
    def enterPause(self, ctx:ipdrawParser.PauseContext):
        pass

    # Exit a parse tree produced by ipdrawParser#pause.
    def exitPause(self, ctx:ipdrawParser.PauseContext):
        pass


    # Enter a parse tree produced by ipdrawParser#stdout.
    def enterStdout(self, ctx:ipdrawParser.StdoutContext):
        pass

    # Exit a parse tree produced by ipdrawParser#stdout.
    def exitStdout(self, ctx:ipdrawParser.StdoutContext):
        pass


    # Enter a parse tree produced by ipdrawParser#stderr.
    def enterStderr(self, ctx:ipdrawParser.StderrContext):
        pass

    # Exit a parse tree produced by ipdrawParser#stderr.
    def exitStderr(self, ctx:ipdrawParser.StderrContext):
        pass


    # Enter a parse tree produced by ipdrawParser#variable.
    def enterVariable(self, ctx:ipdrawParser.VariableContext):
        pass

    # Exit a parse tree produced by ipdrawParser#variable.
    def exitVariable(self, ctx:ipdrawParser.VariableContext):
        pass


    # Enter a parse tree produced by ipdrawParser#incdec.
    def enterIncdec(self, ctx:ipdrawParser.IncdecContext):
        pass

    # Exit a parse tree produced by ipdrawParser#incdec.
    def exitIncdec(self, ctx:ipdrawParser.IncdecContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprString.
    def enterExprString(self, ctx:ipdrawParser.ExprStringContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprString.
    def exitExprString(self, ctx:ipdrawParser.ExprStringContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprParent.
    def enterExprParent(self, ctx:ipdrawParser.ExprParentContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprParent.
    def exitExprParent(self, ctx:ipdrawParser.ExprParentContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprFloat.
    def enterExprFloat(self, ctx:ipdrawParser.ExprFloatContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprFloat.
    def exitExprFloat(self, ctx:ipdrawParser.ExprFloatContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprIncDec.
    def enterExprIncDec(self, ctx:ipdrawParser.ExprIncDecContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprIncDec.
    def exitExprIncDec(self, ctx:ipdrawParser.ExprIncDecContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprMultDivMod.
    def enterExprMultDivMod(self, ctx:ipdrawParser.ExprMultDivModContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprMultDivMod.
    def exitExprMultDivMod(self, ctx:ipdrawParser.ExprMultDivModContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprAddSub.
    def enterExprAddSub(self, ctx:ipdrawParser.ExprAddSubContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprAddSub.
    def exitExprAddSub(self, ctx:ipdrawParser.ExprAddSubContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprPow.
    def enterExprPow(self, ctx:ipdrawParser.ExprPowContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprPow.
    def exitExprPow(self, ctx:ipdrawParser.ExprPowContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprCast.
    def enterExprCast(self, ctx:ipdrawParser.ExprCastContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprCast.
    def exitExprCast(self, ctx:ipdrawParser.ExprCastContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprUnary.
    def enterExprUnary(self, ctx:ipdrawParser.ExprUnaryContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprUnary.
    def exitExprUnary(self, ctx:ipdrawParser.ExprUnaryContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprStdIn.
    def enterExprStdIn(self, ctx:ipdrawParser.ExprStdInContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprStdIn.
    def exitExprStdIn(self, ctx:ipdrawParser.ExprStdInContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprInteger.
    def enterExprInteger(self, ctx:ipdrawParser.ExprIntegerContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprInteger.
    def exitExprInteger(self, ctx:ipdrawParser.ExprIntegerContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprBool.
    def enterExprBool(self, ctx:ipdrawParser.ExprBoolContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprBool.
    def exitExprBool(self, ctx:ipdrawParser.ExprBoolContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ExprVariable.
    def enterExprVariable(self, ctx:ipdrawParser.ExprVariableContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ExprVariable.
    def exitExprVariable(self, ctx:ipdrawParser.ExprVariableContext):
        pass


    # Enter a parse tree produced by ipdrawParser#tuple.
    def enterTuple(self, ctx:ipdrawParser.TupleContext):
        pass

    # Exit a parse tree produced by ipdrawParser#tuple.
    def exitTuple(self, ctx:ipdrawParser.TupleContext):
        pass


    # Enter a parse tree produced by ipdrawParser#Degree.
    def enterDegree(self, ctx:ipdrawParser.DegreeContext):
        pass

    # Exit a parse tree produced by ipdrawParser#Degree.
    def exitDegree(self, ctx:ipdrawParser.DegreeContext):
        pass


    # Enter a parse tree produced by ipdrawParser#Radian.
    def enterRadian(self, ctx:ipdrawParser.RadianContext):
        pass

    # Exit a parse tree produced by ipdrawParser#Radian.
    def exitRadian(self, ctx:ipdrawParser.RadianContext):
        pass


    # Enter a parse tree produced by ipdrawParser#rotateAction.
    def enterRotateAction(self, ctx:ipdrawParser.RotateActionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#rotateAction.
    def exitRotateAction(self, ctx:ipdrawParser.RotateActionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#moveAction.
    def enterMoveAction(self, ctx:ipdrawParser.MoveActionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#moveAction.
    def exitMoveAction(self, ctx:ipdrawParser.MoveActionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#penAction.
    def enterPenAction(self, ctx:ipdrawParser.PenActionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#penAction.
    def exitPenAction(self, ctx:ipdrawParser.PenActionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ArrowColor.
    def enterArrowColor(self, ctx:ipdrawParser.ArrowColorContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ArrowColor.
    def exitArrowColor(self, ctx:ipdrawParser.ArrowColorContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ArrowPosition.
    def enterArrowPosition(self, ctx:ipdrawParser.ArrowPositionContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ArrowPosition.
    def exitArrowPosition(self, ctx:ipdrawParser.ArrowPositionContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ArrowOrientation.
    def enterArrowOrientation(self, ctx:ipdrawParser.ArrowOrientationContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ArrowOrientation.
    def exitArrowOrientation(self, ctx:ipdrawParser.ArrowOrientationContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ArrowThickness.
    def enterArrowThickness(self, ctx:ipdrawParser.ArrowThicknessContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ArrowThickness.
    def exitArrowThickness(self, ctx:ipdrawParser.ArrowThicknessContext):
        pass


    # Enter a parse tree produced by ipdrawParser#ArrowPressure.
    def enterArrowPressure(self, ctx:ipdrawParser.ArrowPressureContext):
        pass

    # Exit a parse tree produced by ipdrawParser#ArrowPressure.
    def exitArrowPressure(self, ctx:ipdrawParser.ArrowPressureContext):
        pass


    # Enter a parse tree produced by ipdrawParser#typeCast.
    def enterTypeCast(self, ctx:ipdrawParser.TypeCastContext):
        pass

    # Exit a parse tree produced by ipdrawParser#typeCast.
    def exitTypeCast(self, ctx:ipdrawParser.TypeCastContext):
        pass



del ipdrawParser