// Generated from Class.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ClassParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, Type=34, INT=35, FLOAT=36, FRACTION=37, BOOL=38, Word=39, 
		Name=40, HexaColor=41, ESC=42, STRING=43, Comment=44, WS=45;
	public static final int
		RULE_class = 0, RULE_classProps = 1, RULE_object = 2, RULE_variable = 3, 
		RULE_expression = 4, RULE_stdin = 5, RULE_tuple = 6, RULE_angle = 7, RULE_moveAction = 8, 
		RULE_penAction = 9, RULE_typeCast = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "classProps", "object", "variable", "expression", "stdin", "tuple", 
			"angle", "moveAction", "penAction", "typeCast"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'define'", "'canvas'", "'pen'", "'{'", "';'", "'}'", "'color'", 
			"'='", "'position'", "'orientation'", "'thickness'", "'pressure'", "'new'", 
			"'/'", "'//'", "'*'", "'%'", "'+'", "'-'", "'^'", "'('", "')'", "'stdin'", 
			"','", "'\\u00BA'", "'deg'", "'rad'", "'forward'", "'backward'", "'left'", 
			"'right'", "'down'", "'up'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Type", "INT", 
			"FLOAT", "FRACTION", "BOOL", "Word", "Name", "HexaColor", "ESC", "STRING", 
			"Comment", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Class.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClassParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	 
		public ClassContext() { }
		public void copyFrom(ClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreatePenContext extends ClassContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ClassPropsContext> classProps() {
			return getRuleContexts(ClassPropsContext.class);
		}
		public ClassPropsContext classProps(int i) {
			return getRuleContext(ClassPropsContext.class,i);
		}
		public CreatePenContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterCreatePen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitCreatePen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitCreatePen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateCanvasContext extends ClassContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ClassParser.STRING, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public CreateCanvasContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterCreateCanvas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitCreateCanvas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitCreateCanvas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_class);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CreateCanvasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				setState(23);
				match(T__1);
				setState(24);
				variable();
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(25);
					match(STRING);
					}
				}

				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(28);
					tuple();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreatePenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__0);
				setState(32);
				match(T__2);
				setState(33);
				variable();
				setState(34);
				match(T__3);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7808L) != 0)) {
					{
					{
					setState(35);
					classProps();
					setState(36);
					match(T__4);
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassPropsContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(ClassParser.Word, 0); }
		public TerminalNode HexaColor() { return getToken(ClassParser.HexaColor, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classProps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterClassProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitClassProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitClassProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPropsContext classProps() throws RecognitionException {
		ClassPropsContext _localctx = new ClassPropsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classProps);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__6);
				setState(48);
				match(T__7);
				setState(49);
				_la = _input.LA(1);
				if ( !(_la==Word || _la==HexaColor) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__8);
				setState(51);
				match(T__7);
				setState(52);
				tuple();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(T__9);
				setState(54);
				match(T__7);
				setState(55);
				angle();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(T__10);
				setState(57);
				match(T__7);
				setState(58);
				expression(0);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				match(T__11);
				setState(60);
				match(T__7);
				setState(61);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__2);
			setState(65);
			variable();
			setState(66);
			match(T__7);
			setState(67);
			match(T__12);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Word || _la==Name) {
				{
				setState(68);
				variable();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(ClassParser.Name, 0); }
		public TerminalNode Word() { return getToken(ClassParser.Word, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==Name) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public types.Symbol symbol;
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.symbol = ctx.symbol;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddSubContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprAddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPowContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprPowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(ClassParser.STRING, 0); }
		public ExprStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCastContext extends ExpressionContext {
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public ExprCastContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParentContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprParentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprParent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ExpressionContext {
		public Token op;
		public ExpressionContext e2;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(ClassParser.FLOAT, 0); }
		public ExprFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStdInContext extends ExpressionContext {
		public StdinContext stdin() {
			return getRuleContext(StdinContext.class,0);
		}
		public ExprStdInContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprStdIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprStdIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprStdIn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntegerContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ClassParser.INT, 0); }
		public ExprIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(ClassParser.BOOL, 0); }
		public ExprBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprVariableContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultDivModContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprMultDivModContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterExprMultDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitExprMultDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitExprMultDivMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(74);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(75);
				((ExprUnaryContext)_localctx).e2 = expression(10);
				}
				break;
			case Type:
				{
				_localctx = new ExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				typeCast();
				}
				break;
			case T__22:
				{
				_localctx = new ExprStdInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				stdin();
				}
				break;
			case INT:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new ExprFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(STRING);
				}
				break;
			case BOOL:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(BOOL);
				}
				break;
			case Word:
			case Name:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				variable();
				}
				break;
			case T__20:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(T__20);
				setState(84);
				expression(0);
				setState(85);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivModContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(90);
						((ExprMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
							((ExprMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(93);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(94);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprPowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(96);
						match(T__19);
						setState(97);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StdinContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ClassParser.STRING, 0); }
		public StdinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterStdin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitStdin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitStdin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StdinContext stdin() throws RecognitionException {
		StdinContext _localctx = new StdinContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stdin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__22);
			setState(104);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__20);
			setState(107);
			expression(0);
			setState(108);
			match(T__23);
			setState(109);
			expression(0);
			setState(110);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngleContext extends ParserRuleContext {
		public AngleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angle; }
	 
		public AngleContext() { }
		public void copyFrom(AngleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RadianContext extends AngleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RadianContext(AngleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterRadian(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitRadian(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitRadian(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DegreeContext extends AngleContext {
		public Token d;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DegreeContext(AngleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitDegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitDegree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_angle);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DegreeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				expression(0);
				setState(113);
				((DegreeContext)_localctx).d = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
					((DegreeContext)_localctx).d = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new RadianContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				expression(0);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(116);
					match(T__26);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MoveActionContext extends ParserRuleContext {
		public MoveActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveAction; }
	 
		public MoveActionContext() { }
		public void copyFrom(MoveActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftContext extends MoveActionContext {
		public LeftContext(MoveActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForwardContext extends MoveActionContext {
		public ForwardContext(MoveActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackwardContext extends MoveActionContext {
		public BackwardContext(MoveActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterBackward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitBackward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitBackward(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RightContext extends MoveActionContext {
		public RightContext(MoveActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveActionContext moveAction() throws RecognitionException {
		MoveActionContext _localctx = new MoveActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moveAction);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new ForwardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new BackwardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new RightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PenActionContext extends ParserRuleContext {
		public PenActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penAction; }
	 
		public PenActionContext() { }
		public void copyFrom(PenActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpContext extends PenActionContext {
		public UpContext(PenActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitUp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DownContext extends PenActionContext {
		public DownContext(PenActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PenActionContext penAction() throws RecognitionException {
		PenActionContext _localctx = new PenActionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_penAction);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new DownContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new UpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(ClassParser.Type, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClassListener ) ((ClassListener)listener).exitTypeCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClassVisitor ) return ((ClassVisitor<? extends T>)visitor).visitTypeCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(Type);
			setState(132);
			match(T__20);
			setState(133);
			expression(0);
			setState(134);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0089\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000\u0003\u0000\u001e"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004X\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004c\b\u0004\n\u0004\f\u0004f\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007v\b\u0007\u0003\u0007x\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b~\b\b\u0001\t\u0001\t\u0003\t\u0082\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0001\b\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005\u0002\u0000\'\'))\u0001"+
		"\u0000\'(\u0001\u0000\u0012\u0013\u0001\u0000\u000e\u0011\u0001\u0000"+
		"\u0019\u001a\u0097\u0000-\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000"+
		"\u0000\u0004@\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\b"+
		"W\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000"+
		"\u0000\u000ew\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012"+
		"\u0081\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018"+
		"\u001a\u0003\u0006\u0003\u0000\u0019\u001b\u0005+\u0000\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001d"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0003\f\u0006\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e.\u0001\u0000"+
		"\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0005\u0003\u0000\u0000"+
		"!\"\u0003\u0006\u0003\u0000\"(\u0005\u0004\u0000\u0000#$\u0003\u0002\u0001"+
		"\u0000$%\u0005\u0005\u0000\u0000%\'\u0001\u0000\u0000\u0000&#\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0006\u0000\u0000,.\u0001\u0000\u0000\u0000-\u0016\u0001\u0000"+
		"\u0000\u0000-\u001f\u0001\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0007\u0000\u000001\u0005\b\u0000\u00001?\u0007\u0000\u0000\u0000"+
		"23\u0005\t\u0000\u000034\u0005\b\u0000\u00004?\u0003\f\u0006\u000056\u0005"+
		"\n\u0000\u000067\u0005\b\u0000\u00007?\u0003\u000e\u0007\u000089\u0005"+
		"\u000b\u0000\u00009:\u0005\b\u0000\u0000:?\u0003\b\u0004\u0000;<\u0005"+
		"\f\u0000\u0000<=\u0005\b\u0000\u0000=?\u0003\b\u0004\u0000>/\u0001\u0000"+
		"\u0000\u0000>2\u0001\u0000\u0000\u0000>5\u0001\u0000\u0000\u0000>8\u0001"+
		"\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000?\u0003\u0001\u0000\u0000"+
		"\u0000@A\u0005\u0003\u0000\u0000AB\u0003\u0006\u0003\u0000BC\u0005\b\u0000"+
		"\u0000CE\u0005\r\u0000\u0000DF\u0003\u0006\u0003\u0000ED\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0007"+
		"\u0001\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0006\u0004\uffff"+
		"\uffff\u0000JK\u0007\u0002\u0000\u0000KX\u0003\b\u0004\nLX\u0003\u0014"+
		"\n\u0000MX\u0003\n\u0005\u0000NX\u0005#\u0000\u0000OX\u0005$\u0000\u0000"+
		"PX\u0005+\u0000\u0000QX\u0005&\u0000\u0000RX\u0003\u0006\u0003\u0000S"+
		"T\u0005\u0015\u0000\u0000TU\u0003\b\u0004\u0000UV\u0005\u0016\u0000\u0000"+
		"VX\u0001\u0000\u0000\u0000WI\u0001\u0000\u0000\u0000WL\u0001\u0000\u0000"+
		"\u0000WM\u0001\u0000\u0000\u0000WN\u0001\u0000\u0000\u0000WO\u0001\u0000"+
		"\u0000\u0000WP\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000WR\u0001"+
		"\u0000\u0000\u0000WS\u0001\u0000\u0000\u0000Xd\u0001\u0000\u0000\u0000"+
		"YZ\n\f\u0000\u0000Z[\u0007\u0003\u0000\u0000[c\u0003\b\u0004\r\\]\n\u000b"+
		"\u0000\u0000]^\u0007\u0002\u0000\u0000^c\u0003\b\u0004\f_`\n\t\u0000\u0000"+
		"`a\u0005\u0014\u0000\u0000ac\u0003\b\u0004\tbY\u0001\u0000\u0000\u0000"+
		"b\\\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\t\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u0017\u0000\u0000hi\u0005"+
		"+\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jk\u0005\u0015\u0000\u0000"+
		"kl\u0003\b\u0004\u0000lm\u0005\u0018\u0000\u0000mn\u0003\b\u0004\u0000"+
		"no\u0005\u0016\u0000\u0000o\r\u0001\u0000\u0000\u0000pq\u0003\b\u0004"+
		"\u0000qr\u0007\u0004\u0000\u0000rx\u0001\u0000\u0000\u0000su\u0003\b\u0004"+
		"\u0000tv\u0005\u001b\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wp\u0001\u0000\u0000\u0000ws\u0001"+
		"\u0000\u0000\u0000x\u000f\u0001\u0000\u0000\u0000y~\u0005\u001c\u0000"+
		"\u0000z~\u0005\u001d\u0000\u0000{~\u0005\u001e\u0000\u0000|~\u0005\u001f"+
		"\u0000\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0011\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0005 \u0000\u0000\u0080\u0082\u0005!\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0005\"\u0000\u0000\u0084\u0085"+
		"\u0005\u0015\u0000\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005"+
		"\u0016\u0000\u0000\u0087\u0015\u0001\u0000\u0000\u0000\r\u001a\u001d("+
		"->EWbduw}\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}