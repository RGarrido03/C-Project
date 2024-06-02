# Generated from Class.g4 by ANTLR 4.13.1
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
        4,1,53,164,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        1,0,1,0,1,0,1,0,3,0,33,8,0,1,0,3,0,36,8,0,1,0,1,0,1,0,1,0,1,0,1,
        0,1,0,5,0,45,8,0,10,0,12,0,48,9,0,1,0,1,0,3,0,52,8,0,1,1,1,1,1,1,
        1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
        3,2,73,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,85,8,3,1,
        4,1,4,1,4,1,4,1,4,3,4,92,8,4,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,6,
        1,6,1,6,1,6,1,6,1,6,1,6,1,6,3,6,110,8,6,1,6,1,6,1,6,1,6,1,6,1,6,
        1,6,1,6,1,6,1,6,1,6,1,6,5,6,124,8,6,10,6,12,6,127,9,6,1,7,1,7,1,
        7,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,3,9,143,8,9,3,9,145,
        8,9,1,10,1,10,3,10,149,8,10,1,11,1,11,3,11,153,8,11,1,12,1,12,3,
        12,157,8,12,1,13,1,13,1,13,1,13,1,13,1,13,0,1,12,14,0,2,4,6,8,10,
        12,14,16,18,20,22,24,26,0,8,2,0,47,47,49,49,1,0,47,48,1,0,15,16,
        1,0,15,20,1,0,21,22,1,0,23,26,1,0,27,28,1,0,33,34,179,0,51,1,0,0,
        0,2,53,1,0,0,0,4,72,1,0,0,0,6,84,1,0,0,0,8,86,1,0,0,0,10,93,1,0,
        0,0,12,109,1,0,0,0,14,128,1,0,0,0,16,131,1,0,0,0,18,144,1,0,0,0,
        20,148,1,0,0,0,22,152,1,0,0,0,24,156,1,0,0,0,26,158,1,0,0,0,28,29,
        5,1,0,0,29,30,5,2,0,0,30,32,3,10,5,0,31,33,5,51,0,0,32,31,1,0,0,
        0,32,33,1,0,0,0,33,35,1,0,0,0,34,36,3,16,8,0,35,34,1,0,0,0,35,36,
        1,0,0,0,36,52,1,0,0,0,37,38,5,1,0,0,38,39,5,3,0,0,39,40,3,10,5,0,
        40,46,5,4,0,0,41,42,3,4,2,0,42,43,5,5,0,0,43,45,1,0,0,0,44,41,1,
        0,0,0,45,48,1,0,0,0,46,44,1,0,0,0,46,47,1,0,0,0,47,49,1,0,0,0,48,
        46,1,0,0,0,49,50,5,6,0,0,50,52,1,0,0,0,51,28,1,0,0,0,51,37,1,0,0,
        0,52,1,1,0,0,0,53,54,3,10,5,0,54,55,5,7,0,0,55,56,7,0,0,0,56,3,1,
        0,0,0,57,58,5,8,0,0,58,59,5,9,0,0,59,73,7,0,0,0,60,61,5,10,0,0,61,
        62,5,9,0,0,62,73,3,16,8,0,63,64,5,11,0,0,64,65,5,9,0,0,65,73,3,18,
        9,0,66,67,5,12,0,0,67,68,5,9,0,0,68,73,3,12,6,0,69,70,5,13,0,0,70,
        71,5,9,0,0,71,73,3,12,6,0,72,57,1,0,0,0,72,60,1,0,0,0,72,63,1,0,
        0,0,72,66,1,0,0,0,72,69,1,0,0,0,73,5,1,0,0,0,74,75,5,8,0,0,75,85,
        7,0,0,0,76,77,5,10,0,0,77,85,3,16,8,0,78,79,5,11,0,0,79,85,3,18,
        9,0,80,81,5,12,0,0,81,85,3,12,6,0,82,83,5,13,0,0,83,85,3,12,6,0,
        84,74,1,0,0,0,84,76,1,0,0,0,84,78,1,0,0,0,84,80,1,0,0,0,84,82,1,
        0,0,0,85,7,1,0,0,0,86,87,5,3,0,0,87,88,3,10,5,0,88,89,5,9,0,0,89,
        91,5,14,0,0,90,92,3,10,5,0,91,90,1,0,0,0,91,92,1,0,0,0,92,9,1,0,
        0,0,93,94,7,1,0,0,94,11,1,0,0,0,95,96,6,6,-1,0,96,97,7,2,0,0,97,
        110,3,12,6,12,98,110,3,26,13,0,99,110,3,14,7,0,100,110,5,43,0,0,
        101,110,5,44,0,0,102,110,5,51,0,0,103,110,5,46,0,0,104,110,3,10,
        5,0,105,106,5,29,0,0,106,107,3,12,6,0,107,108,5,30,0,0,108,110,1,
        0,0,0,109,95,1,0,0,0,109,98,1,0,0,0,109,99,1,0,0,0,109,100,1,0,0,
        0,109,101,1,0,0,0,109,102,1,0,0,0,109,103,1,0,0,0,109,104,1,0,0,
        0,109,105,1,0,0,0,110,125,1,0,0,0,111,112,10,13,0,0,112,113,7,3,
        0,0,113,124,3,12,6,14,114,115,10,11,0,0,115,116,7,4,0,0,116,124,
        3,12,6,12,117,118,10,10,0,0,118,119,7,5,0,0,119,124,3,12,6,11,120,
        121,10,9,0,0,121,122,7,6,0,0,122,124,3,12,6,10,123,111,1,0,0,0,123,
        114,1,0,0,0,123,117,1,0,0,0,123,120,1,0,0,0,124,127,1,0,0,0,125,
        123,1,0,0,0,125,126,1,0,0,0,126,13,1,0,0,0,127,125,1,0,0,0,128,129,
        5,31,0,0,129,130,3,12,6,0,130,15,1,0,0,0,131,132,5,29,0,0,132,133,
        3,12,6,0,133,134,5,32,0,0,134,135,3,12,6,0,135,136,5,30,0,0,136,
        17,1,0,0,0,137,138,3,12,6,0,138,139,7,7,0,0,139,145,1,0,0,0,140,
        142,3,12,6,0,141,143,5,35,0,0,142,141,1,0,0,0,142,143,1,0,0,0,143,
        145,1,0,0,0,144,137,1,0,0,0,144,140,1,0,0,0,145,19,1,0,0,0,146,149,
        5,36,0,0,147,149,5,37,0,0,148,146,1,0,0,0,148,147,1,0,0,0,149,21,
        1,0,0,0,150,153,5,38,0,0,151,153,5,39,0,0,152,150,1,0,0,0,152,151,
        1,0,0,0,153,23,1,0,0,0,154,157,5,40,0,0,155,157,5,41,0,0,156,154,
        1,0,0,0,156,155,1,0,0,0,157,25,1,0,0,0,158,159,5,42,0,0,159,160,
        5,29,0,0,160,161,3,12,6,0,161,162,5,30,0,0,162,27,1,0,0,0,15,32,
        35,46,51,72,84,91,109,123,125,142,144,148,152,156
    ]

class ClassParser ( Parser ):

    grammarFileName = "Class.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'define'", "'canvas'", "'pen'", "'{'", 
                     "';'", "'}'", "'background'", "'color'", "'='", "'position'", 
                     "'orientation'", "'thickness'", "'pressure'", "'new'", 
                     "'+'", "'-'", "'/'", "'//'", "'*'", "'^'", "'=='", 
                     "'!='", "'<'", "'<='", "'>'", "'>='", "'and'", "'or'", 
                     "'('", "')'", "'stdin'", "','", "'\\u00BA'", "'deg'", 
                     "'rad'", "'left'", "'right'", "'forward'", "'backward'", 
                     "'down'", "'up'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "Type", "INT", "FLOAT", 
                      "FRACTION", "BOOL", "Word", "Name", "HexaColor", "ESC", 
                      "STRING", "Comment", "WS" ]

    RULE_class = 0
    RULE_instructionsCanvas = 1
    RULE_classProps = 2
    RULE_arrowProps = 3
    RULE_object = 4
    RULE_variable = 5
    RULE_expression = 6
    RULE_stdin = 7
    RULE_tuple = 8
    RULE_angle = 9
    RULE_rotateAction = 10
    RULE_moveAction = 11
    RULE_penAction = 12
    RULE_typeCast = 13

    ruleNames =  [ "class", "instructionsCanvas", "classProps", "arrowProps", 
                   "object", "variable", "expression", "stdin", "tuple", 
                   "angle", "rotateAction", "moveAction", "penAction", "typeCast" ]

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
    T__27=28
    T__28=29
    T__29=30
    T__30=31
    T__31=32
    T__32=33
    T__33=34
    T__34=35
    T__35=36
    T__36=37
    T__37=38
    T__38=39
    T__39=40
    T__40=41
    Type=42
    INT=43
    FLOAT=44
    FRACTION=45
    BOOL=46
    Word=47
    Name=48
    HexaColor=49
    ESC=50
    STRING=51
    Comment=52
    WS=53

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ClassContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ClassParser.RULE_class

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class CreatePenContext(ClassContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ClassContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def variable(self):
            return self.getTypedRuleContext(ClassParser.VariableContext,0)

        def classProps(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ClassParser.ClassPropsContext)
            else:
                return self.getTypedRuleContext(ClassParser.ClassPropsContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCreatePen" ):
                listener.enterCreatePen(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCreatePen" ):
                listener.exitCreatePen(self)


    class CreateCanvasContext(ClassContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ClassContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def variable(self):
            return self.getTypedRuleContext(ClassParser.VariableContext,0)

        def STRING(self):
            return self.getToken(ClassParser.STRING, 0)
        def tuple_(self):
            return self.getTypedRuleContext(ClassParser.TupleContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCreateCanvas" ):
                listener.enterCreateCanvas(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCreateCanvas" ):
                listener.exitCreateCanvas(self)



    def class_(self):

        localctx = ClassParser.ClassContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_class)
        self._la = 0 # Token type
        try:
            self.state = 51
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                localctx = ClassParser.CreateCanvasContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 28
                self.match(ClassParser.T__0)
                self.state = 29
                self.match(ClassParser.T__1)
                self.state = 30
                self.variable()
                self.state = 32
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==51:
                    self.state = 31
                    self.match(ClassParser.STRING)


                self.state = 35
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==29:
                    self.state = 34
                    self.tuple_()


                pass

            elif la_ == 2:
                localctx = ClassParser.CreatePenContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 37
                self.match(ClassParser.T__0)
                self.state = 38
                self.match(ClassParser.T__2)
                self.state = 39
                self.variable()
                self.state = 40
                self.match(ClassParser.T__3)
                self.state = 46
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 15616) != 0):
                    self.state = 41
                    self.classProps()
                    self.state = 42
                    self.match(ClassParser.T__4)
                    self.state = 48
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 49
                self.match(ClassParser.T__5)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InstructionsCanvasContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ClassParser.RULE_instructionsCanvas

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class BackgroundCanvasContext(InstructionsCanvasContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.InstructionsCanvasContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def variable(self):
            return self.getTypedRuleContext(ClassParser.VariableContext,0)

        def Word(self):
            return self.getToken(ClassParser.Word, 0)
        def HexaColor(self):
            return self.getToken(ClassParser.HexaColor, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBackgroundCanvas" ):
                listener.enterBackgroundCanvas(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBackgroundCanvas" ):
                listener.exitBackgroundCanvas(self)



    def instructionsCanvas(self):

        localctx = ClassParser.InstructionsCanvasContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_instructionsCanvas)
        self._la = 0 # Token type
        try:
            localctx = ClassParser.BackgroundCanvasContext(self, localctx)
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.variable()
            self.state = 54
            self.match(ClassParser.T__6)
            self.state = 55
            _la = self._input.LA(1)
            if not(_la==47 or _la==49):
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


    class ClassPropsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Word(self):
            return self.getToken(ClassParser.Word, 0)

        def HexaColor(self):
            return self.getToken(ClassParser.HexaColor, 0)

        def tuple_(self):
            return self.getTypedRuleContext(ClassParser.TupleContext,0)


        def angle(self):
            return self.getTypedRuleContext(ClassParser.AngleContext,0)


        def expression(self):
            return self.getTypedRuleContext(ClassParser.ExpressionContext,0)


        def getRuleIndex(self):
            return ClassParser.RULE_classProps

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClassProps" ):
                listener.enterClassProps(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClassProps" ):
                listener.exitClassProps(self)




    def classProps(self):

        localctx = ClassParser.ClassPropsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_classProps)
        self._la = 0 # Token type
        try:
            self.state = 72
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 57
                self.match(ClassParser.T__7)
                self.state = 58
                self.match(ClassParser.T__8)
                self.state = 59
                _la = self._input.LA(1)
                if not(_la==47 or _la==49):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 2)
                self.state = 60
                self.match(ClassParser.T__9)
                self.state = 61
                self.match(ClassParser.T__8)
                self.state = 62
                self.tuple_()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 3)
                self.state = 63
                self.match(ClassParser.T__10)
                self.state = 64
                self.match(ClassParser.T__8)
                self.state = 65
                self.angle()
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 4)
                self.state = 66
                self.match(ClassParser.T__11)
                self.state = 67
                self.match(ClassParser.T__8)
                self.state = 68
                self.expression(0)
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 5)
                self.state = 69
                self.match(ClassParser.T__12)
                self.state = 70
                self.match(ClassParser.T__8)
                self.state = 71
                self.expression(0)
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


    class ArrowPropsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Word(self):
            return self.getToken(ClassParser.Word, 0)

        def HexaColor(self):
            return self.getToken(ClassParser.HexaColor, 0)

        def tuple_(self):
            return self.getTypedRuleContext(ClassParser.TupleContext,0)


        def angle(self):
            return self.getTypedRuleContext(ClassParser.AngleContext,0)


        def expression(self):
            return self.getTypedRuleContext(ClassParser.ExpressionContext,0)


        def getRuleIndex(self):
            return ClassParser.RULE_arrowProps

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArrowProps" ):
                listener.enterArrowProps(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArrowProps" ):
                listener.exitArrowProps(self)




    def arrowProps(self):

        localctx = ClassParser.ArrowPropsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_arrowProps)
        self._la = 0 # Token type
        try:
            self.state = 84
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 74
                self.match(ClassParser.T__7)
                self.state = 75
                _la = self._input.LA(1)
                if not(_la==47 or _la==49):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 2)
                self.state = 76
                self.match(ClassParser.T__9)
                self.state = 77
                self.tuple_()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 3)
                self.state = 78
                self.match(ClassParser.T__10)
                self.state = 79
                self.angle()
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 4)
                self.state = 80
                self.match(ClassParser.T__11)
                self.state = 81
                self.expression(0)
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 5)
                self.state = 82
                self.match(ClassParser.T__12)
                self.state = 83
                self.expression(0)
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


    class ObjectContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ClassParser.VariableContext)
            else:
                return self.getTypedRuleContext(ClassParser.VariableContext,i)


        def getRuleIndex(self):
            return ClassParser.RULE_object

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterObject" ):
                listener.enterObject(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitObject" ):
                listener.exitObject(self)




    def object_(self):

        localctx = ClassParser.ObjectContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_object)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.match(ClassParser.T__2)
            self.state = 87
            self.variable()
            self.state = 88
            self.match(ClassParser.T__8)
            self.state = 89
            self.match(ClassParser.T__13)
            self.state = 91
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==47 or _la==48:
                self.state = 90
                self.variable()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Name(self):
            return self.getToken(ClassParser.Name, 0)

        def Word(self):
            return self.getToken(ClassParser.Word, 0)

        def getRuleIndex(self):
            return ClassParser.RULE_variable

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable" ):
                listener.enterVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable" ):
                listener.exitVariable(self)




    def variable(self):

        localctx = ClassParser.VariableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_variable)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 93
            _la = self._input.LA(1)
            if not(_la==47 or _la==48):
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
            return ClassParser.RULE_expression

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)
            self.symbol = ctx.symbol


    class ExprStringContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(ClassParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprString" ):
                listener.enterExprString(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprString" ):
                listener.exitExprString(self)


    class ExprConditionEqualsContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ClassParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ClassParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprConditionEquals" ):
                listener.enterExprConditionEquals(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprConditionEquals" ):
                listener.exitExprConditionEquals(self)


    class ExprParentContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ClassParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprParent" ):
                listener.enterExprParent(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprParent" ):
                listener.exitExprParent(self)


    class ExprFloatContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def FLOAT(self):
            return self.getToken(ClassParser.FLOAT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprFloat" ):
                listener.enterExprFloat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprFloat" ):
                listener.exitExprFloat(self)


    class ExprAddSubMultDivModPowContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ClassParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ClassParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprAddSubMultDivModPow" ):
                listener.enterExprAddSubMultDivModPow(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprAddSubMultDivModPow" ):
                listener.exitExprAddSubMultDivModPow(self)


    class ExprCastContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def typeCast(self):
            return self.getTypedRuleContext(ClassParser.TypeCastContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprCast" ):
                listener.enterExprCast(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprCast" ):
                listener.exitExprCast(self)


    class ExprUnaryContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.e2 = None # ExpressionContext
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ClassParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprUnary" ):
                listener.enterExprUnary(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprUnary" ):
                listener.exitExprUnary(self)


    class ExprConditionAndOrContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ClassParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ClassParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprConditionAndOr" ):
                listener.enterExprConditionAndOr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprConditionAndOr" ):
                listener.exitExprConditionAndOr(self)


    class ExprStdInContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def stdin(self):
            return self.getTypedRuleContext(ClassParser.StdinContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprStdIn" ):
                listener.enterExprStdIn(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprStdIn" ):
                listener.exitExprStdIn(self)


    class ExprIntegerContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(ClassParser.INT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprInteger" ):
                listener.enterExprInteger(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprInteger" ):
                listener.exitExprInteger(self)


    class ExprBoolContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BOOL(self):
            return self.getToken(ClassParser.BOOL, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprBool" ):
                listener.enterExprBool(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprBool" ):
                listener.exitExprBool(self)


    class ExprVariableContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def variable(self):
            return self.getTypedRuleContext(ClassParser.VariableContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprVariable" ):
                listener.enterExprVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprVariable" ):
                listener.exitExprVariable(self)


    class ExprConditionOrderRelationContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.ExpressionContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ClassParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ClassParser.ExpressionContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExprConditionOrderRelation" ):
                listener.enterExprConditionOrderRelation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExprConditionOrderRelation" ):
                listener.exitExprConditionOrderRelation(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ClassParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 12
        self.enterRecursionRule(localctx, 12, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 109
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15, 16]:
                localctx = ClassParser.ExprUnaryContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 96
                localctx.op = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==15 or _la==16):
                    localctx.op = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 97
                localctx.e2 = self.expression(12)
                pass
            elif token in [42]:
                localctx = ClassParser.ExprCastContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 98
                self.typeCast()
                pass
            elif token in [31]:
                localctx = ClassParser.ExprStdInContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 99
                self.stdin()
                pass
            elif token in [43]:
                localctx = ClassParser.ExprIntegerContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 100
                self.match(ClassParser.INT)
                pass
            elif token in [44]:
                localctx = ClassParser.ExprFloatContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 101
                self.match(ClassParser.FLOAT)
                pass
            elif token in [51]:
                localctx = ClassParser.ExprStringContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 102
                self.match(ClassParser.STRING)
                pass
            elif token in [46]:
                localctx = ClassParser.ExprBoolContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 103
                self.match(ClassParser.BOOL)
                pass
            elif token in [47, 48]:
                localctx = ClassParser.ExprVariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 104
                self.variable()
                pass
            elif token in [29]:
                localctx = ClassParser.ExprParentContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 105
                self.match(ClassParser.T__28)
                self.state = 106
                self.expression(0)
                self.state = 107
                self.match(ClassParser.T__29)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 125
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,9,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 123
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
                    if la_ == 1:
                        localctx = ClassParser.ExprAddSubMultDivModPowContext(self, ClassParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 111
                        if not self.precpred(self._ctx, 13):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 13)")
                        self.state = 112
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 2064384) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 113
                        self.expression(14)
                        pass

                    elif la_ == 2:
                        localctx = ClassParser.ExprConditionEqualsContext(self, ClassParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 114
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 115
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==21 or _la==22):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 116
                        self.expression(12)
                        pass

                    elif la_ == 3:
                        localctx = ClassParser.ExprConditionOrderRelationContext(self, ClassParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 117
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 118
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 125829120) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 119
                        self.expression(11)
                        pass

                    elif la_ == 4:
                        localctx = ClassParser.ExprConditionAndOrContext(self, ClassParser.ExpressionContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 120
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 121
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==27 or _la==28):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 122
                        self.expression(10)
                        pass

             
                self.state = 127
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,9,self._ctx)

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
            return self.getTypedRuleContext(ClassParser.ExpressionContext,0)


        def getRuleIndex(self):
            return ClassParser.RULE_stdin

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStdin" ):
                listener.enterStdin(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStdin" ):
                listener.exitStdin(self)




    def stdin(self):

        localctx = ClassParser.StdinContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_stdin)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 128
            self.match(ClassParser.T__30)
            self.state = 129
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
                return self.getTypedRuleContexts(ClassParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(ClassParser.ExpressionContext,i)


        def getRuleIndex(self):
            return ClassParser.RULE_tuple

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTuple" ):
                listener.enterTuple(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTuple" ):
                listener.exitTuple(self)




    def tuple_(self):

        localctx = ClassParser.TupleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_tuple)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 131
            self.match(ClassParser.T__28)
            self.state = 132
            self.expression(0)
            self.state = 133
            self.match(ClassParser.T__31)
            self.state = 134
            self.expression(0)
            self.state = 135
            self.match(ClassParser.T__29)
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
            return ClassParser.RULE_angle

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class RadianContext(AngleContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.AngleContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ClassParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRadian" ):
                listener.enterRadian(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRadian" ):
                listener.exitRadian(self)


    class DegreeContext(AngleContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.AngleContext
            super().__init__(parser)
            self.d = None # Token
            self.copyFrom(ctx)

        def expression(self):
            return self.getTypedRuleContext(ClassParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDegree" ):
                listener.enterDegree(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDegree" ):
                listener.exitDegree(self)



    def angle(self):

        localctx = ClassParser.AngleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_angle)
        self._la = 0 # Token type
        try:
            self.state = 144
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
            if la_ == 1:
                localctx = ClassParser.DegreeContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 137
                self.expression(0)
                self.state = 138
                localctx.d = self._input.LT(1)
                _la = self._input.LA(1)
                if not(_la==33 or _la==34):
                    localctx.d = self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass

            elif la_ == 2:
                localctx = ClassParser.RadianContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 140
                self.expression(0)
                self.state = 142
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==35:
                    self.state = 141
                    self.match(ClassParser.T__34)


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
            return ClassParser.RULE_rotateAction

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class LeftContext(RotateActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.RotateActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLeft" ):
                listener.enterLeft(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLeft" ):
                listener.exitLeft(self)


    class RightContext(RotateActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.RotateActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRight" ):
                listener.enterRight(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRight" ):
                listener.exitRight(self)



    def rotateAction(self):

        localctx = ClassParser.RotateActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_rotateAction)
        try:
            self.state = 148
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [36]:
                localctx = ClassParser.LeftContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 146
                self.match(ClassParser.T__35)
                pass
            elif token in [37]:
                localctx = ClassParser.RightContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 147
                self.match(ClassParser.T__36)
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
            return ClassParser.RULE_moveAction

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ForwardContext(MoveActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.MoveActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForward" ):
                listener.enterForward(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForward" ):
                listener.exitForward(self)


    class BackwardContext(MoveActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.MoveActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBackward" ):
                listener.enterBackward(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBackward" ):
                listener.exitBackward(self)



    def moveAction(self):

        localctx = ClassParser.MoveActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_moveAction)
        try:
            self.state = 152
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [38]:
                localctx = ClassParser.ForwardContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 150
                self.match(ClassParser.T__37)
                pass
            elif token in [39]:
                localctx = ClassParser.BackwardContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 151
                self.match(ClassParser.T__38)
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
            return ClassParser.RULE_penAction

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class UpContext(PenActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.PenActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUp" ):
                listener.enterUp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUp" ):
                listener.exitUp(self)


    class DownContext(PenActionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ClassParser.PenActionContext
            super().__init__(parser)
            self.copyFrom(ctx)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDown" ):
                listener.enterDown(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDown" ):
                listener.exitDown(self)



    def penAction(self):

        localctx = ClassParser.PenActionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_penAction)
        try:
            self.state = 156
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [40]:
                localctx = ClassParser.DownContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 154
                self.match(ClassParser.T__39)
                pass
            elif token in [41]:
                localctx = ClassParser.UpContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 155
                self.match(ClassParser.T__40)
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
            return self.getToken(ClassParser.Type, 0)

        def expression(self):
            return self.getTypedRuleContext(ClassParser.ExpressionContext,0)


        def getRuleIndex(self):
            return ClassParser.RULE_typeCast

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypeCast" ):
                listener.enterTypeCast(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypeCast" ):
                listener.exitTypeCast(self)




    def typeCast(self):

        localctx = ClassParser.TypeCastContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_typeCast)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 158
            self.match(ClassParser.Type)
            self.state = 159
            self.match(ClassParser.T__28)
            self.state = 160
            self.expression(0)
            self.state = 161
            self.match(ClassParser.T__29)
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
        self._predicates[6] = self.expression_sempred
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
         




