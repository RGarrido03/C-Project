# Generated from Elements.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ElementsParser import ElementsParser
else:
    from ElementsParser import ElementsParser

# This class defines a complete listener for a parse tree produced by ElementsParser.
class ElementsListener(ParseTreeListener):

    # Enter a parse tree produced by ElementsParser#variable.
    def enterVariable(self, ctx:ElementsParser.VariableContext):
        pass

    # Exit a parse tree produced by ElementsParser#variable.
    def exitVariable(self, ctx:ElementsParser.VariableContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprString.
    def enterExprString(self, ctx:ElementsParser.ExprStringContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprString.
    def exitExprString(self, ctx:ElementsParser.ExprStringContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprConditionEquals.
    def enterExprConditionEquals(self, ctx:ElementsParser.ExprConditionEqualsContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprConditionEquals.
    def exitExprConditionEquals(self, ctx:ElementsParser.ExprConditionEqualsContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprParent.
    def enterExprParent(self, ctx:ElementsParser.ExprParentContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprParent.
    def exitExprParent(self, ctx:ElementsParser.ExprParentContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprFloat.
    def enterExprFloat(self, ctx:ElementsParser.ExprFloatContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprFloat.
    def exitExprFloat(self, ctx:ElementsParser.ExprFloatContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprAddSubMultDivModPow.
    def enterExprAddSubMultDivModPow(self, ctx:ElementsParser.ExprAddSubMultDivModPowContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprAddSubMultDivModPow.
    def exitExprAddSubMultDivModPow(self, ctx:ElementsParser.ExprAddSubMultDivModPowContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprCast.
    def enterExprCast(self, ctx:ElementsParser.ExprCastContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprCast.
    def exitExprCast(self, ctx:ElementsParser.ExprCastContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprUnary.
    def enterExprUnary(self, ctx:ElementsParser.ExprUnaryContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprUnary.
    def exitExprUnary(self, ctx:ElementsParser.ExprUnaryContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprConditionAndOr.
    def enterExprConditionAndOr(self, ctx:ElementsParser.ExprConditionAndOrContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprConditionAndOr.
    def exitExprConditionAndOr(self, ctx:ElementsParser.ExprConditionAndOrContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprStdIn.
    def enterExprStdIn(self, ctx:ElementsParser.ExprStdInContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprStdIn.
    def exitExprStdIn(self, ctx:ElementsParser.ExprStdInContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprInteger.
    def enterExprInteger(self, ctx:ElementsParser.ExprIntegerContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprInteger.
    def exitExprInteger(self, ctx:ElementsParser.ExprIntegerContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprBool.
    def enterExprBool(self, ctx:ElementsParser.ExprBoolContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprBool.
    def exitExprBool(self, ctx:ElementsParser.ExprBoolContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprVariable.
    def enterExprVariable(self, ctx:ElementsParser.ExprVariableContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprVariable.
    def exitExprVariable(self, ctx:ElementsParser.ExprVariableContext):
        pass


    # Enter a parse tree produced by ElementsParser#ExprConditionOrderRelation.
    def enterExprConditionOrderRelation(self, ctx:ElementsParser.ExprConditionOrderRelationContext):
        pass

    # Exit a parse tree produced by ElementsParser#ExprConditionOrderRelation.
    def exitExprConditionOrderRelation(self, ctx:ElementsParser.ExprConditionOrderRelationContext):
        pass


    # Enter a parse tree produced by ElementsParser#stdin.
    def enterStdin(self, ctx:ElementsParser.StdinContext):
        pass

    # Exit a parse tree produced by ElementsParser#stdin.
    def exitStdin(self, ctx:ElementsParser.StdinContext):
        pass


    # Enter a parse tree produced by ElementsParser#tuple.
    def enterTuple(self, ctx:ElementsParser.TupleContext):
        pass

    # Exit a parse tree produced by ElementsParser#tuple.
    def exitTuple(self, ctx:ElementsParser.TupleContext):
        pass


    # Enter a parse tree produced by ElementsParser#Degree.
    def enterDegree(self, ctx:ElementsParser.DegreeContext):
        pass

    # Exit a parse tree produced by ElementsParser#Degree.
    def exitDegree(self, ctx:ElementsParser.DegreeContext):
        pass


    # Enter a parse tree produced by ElementsParser#Radian.
    def enterRadian(self, ctx:ElementsParser.RadianContext):
        pass

    # Exit a parse tree produced by ElementsParser#Radian.
    def exitRadian(self, ctx:ElementsParser.RadianContext):
        pass


    # Enter a parse tree produced by ElementsParser#left.
    def enterLeft(self, ctx:ElementsParser.LeftContext):
        pass

    # Exit a parse tree produced by ElementsParser#left.
    def exitLeft(self, ctx:ElementsParser.LeftContext):
        pass


    # Enter a parse tree produced by ElementsParser#right.
    def enterRight(self, ctx:ElementsParser.RightContext):
        pass

    # Exit a parse tree produced by ElementsParser#right.
    def exitRight(self, ctx:ElementsParser.RightContext):
        pass


    # Enter a parse tree produced by ElementsParser#forward.
    def enterForward(self, ctx:ElementsParser.ForwardContext):
        pass

    # Exit a parse tree produced by ElementsParser#forward.
    def exitForward(self, ctx:ElementsParser.ForwardContext):
        pass


    # Enter a parse tree produced by ElementsParser#backward.
    def enterBackward(self, ctx:ElementsParser.BackwardContext):
        pass

    # Exit a parse tree produced by ElementsParser#backward.
    def exitBackward(self, ctx:ElementsParser.BackwardContext):
        pass


    # Enter a parse tree produced by ElementsParser#down.
    def enterDown(self, ctx:ElementsParser.DownContext):
        pass

    # Exit a parse tree produced by ElementsParser#down.
    def exitDown(self, ctx:ElementsParser.DownContext):
        pass


    # Enter a parse tree produced by ElementsParser#up.
    def enterUp(self, ctx:ElementsParser.UpContext):
        pass

    # Exit a parse tree produced by ElementsParser#up.
    def exitUp(self, ctx:ElementsParser.UpContext):
        pass


    # Enter a parse tree produced by ElementsParser#typeCast.
    def enterTypeCast(self, ctx:ElementsParser.TypeCastContext):
        pass

    # Exit a parse tree produced by ElementsParser#typeCast.
    def exitTypeCast(self, ctx:ElementsParser.TypeCastContext):
        pass



del ElementsParser