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
		VARNAME=32, NUMBER=33, COMMENT=34, EOL=35, WS=36;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_command = 2, RULE_funcDef = 3, RULE_funcCall = 4, 
		RULE_funcBlock = 5, RULE_loop = 6, RULE_block = 7, RULE_ifStatement = 8, 
		RULE_boolStatement = 9, RULE_assign = 10, RULE_varGetter = 11, RULE_expression = 12, 
		RULE_logicalOperator = 13, RULE_comparisonOperator = 14, RULE_directionalMove = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "command", "funcDef", "funcCall", "funcBlock", "loop", 
			"block", "ifStatement", "boolStatement", "assign", "varGetter", "expression", 
			"logicalOperator", "comparisonOperator", "directionalMove"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'func'", "':'", "'{'", "'}'", "'do'", "'('", "')'", "'if'", 
			"'elif'", "'else'", "'='", "'.'", "'*'", "'/'", "'+'", "'-'", "'&&'", 
			"'||'", "'<?'", "'>?'", "'<=?'", "'>=?'", "'=?'", "'!=?'", "'<'", "'>'", 
			"'^'", "'v'", "'\\'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "VARNAME", "NUMBER", 
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
			setState(32);
			match(NUMBER);
			setState(33);
			match(T__0);
			setState(34);
			match(NUMBER);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(EOL);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EOL );
			setState(46); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(40);
					line();
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(41);
						match(EOL);
						}
						}
						setState(44); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==EOL );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34292642516L) != 0)) {
				{
				setState(50);
				line();
				}
			}

			setState(53);
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case T__6:
			case T__8:
			case T__11:
			case T__12:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case VARNAME:
			case NUMBER:
				_localctx = new CommandCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(55);
					command();
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17112773328L) != 0) );
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(60);
					match(COMMENT);
					}
				}

				}
				break;
			case COMMENT:
				_localctx = new CommentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(COMMENT);
				}
				break;
			case T__1:
				_localctx = new DefinitionOfFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new CommandLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				loop();
				}
				break;
			case T__8:
				_localctx = new CommandIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				ifStatement();
				}
				break;
			case VARNAME:
				_localctx = new CommandFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				funcCall();
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				_localctx = new CommandDirectionalMoveContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				directionalMove();
				}
				break;
			case T__3:
			case T__6:
			case T__12:
			case NUMBER:
				_localctx = new CommandExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				expression(0);
				}
				break;
			case T__11:
				_localctx = new CommandAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
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
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
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
			setState(75);
			match(T__1);
			setState(76);
			match(T__2);
			setState(77);
			match(VARNAME);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(78);
				match(EOL);
				}
			}

			setState(81);
			funcBlock();
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
	public static class FuncBlockContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public FuncBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterFuncBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitFuncBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitFuncBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBlockContext funcBlock() throws RecognitionException {
		FuncBlockContext _localctx = new FuncBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__3);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				command();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17112773328L) != 0) );
			setState(91);
			match(T__4);
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
		enterRule(_localctx, 12, RULE_loop);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DoLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__5);
				setState(94);
				block();
				setState(95);
				match(T__6);
				setState(96);
				match(NUMBER);
				setState(97);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new ConditionalLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__5);
				setState(100);
				block();
				setState(101);
				match(T__8);
				setState(102);
				match(T__6);
				setState(103);
				boolStatement(0);
				setState(104);
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
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__3);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				command();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17112773328L) != 0) );
			setState(114);
			match(T__4);
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
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__8);
			setState(117);
			match(T__6);
			setState(118);
			boolStatement(0);
			setState(119);
			match(T__7);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(120);
				match(EOL);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			block();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(EOL);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(133);
				match(T__9);
				setState(134);
				match(T__6);
				setState(135);
				boolStatement(0);
				setState(136);
				match(T__7);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(137);
					match(EOL);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				block();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					match(EOL);
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(156);
				match(T__10);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EOL) {
					{
					{
					setState(157);
					match(EOL);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
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
	public static class VariableBoolContext extends BoolStatementContext {
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
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
		public List<VarGetterContext> varGetter() {
			return getRuleContexts(VarGetterContext.class);
		}
		public VarGetterContext varGetter(int i) {
			return getRuleContext(VarGetterContext.class,i);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolStatement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new VariableOperatorVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				varGetter();
				setState(168);
				comparisonOperator();
				setState(169);
				varGetter();
				}
				break;
			case 2:
				{
				_localctx = new VariableBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				varGetter();
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(T__6);
				setState(173);
				boolStatement(0);
				setState(174);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolOperatorBoolContext(new BoolStatementContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolStatement);
					setState(178);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(179);
					logicalOperator();
					setState(180);
					boolStatement(3);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 20, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__11);
			setState(188);
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
		enterRule(_localctx, 22, RULE_varGetter);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberGetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(NUMBER);
				}
				break;
			case T__3:
				_localctx = new BlockGetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				block();
				setState(192);
				match(T__12);
				}
				break;
			case T__12:
				_localctx = new GetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(T__12);
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
	public static class SubstractionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubstractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterSubstraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitSubstraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitSubstraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
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
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bf2Listener ) ((bf2Listener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bf2Visitor ) return ((bf2Visitor<? extends T>)visitor).visitDivision(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(198);
				match(T__6);
				setState(199);
				expression(0);
				setState(200);
				match(T__7);
				}
				break;
			case T__3:
			case T__12:
			case NUMBER:
				{
				_localctx = new VariableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				varGetter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(206);
						match(T__13);
						setState(207);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(209);
						match(T__14);
						setState(210);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(212);
						match(T__15);
						setState(213);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new SubstractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(215);
						match(T__16);
						setState(216);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 26, RULE_logicalOperator);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new LogicalAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new LogicalOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(T__18);
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
		enterRule(_localctx, 28, RULE_comparisonOperator);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new ComparisonLessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new ComparisonGreaterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new ComparisonLessEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new ComparisonGreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new ComparisonEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new ComparisonNotEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(T__24);
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
		enterRule(_localctx, 30, RULE_directionalMove);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				_localctx = new MoveLeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new MoveRightContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new MoveUpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__27);
				}
				break;
			case T__28:
				_localctx = new MoveDownContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(T__28);
				}
				break;
			case T__29:
				_localctx = new LowerBoardContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(T__29);
				}
				break;
			case T__30:
				_localctx = new UpperBoardContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return boolStatement_sempred((BoolStatementContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
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
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00f3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000%\b\u0000"+
		"\u000b\u0000\f\u0000&\u0001\u0000\u0001\u0000\u0004\u0000+\b\u0000\u000b"+
		"\u0000\f\u0000,\u0004\u0000/\b\u0000\u000b\u0000\f\u00000\u0001\u0000"+
		"\u0003\u00004\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001"+
		"9\b\u0001\u000b\u0001\f\u0001:\u0001\u0001\u0003\u0001>\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004"+
		"\u0005X\b\u0005\u000b\u0005\f\u0005Y\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006k\b\u0006\u0001\u0007\u0001\u0007\u0004\u0007o\b\u0007\u000b"+
		"\u0007\f\u0007p\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bz\b\b\n\b\f\b}\t\b\u0001\b\u0001\b\u0005\b\u0081\b\b"+
		"\n\b\f\b\u0084\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u008b"+
		"\b\b\n\b\f\b\u008e\t\b\u0001\b\u0001\b\u0005\b\u0092\b\b\n\b\f\b\u0095"+
		"\t\b\u0001\b\u0005\b\u0098\b\b\n\b\f\b\u009b\t\b\u0001\b\u0001\b\u0005"+
		"\b\u009f\b\b\n\b\f\b\u00a2\t\b\u0001\b\u0003\b\u00a5\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00b1\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b7\b\t\n\t\f\t"+
		"\u00ba\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00c4\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cc\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00da\b\f\n\f\f\f\u00dd\t\f\u0001\r\u0001\r\u0003\r\u00e1\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00e9\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00f1\b\u000f\u0001\u000f\u0000\u0002\u0012"+
		"\u0018\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e\u0000\u0000\u010f\u0000 \u0001\u0000\u0000\u0000"+
		"\u0002A\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006K"+
		"\u0001\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000"+
		"\u0000\fj\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010"+
		"t\u0001\u0000\u0000\u0000\u0012\u00b0\u0001\u0000\u0000\u0000\u0014\u00bb"+
		"\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000\u0000\u0000\u0018\u00cb"+
		"\u0001\u0000\u0000\u0000\u001a\u00e0\u0001\u0000\u0000\u0000\u001c\u00e8"+
		"\u0001\u0000\u0000\u0000\u001e\u00f0\u0001\u0000\u0000\u0000 !\u0005!"+
		"\u0000\u0000!\"\u0005\u0001\u0000\u0000\"$\u0005!\u0000\u0000#%\u0005"+
		"#\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'.\u0001\u0000\u0000\u0000"+
		"(*\u0003\u0002\u0001\u0000)+\u0005#\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.(\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001"+
		"\u0000\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u0000"+
		"34\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0005\u0000\u0000"+
		"\u00016\u0001\u0001\u0000\u0000\u000079\u0003\u0004\u0002\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000<>\u0005\"\u0000\u0000"+
		"=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>B\u0001\u0000\u0000"+
		"\u0000?B\u0005\"\u0000\u0000@B\u0003\u0006\u0003\u0000A8\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0003\u0001"+
		"\u0000\u0000\u0000CJ\u0003\f\u0006\u0000DJ\u0003\u0010\b\u0000EJ\u0003"+
		"\b\u0004\u0000FJ\u0003\u001e\u000f\u0000GJ\u0003\u0018\f\u0000HJ\u0003"+
		"\u0014\n\u0000IC\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000IE\u0001"+
		"\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0005\u0002"+
		"\u0000\u0000LM\u0005\u0003\u0000\u0000MO\u0005 \u0000\u0000NP\u0005#\u0000"+
		"\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0003\n\u0005\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0005"+
		" \u0000\u0000T\t\u0001\u0000\u0000\u0000UW\u0005\u0004\u0000\u0000VX\u0003"+
		"\u0004\u0002\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0005\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005"+
		"\u0006\u0000\u0000^_\u0003\u000e\u0007\u0000_`\u0005\u0007\u0000\u0000"+
		"`a\u0005!\u0000\u0000ab\u0005\b\u0000\u0000bk\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0006\u0000\u0000de\u0003\u000e\u0007\u0000ef\u0005\t\u0000\u0000"+
		"fg\u0005\u0007\u0000\u0000gh\u0003\u0012\t\u0000hi\u0005\b\u0000\u0000"+
		"ik\u0001\u0000\u0000\u0000j]\u0001\u0000\u0000\u0000jc\u0001\u0000\u0000"+
		"\u0000k\r\u0001\u0000\u0000\u0000ln\u0005\u0004\u0000\u0000mo\u0003\u0004"+
		"\u0002\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0005\u0005\u0000\u0000s\u000f\u0001\u0000\u0000\u0000tu\u0005\t\u0000"+
		"\u0000uv\u0005\u0007\u0000\u0000vw\u0003\u0012\t\u0000w{\u0005\b\u0000"+
		"\u0000xz\u0005#\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0082\u0003\u000e\u0007\u0000"+
		"\u007f\u0081\u0005#\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0093\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0005\n\u0000\u0000\u0086\u0087"+
		"\u0005\u0007\u0000\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\u008c\u0005"+
		"\b\u0000\u0000\u0089\u008b\u0005#\u0000\u0000\u008a\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u000e"+
		"\u0007\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0085\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0099\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0005#\u0000"+
		"\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u00a4\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u00a0\u0005\u000b\u0000\u0000\u009d\u009f\u0005#\u0000\u0000"+
		"\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0003\u000e\u0007\u0000\u00a4\u009c\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u0011\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0006\t\uffff\uffff\u0000\u00a7\u00a8\u0003\u0016\u000b\u0000"+
		"\u00a8\u00a9\u0003\u001c\u000e\u0000\u00a9\u00aa\u0003\u0016\u000b\u0000"+
		"\u00aa\u00b1\u0001\u0000\u0000\u0000\u00ab\u00b1\u0003\u0016\u000b\u0000"+
		"\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad\u00ae\u0003\u0012\t\u0000\u00ae"+
		"\u00af\u0005\b\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00a6"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b8\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\n\u0002\u0000\u0000\u00b3\u00b4\u0003\u001a\r\u0000\u00b4\u00b5\u0003"+
		"\u0012\t\u0003\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0013\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\f\u0000"+
		"\u0000\u00bc\u00bd\u0003\u0018\f\u0000\u00bd\u0015\u0001\u0000\u0000\u0000"+
		"\u00be\u00c4\u0005!\u0000\u0000\u00bf\u00c0\u0003\u000e\u0007\u0000\u00c0"+
		"\u00c1\u0005\r\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0005\r\u0000\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u0017\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0006\f\uffff\uffff\u0000\u00c6\u00c7\u0005"+
		"\u0007\u0000\u0000\u00c7\u00c8\u0003\u0018\f\u0000\u00c8\u00c9\u0005\b"+
		"\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00cc\u0003\u0016"+
		"\u000b\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00db\u0001\u0000\u0000\u0000\u00cd\u00ce\n\u0005\u0000"+
		"\u0000\u00ce\u00cf\u0005\u000e\u0000\u0000\u00cf\u00da\u0003\u0018\f\u0006"+
		"\u00d0\u00d1\n\u0004\u0000\u0000\u00d1\u00d2\u0005\u000f\u0000\u0000\u00d2"+
		"\u00da\u0003\u0018\f\u0005\u00d3\u00d4\n\u0003\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0010\u0000\u0000\u00d5\u00da\u0003\u0018\f\u0004\u00d6\u00d7\n"+
		"\u0002\u0000\u0000\u00d7\u00d8\u0005\u0011\u0000\u0000\u00d8\u00da\u0003"+
		"\u0018\f\u0003\u00d9\u00cd\u0001\u0000\u0000\u0000\u00d9\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u0019\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e1\u0005\u0012"+
		"\u0000\u0000\u00df\u00e1\u0005\u0013\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u001b\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e9\u0005\u0014\u0000\u0000\u00e3\u00e9\u0005\u0015"+
		"\u0000\u0000\u00e4\u00e9\u0005\u0016\u0000\u0000\u00e5\u00e9\u0005\u0017"+
		"\u0000\u0000\u00e6\u00e9\u0005\u0018\u0000\u0000\u00e7\u00e9\u0005\u0019"+
		"\u0000\u0000\u00e8\u00e2\u0001\u0000\u0000\u0000\u00e8\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e4\u0001\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u001d\u0001\u0000\u0000\u0000\u00ea\u00f1\u0005\u001a"+
		"\u0000\u0000\u00eb\u00f1\u0005\u001b\u0000\u0000\u00ec\u00f1\u0005\u001c"+
		"\u0000\u0000\u00ed\u00f1\u0005\u001d\u0000\u0000\u00ee\u00f1\u0005\u001e"+
		"\u0000\u0000\u00ef\u00f1\u0005\u001f\u0000\u0000\u00f0\u00ea\u0001\u0000"+
		"\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u001f\u0001\u0000"+
		"\u0000\u0000\u001c&,03:=AIOYjp{\u0082\u008c\u0093\u0099\u00a0\u00a4\u00b0"+
		"\u00b8\u00c3\u00cb\u00d9\u00db\u00e0\u00e8\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}