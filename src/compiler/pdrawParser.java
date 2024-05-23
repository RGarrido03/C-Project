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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, Type=40, INT=41, FLOAT=42, FRACTION=43, Word=44, Name=45, HexaColor=46, 
		ESC=47, String=48, Comment=49, WS=50;
	public static final int
		RULE_main = 0, RULE_statement = 1, RULE_instruction = 2, RULE_assignment = 3, 
		RULE_cast = 4, RULE_pause = 5, RULE_print = 6, RULE_execute = 7, RULE_class = 8, 
		RULE_classProps = 9, RULE_object = 10, RULE_variable = 11, RULE_expression = 12, 
		RULE_stdin = 13, RULE_tuple = 14, RULE_angle = 15, RULE_moveAction = 16, 
		RULE_penAction = 17, RULE_typeCast = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statement", "instruction", "assignment", "cast", "pause", "print", 
			"execute", "class", "classProps", "object", "variable", "expression", 
			"stdin", "tuple", "angle", "moveAction", "penAction", "typeCast"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "'pause'", "'->'", "'stdout'", "'stderr'", 
			"'<-'", "'execute'", "'define'", "'canvas'", "'pen'", "'{'", "'}'", "'color'", 
			"'position'", "'orientation'", "'thickness'", "'pressure'", "'new'", 
			"'*'", "'/'", "'%'", "'//'", "'+'", "'-'", "'^'", "'stdin'", "','", "'\\u00BA'", 
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
			null, null, null, null, "Type", "INT", "FLOAT", "FRACTION", "Word", "Name", 
			"HexaColor", "ESC", "String", "Comment", "WS"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 341948854446120L) != 0)) {
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
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ExecuteContext execute() {
			return getRuleContext(ExecuteContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
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
			setState(54);
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
				cast();
				}
				break;
			case 4:
				{
				setState(49);
				class_();
				}
				break;
			case 5:
				{
				setState(50);
				object();
				}
				break;
			case 6:
				{
				setState(51);
				execute();
				}
				break;
			case 7:
				{
				setState(52);
				print();
				}
				break;
			case 8:
				{
				setState(53);
				pause();
				}
				break;
			}
			setState(56);
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
	public static class InstructionMoveActionContext extends InstructionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MoveActionContext moveAction() {
			return getRuleContext(MoveActionContext.class,0);
		}
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public InstructionMoveActionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterInstructionMoveAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitInstructionMoveAction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionPenActionContext extends InstructionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PenActionContext penAction() {
			return getRuleContext(PenActionContext.class,0);
		}
		public InstructionPenActionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterInstructionPenAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitInstructionPenAction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new InstructionMoveActionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				variable();
				setState(59);
				moveAction();
				setState(60);
				angle();
				}
				break;
			case 2:
				_localctx = new InstructionPenActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				variable();
				setState(63);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentPenContext extends AssignmentContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public AssignmentPenContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterAssignmentPen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitAssignmentPen(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReAssignmentVarContext extends AssignmentContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReAssignmentVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterReAssignmentVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitReAssignmentVar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentVarContext extends AssignmentContext {
		public TerminalNode Type() { return getToken(pdrawParser.Type, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterAssignmentVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitAssignmentVar(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				_localctx = new AssignmentVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(Type);
				setState(68);
				variable();
				setState(69);
				match(T__1);
				setState(70);
				expression(0);
				}
				break;
			case T__12:
				_localctx = new AssignmentPenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				object();
				}
				break;
			case Word:
			case Name:
				_localctx = new ReAssignmentVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				variable();
				setState(74);
				match(T__1);
				setState(75);
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
			setState(79);
			match(Type);
			setState(80);
			match(T__2);
			setState(81);
			expression(0);
			setState(82);
			match(T__3);
			setState(83);
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
			setState(85);
			match(T__4);
			setState(86);
			match(INT);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode String() { return getToken(pdrawParser.String, 0); }
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
		public TerminalNode String() { return getToken(pdrawParser.String, 0); }
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
		enterRule(_localctx, 12, RULE_print);
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StdoutContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(88);
					expression(0);
					}
					break;
				case 2:
					{
					setState(89);
					variable();
					}
					break;
				case 3:
					{
					setState(90);
					match(String);
					}
					break;
				}
				setState(93);
				match(T__5);
				setState(94);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new StderrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__25:
				case T__26:
				case T__28:
				case Type:
				case INT:
				case FLOAT:
				case Word:
				case Name:
					{
					setState(95);
					expression(0);
					}
					break;
				case String:
					{
					setState(96);
					match(String);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(99);
				match(T__5);
				setState(100);
				match(T__7);
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
	public static class ExecuteContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_execute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			variable();
			setState(104);
			match(T__8);
			setState(105);
			match(T__9);
			setState(106);
			match(String);
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
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterCreatePen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitCreatePen(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateCanvasContext extends ClassContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode String() { return getToken(pdrawParser.String, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public CreateCanvasContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterCreateCanvas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitCreateCanvas(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new CreateCanvasContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__10);
				setState(109);
				match(T__11);
				setState(110);
				variable();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(111);
					match(String);
					}
				}

				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(114);
					tuple();
					}
				}

				}
				break;
			case 2:
				_localctx = new CreatePenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__10);
				setState(118);
				match(T__12);
				setState(119);
				variable();
				setState(120);
				match(T__13);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2031616L) != 0)) {
					{
					{
					setState(121);
					classProps();
					setState(122);
					match(T__0);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(T__14);
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
		public TerminalNode Word() { return getToken(pdrawParser.Word, 0); }
		public TerminalNode HexaColor() { return getToken(pdrawParser.HexaColor, 0); }
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
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__15);
				setState(134);
				match(T__1);
				setState(135);
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
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__16);
				setState(137);
				match(T__1);
				setState(138);
				tuple();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__17);
				setState(140);
				match(T__1);
				setState(141);
				angle();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(T__18);
				setState(143);
				match(T__1);
				setState(144);
				expression(0);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				match(T__19);
				setState(146);
				match(T__1);
				setState(147);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__12);
			setState(151);
			variable();
			setState(152);
			match(T__1);
			setState(153);
			match(T__20);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Word || _la==Name) {
				{
				setState(154);
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
		public TerminalNode Name() { return getToken(pdrawParser.Name, 0); }
		public TerminalNode Word() { return getToken(pdrawParser.Word, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
	public static class ExprCastContext extends ExpressionContext {
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public ExprCastContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprCast(this);
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
	public static class ExprUnaryContext extends ExpressionContext {
		public Token op;
		public ExpressionContext e2;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprUnary(this);
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
	public static class ExprStdInContext extends ExpressionContext {
		public StdinContext stdin() {
			return getRuleContext(StdinContext.class,0);
		}
		public ExprStdInContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).enterExprStdIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pdrawListener ) ((pdrawListener)listener).exitExprStdIn(this);
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
		public TerminalNode Word() { return getToken(pdrawParser.Word, 0); }
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
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__25 || _la==T__26) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				((ExprUnaryContext)_localctx).e2 = expression(8);
				}
				break;
			case INT:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new ExprFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(FLOAT);
				}
				break;
			case Word:
			case Name:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
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
				break;
			case Type:
				{
				_localctx = new ExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				typeCast();
				}
				break;
			case T__28:
				{
				_localctx = new ExprStdInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				stdin();
				}
				break;
			case T__2:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__2);
				setState(168);
				expression(0);
				setState(169);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivModContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(174);
						((ExprMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
							((ExprMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(177);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprPowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(180);
						match(T__27);
						setState(181);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TerminalNode String() { return getToken(pdrawParser.String, 0); }
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
		enterRule(_localctx, 26, RULE_stdin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__28);
			setState(188);
			match(String);
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
			setState(190);
			match(T__2);
			setState(191);
			expression(0);
			setState(192);
			match(T__29);
			setState(193);
			expression(0);
			setState(194);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DegreeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				expression(0);
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
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
				setState(199);
				expression(0);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__32) {
					{
					setState(200);
					match(T__32);
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
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				_localctx = new ForwardContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__33);
				}
				break;
			case T__34:
				_localctx = new BackwardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__34);
				}
				break;
			case T__35:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__35);
				}
				break;
			case T__36:
				_localctx = new RightContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				_localctx = new DownContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__37);
				}
				break;
			case T__38:
				_localctx = new UpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__38);
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
			setState(215);
			match(Type);
			setState(216);
			match(T__2);
			setState(217);
			expression(0);
			setState(218);
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
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u00dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006f\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bq\b\b\u0001\b\u0003\bt\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b}\b\b\n\b\f\b\u0080\t\b\u0001\b\u0001\b\u0003\b\u0084"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0095\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009c\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ac\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00b7\b\f\n"+
		"\f\f\f\u00ba\t\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ca\b\u000f\u0003\u000f\u00cc"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d2"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00d6\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0001"+
		"\u0018\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0005\u0002\u0000,,..\u0001\u0000,"+
		"-\u0001\u0000\u001a\u001b\u0001\u0000\u0016\u0019\u0001\u0000\u001f \u00f0"+
		"\u0000)\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004A"+
		"\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bO\u0001\u0000"+
		"\u0000\u0000\nU\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000e"+
		"g\u0001\u0000\u0000\u0000\u0010\u0083\u0001\u0000\u0000\u0000\u0012\u0094"+
		"\u0001\u0000\u0000\u0000\u0014\u0096\u0001\u0000\u0000\u0000\u0016\u009d"+
		"\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000\u0000\u001a\u00bb"+
		"\u0001\u0000\u0000\u0000\u001c\u00be\u0001\u0000\u0000\u0000\u001e\u00cb"+
		"\u0001\u0000\u0000\u0000 \u00d1\u0001\u0000\u0000\u0000\"\u00d5\u0001"+
		"\u0000\u0000\u0000$\u00d7\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001"+
		"\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000"+
		"\u0000.7\u0003\u0004\u0002\u0000/7\u0003\u0006\u0003\u000007\u0003\b\u0004"+
		"\u000017\u0003\u0010\b\u000027\u0003\u0014\n\u000037\u0003\u000e\u0007"+
		"\u000047\u0003\f\u0006\u000057\u0003\n\u0005\u00006.\u0001\u0000\u0000"+
		"\u00006/\u0001\u0000\u0000\u000060\u0001\u0000\u0000\u000061\u0001\u0000"+
		"\u0000\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"89\u0005\u0001\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0003\u0016"+
		"\u000b\u0000;<\u0003 \u0010\u0000<=\u0003\u001e\u000f\u0000=B\u0001\u0000"+
		"\u0000\u0000>?\u0003\u0016\u000b\u0000?@\u0003\"\u0011\u0000@B\u0001\u0000"+
		"\u0000\u0000A:\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000B\u0005"+
		"\u0001\u0000\u0000\u0000CD\u0005(\u0000\u0000DE\u0003\u0016\u000b\u0000"+
		"EF\u0005\u0002\u0000\u0000FG\u0003\u0018\f\u0000GN\u0001\u0000\u0000\u0000"+
		"HN\u0003\u0014\n\u0000IJ\u0003\u0016\u000b\u0000JK\u0005\u0002\u0000\u0000"+
		"KL\u0003\u0018\f\u0000LN\u0001\u0000\u0000\u0000MC\u0001\u0000\u0000\u0000"+
		"MH\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000N\u0007\u0001\u0000"+
		"\u0000\u0000OP\u0005(\u0000\u0000PQ\u0005\u0003\u0000\u0000QR\u0003\u0018"+
		"\f\u0000RS\u0005\u0004\u0000\u0000ST\u0005\u0001\u0000\u0000T\t\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0005\u0000\u0000VW\u0005)\u0000\u0000W\u000b"+
		"\u0001\u0000\u0000\u0000X\\\u0003\u0018\f\u0000Y\\\u0003\u0016\u000b\u0000"+
		"Z\\\u00050\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\u0006\u0000"+
		"\u0000^f\u0005\u0007\u0000\u0000_b\u0003\u0018\f\u0000`b\u00050\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0005\u0006\u0000\u0000df\u0005\b\u0000\u0000e[\u0001\u0000"+
		"\u0000\u0000ea\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0003"+
		"\u0016\u000b\u0000hi\u0005\t\u0000\u0000ij\u0005\n\u0000\u0000jk\u0005"+
		"0\u0000\u0000k\u000f\u0001\u0000\u0000\u0000lm\u0005\u000b\u0000\u0000"+
		"mn\u0005\f\u0000\u0000np\u0003\u0016\u000b\u0000oq\u00050\u0000\u0000"+
		"po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000"+
		"\u0000rt\u0003\u001c\u000e\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t\u0084\u0001\u0000\u0000\u0000uv\u0005\u000b\u0000\u0000"+
		"vw\u0005\r\u0000\u0000wx\u0003\u0016\u000b\u0000x~\u0005\u000e\u0000\u0000"+
		"yz\u0003\u0012\t\u0000z{\u0005\u0001\u0000\u0000{}\u0001\u0000\u0000\u0000"+
		"|y\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u000f\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083l\u0001\u0000\u0000\u0000\u0083"+
		"u\u0001\u0000\u0000\u0000\u0084\u0011\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u0010\u0000\u0000\u0086\u0087\u0005\u0002\u0000\u0000\u0087\u0095"+
		"\u0007\u0000\u0000\u0000\u0088\u0089\u0005\u0011\u0000\u0000\u0089\u008a"+
		"\u0005\u0002\u0000\u0000\u008a\u0095\u0003\u001c\u000e\u0000\u008b\u008c"+
		"\u0005\u0012\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\u0095"+
		"\u0003\u001e\u000f\u0000\u008e\u008f\u0005\u0013\u0000\u0000\u008f\u0090"+
		"\u0005\u0002\u0000\u0000\u0090\u0095\u0003\u0018\f\u0000\u0091\u0092\u0005"+
		"\u0014\u0000\u0000\u0092\u0093\u0005\u0002\u0000\u0000\u0093\u0095\u0003"+
		"\u0018\f\u0000\u0094\u0085\u0001\u0000\u0000\u0000\u0094\u0088\u0001\u0000"+
		"\u0000\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000"+
		"\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0095\u0013\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\r\u0000\u0000\u0097\u0098\u0003\u0016\u000b"+
		"\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099\u009b\u0005\u0015\u0000"+
		"\u0000\u009a\u009c\u0003\u0016\u000b\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0015\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0007\u0001\u0000\u0000\u009e\u0017\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0006\f\uffff\uffff\u0000\u00a0\u00a1\u0007\u0002\u0000"+
		"\u0000\u00a1\u00ac\u0003\u0018\f\b\u00a2\u00ac\u0005)\u0000\u0000\u00a3"+
		"\u00ac\u0005*\u0000\u0000\u00a4\u00ac\u0007\u0001\u0000\u0000\u00a5\u00ac"+
		"\u0003$\u0012\u0000\u00a6\u00ac\u0003\u001a\r\u0000\u00a7\u00a8\u0005"+
		"\u0003\u0000\u0000\u00a8\u00a9\u0003\u0018\f\u0000\u00a9\u00aa\u0005\u0004"+
		"\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u009f\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a2\u0001\u0000\u0000\u0000\u00ab\u00a3\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b8\u0001\u0000\u0000\u0000\u00ad\u00ae\n\n\u0000"+
		"\u0000\u00ae\u00af\u0007\u0003\u0000\u0000\u00af\u00b7\u0003\u0018\f\u000b"+
		"\u00b0\u00b1\n\t\u0000\u0000\u00b1\u00b2\u0007\u0002\u0000\u0000\u00b2"+
		"\u00b7\u0003\u0018\f\n\u00b3\u00b4\n\u0005\u0000\u0000\u00b4\u00b5\u0005"+
		"\u001c\u0000\u0000\u00b5\u00b7\u0003\u0018\f\u0005\u00b6\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b0\u0001\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0019\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001d"+
		"\u0000\u0000\u00bc\u00bd\u00050\u0000\u0000\u00bd\u001b\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u0003\u0000\u0000\u00bf\u00c0\u0003\u0018\f\u0000"+
		"\u00c0\u00c1\u0005\u001e\u0000\u0000\u00c1\u00c2\u0003\u0018\f\u0000\u00c2"+
		"\u00c3\u0005\u0004\u0000\u0000\u00c3\u001d\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0003\u0018\f\u0000\u00c5\u00c6\u0007\u0004\u0000\u0000\u00c6\u00cc"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003\u0018\f\u0000\u00c8\u00ca\u0005"+
		"!\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c4\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cc\u001f\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d2\u0005\"\u0000\u0000\u00ce\u00d2\u0005#\u0000"+
		"\u0000\u00cf\u00d2\u0005$\u0000\u0000\u00d0\u00d2\u0005%\u0000\u0000\u00d1"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"!\u0001\u0000\u0000\u0000\u00d3\u00d6\u0005&\u0000\u0000\u00d4\u00d6\u0005"+
		"\'\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6#\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005(\u0000\u0000"+
		"\u00d8\u00d9\u0005\u0003\u0000\u0000\u00d9\u00da\u0003\u0018\f\u0000\u00da"+
		"\u00db\u0005\u0004\u0000\u0000\u00db%\u0001\u0000\u0000\u0000\u0014)6"+
		"AM[aeps~\u0083\u0094\u009b\u00ab\u00b6\u00b8\u00c9\u00cb\u00d1\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}