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
        4,1,32,86,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,3,1,35,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        5,1,46,8,1,10,1,12,1,49,9,1,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,
        1,4,1,4,1,4,1,4,1,4,3,4,65,8,4,3,4,67,8,4,1,5,1,5,3,5,71,8,5,1,6,
        1,6,3,6,75,8,6,1,7,1,7,3,7,79,8,7,1,8,1,8,1,8,1,8,1,8,1,8,0,1,2,
        9,0,2,4,6,8,10,12,14,16,0,4,1,0,26,27,1,0,5,6,1,0,1,4,1,0,12,13,
        92,0,18,1,0,0,0,2,34,1,0,0,0,4,50,1,0,0,0,6,53,1,0,0,0,8,66,1,0,
        0,0,10,70,1,0,0,0,12,74,1,0,0,0,14,78,1,0,0,0,16,80,1,0,0,0,18,19,
        7,0,0,0,19,1,1,0,0,0,20,21,6,1,-1,0,21,22,7,1,0,0,22,35,3,2,1,10,
        23,35,3,16,8,0,24,35,3,4,2,0,25,35,5,22,0,0,26,35,5,23,0,0,27,35,
        5,30,0,0,28,35,5,25,0,0,29,35,3,0,0,0,30,31,5,8,0,0,31,32,3,2,1,
        0,32,33,5,9,0,0,33,35,1,0,0,0,34,20,1,0,0,0,34,23,1,0,0,0,34,24,
        1,0,0,0,34,25,1,0,0,0,34,26,1,0,0,0,34,27,1,0,0,0,34,28,1,0,0,0,
        34,29,1,0,0,0,34,30,1,0,0,0,35,47,1,0,0,0,36,37,10,12,0,0,37,38,
        7,2,0,0,38,46,3,2,1,13,39,40,10,11,0,0,40,41,7,1,0,0,41,46,3,2,1,
        12,42,43,10,9,0,0,43,44,5,7,0,0,44,46,3,2,1,9,45,36,1,0,0,0,45,39,
        1,0,0,0,45,42,1,0,0,0,46,49,1,0,0,0,47,45,1,0,0,0,47,48,1,0,0,0,
        48,3,1,0,0,0,49,47,1,0,0,0,50,51,5,10,0,0,51,52,3,2,1,0,52,5,1,0,
        0,0,53,54,5,8,0,0,54,55,3,2,1,0,55,56,5,11,0,0,56,57,3,2,1,0,57,
        58,5,9,0,0,58,7,1,0,0,0,59,60,3,2,1,0,60,61,7,3,0,0,61,67,1,0,0,
        0,62,64,3,2,1,0,63,65,5,14,0,0,64,63,1,0,0,0,64,65,1,0,0,0,65,67,
        1,0,0,0,66,59,1,0,0,0,66,62,1,0,0,0,67,9,1,0,0,0,68,71,5,15,0,0,
        69,71,5,16,0,0,70,68,1,0,0,0,70,69,1,0,0,0,71,11,1,0,0,0,72,75,5,
        17,0,0,73,75,5,18,0,0,74,72,1,0,0,0,74,73,1,0,0,0,75,13,1,0,0,0,
        76,79,5,19,0,0,77,79,5,20,0,0,78,76,1,0,0,0,78,77,1,0,0,0,79,15,
        1,0,0,0,80,81,5,21,0,0,81,82,5,8,0,0,82,83,3,2,1,0,83,84,5,9,0,0,
        84,17,1,0,0,0,8,34,45,47,64,66,70,74,78
    ]

class ElementsParser ( Parser ):

    grammarFileName = "Elements.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'/'", "'//'", "'*'", "'%'", "'+'", "'-'", 
                     "'^'", "'('", "')'", "'stdin'", "','", "'\\u00BA'", 
                     "'deg'", "'rad'", "'left'", "'right'", "'forward'", 
                     "'backward'", "'down'", "'up'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "Type", "INT", "FLOAT", "FRACTION", "BOOL", 
                      "Word", "Name", "HexaColor", "ESC", "STRING", "Comment", 
                      "WS" ]

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
    Type=21
    INT=22
    FLOAT=23
    FRACTION=24
    BOOL=25
    Word=26
    Name=27
    HexaColor=28
    ESC=29
    STRING=30
    Comment=31
    WS=32

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
            if not(_la==26 or _la==27):
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


    class ExprAddSubContext(ExpressionContext):

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
            if hasattr( listener, "enterExprAddSub" ):
                listener.enterExprAddSub(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprAddSub" ):
                listener.exitExprAddSub(self)


    class ExprPowContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ElementsParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ElementsParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ElementsParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprPow" ):
                listener.enterExprPow(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprPow" ):
                listener.exitExprPow(self)


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


    class ExprMultDivModContext(ExpressionContext):

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
            if hasattr( listener, "enterExprMultDivMod" ):
                listener.enterExprMultDivMod(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprMultDivMod" ):
                listener.exitExprMultDivMod(self)



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
            if token in [5, 6]:
                localctx = ElementsParser.ExprUnaryContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 21
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==5 or _la==6):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 22
                localctx.e2 = self.expression(10)
                pass
            elif token in [21]:
                localctx = ElementsParser.ExprCastContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 23
                self.typeCast()
                pass
            elif token in [10]:
                localctx = ElementsParser.ExprStdInContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 24
                self.stdin()
                pass
            elif token in [22]:
                localctx = ElementsParser.ExprIntegerContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 25
                self.match(ElementsParser.INT)
                pass
            elif token in [23]:
                localctx = ElementsParser.ExprFloatContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 26
                self.match(ElementsParser.FLOAT)
                pass
            elif token in [30]:
                localctx = ElementsParser.ExprStringContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 27
                self.match(ElementsParser.STRING)
                pass
            elif token in [25]:
                localctx = ElementsParser.ExprBoolContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 28
                self.match(ElementsParser.BOOL)
                pass
            elif token in [26, 27]:
                localctx = ElementsParser.ExprVariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 29
                self.variable()
                pass
            elif token in [8]:
                localctx = ElementsParser.ExprParentContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 30
                self.match(ElementsParser.T__7)
                self.state = 31
                self.expression(0)
                self.state = 32
                self.match(ElementsParser.T__8)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 47
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 45
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                    if la_ == 1:
                        localctx = ElementsParser.ExprMultDivModContext(self, ElementsParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 36
                        if not self.precpred(self._ctx, 12):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 12)")
                        self.state = 37
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 30) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 38
                        self.expression(13)
                        pass

                    elif la_ == 2:
                        localctx = ElementsParser.ExprAddSubContext(self, ElementsParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 39
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 40
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==5 or _la==6):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 41
                        self.expression(12)
                        pass

                    elif la_ == 3:
                        localctx = ElementsParser.ExprPowContext(self, ElementsParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 42
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 43
                        self.match(ElementsParser.T__6)
                        self.state = 44
                        self.expression(9)
                        pass

             
                self.state = 49
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
            self.state = 50
            self.match(ElementsParser.T__9)
            self.state = 51
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
            self.state = 53
            self.match(ElementsParser.T__7)
            self.state = 54
            self.expression(0)
            self.state = 55
            self.match(ElementsParser.T__10)
            self.state = 56
            self.expression(0)
            self.state = 57
            self.match(ElementsParser.T__8)
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
            self.state = 66
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                localctx = ElementsParser.DegreeContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 59
                self.expression(0)
                self.state = 60
                localctx.d = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==12 or _la==13):
                    localctx.d = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass

            elif la_ == 2:
                localctx = ElementsParser.RadianContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 62
                self.expression(0)
                self.state = 64
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==14:
                    self.state = 63
                    self.match(ElementsParser.T__13)


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
            self.state = 70
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15]:
                localctx = ElementsParser.LeftContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 68
                self.match(ElementsParser.T__14)
                pass
            elif token in [16]:
                localctx = ElementsParser.RightContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 69
                self.match(ElementsParser.T__15)
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
            self.state = 74
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [17]:
                localctx = ElementsParser.ForwardContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 72
                self.match(ElementsParser.T__16)
                pass
            elif token in [18]:
                localctx = ElementsParser.BackwardContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 73
                self.match(ElementsParser.T__17)
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
            self.state = 78
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [19]:
                localctx = ElementsParser.DownContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 76
                self.match(ElementsParser.T__18)
                pass
            elif token in [20]:
                localctx = ElementsParser.UpContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 77
                self.match(ElementsParser.T__19)
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
            self.state = 80
            self.match(ElementsParser.Type)
            self.state = 81
            self.match(ElementsParser.T__7)
            self.state = 82
            self.expression(0)
            self.state = 83
            self.match(ElementsParser.T__8)
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
                return self.precpred(self._ctx, 12)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 11)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 9)
         




