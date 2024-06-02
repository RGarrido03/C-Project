# Generated from Class.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ClassParser import ClassParser
else:
    from ClassParser import ClassParser

# This class defines a complete listener for a parse tree produced by ClassParser.
class ClassListener(ParseTreeListener):

    # Enter a parse tree produced by ClassParser#CreateCanvas.
    def enterCreateCanvas(self, ctx:ClassParser.CreateCanvasContext):
        pass

    # Exit a parse tree produced by ClassParser#CreateCanvas.
    def exitCreateCanvas(self, ctx:ClassParser.CreateCanvasContext):
        pass


    # Enter a parse tree produced by ClassParser#CreatePen.
    def enterCreatePen(self, ctx:ClassParser.CreatePenContext):
        pass

    # Exit a parse tree produced by ClassParser#CreatePen.
    def exitCreatePen(self, ctx:ClassParser.CreatePenContext):
        pass


    # Enter a parse tree produced by ClassParser#BackgroundCanvas.
    def enterBackgroundCanvas(self, ctx:ClassParser.BackgroundCanvasContext):
        pass

    # Exit a parse tree produced by ClassParser#BackgroundCanvas.
    def exitBackgroundCanvas(self, ctx:ClassParser.BackgroundCanvasContext):
        pass


    # Enter a parse tree produced by ClassParser#classProps.
    def enterClassProps(self, ctx:ClassParser.ClassPropsContext):
        pass

    # Exit a parse tree produced by ClassParser#classProps.
    def exitClassProps(self, ctx:ClassParser.ClassPropsContext):
        pass


    # Enter a parse tree produced by ClassParser#arrowProps.
    def enterArrowProps(self, ctx:ClassParser.ArrowPropsContext):
        pass

    # Exit a parse tree produced by ClassParser#arrowProps.
    def exitArrowProps(self, ctx:ClassParser.ArrowPropsContext):
        pass


    # Enter a parse tree produced by ClassParser#object.
    def enterObject(self, ctx:ClassParser.ObjectContext):
        pass

    # Exit a parse tree produced by ClassParser#object.
    def exitObject(self, ctx:ClassParser.ObjectContext):
        pass


    # Enter a parse tree produced by ClassParser#variable.
    def enterVariable(self, ctx:ClassParser.VariableContext):
        pass

    # Exit a parse tree produced by ClassParser#variable.
    def exitVariable(self, ctx:ClassParser.VariableContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprString.
    def enterExprString(self, ctx:ClassParser.ExprStringContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprString.
    def exitExprString(self, ctx:ClassParser.ExprStringContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprConditionEquals.
    def enterExprConditionEquals(self, ctx:ClassParser.ExprConditionEqualsContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprConditionEquals.
    def exitExprConditionEquals(self, ctx:ClassParser.ExprConditionEqualsContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprParent.
    def enterExprParent(self, ctx:ClassParser.ExprParentContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprParent.
    def exitExprParent(self, ctx:ClassParser.ExprParentContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprFloat.
    def enterExprFloat(self, ctx:ClassParser.ExprFloatContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprFloat.
    def exitExprFloat(self, ctx:ClassParser.ExprFloatContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprAddSubMultDivModPow.
    def enterExprAddSubMultDivModPow(self, ctx:ClassParser.ExprAddSubMultDivModPowContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprAddSubMultDivModPow.
    def exitExprAddSubMultDivModPow(self, ctx:ClassParser.ExprAddSubMultDivModPowContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprCast.
    def enterExprCast(self, ctx:ClassParser.ExprCastContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprCast.
    def exitExprCast(self, ctx:ClassParser.ExprCastContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprUnary.
    def enterExprUnary(self, ctx:ClassParser.ExprUnaryContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprUnary.
    def exitExprUnary(self, ctx:ClassParser.ExprUnaryContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprConditionAndOr.
    def enterExprConditionAndOr(self, ctx:ClassParser.ExprConditionAndOrContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprConditionAndOr.
    def exitExprConditionAndOr(self, ctx:ClassParser.ExprConditionAndOrContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprStdIn.
    def enterExprStdIn(self, ctx:ClassParser.ExprStdInContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprStdIn.
    def exitExprStdIn(self, ctx:ClassParser.ExprStdInContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprInteger.
    def enterExprInteger(self, ctx:ClassParser.ExprIntegerContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprInteger.
    def exitExprInteger(self, ctx:ClassParser.ExprIntegerContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprBool.
    def enterExprBool(self, ctx:ClassParser.ExprBoolContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprBool.
    def exitExprBool(self, ctx:ClassParser.ExprBoolContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprVariable.
    def enterExprVariable(self, ctx:ClassParser.ExprVariableContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprVariable.
    def exitExprVariable(self, ctx:ClassParser.ExprVariableContext):
        pass


    # Enter a parse tree produced by ClassParser#ExprConditionOrderRelation.
    def enterExprConditionOrderRelation(self, ctx:ClassParser.ExprConditionOrderRelationContext):
        pass

    # Exit a parse tree produced by ClassParser#ExprConditionOrderRelation.
    def exitExprConditionOrderRelation(self, ctx:ClassParser.ExprConditionOrderRelationContext):
        pass


    # Enter a parse tree produced by ClassParser#stdin.
    def enterStdin(self, ctx:ClassParser.StdinContext):
        pass

    # Exit a parse tree produced by ClassParser#stdin.
    def exitStdin(self, ctx:ClassParser.StdinContext):
        pass


    # Enter a parse tree produced by ClassParser#tuple.
    def enterTuple(self, ctx:ClassParser.TupleContext):
        pass

    # Exit a parse tree produced by ClassParser#tuple.
    def exitTuple(self, ctx:ClassParser.TupleContext):
        pass


    # Enter a parse tree produced by ClassParser#Degree.
    def enterDegree(self, ctx:ClassParser.DegreeContext):
        pass

    # Exit a parse tree produced by ClassParser#Degree.
    def exitDegree(self, ctx:ClassParser.DegreeContext):
        pass


    # Enter a parse tree produced by ClassParser#Radian.
    def enterRadian(self, ctx:ClassParser.RadianContext):
        pass

    # Exit a parse tree produced by ClassParser#Radian.
    def exitRadian(self, ctx:ClassParser.RadianContext):
        pass


    # Enter a parse tree produced by ClassParser#left.
    def enterLeft(self, ctx:ClassParser.LeftContext):
        pass

    # Exit a parse tree produced by ClassParser#left.
    def exitLeft(self, ctx:ClassParser.LeftContext):
        pass


    # Enter a parse tree produced by ClassParser#right.
    def enterRight(self, ctx:ClassParser.RightContext):
        pass

    # Exit a parse tree produced by ClassParser#right.
    def exitRight(self, ctx:ClassParser.RightContext):
        pass


    # Enter a parse tree produced by ClassParser#forward.
    def enterForward(self, ctx:ClassParser.ForwardContext):
        pass

    # Exit a parse tree produced by ClassParser#forward.
    def exitForward(self, ctx:ClassParser.ForwardContext):
        pass


    # Enter a parse tree produced by ClassParser#backward.
    def enterBackward(self, ctx:ClassParser.BackwardContext):
        pass

    # Exit a parse tree produced by ClassParser#backward.
    def exitBackward(self, ctx:ClassParser.BackwardContext):
        pass


    # Enter a parse tree produced by ClassParser#down.
    def enterDown(self, ctx:ClassParser.DownContext):
        pass

    # Exit a parse tree produced by ClassParser#down.
    def exitDown(self, ctx:ClassParser.DownContext):
        pass


    # Enter a parse tree produced by ClassParser#up.
    def enterUp(self, ctx:ClassParser.UpContext):
        pass

    # Exit a parse tree produced by ClassParser#up.
    def exitUp(self, ctx:ClassParser.UpContext):
        pass


    # Enter a parse tree produced by ClassParser#typeCast.
    def enterTypeCast(self, ctx:ClassParser.TypeCastContext):
        pass

    # Exit a parse tree produced by ClassParser#typeCast.
    def exitTypeCast(self, ctx:ClassParser.TypeCastContext):
        pass



del ClassParser