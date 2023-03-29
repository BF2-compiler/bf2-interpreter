package org.bf2;

// Generated from bf2.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class bf2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, VARNAME=28, NUMBER=29, COMMENT=30, EOL=31, 
		WS=32;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_command = 2, RULE_funcDef = 3, RULE_funcCall = 4, 
		RULE_loop = 5, RULE_block = 6, RULE_ifStatement = 7, RULE_boolStatement = 8, 
		RULE_assign = 9, RULE_varGetter = 10, RULE_expression = 11, RULE_multiplyingExpression = 12, 
		RULE_signExpression = 13, RULE_logicalOperator = 14, RULE_comparisonOperator = 15, 
		RULE_directionalMove = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "command", "funcDef", "funcCall", "loop", "block", "ifStatement", 
			"boolStatement", "assign", "varGetter", "expression", "multiplyingExpression", 
			"signExpression", "logicalOperator", "comparisonOperator", "directionalMove"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "':'", "'{'", "'}'", "'do'", "'('", "')'", "'if'", "'='", 
			"'.'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'<?'", "'>?'", "'<=?'", 
			"'>=?'", "'=?'", "'!=?'", "'<'", "'>'", "'^'", "'v'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "VARNAME", "NUMBER", "COMMENT", "EOL", "WS"
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
	public String getGrammarFileName() { return "bf2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bf2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(bf2Parser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(bf2Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(bf2Parser.EOL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					line();
					setState(35);
					match(EOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2139119466L) != 0)) {
				{
				setState(41);
				line();
				}
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
	public static class LineContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode COMMENT() { return getToken(bf2Parser.COMMENT, 0); }
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case VARNAME:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46);
					command();
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1065377640L) != 0) );
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(51);
					match(COMMENT);
					}
				}

				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(COMMENT);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				funcDef();
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
	public static class CommandContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public DirectionalMoveContext directionalMove() {
			return getRuleContext(DirectionalMoveContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				loop();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				ifStatement();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				funcCall();
				}
				break;
			case T__13:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				directionalMove();
				}
				break;
			case T__2:
			case T__5:
			case T__9:
			case T__10:
			case T__11:
			case NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				expression();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				assign();
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
	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(bf2Parser.VARNAME, 0); }
		public List<TerminalNode> EOL() { return getTokens(bf2Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(bf2Parser.EOL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitFuncDef(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(T__1);
			setState(68);
			match(VARNAME);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(69);
				match(EOL);
				}
			}

			setState(72);
			match(T__2);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2139119466L) != 0)) {
					{
					setState(73);
					line();
					}
				}

				setState(76);
				match(EOL);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4286603114L) != 0) );
			setState(81);
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
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(bf2Parser.VARNAME, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VARNAME);
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
	public static class LoopContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__4);
				setState(86);
				block();
				setState(87);
				match(T__5);
				setState(88);
				match(NUMBER);
				setState(89);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(T__4);
				setState(92);
				block();
				setState(93);
				match(T__7);
				setState(94);
				match(T__5);
				setState(95);
				boolStatement(0);
				setState(96);
				match(T__6);
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
	public static class BlockContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__2);
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				command();
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1065377640L) != 0) );
			setState(106);
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
	public static class IfStatementContext extends ParserRuleContext {
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__7);
			setState(109);
			match(T__5);
			setState(110);
			boolStatement(0);
			setState(111);
			match(T__6);
			setState(112);
			block();
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
	public static class BoolStatementContext extends ParserRuleContext {
		public List<VarGetterContext> varGetter() {
			return getRuleContexts(VarGetterContext.class);
		}
		public VarGetterContext varGetter(int i) {
			return getRuleContext(VarGetterContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<BoolStatementContext> boolStatement() {
			return getRuleContexts(BoolStatementContext.class);
		}
		public BoolStatementContext boolStatement(int i) {
			return getRuleContext(BoolStatementContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public BoolStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterBoolStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitBoolStatement(this);
		}
	}

	public final BoolStatementContext boolStatement() throws RecognitionException {
		return boolStatement(0);
	}

	private BoolStatementContext boolStatement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolStatementContext _localctx = new BoolStatementContext(_ctx, _parentState);
		BoolStatementContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_boolStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(115);
				varGetter();
				setState(116);
				comparisonOperator();
				setState(117);
				varGetter();
				}
				break;
			case 2:
				{
				setState(119);
				varGetter();
				}
				break;
			case 3:
				{
				setState(120);
				match(T__5);
				setState(121);
				boolStatement(0);
				setState(122);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolStatementContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolStatement);
					setState(126);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(127);
					logicalOperator();
					setState(128);
					boolStatement(3);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class AssignContext extends ParserRuleContext {
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__8);
				setState(136);
				varGetter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__8);
				setState(138);
				match(NUMBER);
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
	public static class VarGetterContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarGetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varGetter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterVarGetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitVarGetter(this);
		}
	}

	public final VarGetterContext varGetter() throws RecognitionException {
		VarGetterContext _localctx = new VarGetterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varGetter);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(NUMBER);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				block();
				setState(143);
				match(T__9);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(T__9);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				multiplyingExpression();
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						multiplyingExpression();
						}
						} 
					}
					setState(155);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__5);
				setState(157);
				expression();
				setState(158);
				match(T__6);
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
	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<SignExpressionContext> signExpression() {
			return getRuleContexts(SignExpressionContext.class);
		}
		public SignExpressionContext signExpression(int i) {
			return getRuleContext(SignExpressionContext.class,i);
		}
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitMultiplyingExpression(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiplyingExpression);
		int _la;
		try {
			int _alt;
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__10:
			case T__11:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				signExpression();
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(163);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(164);
						signExpression();
						}
						} 
					}
					setState(169);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__5);
				setState(171);
				multiplyingExpression();
				setState(172);
				match(T__6);
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
	public static class SignExpressionContext extends ParserRuleContext {
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
		}
		public SignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterSignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitSignExpression(this);
		}
	}

	public final SignExpressionContext signExpression() throws RecognitionException {
		SignExpressionContext _localctx = new SignExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_signExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			varGetter();
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
	public static class LogicalOperatorContext extends ParserRuleContext {
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0)) ) {
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
	public static class DirectionalMoveContext extends ParserRuleContext {
		public DirectionalMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionalMove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterDirectionalMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitDirectionalMove(this);
		}
	}

	public final DirectionalMoveContext directionalMove() throws RecognitionException {
		DirectionalMoveContext _localctx = new DirectionalMoveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_directionalMove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 260063232L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return boolStatement_sempred((BoolStatementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolStatement_sempred(BoolStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00bf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0000\u0003\u0000+\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u00010\b\u0001\u000b\u0001\f\u0001"+
		"1\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"9\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"K\b\u0003\u0001\u0003\u0004\u0003N\b\u0003\u000b\u0003\f\u0003O\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005c\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0004\u0006g\b\u0006\u000b\u0006\f\u0006"+
		"h\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b}\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0083\b\b\n\b\f\b\u0086\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u008c\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0093\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0098\b\u000b"+
		"\n\u000b\f\u000b\u009b\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00a1\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a6"+
		"\b\f\n\f\f\f\u00a9\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00af\b"+
		"\f\u0001\r\u0005\r\u00b2\b\r\n\r\f\r\u00b5\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0000\u0001\u0010\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0005\u0001\u0000\u000b\f"+
		"\u0001\u0000\r\u000e\u0001\u0000\u000f\u0010\u0001\u0000\u0011\u0016\u0002"+
		"\u0000\u000e\u000e\u0017\u001b\u00c8\u0000%\u0001\u0000\u0000\u0000\u0002"+
		"8\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000\u0000\u0006B\u0001"+
		"\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000\u0000"+
		"\fd\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010|\u0001"+
		"\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u0092\u0001"+
		"\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00ae\u0001"+
		"\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00b8\u0001"+
		"\u0000\u0000\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00bc\u0001\u0000"+
		"\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u001f\u0000\u0000$&\u0001"+
		"\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000"+
		"\u0000)+\u0003\u0002\u0001\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0005\u0000\u0000\u0001-\u0001"+
		"\u0001\u0000\u0000\u0000.0\u0003\u0004\u0002\u0000/.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000024\u0001\u0000\u0000\u000035\u0005\u001e\u0000\u000043\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000059\u0001\u0000\u0000\u0000"+
		"69\u0005\u001e\u0000\u000079\u0003\u0006\u0003\u00008/\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009\u0003\u0001"+
		"\u0000\u0000\u0000:A\u0003\n\u0005\u0000;A\u0003\u000e\u0007\u0000<A\u0003"+
		"\b\u0004\u0000=A\u0003 \u0010\u0000>A\u0003\u0016\u000b\u0000?A\u0003"+
		"\u0012\t\u0000@:\u0001\u0000\u0000\u0000@;\u0001\u0000\u0000\u0000@<\u0001"+
		"\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@?\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u0001"+
		"\u0000\u0000CD\u0005\u0002\u0000\u0000DF\u0005\u001c\u0000\u0000EG\u0005"+
		"\u001f\u0000\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HM\u0005\u0003\u0000\u0000IK\u0003\u0002\u0001"+
		"\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000LN\u0005\u001f\u0000\u0000MJ\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QR\u0005\u0004\u0000\u0000R\u0007\u0001\u0000"+
		"\u0000\u0000ST\u0005\u001c\u0000\u0000T\t\u0001\u0000\u0000\u0000UV\u0005"+
		"\u0005\u0000\u0000VW\u0003\f\u0006\u0000WX\u0005\u0006\u0000\u0000XY\u0005"+
		"\u001d\u0000\u0000YZ\u0005\u0007\u0000\u0000Zc\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0005\u0000\u0000\\]\u0003\f\u0006\u0000]^\u0005\b\u0000\u0000"+
		"^_\u0005\u0006\u0000\u0000_`\u0003\u0010\b\u0000`a\u0005\u0007\u0000\u0000"+
		"ac\u0001\u0000\u0000\u0000bU\u0001\u0000\u0000\u0000b[\u0001\u0000\u0000"+
		"\u0000c\u000b\u0001\u0000\u0000\u0000df\u0005\u0003\u0000\u0000eg\u0003"+
		"\u0004\u0002\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0004\u0000\u0000k\r\u0001\u0000\u0000\u0000lm\u0005\b"+
		"\u0000\u0000mn\u0005\u0006\u0000\u0000no\u0003\u0010\b\u0000op\u0005\u0007"+
		"\u0000\u0000pq\u0003\f\u0006\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0006"+
		"\b\uffff\uffff\u0000st\u0003\u0014\n\u0000tu\u0003\u001e\u000f\u0000u"+
		"v\u0003\u0014\n\u0000v}\u0001\u0000\u0000\u0000w}\u0003\u0014\n\u0000"+
		"xy\u0005\u0006\u0000\u0000yz\u0003\u0010\b\u0000z{\u0005\u0007\u0000\u0000"+
		"{}\u0001\u0000\u0000\u0000|r\u0001\u0000\u0000\u0000|w\u0001\u0000\u0000"+
		"\u0000|x\u0001\u0000\u0000\u0000}\u0084\u0001\u0000\u0000\u0000~\u007f"+
		"\n\u0002\u0000\u0000\u007f\u0080\u0003\u001c\u000e\u0000\u0080\u0081\u0003"+
		"\u0010\b\u0003\u0081\u0083\u0001\u0000\u0000\u0000\u0082~\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0011\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\t\u0000"+
		"\u0000\u0088\u008c\u0003\u0014\n\u0000\u0089\u008a\u0005\t\u0000\u0000"+
		"\u008a\u008c\u0005\u001d\u0000\u0000\u008b\u0087\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000"+
		"\u008d\u0093\u0005\u001d\u0000\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f"+
		"\u0090\u0005\n\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u0093"+
		"\u0005\n\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001"+
		"\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0015\u0001"+
		"\u0000\u0000\u0000\u0094\u0099\u0003\u0018\f\u0000\u0095\u0096\u0007\u0000"+
		"\u0000\u0000\u0096\u0098\u0003\u0018\f\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00a1\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0006\u0000"+
		"\u0000\u009d\u009e\u0003\u0016\u000b\u0000\u009e\u009f\u0005\u0007\u0000"+
		"\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u0094\u0001\u0000\u0000"+
		"\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a1\u0017\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a7\u0003\u001a\r\u0000\u00a3\u00a4\u0007\u0001\u0000\u0000"+
		"\u00a4\u00a6\u0003\u001a\r\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a8\u00af\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0006\u0000\u0000\u00ab"+
		"\u00ac\u0003\u0018\f\u0000\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad\u00af"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a2\u0001\u0000\u0000\u0000\u00ae\u00aa"+
		"\u0001\u0000\u0000\u0000\u00af\u0019\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0007\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003\u0014\n\u0000\u00b7\u001b\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0007\u0002\u0000\u0000\u00b9\u001d\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0007\u0003\u0000\u0000\u00bb\u001f\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0007\u0004\u0000\u0000\u00bd!\u0001\u0000"+
		"\u0000\u0000\u0014\'*148@FJObh|\u0084\u008b\u0092\u0099\u00a0\u00a7\u00ae"+
		"\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}