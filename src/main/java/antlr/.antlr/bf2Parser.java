// Generated from /Users/marcin/AGH/semestr_4/Kompilatory/compiler/src/main/java/antlr/bf2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bf2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			"'elif'", "'else'", "'='", "'.'", "'+'", "'-'", "'*'", "'/'", "'&&'", 
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << VARNAME) | (1L << NUMBER) | (1L << COMMENT))) != 0)) {
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
	public static class CommentContext extends LineContext {
		public TerminalNode COMMENT() { return getToken(bf2Parser.COMMENT, 0); }
		public CommentContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class CommandCommentContext extends LineContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode COMMENT() { return getToken(bf2Parser.COMMENT, 0); }
		public CommandCommentContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class DefinitionOfFunctionContext extends LineContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public DefinitionOfFunctionContext(LineContext ctx) { copyFrom(ctx); }
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << VARNAME) | (1L << NUMBER))) != 0) );
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
	public static class CommandAssignContext extends CommandContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CommandAssignContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class CommandLoopContext extends CommandContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CommandLoopContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class CommandFuncCallContext extends CommandContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public CommandFuncCallContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class CommandDirectionalMoveContext extends CommandContext {
		public DirectionalMoveContext directionalMove() {
			return getRuleContext(DirectionalMoveContext.class,0);
		}
		public CommandDirectionalMoveContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class CommandIfStatementContext extends CommandContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CommandIfStatementContext(CommandContext ctx) { copyFrom(ctx); }
	}
	public static class CommandExpressionContext extends CommandContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandExpressionContext(CommandContext ctx) { copyFrom(ctx); }
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(bf2Parser.VARNAME, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << VARNAME) | (1L << NUMBER))) != 0) );
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
	public static class ConditionalLoopContext extends LoopContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public ConditionalLoopContext(LoopContext ctx) { copyFrom(ctx); }
	}
	public static class DoLoopContext extends LoopContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public DoLoopContext(LoopContext ctx) { copyFrom(ctx); }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << VARNAME) | (1L << NUMBER))) != 0) );
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
	public static class ParenthesisBoolContext extends BoolStatementContext {
		public BoolStatementContext boolStatement() {
			return getRuleContext(BoolStatementContext.class,0);
		}
		public ParenthesisBoolContext(BoolStatementContext ctx) { copyFrom(ctx); }
	}
	public static class VariableBoolContext extends BoolStatementContext {
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
		}
		public VariableBoolContext(BoolStatementContext ctx) { copyFrom(ctx); }
	}
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
	}
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

	public static class AssignContext extends ParserRuleContext {
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
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
	public static class NumberGetContext extends VarGetterContext {
		public TerminalNode NUMBER() { return getToken(bf2Parser.NUMBER, 0); }
		public NumberGetContext(VarGetterContext ctx) { copyFrom(ctx); }
	}
	public static class BlockGetContext extends VarGetterContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockGetContext(VarGetterContext ctx) { copyFrom(ctx); }
	}
	public static class GetContext extends VarGetterContext {
		public GetContext(VarGetterContext ctx) { copyFrom(ctx); }
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
	public static class SubstractionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubstractionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VariableExpressionContext extends ExpressionContext {
		public VarGetterContext varGetter() {
			return getRuleContext(VarGetterContext.class,0);
		}
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						match(T__13);
						setState(207);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new SubstractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						match(T__14);
						setState(210);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						match(T__15);
						setState(213);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						match(T__16);
						setState(216);
						expression(4);
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
	public static class LogicalAndContext extends LogicalOperatorContext {
		public LogicalAndContext(LogicalOperatorContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrContext extends LogicalOperatorContext {
		public LogicalOrContext(LogicalOperatorContext ctx) { copyFrom(ctx); }
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
	public static class ComparisonGreaterContext extends ComparisonOperatorContext {
		public ComparisonGreaterContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonEqualContext extends ComparisonOperatorContext {
		public ComparisonEqualContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonNotEqualContext extends ComparisonOperatorContext {
		public ComparisonNotEqualContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonLessEqualContext extends ComparisonOperatorContext {
		public ComparisonLessEqualContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonGreaterEqualContext extends ComparisonOperatorContext {
		public ComparisonGreaterEqualContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonLessContext extends ComparisonOperatorContext {
		public ComparisonLessContext(ComparisonOperatorContext ctx) { copyFrom(ctx); }
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
	public static class MoveUpContext extends DirectionalMoveContext {
		public MoveUpContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
	}
	public static class MoveLeftContext extends DirectionalMoveContext {
		public MoveLeftContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
	}
	public static class MoveDownContext extends DirectionalMoveContext {
		public MoveDownContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
	}
	public static class LowerBoardContext extends DirectionalMoveContext {
		public LowerBoardContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
	}
	public static class MoveRightContext extends DirectionalMoveContext {
		public MoveRightContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
	}
	public static class UpperBoardContext extends DirectionalMoveContext {
		public UpperBoardContext(DirectionalMoveContext ctx) { copyFrom(ctx); }
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
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\6\2\'\n\2\r\2\16\2(\3\2\3\2\6\2-\n\2\r\2\16\2.\6\2\61\n\2\r\2\16"+
		"\2\62\3\2\5\2\66\n\2\3\2\3\2\3\3\6\3;\n\3\r\3\16\3<\3\3\5\3@\n\3\3\3\3"+
		"\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\3\5\3\5\5\5R\n\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\6\7Z\n\7\r\7\16\7[\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\6\tq\n\t\r\t\16\t"+
		"r\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\n\3\n\7\n\u0083"+
		"\n\n\f\n\16\n\u0086\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090"+
		"\13\n\3\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\7\n\u009a\n\n\f\n"+
		"\16\n\u009d\13\n\3\n\3\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n\3\n\5\n\u00a7"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc\13\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ce\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00dc\n\16\f\16\16\16\u00df\13\16\3\17\3\17\5\17\u00e3\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00eb\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00f3\n\21\3\21\2\4\24\32\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \2\2\2\u0111\2\"\3\2\2\2\4C\3\2\2\2\6K\3\2\2\2\bM\3\2\2\2\nU\3\2\2"+
		"\2\fW\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22v\3\2\2\2\24\u00b2\3\2\2\2\26"+
		"\u00bd\3\2\2\2\30\u00c5\3\2\2\2\32\u00cd\3\2\2\2\34\u00e2\3\2\2\2\36\u00ea"+
		"\3\2\2\2 \u00f2\3\2\2\2\"#\7#\2\2#$\7\3\2\2$&\7#\2\2%\'\7%\2\2&%\3\2\2"+
		"\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\60\3\2\2\2*,\5\4\3\2+-\7%\2\2,+\3\2"+
		"\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60*\3\2\2\2\61\62\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2"+
		"\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\2\2\38\3\3\2\2\29;\5\6\4\2:9\3\2"+
		"\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\7$\2\2?>\3\2\2\2?@\3\2"+
		"\2\2@D\3\2\2\2AD\7$\2\2BD\5\b\5\2C:\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\5\3\2"+
		"\2\2EL\5\16\b\2FL\5\22\n\2GL\5\n\6\2HL\5 \21\2IL\5\32\16\2JL\5\26\f\2"+
		"KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\7\3\2\2"+
		"\2MN\7\4\2\2NO\7\5\2\2OQ\7\"\2\2PR\7%\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2"+
		"\2ST\5\f\7\2T\t\3\2\2\2UV\7\"\2\2V\13\3\2\2\2WY\7\6\2\2XZ\5\6\4\2YX\3"+
		"\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\7\2\2^\r\3\2\2\2"+
		"_`\7\b\2\2`a\5\20\t\2ab\7\t\2\2bc\7#\2\2cd\7\n\2\2dm\3\2\2\2ef\7\b\2\2"+
		"fg\5\20\t\2gh\7\13\2\2hi\7\t\2\2ij\5\24\13\2jk\7\n\2\2km\3\2\2\2l_\3\2"+
		"\2\2le\3\2\2\2m\17\3\2\2\2np\7\6\2\2oq\5\6\4\2po\3\2\2\2qr\3\2\2\2rp\3"+
		"\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\7\2\2u\21\3\2\2\2vw\7\13\2\2wx\7\t\2\2"+
		"xy\5\24\13\2y}\7\n\2\2z|\7%\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2"+
		"\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084\5\20\t\2\u0081\u0083\7%\2"+
		"\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0095\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\f\2\2\u0088"+
		"\u0089\7\t\2\2\u0089\u008a\5\24\13\2\u008a\u008e\7\n\2\2\u008b\u008d\7"+
		"%\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5\20"+
		"\t\2\u0092\u0094\3\2\2\2\u0093\u0087\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009b\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u009a\7%\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a6\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a2\7\r\2\2\u009f\u00a1\7%\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\20\t\2\u00a6\u009e\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\23\3\2\2\2\u00a8\u00a9\b\13\1\2\u00a9\u00aa\5\30"+
		"\r\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac\5\30\r\2\u00ac\u00b3\3\2\2\2\u00ad"+
		"\u00b3\5\30\r\2\u00ae\u00af\7\t\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1"+
		"\7\n\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00ae\3\2\2\2\u00b3\u00ba\3\2\2\2\u00b4\u00b5\f\4\2\2\u00b5\u00b6\5\34"+
		"\17\2\u00b6\u00b7\5\24\13\5\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\25\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\16\2\2\u00be\u00bf\5\30\r\2\u00bf"+
		"\27\3\2\2\2\u00c0\u00c6\7#\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7\17\2"+
		"\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c0\3\2\2\2\u00c5"+
		"\u00c1\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\b\16\1"+
		"\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\7\n\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ce\5\30\r\2\u00cd\u00c7\3\2\2\2\u00cd\u00cc\3"+
		"\2\2\2\u00ce\u00dd\3\2\2\2\u00cf\u00d0\f\b\2\2\u00d0\u00d1\7\20\2\2\u00d1"+
		"\u00dc\5\32\16\t\u00d2\u00d3\f\7\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00dc"+
		"\5\32\16\b\u00d5\u00d6\f\6\2\2\u00d6\u00d7\7\22\2\2\u00d7\u00dc\5\32\16"+
		"\7\u00d8\u00d9\f\5\2\2\u00d9\u00da\7\23\2\2\u00da\u00dc\5\32\16\6\u00db"+
		"\u00cf\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\33\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\7\24\2\2\u00e1\u00e3\7\25"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\35\3\2\2\2\u00e4\u00eb"+
		"\7\26\2\2\u00e5\u00eb\7\27\2\2\u00e6\u00eb\7\30\2\2\u00e7\u00eb\7\31\2"+
		"\2\u00e8\u00eb\7\32\2\2\u00e9\u00eb\7\33\2\2\u00ea\u00e4\3\2\2\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00e9\3\2\2\2\u00eb\37\3\2\2\2\u00ec\u00f3\7\34\2\2\u00ed\u00f3"+
		"\7\35\2\2\u00ee\u00f3\7\36\2\2\u00ef\u00f3\7\37\2\2\u00f0\u00f3\7 \2\2"+
		"\u00f1\u00f3\7!\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00ee"+
		"\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"!\3\2\2\2\36(.\62\65<?CKQ[lr}\u0084\u008e\u0095\u009b\u00a2\u00a6\u00b2"+
		"\u00ba\u00c5\u00cd\u00db\u00dd\u00e2\u00ea\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}