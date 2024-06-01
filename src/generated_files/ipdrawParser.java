// Generated from ipdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ipdrawParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, Type=61, INT=62, FLOAT=63, BOOL=64, Word=65, Name=66, HexaColor=67, 
		ESC=68, STRING=69, Comment=70, WS=71;
	public static final int
		RULE_main = 0, RULE_statement = 1, RULE_ifStatement = 2, RULE_elseIfBlock = 3, 
		RULE_elseBlock = 4, RULE_whileLoop = 5, RULE_forLoop = 6, RULE_finallyBlock = 7, 
		RULE_condition = 8, RULE_instruction = 9, RULE_assignment = 10, RULE_stdin = 11, 
		RULE_pause = 12, RULE_print = 13, RULE_variable = 14, RULE_postincdec = 15, 
		RULE_expression = 16, RULE_tuple = 17, RULE_angle = 18, RULE_rotateAction = 19, 
		RULE_moveAction = 20, RULE_penAction = 21, RULE_arrowProps = 22, RULE_typeCast = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statement", "ifStatement", "elseIfBlock", "elseBlock", "whileLoop", 
			"forLoop", "finallyBlock", "condition", "instruction", "assignment", 
			"stdin", "pause", "print", "variable", "postincdec", "expression", "tuple", 
			"angle", "rotateAction", "moveAction", "penAction", "arrowProps", "typeCast"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", 
			"'until'", "'for'", "'finally'", "'\\u00AC'", "'!'", "'not'", "'=='", 
			"'eq'", "'!='", "'neq'", "'<'", "'lt'", "'>'", "'gt'", "'<='", "'lte'", 
			"'>='", "'gte'", "'&&'", "'and'", "'||'", "'or'", "'='", "','", "'stdin'", 
			"'pause'", "'->'", "'stdout'", "'stderr'", "'++'", "'--'", "'/'", "'//'", 
			"'*'", "'mod'", "'+'", "'-'", "'^'", "'\\u00BA'", "'deg'", "'rad'", "'left'", 
			"'right'", "'forward'", "'backward'", "'down'", "'up'", "'color'", "'position'", 
			"'orientation'", "'thickness'", "'pressure'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Type", "INT", "FLOAT", "BOOL", "Word", "Name", "HexaColor", "ESC", 
			"STRING", "Comment", "WS"
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
	public String getGrammarFileName() { return "ipdraw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ipdrawParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ipdrawParser.EOF, 0); }
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073097578903796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 39L) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StdinContext stdin() {
			return getRuleContext(StdinContext.class,0);
		}
		public PauseContext pause() {
			return getRuleContext(PauseContext.class,0);
		}
		public PostincdecContext postincdec() {
			return getRuleContext(PostincdecContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(56);
				instruction();
				}
				break;
			case 2:
				{
				setState(57);
				assignment();
				}
				break;
			case 3:
				{
				setState(58);
				ifStatement();
				}
				break;
			case 4:
				{
				setState(59);
				whileLoop();
				}
				break;
			case 5:
				{
				setState(60);
				forLoop();
				}
				break;
			case 6:
				{
				setState(61);
				print();
				}
				break;
			case 7:
				{
				setState(62);
				stdin();
				}
				break;
			case 8:
				{
				setState(63);
				pause();
				}
				break;
			case 9:
				{
				setState(64);
				postincdec();
				}
				break;
			}
			setState(67);
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
	public static class IfStatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElseIfBlockContext> elseIfBlock() {
			return getRuleContexts(ElseIfBlockContext.class);
		}
		public ElseIfBlockContext elseIfBlock(int i) {
			return getRuleContext(ElseIfBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__1);
			setState(70);
			match(T__2);
			setState(71);
			condition();
			setState(72);
			match(T__3);
			setState(73);
			match(T__4);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073097578903796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 39L) != 0)) {
				{
				{
				setState(74);
				statement();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__5);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					elseIfBlock();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(87);
				elseBlock();
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
	public static class ElseIfBlockContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterElseIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitElseIfBlock(this);
		}
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elseIfBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(91);
			match(T__1);
			setState(92);
			match(T__2);
			setState(93);
			condition();
			setState(94);
			match(T__3);
			setState(95);
			match(T__4);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073097578903796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 39L) != 0)) {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__5);
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
	public static class ElseBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitElseBlock(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__6);
			setState(105);
			match(T__4);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073097578903796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 39L) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__5);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public Token cicle;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((WhileLoopContext)_localctx).cicle = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
				((WhileLoopContext)_localctx).cicle = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			match(T__2);
			setState(116);
			condition();
			setState(117);
			match(T__3);
			setState(118);
			match(T__4);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073097578903796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 39L) != 0)) {
				{
				{
				setState(119);
				statement();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__5);
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
	public static class ForLoopContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__9);
			setState(128);
			match(T__2);
			setState(129);
			assignment();
			setState(130);
			match(T__0);
			setState(131);
			condition();
			setState(132);
			match(T__0);
			setState(133);
			assignment();
			setState(134);
			match(T__3);
			setState(135);
			match(T__4);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073097578903796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 39L) != 0)) {
				{
				{
				setState(136);
				statement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__5);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(143);
				finallyBlock();
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
	public static class FinallyBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_finallyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__10);
			setState(147);
			match(T__4);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1073097578903796L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 39L) != 0)) {
				{
				{
				setState(148);
				statement();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(T__5);
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionGreaterThanContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionGreaterThanContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionGreaterThan(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionAndContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionAndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionOrContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionOrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionNotContext extends ConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionNotContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionLessThanContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionLessThanContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionLessThan(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionEqualsContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionEqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionEquals(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionLessEqualContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionLessEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionLessEqual(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionNotEqualsContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionNotEqualsContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionNotEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionNotEquals(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionGreaterEqualContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionGreaterEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionGreaterEqual(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionParenthesesContext extends ConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionParenthesesContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterConditionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitConditionParentheses(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ConditionNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				condition();
				}
				break;
			case 2:
				_localctx = new ConditionEqualsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				expression(0);
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				expression(0);
				}
				break;
			case 3:
				_localctx = new ConditionNotEqualsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				expression(0);
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				expression(0);
				}
				break;
			case 4:
				_localctx = new ConditionLessThanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				expression(0);
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				expression(0);
				}
				break;
			case 5:
				_localctx = new ConditionGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				expression(0);
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				expression(0);
				}
				break;
			case 6:
				_localctx = new ConditionLessEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				expression(0);
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				expression(0);
				}
				break;
			case 7:
				_localctx = new ConditionGreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				expression(0);
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				expression(0);
				}
				break;
			case 8:
				_localctx = new ConditionAndContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				expression(0);
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				expression(0);
				}
				break;
			case 9:
				_localctx = new ConditionOrContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				expression(0);
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				expression(0);
				}
				break;
			case 10:
				_localctx = new ConditionParenthesesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
				match(T__2);
				setState(191);
				condition();
				setState(192);
				match(T__3);
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
	public static class InstructionArrowPropsContext extends InstructionContext {
		public ArrowPropsContext arrowProps() {
			return getRuleContext(ArrowPropsContext.class,0);
		}
		public InstructionArrowPropsContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterInstructionArrowProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitInstructionArrowProps(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionMoveActionContext extends InstructionContext {
		public MoveActionContext moveAction() {
			return getRuleContext(MoveActionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstructionMoveActionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterInstructionMoveAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitInstructionMoveAction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionRotateActionContext extends InstructionContext {
		public RotateActionContext rotateAction() {
			return getRuleContext(RotateActionContext.class,0);
		}
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public InstructionRotateActionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterInstructionRotateAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitInstructionRotateAction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionPenActionContext extends InstructionContext {
		public PenActionContext penAction() {
			return getRuleContext(PenActionContext.class,0);
		}
		public InstructionPenActionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterInstructionPenAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitInstructionPenAction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruction);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
			case T__52:
				_localctx = new InstructionMoveActionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				moveAction();
				setState(197);
				expression(0);
				}
				break;
			case T__49:
			case T__50:
				_localctx = new InstructionRotateActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				rotateAction();
				setState(200);
				angle();
				}
				break;
			case T__53:
			case T__54:
				_localctx = new InstructionPenActionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				penAction();
				}
				break;
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
				_localctx = new InstructionArrowPropsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				arrowProps();
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterReAssignmentVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitReAssignmentVar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentVarContext extends AssignmentContext {
		public TerminalNode Type() { return getToken(ipdrawParser.Type, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterAssignmentVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitAssignmentVar(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Type:
				_localctx = new AssignmentVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(Type);
				setState(207);
				variable();
				setState(208);
				match(T__30);
				setState(209);
				expression(0);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__31) {
					{
					setState(210);
					match(T__31);
					setState(211);
					variable();
					setState(212);
					match(T__30);
					setState(213);
					expression(0);
					}
				}

				}
				break;
			case Word:
			case Name:
				_localctx = new ReAssignmentVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				variable();
				setState(218);
				match(T__30);
				setState(219);
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
	public static class StdinContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StdinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterStdin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitStdin(this);
		}
	}

	public final StdinContext stdin() throws RecognitionException {
		StdinContext _localctx = new StdinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stdin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__32);
			setState(224);
			expression(0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterPause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitPause(this);
		}
	}

	public final PauseContext pause() throws RecognitionException {
		PauseContext _localctx = new PauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__33);
			setState(227);
			expression(0);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterStdout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitStdout(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterStderr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitStderr(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new StdoutContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				expression(0);
				setState(230);
				match(T__34);
				setState(231);
				match(T__35);
				}
				break;
			case 2:
				_localctx = new StderrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				expression(0);
				setState(234);
				match(T__34);
				setState(235);
				match(T__36);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(ipdrawParser.Name, 0); }
		public TerminalNode Word() { return getToken(ipdrawParser.Word, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
	public static class PostincdecContext extends ParserRuleContext {
		public Token op;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PostincdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postincdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterPostincdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitPostincdec(this);
		}
	}

	public final PostincdecContext postincdec() throws RecognitionException {
		PostincdecContext _localctx = new PostincdecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_postincdec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			variable();
			setState(242);
			((PostincdecContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__38) ) {
				((PostincdecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
	public static class ExprStringContext extends ExpressionContext {
		public List<TerminalNode> STRING() { return getTokens(ipdrawParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ipdrawParser.STRING, i);
		}
		public ExprStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprString(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprParent(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFloatContext extends ExpressionContext {
		public TerminalNode FLOAT() { return getToken(ipdrawParser.FLOAT, 0); }
		public ExprFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprFloat(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprMultDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprMultDivMod(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPostIncDecContext extends ExpressionContext {
		public PostincdecContext postincdec() {
			return getRuleContext(PostincdecContext.class,0);
		}
		public ExprPostIncDecContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprPostIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprPostIncDec(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprAddSub(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprPow(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprCast(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprUnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprUnary(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprStdIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprStdIn(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntegerContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ipdrawParser.INT, 0); }
		public ExprIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprInteger(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(ipdrawParser.BOOL, 0); }
		public ExprBoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprBool(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterExprVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitExprVariable(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(245);
				((ExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__44) ) {
					((ExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				expression(11);
				}
				break;
			case 2:
				{
				_localctx = new ExprPostIncDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				postincdec();
				}
				break;
			case 3:
				{
				_localctx = new ExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				typeCast();
				}
				break;
			case 4:
				{
				_localctx = new ExprStdInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				stdin();
				}
				break;
			case 5:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new ExprFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(FLOAT);
				}
				break;
			case 7:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(252);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(255); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				{
				_localctx = new ExprBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(BOOL);
				}
				break;
			case 9:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				variable();
				}
				break;
			case 10:
				{
				_localctx = new ExprParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(T__2);
				setState(260);
				expression(0);
				setState(261);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivModContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(266);
						((ExprMultDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16492674416640L) != 0)) ) {
							((ExprMultDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(269);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__43 || _la==T__44) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprPowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(272);
						match(T__45);
						setState(273);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__2);
			setState(280);
			expression(0);
			setState(281);
			match(T__31);
			setState(282);
			expression(0);
			setState(283);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterRadian(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitRadian(this);
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
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitDegree(this);
		}
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_angle);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new DegreeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				expression(0);
				setState(286);
				_la = _input.LA(1);
				if ( !(_la==T__46 || _la==T__47) ) {
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
				setState(288);
				expression(0);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(289);
					match(T__48);
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
	public static class RotateActionContext extends ParserRuleContext {
		public RotateActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterRotateAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitRotateAction(this);
		}
	}

	public final RotateActionContext rotateAction() throws RecognitionException {
		RotateActionContext _localctx = new RotateActionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rotateAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__50) ) {
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
	public static class MoveActionContext extends ParserRuleContext {
		public MoveActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterMoveAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitMoveAction(this);
		}
	}

	public final MoveActionContext moveAction() throws RecognitionException {
		MoveActionContext _localctx = new MoveActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_moveAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
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
	public static class PenActionContext extends ParserRuleContext {
		public PenActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterPenAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitPenAction(this);
		}
	}

	public final PenActionContext penAction() throws RecognitionException {
		PenActionContext _localctx = new PenActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_penAction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__54) ) {
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
	public static class ArrowPropsContext extends ParserRuleContext {
		public ArrowPropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowProps; }
	 
		public ArrowPropsContext() { }
		public void copyFrom(ArrowPropsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowOrientationContext extends ArrowPropsContext {
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public ArrowOrientationContext(ArrowPropsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterArrowOrientation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitArrowOrientation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowPressureContext extends ArrowPropsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowPressureContext(ArrowPropsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterArrowPressure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitArrowPressure(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowColorContext extends ArrowPropsContext {
		public TerminalNode Word() { return getToken(ipdrawParser.Word, 0); }
		public TerminalNode HexaColor() { return getToken(ipdrawParser.HexaColor, 0); }
		public ArrowColorContext(ArrowPropsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterArrowColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitArrowColor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowPositionContext extends ArrowPropsContext {
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ArrowPositionContext(ArrowPropsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterArrowPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitArrowPosition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowThicknessContext extends ArrowPropsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowThicknessContext(ArrowPropsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterArrowThickness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitArrowThickness(this);
		}
	}

	public final ArrowPropsContext arrowProps() throws RecognitionException {
		ArrowPropsContext _localctx = new ArrowPropsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrowProps);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				_localctx = new ArrowColorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__55);
				setState(301);
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
			case T__56:
				_localctx = new ArrowPositionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(T__56);
				setState(303);
				tuple();
				}
				break;
			case T__57:
				_localctx = new ArrowOrientationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(T__57);
				setState(305);
				angle();
				}
				break;
			case T__58:
				_localctx = new ArrowThicknessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(T__58);
				setState(307);
				expression(0);
				}
				break;
			case T__59:
				_localctx = new ArrowPressureContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				match(T__59);
				setState(309);
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
	public static class TypeCastContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(ipdrawParser.Type, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).enterTypeCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ipdrawListener ) ((ipdrawListener)listener).exitTypeCast(this);
		}
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Type);
			setState(313);
			match(T__2);
			setState(314);
			expression(0);
			setState(315);
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
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001G\u013e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0001\u0002\u0003\u0002"+
		"Y\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003b\b\u0003\n\u0003\f\u0003e\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"l\b\u0004\n\u0004\f\u0004o\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"y\b\u0005\n\u0005\f\u0005|\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u008a\b\u0006\n\u0006"+
		"\f\u0006\u008d\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0091\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0096\b\u0007\n\u0007"+
		"\f\u0007\u0099\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00c3\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00cd\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00d8\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00de\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00ee\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00fe\b\u0010\u000b\u0010"+
		"\f\u0010\u00ff\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0108\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0113\b\u0010\n\u0010\f\u0010\u0116\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0123\b\u0012\u0003"+
		"\u0012\u0125\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0137\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0000\u0001 \u0018\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\u0013"+
		"\u0001\u0000\b\t\u0001\u0000\f\u000e\u0001\u0000\u000f\u0010\u0001\u0000"+
		"\u0011\u0012\u0001\u0000\u0013\u0014\u0001\u0000\u0015\u0016\u0001\u0000"+
		"\u0017\u0018\u0001\u0000\u0019\u001a\u0001\u0000\u001b\u001c\u0001\u0000"+
		"\u001d\u001e\u0001\u0000AB\u0001\u0000&\'\u0001\u0000,-\u0001\u0000(+"+
		"\u0001\u0000/0\u0001\u000023\u0001\u000045\u0001\u000067\u0002\u0000A"+
		"ACC\u0159\u00003\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000"+
		"\u0004E\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000\u0000\bh\u0001"+
		"\u0000\u0000\u0000\nr\u0001\u0000\u0000\u0000\f\u007f\u0001\u0000\u0000"+
		"\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u00c2\u0001\u0000\u0000"+
		"\u0000\u0012\u00cc\u0001\u0000\u0000\u0000\u0014\u00dd\u0001\u0000\u0000"+
		"\u0000\u0016\u00df\u0001\u0000\u0000\u0000\u0018\u00e2\u0001\u0000\u0000"+
		"\u0000\u001a\u00ed\u0001\u0000\u0000\u0000\u001c\u00ef\u0001\u0000\u0000"+
		"\u0000\u001e\u00f1\u0001\u0000\u0000\u0000 \u0107\u0001\u0000\u0000\u0000"+
		"\"\u0117\u0001\u0000\u0000\u0000$\u0124\u0001\u0000\u0000\u0000&\u0126"+
		"\u0001\u0000\u0000\u0000(\u0128\u0001\u0000\u0000\u0000*\u012a\u0001\u0000"+
		"\u0000\u0000,\u0136\u0001\u0000\u0000\u0000.\u0138\u0001\u0000\u0000\u0000"+
		"02\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u0000\u0000\u00017\u0001"+
		"\u0001\u0000\u0000\u00008B\u0003\u0012\t\u00009B\u0003\u0014\n\u0000:"+
		"B\u0003\u0004\u0002\u0000;B\u0003\n\u0005\u0000<B\u0003\f\u0006\u0000"+
		"=B\u0003\u001a\r\u0000>B\u0003\u0016\u000b\u0000?B\u0003\u0018\f\u0000"+
		"@B\u0003\u001e\u000f\u0000A8\u0001\u0000\u0000\u0000A9\u0001\u0000\u0000"+
		"\u0000A:\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000A<\u0001\u0000"+
		"\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0001\u0000\u0000D\u0003\u0001\u0000\u0000\u0000EF\u0005\u0002"+
		"\u0000\u0000FG\u0005\u0003\u0000\u0000GH\u0003\u0010\b\u0000HI\u0005\u0004"+
		"\u0000\u0000IM\u0005\u0005\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PT\u0005\u0006\u0000\u0000QS\u0003\u0006\u0003\u0000RQ\u0001\u0000"+
		"\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WY\u0003\b\u0004\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\u0005\u0001\u0000\u0000\u0000Z[\u0005\u0007\u0000\u0000[\\\u0005\u0002"+
		"\u0000\u0000\\]\u0005\u0003\u0000\u0000]^\u0003\u0010\b\u0000^_\u0005"+
		"\u0004\u0000\u0000_c\u0005\u0005\u0000\u0000`b\u0003\u0002\u0001\u0000"+
		"a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0006\u0000\u0000g\u0007\u0001\u0000\u0000\u0000"+
		"hi\u0005\u0007\u0000\u0000im\u0005\u0005\u0000\u0000jl\u0003\u0002\u0001"+
		"\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u0005\u0006\u0000\u0000q\t\u0001\u0000\u0000\u0000"+
		"rs\u0007\u0000\u0000\u0000st\u0005\u0003\u0000\u0000tu\u0003\u0010\b\u0000"+
		"uv\u0005\u0004\u0000\u0000vz\u0005\u0005\u0000\u0000wy\u0003\u0002\u0001"+
		"\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}~\u0005\u0006\u0000\u0000~\u000b\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0081\u0005\u0003\u0000\u0000"+
		"\u0081\u0082\u0003\u0014\n\u0000\u0082\u0083\u0005\u0001\u0000\u0000\u0083"+
		"\u0084\u0003\u0010\b\u0000\u0084\u0085\u0005\u0001\u0000\u0000\u0085\u0086"+
		"\u0003\u0014\n\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087\u008b\u0005"+
		"\u0005\u0000\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090\u0005"+
		"\u0006\u0000\u0000\u008f\u0091\u0003\u000e\u0007\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\r\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u000b\u0000\u0000\u0093\u0097\u0005\u0005"+
		"\u0000\u0000\u0094\u0096\u0003\u0002\u0001\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0006"+
		"\u0000\u0000\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0001"+
		"\u0000\u0000\u009d\u00c3\u0003\u0010\b\u0000\u009e\u009f\u0003 \u0010"+
		"\u0000\u009f\u00a0\u0007\u0002\u0000\u0000\u00a0\u00a1\u0003 \u0010\u0000"+
		"\u00a1\u00c3\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003 \u0010\u0000\u00a3"+
		"\u00a4\u0007\u0003\u0000\u0000\u00a4\u00a5\u0003 \u0010\u0000\u00a5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003 \u0010\u0000\u00a7\u00a8\u0007"+
		"\u0004\u0000\u0000\u00a8\u00a9\u0003 \u0010\u0000\u00a9\u00c3\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0003 \u0010\u0000\u00ab\u00ac\u0007\u0005\u0000"+
		"\u0000\u00ac\u00ad\u0003 \u0010\u0000\u00ad\u00c3\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0003 \u0010\u0000\u00af\u00b0\u0007\u0006\u0000\u0000\u00b0"+
		"\u00b1\u0003 \u0010\u0000\u00b1\u00c3\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0003 \u0010\u0000\u00b3\u00b4\u0007\u0007\u0000\u0000\u00b4\u00b5\u0003"+
		" \u0010\u0000\u00b5\u00c3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003 \u0010"+
		"\u0000\u00b7\u00b8\u0007\b\u0000\u0000\u00b8\u00b9\u0003 \u0010\u0000"+
		"\u00b9\u00c3\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003 \u0010\u0000\u00bb"+
		"\u00bc\u0007\t\u0000\u0000\u00bc\u00bd\u0003 \u0010\u0000\u00bd\u00c3"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0003\u0000\u0000\u00bf\u00c0"+
		"\u0003\u0010\b\u0000\u00c0\u00c1\u0005\u0004\u0000\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u009c\u0001\u0000\u0000\u0000\u00c2\u009e\u0001"+
		"\u0000\u0000\u0000\u00c2\u00a2\u0001\u0000\u0000\u0000\u00c2\u00a6\u0001"+
		"\u0000\u0000\u0000\u00c2\u00aa\u0001\u0000\u0000\u0000\u00c2\u00ae\u0001"+
		"\u0000\u0000\u0000\u00c2\u00b2\u0001\u0000\u0000\u0000\u00c2\u00b6\u0001"+
		"\u0000\u0000\u0000\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2\u00be\u0001"+
		"\u0000\u0000\u0000\u00c3\u0011\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003"+
		"(\u0014\u0000\u00c5\u00c6\u0003 \u0010\u0000\u00c6\u00cd\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0003&\u0013\u0000\u00c8\u00c9\u0003$\u0012\u0000\u00c9"+
		"\u00cd\u0001\u0000\u0000\u0000\u00ca\u00cd\u0003*\u0015\u0000\u00cb\u00cd"+
		"\u0003,\u0016\u0000\u00cc\u00c4\u0001\u0000\u0000\u0000\u00cc\u00c7\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u0013\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"=\u0000\u0000\u00cf\u00d0\u0003\u001c\u000e\u0000\u00d0\u00d1\u0005\u001f"+
		"\u0000\u0000\u00d1\u00d7\u0003 \u0010\u0000\u00d2\u00d3\u0005 \u0000\u0000"+
		"\u00d3\u00d4\u0003\u001c\u000e\u0000\u00d4\u00d5\u0005\u001f\u0000\u0000"+
		"\u00d5\u00d6\u0003 \u0010\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00de\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u001c\u000e\u0000\u00da"+
		"\u00db\u0005\u001f\u0000\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00de"+
		"\u0001\u0000\u0000\u0000\u00dd\u00ce\u0001\u0000\u0000\u0000\u00dd\u00d9"+
		"\u0001\u0000\u0000\u0000\u00de\u0015\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005!\u0000\u0000\u00e0\u00e1\u0003 \u0010\u0000\u00e1\u0017\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\"\u0000\u0000\u00e3\u00e4\u0003 \u0010"+
		"\u0000\u00e4\u0019\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003 \u0010\u0000"+
		"\u00e6\u00e7\u0005#\u0000\u0000\u00e7\u00e8\u0005$\u0000\u0000\u00e8\u00ee"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003 \u0010\u0000\u00ea\u00eb\u0005"+
		"#\u0000\u0000\u00eb\u00ec\u0005%\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e5\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001\u0000\u0000"+
		"\u0000\u00ee\u001b\u0001\u0000\u0000\u0000\u00ef\u00f0\u0007\n\u0000\u0000"+
		"\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\u001c\u000e\u0000"+
		"\u00f2\u00f3\u0007\u000b\u0000\u0000\u00f3\u001f\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0006\u0010\uffff\uffff\u0000\u00f5\u00f6\u0007\f\u0000\u0000"+
		"\u00f6\u0108\u0003 \u0010\u000b\u00f7\u0108\u0003\u001e\u000f\u0000\u00f8"+
		"\u0108\u0003.\u0017\u0000\u00f9\u0108\u0003\u0016\u000b\u0000\u00fa\u0108"+
		"\u0005>\u0000\u0000\u00fb\u0108\u0005?\u0000\u0000\u00fc\u00fe\u0005E"+
		"\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100\u0108\u0001\u0000\u0000\u0000\u0101\u0108\u0005@\u0000"+
		"\u0000\u0102\u0108\u0003\u001c\u000e\u0000\u0103\u0104\u0005\u0003\u0000"+
		"\u0000\u0104\u0105\u0003 \u0010\u0000\u0105\u0106\u0005\u0004\u0000\u0000"+
		"\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u00f4\u0001\u0000\u0000\u0000"+
		"\u0107\u00f7\u0001\u0000\u0000\u0000\u0107\u00f8\u0001\u0000\u0000\u0000"+
		"\u0107\u00f9\u0001\u0000\u0000\u0000\u0107\u00fa\u0001\u0000\u0000\u0000"+
		"\u0107\u00fb\u0001\u0000\u0000\u0000\u0107\u00fd\u0001\u0000\u0000\u0000"+
		"\u0107\u0101\u0001\u0000\u0000\u0000\u0107\u0102\u0001\u0000\u0000\u0000"+
		"\u0107\u0103\u0001\u0000\u0000\u0000\u0108\u0114\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\n\r\u0000\u0000\u010a\u010b\u0007\r\u0000\u0000\u010b\u0113"+
		"\u0003 \u0010\u000e\u010c\u010d\n\f\u0000\u0000\u010d\u010e\u0007\f\u0000"+
		"\u0000\u010e\u0113\u0003 \u0010\r\u010f\u0110\n\t\u0000\u0000\u0110\u0111"+
		"\u0005.\u0000\u0000\u0111\u0113\u0003 \u0010\t\u0112\u0109\u0001\u0000"+
		"\u0000\u0000\u0112\u010c\u0001\u0000\u0000\u0000\u0112\u010f\u0001\u0000"+
		"\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115!\u0001\u0000\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0003\u0000"+
		"\u0000\u0118\u0119\u0003 \u0010\u0000\u0119\u011a\u0005 \u0000\u0000\u011a"+
		"\u011b\u0003 \u0010\u0000\u011b\u011c\u0005\u0004\u0000\u0000\u011c#\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0003 \u0010\u0000\u011e\u011f\u0007\u000e"+
		"\u0000\u0000\u011f\u0125\u0001\u0000\u0000\u0000\u0120\u0122\u0003 \u0010"+
		"\u0000\u0121\u0123\u00051\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000"+
		"\u0124\u011d\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000\u0000\u0000"+
		"\u0125%\u0001\u0000\u0000\u0000\u0126\u0127\u0007\u000f\u0000\u0000\u0127"+
		"\'\u0001\u0000\u0000\u0000\u0128\u0129\u0007\u0010\u0000\u0000\u0129)"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0007\u0011\u0000\u0000\u012b+\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u00058\u0000\u0000\u012d\u0137\u0007\u0012"+
		"\u0000\u0000\u012e\u012f\u00059\u0000\u0000\u012f\u0137\u0003\"\u0011"+
		"\u0000\u0130\u0131\u0005:\u0000\u0000\u0131\u0137\u0003$\u0012\u0000\u0132"+
		"\u0133\u0005;\u0000\u0000\u0133\u0137\u0003 \u0010\u0000\u0134\u0135\u0005"+
		"<\u0000\u0000\u0135\u0137\u0003 \u0010\u0000\u0136\u012c\u0001\u0000\u0000"+
		"\u0000\u0136\u012e\u0001\u0000\u0000\u0000\u0136\u0130\u0001\u0000\u0000"+
		"\u0000\u0136\u0132\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0137-\u0001\u0000\u0000\u0000\u0138\u0139\u0005=\u0000\u0000\u0139"+
		"\u013a\u0005\u0003\u0000\u0000\u013a\u013b\u0003 \u0010\u0000\u013b\u013c"+
		"\u0005\u0004\u0000\u0000\u013c/\u0001\u0000\u0000\u0000\u00173AMTXcmz"+
		"\u008b\u0090\u0097\u00c2\u00cc\u00d7\u00dd\u00ed\u00ff\u0107\u0112\u0114"+
		"\u0122\u0124\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}