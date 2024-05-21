// Generated from pdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pdrawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, Type=38, INT=39, 
		FLOAT=40, FRACTION=41, Word=42, Name=43, ESC=44, String=45, Comment=46, 
		WS=47;
	public static final int
		RULE_main = 0, RULE_statement = 1, RULE_instruction = 2, RULE_assignment = 3, 
		RULE_cast = 4, RULE_pause = 5, RULE_stdin = 6, RULE_print = 7, RULE_class = 8, 
		RULE_classProps = 9, RULE_object = 10, RULE_variable = 11, RULE_expression = 12, 
		RULE_execute = 13, RULE_tuple = 14, RULE_angle = 15, RULE_moveAction = 16, 
		RULE_penAction = 17, RULE_typeCast = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statement", "instruction", "assignment", "cast", "pause", "stdin", 
			"print", "class", "classProps", "object", "variable", "expression", "execute", 
			"tuple", "angle", "moveAction", "penAction", "typeCast"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'pause'", "'stdin'", "'\"'", "'->'", 
			"'stdout'", "'stderr'", "'define'", "'pen'", "'{'", "'}'", "'color'", 
			"'position'", "'orientation'", "'thickness'", "'pressure'", "'new'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'^'", "'execute'", "','", "'\\u00BA'", 
			"'deg'", "'rad'", "'forward'", "'backward'", "'left'", "'right'", "'down'", 
			"'up'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Type", "INT", "FLOAT", "FRACTION", "Word", "Name", "ESC", 
			"String", "Comment", "WS"
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
	public String getGrammarFileName() { return "pdraw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pdrawParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pdrawParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093028352L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(46);
				instruction();
				}
				break;
			case 2:
				{
				setState(47);
				assignment();
				}
				break;
			case 3:
				{
				setState(48);
				class_();
				}
				break;
			case 4:
				{
				setState(49);
				object();
				}
				break;
			}
			setState(52);
			match(T__0);
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
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveAction_Context extends InstructionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MoveActionContext moveAction() {
			return getRuleContext(MoveActionContext.class,0);
		}
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public MoveAction_Context(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterMoveAction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitMoveAction_(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PenAction_Context extends InstructionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PenActionContext penAction() {
			return getRuleContext(PenActionContext.class,0);
		}
		public PenAction_Context(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterPenAction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitPenAction_(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new MoveAction_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				variable();
				setState(55);
				moveAction();
				setState(56);
				angle();
				}
				break;
			case 2:
				_localctx = new PenAction_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				variable();
				setState(59);
				penAction();
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
	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			variable();
			setState(64);
			match(T__1);
			setState(65);
			expression(0);
			setState(66);
			match(T__0);
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
	public static class CastContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(pdrawParser.Type, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitCast(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(Type);
			setState(69);
			match(T__2);
			setState(70);
			expression(0);
			setState(71);
			match(T__3);
			setState(72);
			match(T__0);
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
	public static class PauseContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(pdrawParser.INT, 0); }
		public PauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitPause(this);
		}
	}

	public final PauseContext pause() throws RecognitionException {
		PauseContext _localctx = new PauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__4);
			setState(75);
			match(INT);
			setState(76);
			match(T__0);
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
	public static class StdinContext extends ParserRuleContext {
		public StdinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterStdin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitStdin(this);
		}
	}

	public final StdinContext stdin() throws RecognitionException {
		StdinContext _localctx = new StdinContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stdin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__5);
			setState(79);
			match(T__6);
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
	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StdoutContext extends PrintContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StdoutContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterStdout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitStdout(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StderrContext extends PrintContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StderrContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterStderr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitStderr(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StdoutContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				expression(0);
				setState(82);
				match(T__7);
				setState(83);
				match(T__8);
				setState(84);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new StderrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				expression(0);
				setState(87);
				match(T__7);
				setState(88);
				match(T__9);
				setState(89);
				match(T__0);
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
	public static class ClassContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ClassPropsContext> classProps() {
			return getRuleContexts(ClassPropsContext.class);
		}
		public ClassPropsContext classProps(int i) {
			return getRuleContext(ClassPropsContext.class,i);
		}
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitClass(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__10);
			setState(94);
			match(T__11);
			setState(95);
			variable();
			setState(96);
			match(T__12);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0)) {
				{
				{
				setState(97);
				classProps();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__13);
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
		public TerminalNode Word() { return getToken(pdrawParser.Word, 0); }
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterClassProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitClassProps(this);
		}
	}

	public final ClassPropsContext classProps() throws RecognitionException {
		ClassPropsContext _localctx = new ClassPropsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classProps);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__14);
				setState(106);
				match(T__1);
				setState(107);
				match(Word);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__15);
				setState(109);
				match(T__1);
				setState(110);
				tuple();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__16);
				setState(112);
				match(T__1);
				setState(113);
				angle();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(T__17);
				setState(115);
				match(T__1);
				setState(116);
				expression(0);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				match(T__18);
				setState(118);
				match(T__1);
				setState(119);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__11);
			setState(123);
			variable();
			setState(124);
			match(T__1);
			setState(125);
			match(T__19);
			setState(126);
			variable();
			setState(127);
			match(T__0);
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
		public TerminalNode Name() { return getToken(pdrawParser.Name, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Name);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprAddSub(this);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprPow(this);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprParent(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(pdrawParser.FLOAT, 0); }
		public ExprFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprFloat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntegerContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(pdrawParser.INT, 0); }
		public ExprIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprInteger(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdContext extends ExpressionContext {
		public TerminalNode Name() { return getToken(pdrawParser.Name, 0); }
		public ExprIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprId(this);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprMultDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprMultDivMod(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new ExprFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(FLOAT);
				}
				break;
			case Name:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				match(Name);
				}
				break;
			case T__2:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__2);
				setState(136);
				expression(0);
				setState(137);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivModContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(142);
						((ExprMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
							((ExprMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(145);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprPowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(148);
						match(T__25);
						setState(149);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(154);
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
	public static class ExecuteContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(pdrawParser.String, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExecute(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_execute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__26);
			setState(156);
			match(String);
			setState(157);
			match(T__0);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__2);
			setState(160);
			expression(0);
			setState(161);
			match(T__27);
			setState(162);
			expression(0);
			setState(163);
			match(T__3);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterRadian(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitRadian(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DegreeContext extends AngleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DegreeContext(AngleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitDegree(this);
		}
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_angle);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DegreeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				expression(0);
				setState(166);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
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
				setState(168);
				expression(0);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__30) {
					{
					setState(169);
					match(T__30);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitLeft(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForwardContext extends MoveActionContext {
		public ForwardContext(MoveActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitForward(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackwardContext extends MoveActionContext {
		public BackwardContext(MoveActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterBackward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitBackward(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RightContext extends MoveActionContext {
		public RightContext(MoveActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitRight(this);
		}
	}

	public final MoveActionContext moveAction() throws RecognitionException {
		MoveActionContext _localctx = new MoveActionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_moveAction);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new ForwardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__31);
				}
				break;
			case T__32:
				_localctx = new BackwardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__32);
				}
				break;
			case T__33:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new RightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__34);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitUp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DownContext extends PenActionContext {
		public DownContext(PenActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitDown(this);
		}
	}

	public final PenActionContext penAction() throws RecognitionException {
		PenActionContext _localctx = new PenActionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_penAction);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				_localctx = new DownContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__35);
				}
				break;
			case T__36:
				_localctx = new UpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__36);
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
		public TerminalNode Type() { return getToken(pdrawParser.Type, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitTypeCast(this);
		}
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(Type);
			setState(185);
			match(T__2);
			setState(186);
			expression(0);
			setState(187);
			match(T__3);
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
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00be\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\\\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bc\b\b\n\b\f\bf\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\ty\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u008c\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0097\b\f\n\f\f\f\u009a\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00ab\b\u000f\u0003\u000f\u00ad\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b3\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00b7\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0001\u0018\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0003\u0001\u0000\u0015\u0017\u0001\u0000\u0018\u0019\u0001"+
		"\u0000\u001d\u001e\u00c1\u0000)\u0001\u0000\u0000\u0000\u00022\u0001\u0000"+
		"\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000"+
		"\bD\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fN\u0001\u0000"+
		"\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010]\u0001\u0000\u0000\u0000"+
		"\u0012x\u0001\u0000\u0000\u0000\u0014z\u0001\u0000\u0000\u0000\u0016\u0081"+
		"\u0001\u0000\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u009b"+
		"\u0001\u0000\u0000\u0000\u001c\u009f\u0001\u0000\u0000\u0000\u001e\u00ac"+
		"\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00b6\u0001"+
		"\u0000\u0000\u0000$\u00b8\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001"+
		"\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000"+
		"\u0000.3\u0003\u0004\u0002\u0000/3\u0003\u0006\u0003\u000003\u0003\u0010"+
		"\b\u000013\u0003\u0014\n\u00002.\u0001\u0000\u0000\u00002/\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000045\u0005\u0001\u0000\u00005\u0003\u0001\u0000\u0000"+
		"\u000067\u0003\u0016\u000b\u000078\u0003 \u0010\u000089\u0003\u001e\u000f"+
		"\u00009>\u0001\u0000\u0000\u0000:;\u0003\u0016\u000b\u0000;<\u0003\"\u0011"+
		"\u0000<>\u0001\u0000\u0000\u0000=6\u0001\u0000\u0000\u0000=:\u0001\u0000"+
		"\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0003\u0016\u000b\u0000"+
		"@A\u0005\u0002\u0000\u0000AB\u0003\u0018\f\u0000BC\u0005\u0001\u0000\u0000"+
		"C\u0007\u0001\u0000\u0000\u0000DE\u0005&\u0000\u0000EF\u0005\u0003\u0000"+
		"\u0000FG\u0003\u0018\f\u0000GH\u0005\u0004\u0000\u0000HI\u0005\u0001\u0000"+
		"\u0000I\t\u0001\u0000\u0000\u0000JK\u0005\u0005\u0000\u0000KL\u0005\'"+
		"\u0000\u0000LM\u0005\u0001\u0000\u0000M\u000b\u0001\u0000\u0000\u0000"+
		"NO\u0005\u0006\u0000\u0000OP\u0005\u0007\u0000\u0000P\r\u0001\u0000\u0000"+
		"\u0000QR\u0003\u0018\f\u0000RS\u0005\b\u0000\u0000ST\u0005\t\u0000\u0000"+
		"TU\u0005\u0001\u0000\u0000U\\\u0001\u0000\u0000\u0000VW\u0003\u0018\f"+
		"\u0000WX\u0005\b\u0000\u0000XY\u0005\n\u0000\u0000YZ\u0005\u0001\u0000"+
		"\u0000Z\\\u0001\u0000\u0000\u0000[Q\u0001\u0000\u0000\u0000[V\u0001\u0000"+
		"\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000]^\u0005\u000b\u0000\u0000"+
		"^_\u0005\f\u0000\u0000_`\u0003\u0016\u000b\u0000`d\u0005\r\u0000\u0000"+
		"ac\u0003\u0012\t\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u000e\u0000\u0000h\u0011\u0001"+
		"\u0000\u0000\u0000ij\u0005\u000f\u0000\u0000jk\u0005\u0002\u0000\u0000"+
		"ky\u0005*\u0000\u0000lm\u0005\u0010\u0000\u0000mn\u0005\u0002\u0000\u0000"+
		"ny\u0003\u001c\u000e\u0000op\u0005\u0011\u0000\u0000pq\u0005\u0002\u0000"+
		"\u0000qy\u0003\u001e\u000f\u0000rs\u0005\u0012\u0000\u0000st\u0005\u0002"+
		"\u0000\u0000ty\u0003\u0018\f\u0000uv\u0005\u0013\u0000\u0000vw\u0005\u0002"+
		"\u0000\u0000wy\u0003\u0018\f\u0000xi\u0001\u0000\u0000\u0000xl\u0001\u0000"+
		"\u0000\u0000xo\u0001\u0000\u0000\u0000xr\u0001\u0000\u0000\u0000xu\u0001"+
		"\u0000\u0000\u0000y\u0013\u0001\u0000\u0000\u0000z{\u0005\f\u0000\u0000"+
		"{|\u0003\u0016\u000b\u0000|}\u0005\u0002\u0000\u0000}~\u0005\u0014\u0000"+
		"\u0000~\u007f\u0003\u0016\u000b\u0000\u007f\u0080\u0005\u0001\u0000\u0000"+
		"\u0080\u0015\u0001\u0000\u0000\u0000\u0081\u0082\u0005+\u0000\u0000\u0082"+
		"\u0017\u0001\u0000\u0000\u0000\u0083\u0084\u0006\f\uffff\uffff\u0000\u0084"+
		"\u008c\u0005\'\u0000\u0000\u0085\u008c\u0005(\u0000\u0000\u0086\u008c"+
		"\u0005+\u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088\u0089\u0003"+
		"\u0018\f\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u0083\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000"+
		"\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000"+
		"\u0000\u0000\u008c\u0098\u0001\u0000\u0000\u0000\u008d\u008e\n\u0007\u0000"+
		"\u0000\u008e\u008f\u0007\u0000\u0000\u0000\u008f\u0097\u0003\u0018\f\b"+
		"\u0090\u0091\n\u0006\u0000\u0000\u0091\u0092\u0007\u0001\u0000\u0000\u0092"+
		"\u0097\u0003\u0018\f\u0007\u0093\u0094\n\u0003\u0000\u0000\u0094\u0095"+
		"\u0005\u001a\u0000\u0000\u0095\u0097\u0003\u0018\f\u0003\u0096\u008d\u0001"+
		"\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0093\u0001"+
		"\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0019\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u001b\u0000\u0000\u009c\u009d\u0005-\u0000\u0000\u009d\u009e\u0005\u0001"+
		"\u0000\u0000\u009e\u001b\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0003"+
		"\u0000\u0000\u00a0\u00a1\u0003\u0018\f\u0000\u00a1\u00a2\u0005\u001c\u0000"+
		"\u0000\u00a2\u00a3\u0003\u0018\f\u0000\u00a3\u00a4\u0005\u0004\u0000\u0000"+
		"\u00a4\u001d\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\u0018\f\u0000\u00a6"+
		"\u00a7\u0007\u0002\u0000\u0000\u00a7\u00ad\u0001\u0000\u0000\u0000\u00a8"+
		"\u00aa\u0003\u0018\f\u0000\u00a9\u00ab\u0005\u001f\u0000\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a5\u0001\u0000\u0000\u0000\u00ac\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ad\u001f\u0001\u0000\u0000\u0000\u00ae\u00b3"+
		"\u0005 \u0000\u0000\u00af\u00b3\u0005!\u0000\u0000\u00b0\u00b3\u0005\""+
		"\u0000\u0000\u00b1\u00b3\u0005#\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3!\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0005$\u0000\u0000\u00b5\u00b7\u0005%\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7#\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005&\u0000\u0000\u00b9\u00ba\u0005\u0003"+
		"\u0000\u0000\u00ba\u00bb\u0003\u0018\f\u0000\u00bb\u00bc\u0005\u0004\u0000"+
		"\u0000\u00bc%\u0001\u0000\u0000\u0000\r)2=[dx\u008b\u0096\u0098\u00aa"+
		"\u00ac\u00b2\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}