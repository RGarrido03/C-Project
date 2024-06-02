# Generated from Elements.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,39,89,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,3,1,35,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,5,1,49,8,1,10,1,12,1,52,9,1,1,2,1,2,1,2,1,3,1,3,1,3,
        1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,3,4,68,8,4,3,4,70,8,4,1,5,1,5,3,
        5,74,8,5,1,6,1,6,3,6,78,8,6,1,7,1,7,3,7,82,8,7,1,8,1,8,1,8,1,8,1,
        8,1,8,0,1,2,9,0,2,4,6,8,10,12,14,16,0,7,1,0,33,34,1,0,1,2,1,0,1,
        6,1,0,7,8,1,0,9,12,1,0,13,14,1,0,19,20,96,0,18,1,0,0,0,2,34,1,0,
        0,0,4,53,1,0,0,0,6,56,1,0,0,0,8,69,1,0,0,0,10,73,1,0,0,0,12,77,1,
        0,0,0,14,81,1,0,0,0,16,83,1,0,0,0,18,19,7,0,0,0,19,1,1,0,0,0,20,
        21,6,1,-1,0,21,22,7,1,0,0,22,35,3,2,1,12,23,35,3,16,8,0,24,35,3,
        4,2,0,25,35,5,29,0,0,26,35,5,30,0,0,27,35,5,37,0,0,28,35,5,32,0,
        0,29,35,3,0,0,0,30,31,5,15,0,0,31,32,3,2,1,0,32,33,5,16,0,0,33,35,
        1,0,0,0,34,20,1,0,0,0,34,23,1,0,0,0,34,24,1,0,0,0,34,25,1,0,0,0,
        34,26,1,0,0,0,34,27,1,0,0,0,34,28,1,0,0,0,34,29,1,0,0,0,34,30,1,
        0,0,0,35,50,1,0,0,0,36,37,10,13,0,0,37,38,7,2,0,0,38,49,3,2,1,14,
        39,40,10,11,0,0,40,41,7,3,0,0,41,49,3,2,1,12,42,43,10,10,0,0,43,
        44,7,4,0,0,44,49,3,2,1,11,45,46,10,9,0,0,46,47,7,5,0,0,47,49,3,2,
        1,10,48,36,1,0,0,0,48,39,1,0,0,0,48,42,1,0,0,0,48,45,1,0,0,0,49,
        52,1,0,0,0,50,48,1,0,0,0,50,51,1,0,0,0,51,3,1,0,0,0,52,50,1,0,0,
        0,53,54,5,17,0,0,54,55,3,2,1,0,55,5,1,0,0,0,56,57,5,15,0,0,57,58,
        3,2,1,0,58,59,5,18,0,0,59,60,3,2,1,0,60,61,5,16,0,0,61,7,1,0,0,0,
        62,63,3,2,1,0,63,64,7,6,0,0,64,70,1,0,0,0,65,67,3,2,1,0,66,68,5,
        21,0,0,67,66,1,0,0,0,67,68,1,0,0,0,68,70,1,0,0,0,69,62,1,0,0,0,69,
        65,1,0,0,0,70,9,1,0,0,0,71,74,5,22,0,0,72,74,5,23,0,0,73,71,1,0,
        0,0,73,72,1,0,0,0,74,11,1,0,0,0,75,78,5,24,0,0,76,78,5,25,0,0,77,
        75,1,0,0,0,77,76,1,0,0,0,78,13,1,0,0,0,79,82,5,26,0,0,80,82,5,27,
        0,0,81,79,1,0,0,0,81,80,1,0,0,0,82,15,1,0,0,0,83,84,5,28,0,0,84,
        85,5,15,0,0,85,86,3,2,1,0,86,87,5,16,0,0,87,17,1,0,0,0,8,34,48,50,
        67,69,73,77,81
    ]

class ElementsParser ( Parser ):

    grammarFileName = "Elements.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'+'", "'-'", "'/'", "'//'", "'*'", "'^'", 
                     "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'and'", 
                     "'or'", "'('", "')'", "'stdin'", "','", "'\\u00BA'", 
                     "'deg'", "'rad'", "'left'", "'right'", "'forward'", 
                     "'backward'", "'down'", "'up'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "Type", "INT", "FLOAT", "FRACTION", "BOOL", "Word", 
                      "Name", "HexaColor", "ESC", "STRING", "Comment", "WS" ]

    RULE_variable = 0
    RULE_expression = 1
    RULE_stdin = 2
    RULE_tuple = 3
    RULE_angle = 4
    RULE_rotateAction = 5
    RULE_moveAction = 6
    RULE_penAction = 7
    RULE_typeCast = 8

    ruleNames =  [ "variable", "expression", "stdin", "tuple", "angle", 
                   "rotateAction", "moveAction", "penAction", "typeCast" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    Type=28
    INT=29
    FLOAT=30
    FRACTION=31
    BOOL=32
    Word=33
    Name=34
    HexaColor=35
    ESC=36
    STRING=37
    Comment=38
    WS=39

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class VariableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Name(self):
            return self.getToken(ElementsParser.Name, 0)

        def Word(self):
            return self.getToken(ElementsParser.Word, 0)

        def getRuleIndex(self):
            return ElementsParser.RULE_variable

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable" ):
                listener.enterVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable" ):
                listener.exitVariable(self)




    def variable(self):

        localctx = ElementsParser.VariableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_variable)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 18
            _la = self._input.LA(1)
            if not(_la==33 or _la==34):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.symbol = None


        def getRuleIndex(self):
            return ElementsParser.RULE_expression

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)
            self.symbol = ctx.symbol


    class ExprStringContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(ElementsParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprString" ):
                listener.enterExprString(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprString" ):
                listener.exitExprString(self)


    class ExprConditionEqualsContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ElementsParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ElementsParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprConditionEquals" ):
                listener.enterExprConditionEquals(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprConditionEquals" ):
                listener.exitExprConditionEquals(self)


    class ExprParentContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ElementsParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprParent" ):
                listener.enterExprParent(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprParent" ):
                listener.exitExprParent(self)


    class ExprFloatContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def FLOAT(self):
            return self.getToken(ElementsParser.FLOAT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprFloat" ):
                listener.enterExprFloat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprFloat" ):
                listener.exitExprFloat(self)


    class ExprAddSubMultDivModPowContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ElementsParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ElementsParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprAddSubMultDivModPow" ):
                listener.enterExprAddSubMultDivModPow(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprAddSubMultDivModPow" ):
                listener.exitExprAddSubMultDivModPow(self)


    class ExprCastContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def typeCast(self):
            return self.getTypedRuleContext(ElementsParser.TypeCastContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprCast" ):
                listener.enterExprCast(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprCast" ):
                listener.exitExprCast(self)


    class ExprUnaryContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.e2 = None # ExpressionContext
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ElementsParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprUnary" ):
                listener.enterExprUnary(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprUnary" ):
                listener.exitExprUnary(self)


    class ExprConditionAndOrContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ElementsParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ElementsParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprConditionAndOr" ):
                listener.enterExprConditionAndOr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprConditionAndOr" ):
                listener.exitExprConditionAndOr(self)


    class ExprStdInContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def stdin(self):
            return self.getTypedRuleContext(ElementsParser.StdinContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprStdIn" ):
                listener.enterExprStdIn(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprStdIn" ):
                listener.exitExprStdIn(self)


    class ExprIntegerContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(ElementsParser.INT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprInteger" ):
                listener.enterExprInteger(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprInteger" ):
                listener.exitExprInteger(self)


    class ExprBoolContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BOOL(self):
            return self.getToken(ElementsParser.BOOL, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprBool" ):
                listener.enterExprBool(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprBool" ):
                listener.exitExprBool(self)


    class ExprVariableContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def variable(self):
            return self.getTypedRuleContext(ElementsParser.VariableContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprVariable" ):
                listener.enterExprVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprVariable" ):
                listener.exitExprVariable(self)


    class ExprConditionOrderRelationContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ElementsParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ElementsParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprConditionOrderRelation" ):
                listener.enterExprConditionOrderRelation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprConditionOrderRelation" ):
                listener.exitExprConditionOrderRelation(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ElementsParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1, 2]:
                localctx = ElementsParser.ExprUnaryContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 21
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==1 or _la==2):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 22
                localctx.e2 = self.expression(12)
                pass
            elif token in [28]:
                localctx = ElementsParser.ExprCastContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 23
                self.typeCast()
                pass
            elif token in [17]:
                localctx = ElementsParser.ExprStdInContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 24
                self.stdin()
                pass
            elif token in [29]:
                localctx = ElementsParser.ExprIntegerContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 25
                self.match(ElementsParser.INT)
                pass
            elif token in [30]:
                localctx = ElementsParser.ExprFloatContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 26
                self.match(ElementsParser.FLOAT)
                pass
            elif token in [37]:
                localctx = ElementsParser.ExprStringContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 27
                self.match(ElementsParser.STRING)
                pass
            elif token in [32]:
                localctx = ElementsParser.ExprBoolContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 28
                self.match(ElementsParser.BOOL)
                pass
            elif token in [33, 34]:
                localctx = ElementsParser.ExprVariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 29
                self.variable()
                pass
            elif token in [15]:
                localctx = ElementsParser.ExprParentContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 30
                self.match(ElementsParser.T__14)
                self.state = 31
                self.expression(0)
                self.state = 32
                self.match(ElementsParser.T__15)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 50
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 48
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                    if la_ == 1:
                        localctx = ElementsParser.ExprAddSubMultDivModPowContext(self, ElementsParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 36
                        if not self.precpred(self._ctx, 13):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 13)")
                        self.state = 37
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 126) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 38
                        self.expression(14)
                        pass

                    elif la_ == 2:
                        localctx = ElementsParser.ExprConditionEqualsContext(self, ElementsParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 39
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 40
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==7 or _la==8):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 41
                        self.expression(12)
                        pass

                    elif la_ == 3:
                        localctx = ElementsParser.ExprConditionOrderRelationContext(self, ElementsParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 42
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 43
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 7680) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 44
                        self.expression(11)
                        pass

                    elif la_ == 4:
                        localctx = ElementsParser.ExprConditionAndOrContext(self, ElementsParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 45
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 46
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==13 or _la==14):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 47
                        self.expression(10)
                        pass

             
                self.state = 52
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class StdinContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(ElementsParser.ExpressionContext,0)


        def getRuleIndex(self):
            return ElementsParser.RULE_stdin

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStdin" ):
                listener.enterStdin(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStdin" ):
                listener.exitStdin(self)




    def stdin(self):

        localctx = ElementsParser.StdinContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_stdin)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(ElementsParser.T__16)
            self.state = 54
            self.expression(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TupleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ElementsParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ElementsParser.ExpressionContext,i)


        def getRuleIndex(self):
            return ElementsParser.RULE_tuple

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTuple" ):
                listener.enterTuple(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTuple" ):
                listener.exitTuple(self)




    def tuple_(self):

        localctx = ElementsParser.TupleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_tuple)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self.match(ElementsParser.T__14)
            self.state = 57
            self.expression(0)
            self.state = 58
            self.match(ElementsParser.T__17)
            self.state = 59
            self.expression(0)
            self.state = 60
            self.match(ElementsParser.T__15)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AngleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ElementsParser.RULE_angle

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class RadianContext(AngleContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.AngleContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ElementsParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRadian" ):
                listener.enterRadian(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRadian" ):
                listener.exitRadian(self)


    class DegreeContext(AngleContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.AngleContext
            super().__init__(parser)
            self.d = None # Token
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ElementsParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDegree" ):
                listener.enterDegree(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDegree" ):
                listener.exitDegree(self)



    def angle(self):

        localctx = ElementsParser.AngleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_angle)
        self._la = 0 # Token type
        try:
            self.state = 69
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                localctx = ElementsParser.DegreeContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 62
                self.expression(0)
                self.state = 63
                localctx.d = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==19 or _la==20):
                    localctx.d = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass

            elif la_ == 2:
                localctx = ElementsParser.RadianContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 65
                self.expression(0)
                self.state = 67
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==21:
                    self.state = 66
                    self.match(ElementsParser.T__20)


                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RotateActionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ElementsParser.RULE_rotateAction

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class LeftContext(RotateActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.RotateActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLeft" ):
                listener.enterLeft(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLeft" ):
                listener.exitLeft(self)


    class RightContext(RotateActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.RotateActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRight" ):
                listener.enterRight(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRight" ):
                listener.exitRight(self)



    def rotateAction(self):

        localctx = ElementsParser.RotateActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_rotateAction)
        try:
            self.state = 73
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [22]:
                localctx = ElementsParser.LeftContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 71
                self.match(ElementsParser.T__21)
                pass
            elif token in [23]:
                localctx = ElementsParser.RightContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 72
                self.match(ElementsParser.T__22)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MoveActionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ElementsParser.RULE_moveAction

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ForwardContext(MoveActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.MoveActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForward" ):
                listener.enterForward(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForward" ):
                listener.exitForward(self)


    class BackwardContext(MoveActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.MoveActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBackward" ):
                listener.enterBackward(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBackward" ):
                listener.exitBackward(self)



    def moveAction(self):

        localctx = ElementsParser.MoveActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_moveAction)
        try:
            self.state = 77
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [24]:
                localctx = ElementsParser.ForwardContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 75
                self.match(ElementsParser.T__23)
                pass
            elif token in [25]:
                localctx = ElementsParser.BackwardContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 76
                self.match(ElementsParser.T__24)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PenActionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ElementsParser.RULE_penAction

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class UpContext(PenActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.PenActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUp" ):
                listener.enterUp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUp" ):
                listener.exitUp(self)


    class DownContext(PenActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.PenActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDown" ):
                listener.enterDown(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDown" ):
                listener.exitDown(self)



    def penAction(self):

        localctx = ElementsParser.PenActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_penAction)
        try:
            self.state = 81
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [26]:
                localctx = ElementsParser.DownContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 79
                self.match(ElementsParser.T__25)
                pass
            elif token in [27]:
                localctx = ElementsParser.UpContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 80
                self.match(ElementsParser.T__26)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypeCastContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Type(self):
            return self.getToken(ElementsParser.Type, 0)

        def expression(self):
            return self.getTypedRuleContext(ElementsParser.ExpressionContext,0)


        def getRuleIndex(self):
            return ElementsParser.RULE_typeCast

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypeCast" ):
                listener.enterTypeCast(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypeCast" ):
                listener.exitTypeCast(self)




    def typeCast(self):

        localctx = ElementsParser.TypeCastContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_typeCast)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            self.match(ElementsParser.Type)
            self.state = 84
            self.match(ElementsParser.T__14)
            self.state = 85
            self.expression(0)
            self.state = 86
            self.match(ElementsParser.T__15)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 13)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 11)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 9)
         




