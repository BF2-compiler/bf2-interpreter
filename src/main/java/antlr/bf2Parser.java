// Generated from bf2.g4 by ANTLR 4.12.0
package antlr;

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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, VARNAME=33, NUMBER=34, COMMENT=35, EOL=36, WS=37;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_command = 2, RULE_funcDef = 3, RULE_funcCall = 4, 
		RULE_loop = 5, RULE_block = 6, RULE_ifStatement = 7, RULE_boolStatement = 8, 
		RULE_assign = 9, RULE_varGetter = 10, RULE_expression = 11, RULE_logicalOperator = 12, 
		RULE_comparisonOperator = 13, RULE_directionalMove = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "command", "funcDef", "funcCall", "loop", "block", "ifStatement", 
			"boolStatement", "assign", "varGetter", "expression", "logicalOperator", 
			"comparisonOperator", "directionalMove"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'func'", "':'", "'do'", "'('", "')'", "'if'", "'{'", "'}'", 
			"'elif'", "'else'", "'~~'", "'='", "'.'", "'*'", "'/'", "'+'", "'-'", 
			"'&&'", "'||'", "'<?'", "'>?'", "'<=?'", "'>=?'", "'=?'", "'!=?'", "'<'", 
			"'>'", "'^'", "'v'", "'\\'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "VARNAME", "NUMBER", 
			"COMMENT", "EOL", "WS"
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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ProgContext {
		public List<TerminalNode> NUMBER() { return getTokens(bf2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(bf2Parser.NUMBER, i);
		}
		public TerminalNode EOF() { return getToken(bf2Parser.EOF, 0); }
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
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(NUMBER);
			setState(31);
			match(T__0);
			setState(32);
			match(NUMBER);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				match(EOL);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EOL );
			setState(44); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					line();
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(39);
						match(EOL);
						}
						}
						setState(42); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==EOL );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68585284020L) != 0)) {
				{
				setState(48);
				line();
				}
			}

			setState(51);
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
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends LineContext {
		public TerminalNode COMMENT() { return getToken(bf2Parser.COMMENT, 0); }
		public CommentContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandCommentContext extends LineContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode COMMENT() { return getToken(bf2Parser.COMMENT, 0); }
		public CommandCommentContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommandComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommandComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitCommandComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionOfFunctionContext extends LineContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public DefinitionOfFunctionContext(LineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterDefinitionOfFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitDefinitionOfFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitDefinitionOfFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__6:
			case T__7:
			case T__12:
			case T__13:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case VARNAME:
			case NUMBER:
				_localctx = new CommandCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					command();
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34225545648L) != 0) );
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(58);
					match(COMMENT);
					}
				}

				}
				break;
			case COMMENT:
				_localctx = new CommentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(COMMENT);
				}
				break;
			case T__1:
				_localctx = new DefinitionOfFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandAssignContext extends CommandContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CommandAssignContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommandAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommandAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitCommandAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandLoopContext extends CommandContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CommandLoopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommandLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommandLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitCommandLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandFuncCallContext extends CommandContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public CommandFuncCallContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommandFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommandFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitCommandFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandDirectionalMoveContext extends CommandContext {
		public DirectionalMoveContext directionalMove() {
			return getRuleContext(DirectionalMoveContext.class,0);
		}
		public CommandDirectionalMoveContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommandDirectionalMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommandDirectionalMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitCommandDirectionalMove(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandIfStatementContext extends CommandContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CommandIfStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommandIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommandIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitCommandIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandExpressionContext extends CommandContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandExpressionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterCommandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitCommandExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitCommandExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new CommandLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				loop();
				}
				break;
			case T__6:
				_localctx = new CommandIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				ifStatement();
				}
				break;
			case VARNAME:
				_localctx = new CommandFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				funcCall();
				}
				break;
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				_localctx = new CommandDirectionalMoveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				directionalMove();
				}
				break;
			case T__4:
			case T__7:
			case T__13:
			case NUMBER:
				_localctx = new CommandExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				expression(0);
				}
				break;
			case T__12:
				_localctx = new CommandAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOL() { return getToken(bf2Parser.EOL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__1);
			setState(74);
			match(T__2);
			setState(75);
			match(VARNAME);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(76);
				match(EOL);
				}
			}

			setState(79);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalLoopContext extends LoopContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public ConditionalLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterConditionalLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitConditionalLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitConditionalLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoLoopContext extends LoopContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public DoLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterDoLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitDoLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitDoLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new DoLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__3);
				setState(84);
				block();
				setState(85);
				match(T__4);
				setState(86);
				match(NUMBER);
				setState(87);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ConditionalLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__3);
				setState(90);
				block();
				setState(91);
				match(T__6);
				setState(92);
				match(T__4);
				setState(93);
				boolStatement(0);
				setState(94);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__7);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				command();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 34225545648L) != 0) );
			setState(104);
			match(T__8);
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
		public List<BoolStatementContext> boolStatement() {
			return getRuleContexts(BoolStatementContext.class);
		}
		public BoolStatementContext boolStatement(int i) {
			return getRuleContext(BoolStatementContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(bf2Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(bf2Parser.EOL, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__6);
			setState(107);
			match(T__4);
			setState(108);
			boolStatement(0);
			setState(109);
			match(T__5);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(110);
				match(EOL);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			block();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					match(EOL);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(123);
				match(T__9);
				setState(124);
				match(T__4);
				setState(125);
				boolStatement(0);
				setState(126);
				match(T__5);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(127);
					match(EOL);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				block();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					match(EOL);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(146);
				match(T__10);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(147);
					match(EOL);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				block();
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
	public static class BoolStatementContext extends ParserRuleContext {
		public BoolStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolStatement; }
	 
		public BoolStatementContext() { }
		public void copyFrom(BoolStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisBoolContext extends BoolStatementContext {
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public ParenthesisBoolContext(BoolStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterParenthesisBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitParenthesisBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitParenthesisBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotOperatorContext extends BoolStatementContext {
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public NotOperatorContext(BoolStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterNotOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitNotOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableBoolContext extends BoolStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableBoolContext(BoolStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterVariableBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitVariableBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitVariableBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableOperatorVariableContext extends BoolStatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public VariableOperatorVariableContext(BoolStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterVariableOperatorVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitVariableOperatorVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitVariableOperatorVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolOperatorBoolContext extends BoolStatementContext {
		public List<BoolStatementContext> boolStatement() {
			return getRuleContexts(BoolStatementContext.class);
		}
		public BoolStatementContext boolStatement(int i) {
			return getRuleContext(BoolStatementContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public BoolOperatorBoolContext(BoolStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterBoolOperatorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitBoolOperatorBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitBoolOperatorBool(this);
			else return visitor.visitChildren(this);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new VariableOperatorVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157);
				expression(0);
				setState(158);
				comparisonOperator();
				setState(159);
				expression(0);
				}
				break;
			case 2:
				{
				_localctx = new VariableBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				expression(0);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__4);
				setState(163);
				boolStatement(0);
				setState(164);
				match(T__5);
				}
				break;
			case 4:
				{
				_localctx = new NotOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(T__11);
				setState(167);
				boolStatement(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolOperatorBoolContext(new BoolStatementContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolStatement);
					setState(170);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(171);
					logicalOperator();
					setState(172);
					boolStatement(4);
					}
					} 
				}
				setState(178);
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
	public static class AssignContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__12);
			setState(180);
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
	public static class VarGetterContext extends ParserRuleContext {
		public VarGetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varGetter; }
	 
		public VarGetterContext() { }
		public void copyFrom(VarGetterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberGetContext extends VarGetterContext {
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public NumberGetContext(VarGetterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterNumberGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitNumberGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitNumberGet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockGetContext extends VarGetterContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockGetContext(VarGetterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterBlockGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitBlockGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitBlockGet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetContext extends VarGetterContext {
		public GetContext(VarGetterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarGetterContext varGetter() throws RecognitionException {
		VarGetterContext _localctx = new VarGetterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varGetter);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberGetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(NUMBER);
				}
				break;
			case T__7:
				_localctx = new BlockGetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				block();
				setState(184);
				match(T__13);
				}
				break;
			case T__13:
				_localctx = new GetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(T__13);
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
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionSubstractionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditionSubstractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterAdditionSubstraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitAdditionSubstraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitAdditionSubstraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExpressionContext extends ExpressionContext {
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
		}
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationDivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicationDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterMultiplicationDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitMultiplicationDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitMultiplicationDivision(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				match(T__4);
				setState(191);
				expression(0);
				setState(192);
				match(T__5);
				}
				break;
			case T__7:
			case T__13:
			case NUMBER:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				varGetter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationDivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new AdditionSubstractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class LogicalOperatorContext extends ParserRuleContext {
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	 
		public LogicalOperatorContext() { }
		public void copyFrom(LogicalOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndContext extends LogicalOperatorContext {
		public LogicalAndContext(LogicalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrContext extends LogicalOperatorContext {
		public LogicalOrContext(LogicalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicalOperator);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new LogicalAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new LogicalOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__19);
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
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	 
		public ComparisonOperatorContext() { }
		public void copyFrom(ComparisonOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonGreaterContext extends ComparisonOperatorContext {
		public ComparisonGreaterContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComparisonGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComparisonGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitComparisonGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonEqualContext extends ComparisonOperatorContext {
		public ComparisonEqualContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComparisonEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComparisonEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitComparisonEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonNotEqualContext extends ComparisonOperatorContext {
		public ComparisonNotEqualContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComparisonNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComparisonNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitComparisonNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonLessEqualContext extends ComparisonOperatorContext {
		public ComparisonLessEqualContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComparisonLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComparisonLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitComparisonLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonGreaterEqualContext extends ComparisonOperatorContext {
		public ComparisonGreaterEqualContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComparisonGreaterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComparisonGreaterEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitComparisonGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonLessContext extends ComparisonOperatorContext {
		public ComparisonLessContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterComparisonLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitComparisonLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitComparisonLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparisonOperator);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				_localctx = new ComparisonLessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new ComparisonGreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new ComparisonLessEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new ComparisonGreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new ComparisonEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new ComparisonNotEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(T__25);
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
	public static class DirectionalMoveContext extends ParserRuleContext {
		public DirectionalMoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionalMove; }
	 
		public DirectionalMoveContext() { }
		public void copyFrom(DirectionalMoveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveUpContext extends DirectionalMoveContext {
		public MoveUpContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterMoveUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitMoveUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitMoveUp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveLeftContext extends DirectionalMoveContext {
		public MoveLeftContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterMoveLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitMoveLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitMoveLeft(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveDownContext extends DirectionalMoveContext {
		public MoveDownContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterMoveDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitMoveDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitMoveDown(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LowerBoardContext extends DirectionalMoveContext {
		public LowerBoardContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterLowerBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitLowerBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitLowerBoard(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MoveRightContext extends DirectionalMoveContext {
		public MoveRightContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterMoveRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitMoveRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitMoveRight(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UpperBoardContext extends DirectionalMoveContext {
		public UpperBoardContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterUpperBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitUpperBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitUpperBoard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionalMoveContext directionalMove() throws RecognitionException {
		DirectionalMoveContext _localctx = new DirectionalMoveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_directionalMove);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new MoveLeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new MoveRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new MoveUpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new MoveDownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new LowerBoardContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(T__30);
				}
				break;
			case T__31:
				_localctx = new UpperBoardContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(T__31);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return boolStatement_sempred((BoolStatementContext)_localctx, predIndex);
		case 11:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolStatement_sempred(BoolStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00e5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000$\u0001"+
		"\u0000\u0001\u0000\u0004\u0000)\b\u0000\u000b\u0000\f\u0000*\u0004\u0000"+
		"-\b\u0000\u000b\u0000\f\u0000.\u0001\u0000\u0003\u00002\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u00017\b\u0001\u000b\u0001\f\u0001"+
		"8\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0004\u0006e\b\u0006\u000b\u0006\f\u0006f\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007p\b"+
		"\u0007\n\u0007\f\u0007s\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007w\b"+
		"\u0007\n\u0007\f\u0007z\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0081\b\u0007\n\u0007\f\u0007\u0084\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0088\b\u0007\n\u0007\f\u0007\u008b"+
		"\t\u0007\u0001\u0007\u0005\u0007\u008e\b\u0007\n\u0007\f\u0007\u0091\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0095\b\u0007\n\u0007\f\u0007"+
		"\u0098\t\u0007\u0001\u0007\u0003\u0007\u009b\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00a9\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00af\b\b"+
		"\n\b\f\b\u00b2\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00bc\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c4\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00cc"+
		"\b\u000b\n\u000b\f\u000b\u00cf\t\u000b\u0001\f\u0001\f\u0003\f\u00d3\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00db\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00e3\b\u000e\u0001\u000e\u0000\u0002\u0010\u0016\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0002\u0001\u0000\u000f\u0010\u0001\u0000\u0011\u0012\u0100\u0000\u001e"+
		"\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000\u0004G\u0001\u0000"+
		"\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000"+
		"\n`\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000\u000ej\u0001\u0000"+
		"\u0000\u0000\u0010\u00a8\u0001\u0000\u0000\u0000\u0012\u00b3\u0001\u0000"+
		"\u0000\u0000\u0014\u00bb\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000"+
		"\u0000\u0000\u0018\u00d2\u0001\u0000\u0000\u0000\u001a\u00da\u0001\u0000"+
		"\u0000\u0000\u001c\u00e2\u0001\u0000\u0000\u0000\u001e\u001f\u0005\"\u0000"+
		"\u0000\u001f \u0005\u0001\u0000\u0000 \"\u0005\"\u0000\u0000!#\u0005$"+
		"\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%,\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0002\u0001\u0000\')\u0005$\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+-\u0001\u0000\u0000\u0000,&\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/1\u0001\u0000\u0000\u000002\u0003\u0002\u0001\u000010\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0000"+
		"\u0000\u00014\u0001\u0001\u0000\u0000\u000057\u0003\u0004\u0002\u0000"+
		"65\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:<\u0005#\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<@\u0001\u0000"+
		"\u0000\u0000=@\u0005#\u0000\u0000>@\u0003\u0006\u0003\u0000?6\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0003"+
		"\u0001\u0000\u0000\u0000AH\u0003\n\u0005\u0000BH\u0003\u000e\u0007\u0000"+
		"CH\u0003\b\u0004\u0000DH\u0003\u001c\u000e\u0000EH\u0003\u0016\u000b\u0000"+
		"FH\u0003\u0012\t\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000"+
		"GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000IJ\u0005"+
		"\u0002\u0000\u0000JK\u0005\u0003\u0000\u0000KM\u0005!\u0000\u0000LN\u0005"+
		"$\u0000\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OP\u0003\f\u0006\u0000P\u0007\u0001\u0000\u0000\u0000"+
		"QR\u0005!\u0000\u0000R\t\u0001\u0000\u0000\u0000ST\u0005\u0004\u0000\u0000"+
		"TU\u0003\f\u0006\u0000UV\u0005\u0005\u0000\u0000VW\u0005\"\u0000\u0000"+
		"WX\u0005\u0006\u0000\u0000Xa\u0001\u0000\u0000\u0000YZ\u0005\u0004\u0000"+
		"\u0000Z[\u0003\f\u0006\u0000[\\\u0005\u0007\u0000\u0000\\]\u0005\u0005"+
		"\u0000\u0000]^\u0003\u0010\b\u0000^_\u0005\u0006\u0000\u0000_a\u0001\u0000"+
		"\u0000\u0000`S\u0001\u0000\u0000\u0000`Y\u0001\u0000\u0000\u0000a\u000b"+
		"\u0001\u0000\u0000\u0000bd\u0005\b\u0000\u0000ce\u0003\u0004\u0002\u0000"+
		"dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\t\u0000"+
		"\u0000i\r\u0001\u0000\u0000\u0000jk\u0005\u0007\u0000\u0000kl\u0005\u0005"+
		"\u0000\u0000lm\u0003\u0010\b\u0000mq\u0005\u0006\u0000\u0000np\u0005$"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tx\u0003\f\u0006\u0000uw\u0005$\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y\u0089\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{|\u0005\n\u0000\u0000|}\u0005\u0005\u0000\u0000}~\u0003"+
		"\u0010\b\u0000~\u0082\u0005\u0006\u0000\u0000\u007f\u0081\u0005$\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0003\f\u0006\u0000\u0086\u0088\u0001\u0000\u0000\u0000"+
		"\u0087{\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008f\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0005$\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u009a\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0096\u0005\u000b\u0000\u0000\u0093\u0095"+
		"\u0005$\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009b\u0003\f\u0006\u0000\u009a\u0092\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u000f\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0006\b\uffff\uffff\u0000\u009d\u009e\u0003\u0016"+
		"\u000b\u0000\u009e\u009f\u0003\u001a\r\u0000\u009f\u00a0\u0003\u0016\u000b"+
		"\u0000\u00a0\u00a9\u0001\u0000\u0000\u0000\u00a1\u00a9\u0003\u0016\u000b"+
		"\u0000\u00a2\u00a3\u0005\u0005\u0000\u0000\u00a3\u00a4\u0003\u0010\b\u0000"+
		"\u00a4\u00a5\u0005\u0006\u0000\u0000\u00a5\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005\f\u0000\u0000\u00a7\u00a9\u0003\u0010\b\u0001\u00a8"+
		"\u009c\u0001\u0000\u0000\u0000\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00b0\u0001\u0000\u0000\u0000\u00aa\u00ab\n\u0003\u0000\u0000\u00ab\u00ac"+
		"\u0003\u0018\f\u0000\u00ac\u00ad\u0003\u0010\b\u0004\u00ad\u00af\u0001"+
		"\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00af\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u0011\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\r\u0000\u0000\u00b4\u00b5\u0003\u0016"+
		"\u000b\u0000\u00b5\u0013\u0001\u0000\u0000\u0000\u00b6\u00bc\u0005\"\u0000"+
		"\u0000\u00b7\u00b8\u0003\f\u0006\u0000\u00b8\u00b9\u0005\u000e\u0000\u0000"+
		"\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\u000e\u0000\u0000"+
		"\u00bb\u00b6\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u0015\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0006\u000b\uffff\uffff\u0000\u00be\u00bf\u0005\u0005\u0000"+
		"\u0000\u00bf\u00c0\u0003\u0016\u000b\u0000\u00c0\u00c1\u0005\u0006\u0000"+
		"\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\u0014\n\u0000"+
		"\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00cd\u0001\u0000\u0000\u0000\u00c5\u00c6\n\u0003\u0000\u0000\u00c6"+
		"\u00c7\u0007\u0000\u0000\u0000\u00c7\u00cc\u0003\u0016\u000b\u0004\u00c8"+
		"\u00c9\n\u0002\u0000\u0000\u00c9\u00ca\u0007\u0001\u0000\u0000\u00ca\u00cc"+
		"\u0003\u0016\u000b\u0003\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u0017"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3"+
		"\u0005\u0013\u0000\u0000\u00d1\u00d3\u0005\u0014\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u0019"+
		"\u0001\u0000\u0000\u0000\u00d4\u00db\u0005\u0015\u0000\u0000\u00d5\u00db"+
		"\u0005\u0016\u0000\u0000\u00d6\u00db\u0005\u0017\u0000\u0000\u00d7\u00db"+
		"\u0005\u0018\u0000\u0000\u00d8\u00db\u0005\u0019\u0000\u0000\u00d9\u00db"+
		"\u0005\u001a\u0000\u0000\u00da\u00d4\u0001\u0000\u0000\u0000\u00da\u00d5"+
		"\u0001\u0000\u0000\u0000\u00da\u00d6\u0001\u0000\u0000\u0000\u00da\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u001b\u0001\u0000\u0000\u0000\u00dc\u00e3"+
		"\u0005\u001b\u0000\u0000\u00dd\u00e3\u0005\u001c\u0000\u0000\u00de\u00e3"+
		"\u0005\u001d\u0000\u0000\u00df\u00e3\u0005\u001e\u0000\u0000\u00e0\u00e3"+
		"\u0005\u001f\u0000\u0000\u00e1\u00e3\u0005 \u0000\u0000\u00e2\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e2\u00de\u0001"+
		"\u0000\u0000\u0000\u00e2\u00df\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u001d\u0001"+
		"\u0000\u0000\u0000\u001b$*.18;?GM`fqx\u0082\u0089\u008f\u0096\u009a\u00a8"+
		"\u00b0\u00bb\u00c3\u00cb\u00cd\u00d2\u00da\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}