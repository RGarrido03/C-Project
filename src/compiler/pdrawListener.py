# Generated from pdraw.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .pdrawParser import pdrawParser
else:
    from pdrawParser import pdrawParser

# This class defines a complete listener for a parse tree produced by pdrawParser.
class pdrawListener(ParseTreeListener):

    # Enter a parse tree produced by pdrawParser#main.
    def enterMain(self, ctx:pdrawParser.MainContext):
        pass

    # Exit a parse tree produced by pdrawParser#main.
    def exitMain(self, ctx:pdrawParser.MainContext):
        pass


    # Enter a parse tree produced by pdrawParser#statement.
    def enterStatement(self, ctx:pdrawParser.StatementContext):
        pass

    # Exit a parse tree produced by pdrawParser#statement.
    def exitStatement(self, ctx:pdrawParser.StatementContext):
        pass


    # Enter a parse tree produced by pdrawParser#if.
    def enterIf(self, ctx:pdrawParser.IfContext):
        pass

    # Exit a parse tree produced by pdrawParser#if.
    def exitIf(self, ctx:pdrawParser.IfContext):
        pass


    # Enter a parse tree produced by pdrawParser#ConditionEquals.
    def enterConditionEquals(self, ctx:pdrawParser.ConditionEqualsContext):
        pass

    # Exit a parse tree produced by pdrawParser#ConditionEquals.
    def exitConditionEquals(self, ctx:pdrawParser.ConditionEqualsContext):
        pass


    # Enter a parse tree produced by pdrawParser#ConditionNotEquals.
    def enterConditionNotEquals(self, ctx:pdrawParser.ConditionNotEqualsContext):
        pass

    # Exit a parse tree produced by pdrawParser#ConditionNotEquals.
    def exitConditionNotEquals(self, ctx:pdrawParser.ConditionNotEqualsContext):
        pass


    # Enter a parse tree produced by pdrawParser#InstructionMoveAction.
    def enterInstructionMoveAction(self, ctx:pdrawParser.InstructionMoveActionContext):
        pass

    # Exit a parse tree produced by pdrawParser#InstructionMoveAction.
    def exitInstructionMoveAction(self, ctx:pdrawParser.InstructionMoveActionContext):
        pass


    # Enter a parse tree produced by pdrawParser#InstructionRotateAction.
    def enterInstructionRotateAction(self, ctx:pdrawParser.InstructionRotateActionContext):
        pass

    # Exit a parse tree produced by pdrawParser#InstructionRotateAction.
    def exitInstructionRotateAction(self, ctx:pdrawParser.InstructionRotateActionContext):
        pass


    # Enter a parse tree produced by pdrawParser#InstructionPenAction.
    def enterInstructionPenAction(self, ctx:pdrawParser.InstructionPenActionContext):
        pass

    # Exit a parse tree produced by pdrawParser#InstructionPenAction.
    def exitInstructionPenAction(self, ctx:pdrawParser.InstructionPenActionContext):
        pass


    # Enter a parse tree produced by pdrawParser#InstructionArrowProps.
    def enterInstructionArrowProps(self, ctx:pdrawParser.InstructionArrowPropsContext):
        pass

    # Exit a parse tree produced by pdrawParser#InstructionArrowProps.
    def exitInstructionArrowProps(self, ctx:pdrawParser.InstructionArrowPropsContext):
        pass


    # Enter a parse tree produced by pdrawParser#AssignmentVar.
    def enterAssignmentVar(self, ctx:pdrawParser.AssignmentVarContext):
        pass

    # Exit a parse tree produced by pdrawParser#AssignmentVar.
    def exitAssignmentVar(self, ctx:pdrawParser.AssignmentVarContext):
        pass


    # Enter a parse tree produced by pdrawParser#AssignmentPen.
    def enterAssignmentPen(self, ctx:pdrawParser.AssignmentPenContext):
        pass

    # Exit a parse tree produced by pdrawParser#AssignmentPen.
    def exitAssignmentPen(self, ctx:pdrawParser.AssignmentPenContext):
        pass


    # Enter a parse tree produced by pdrawParser#ReAssignmentVar.
    def enterReAssignmentVar(self, ctx:pdrawParser.ReAssignmentVarContext):
        pass

    # Exit a parse tree produced by pdrawParser#ReAssignmentVar.
    def exitReAssignmentVar(self, ctx:pdrawParser.ReAssignmentVarContext):
        pass


    # Enter a parse tree produced by pdrawParser#stdin.
    def enterStdin(self, ctx:pdrawParser.StdinContext):
        pass

    # Exit a parse tree produced by pdrawParser#stdin.
    def exitStdin(self, ctx:pdrawParser.StdinContext):
        pass


    # Enter a parse tree produced by pdrawParser#pause.
    def enterPause(self, ctx:pdrawParser.PauseContext):
        pass

    # Exit a parse tree produced by pdrawParser#pause.
    def exitPause(self, ctx:pdrawParser.PauseContext):
        pass


    # Enter a parse tree produced by pdrawParser#stdout.
    def enterStdout(self, ctx:pdrawParser.StdoutContext):
        pass

    # Exit a parse tree produced by pdrawParser#stdout.
    def exitStdout(self, ctx:pdrawParser.StdoutContext):
        pass


    # Enter a parse tree produced by pdrawParser#stderr.
    def enterStderr(self, ctx:pdrawParser.StderrContext):
        pass

    # Exit a parse tree produced by pdrawParser#stderr.
    def exitStderr(self, ctx:pdrawParser.StderrContext):
        pass


    # Enter a parse tree produced by pdrawParser#execute.
    def enterExecute(self, ctx:pdrawParser.ExecuteContext):
        pass

    # Exit a parse tree produced by pdrawParser#execute.
    def exitExecute(self, ctx:pdrawParser.ExecuteContext):
        pass


    # Enter a parse tree produced by pdrawParser#CreateCanvas.
    def enterCreateCanvas(self, ctx:pdrawParser.CreateCanvasContext):
        pass

    # Exit a parse tree produced by pdrawParser#CreateCanvas.
    def exitCreateCanvas(self, ctx:pdrawParser.CreateCanvasContext):
        pass


    # Enter a parse tree produced by pdrawParser#CreatePen.
    def enterCreatePen(self, ctx:pdrawParser.CreatePenContext):
        pass

    # Exit a parse tree produced by pdrawParser#CreatePen.
    def exitCreatePen(self, ctx:pdrawParser.CreatePenContext):
        pass


    # Enter a parse tree produced by pdrawParser#classProps.
    def enterClassProps(self, ctx:pdrawParser.ClassPropsContext):
        pass

    # Exit a parse tree produced by pdrawParser#classProps.
    def exitClassProps(self, ctx:pdrawParser.ClassPropsContext):
        pass


    # Enter a parse tree produced by pdrawParser#arrowProps.
    def enterArrowProps(self, ctx:pdrawParser.ArrowPropsContext):
        pass

    # Exit a parse tree produced by pdrawParser#arrowProps.
    def exitArrowProps(self, ctx:pdrawParser.ArrowPropsContext):
        pass


    # Enter a parse tree produced by pdrawParser#object.
    def enterObject(self, ctx:pdrawParser.ObjectContext):
        pass

    # Exit a parse tree produced by pdrawParser#object.
    def exitObject(self, ctx:pdrawParser.ObjectContext):
        pass


    # Enter a parse tree produced by pdrawParser#variable.
    def enterVariable(self, ctx:pdrawParser.VariableContext):
        pass

    # Exit a parse tree produced by pdrawParser#variable.
    def exitVariable(self, ctx:pdrawParser.VariableContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprAddSub.
    def enterExprAddSub(self, ctx:pdrawParser.ExprAddSubContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprAddSub.
    def exitExprAddSub(self, ctx:pdrawParser.ExprAddSubContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprPow.
    def enterExprPow(self, ctx:pdrawParser.ExprPowContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprPow.
    def exitExprPow(self, ctx:pdrawParser.ExprPowContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprString.
    def enterExprString(self, ctx:pdrawParser.ExprStringContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprString.
    def exitExprString(self, ctx:pdrawParser.ExprStringContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprCast.
    def enterExprCast(self, ctx:pdrawParser.ExprCastContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprCast.
    def exitExprCast(self, ctx:pdrawParser.ExprCastContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprParent.
    def enterExprParent(self, ctx:pdrawParser.ExprParentContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprParent.
    def exitExprParent(self, ctx:pdrawParser.ExprParentContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprUnary.
    def enterExprUnary(self, ctx:pdrawParser.ExprUnaryContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprUnary.
    def exitExprUnary(self, ctx:pdrawParser.ExprUnaryContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprFloat.
    def enterExprFloat(self, ctx:pdrawParser.ExprFloatContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprFloat.
    def exitExprFloat(self, ctx:pdrawParser.ExprFloatContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprStdIn.
    def enterExprStdIn(self, ctx:pdrawParser.ExprStdInContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprStdIn.
    def exitExprStdIn(self, ctx:pdrawParser.ExprStdInContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprInteger.
    def enterExprInteger(self, ctx:pdrawParser.ExprIntegerContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprInteger.
    def exitExprInteger(self, ctx:pdrawParser.ExprIntegerContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprBool.
    def enterExprBool(self, ctx:pdrawParser.ExprBoolContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprBool.
    def exitExprBool(self, ctx:pdrawParser.ExprBoolContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprVariable.
    def enterExprVariable(self, ctx:pdrawParser.ExprVariableContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprVariable.
    def exitExprVariable(self, ctx:pdrawParser.ExprVariableContext):
        pass


    # Enter a parse tree produced by pdrawParser#ExprMultDivMod.
    def enterExprMultDivMod(self, ctx:pdrawParser.ExprMultDivModContext):
        pass

    # Exit a parse tree produced by pdrawParser#ExprMultDivMod.
    def exitExprMultDivMod(self, ctx:pdrawParser.ExprMultDivModContext):
        pass


    # Enter a parse tree produced by pdrawParser#tuple.
    def enterTuple(self, ctx:pdrawParser.TupleContext):
        pass

    # Exit a parse tree produced by pdrawParser#tuple.
    def exitTuple(self, ctx:pdrawParser.TupleContext):
        pass


    # Enter a parse tree produced by pdrawParser#Degree.
    def enterDegree(self, ctx:pdrawParser.DegreeContext):
        pass

    # Exit a parse tree produced by pdrawParser#Degree.
    def exitDegree(self, ctx:pdrawParser.DegreeContext):
        pass


    # Enter a parse tree produced by pdrawParser#Radian.
    def enterRadian(self, ctx:pdrawParser.RadianContext):
        pass

    # Exit a parse tree produced by pdrawParser#Radian.
    def exitRadian(self, ctx:pdrawParser.RadianContext):
        pass


    # Enter a parse tree produced by pdrawParser#left.
    def enterLeft(self, ctx:pdrawParser.LeftContext):
        pass

    # Exit a parse tree produced by pdrawParser#left.
    def exitLeft(self, ctx:pdrawParser.LeftContext):
        pass


    # Enter a parse tree produced by pdrawParser#right.
    def enterRight(self, ctx:pdrawParser.RightContext):
        pass

    # Exit a parse tree produced by pdrawParser#right.
    def exitRight(self, ctx:pdrawParser.RightContext):
        pass


    # Enter a parse tree produced by pdrawParser#forward.
    def enterForward(self, ctx:pdrawParser.ForwardContext):
        pass

    # Exit a parse tree produced by pdrawParser#forward.
    def exitForward(self, ctx:pdrawParser.ForwardContext):
        pass


    # Enter a parse tree produced by pdrawParser#backward.
    def enterBackward(self, ctx:pdrawParser.BackwardContext):
        pass

    # Exit a parse tree produced by pdrawParser#backward.
    def exitBackward(self, ctx:pdrawParser.BackwardContext):
        pass


    # Enter a parse tree produced by pdrawParser#down.
    def enterDown(self, ctx:pdrawParser.DownContext):
        pass

    # Exit a parse tree produced by pdrawParser#down.
    def exitDown(self, ctx:pdrawParser.DownContext):
        pass


    # Enter a parse tree produced by pdrawParser#up.
    def enterUp(self, ctx:pdrawParser.UpContext):
        pass

    # Exit a parse tree produced by pdrawParser#up.
    def exitUp(self, ctx:pdrawParser.UpContext):
        pass


    # Enter a parse tree produced by pdrawParser#typeCast.
    def enterTypeCast(self, ctx:pdrawParser.TypeCastContext):
        pass

    # Exit a parse tree produced by pdrawParser#typeCast.
    def exitTypeCast(self, ctx:pdrawParser.TypeCastContext):
        pass



del pdrawParser