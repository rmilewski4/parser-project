// Generated from /Users/jariebel/Desktop/parser-project/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, NUMS=36, VALIDWORDS=37, WS=38, 
		LINE_COMMENT=39, BLOCK_COMMENT=40;
	public static final int
		RULE_start_ = 0, RULE_expr = 1, RULE_arethmetic = 2, RULE_assignment = 3, 
		RULE_array = 4, RULE_arrchars = 5, RULE_if_else_block = 6, RULE_if_block = 7, 
		RULE_else_block = 8, RULE_elif_block = 9, RULE_condition = 10, RULE_condition_statement = 11, 
		RULE_var = 12, RULE_string = 13, RULE_char = 14, RULE_tab = 15, RULE_space = 16, 
		RULE_while_loop = 17, RULE_for_loop = 18, RULE_iterable = 19, RULE_range_expr = 20, 
		RULE_range_params = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "expr", "arethmetic", "assignment", "array", "arrchars", "if_else_block", 
			"if_block", "else_block", "elif_block", "condition", "condition_statement", 
			"var", "string", "char", "tab", "space", "while_loop", "for_loop", "iterable", 
			"range_expr", "range_params"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\n'", "'+'", "'-'", "'/'", "'*'", "'%'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'['", "']'", "','", "'if'", "':'", "'else:'", "'elif'", 
			"'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'not'", "'('", "')'", 
			"'and'", "'or'", "'    '", "' '", "'while'", "'for'", "'in'", "'range'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMS", "VALIDWORDS", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public Start_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_; }
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			expr();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 219043364866L) != 0)) {
				{
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(45);
					match(T__0);
					}
					break;
				case T__14:
				case T__31:
				case T__32:
				case NUMS:
				case VALIDWORDS:
					{
					setState(46);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
	public static class ExprContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_else_blockContext if_else_block() {
			return getRuleContext(If_else_blockContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMS:
			case VALIDWORDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				assignment();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				if_else_block();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				while_loop();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				for_loop();
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
	public static class ArethmeticContext extends ParserRuleContext {
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<CharContext> char_() {
			return getRuleContexts(CharContext.class);
		}
		public CharContext char_(int i) {
			return getRuleContext(CharContext.class,i);
		}
		public List<ArethmeticContext> arethmetic() {
			return getRuleContexts(ArethmeticContext.class);
		}
		public ArethmeticContext arethmetic(int i) {
			return getRuleContext(ArethmeticContext.class,i);
		}
		public ArethmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arethmetic; }
	}

	public final ArethmeticContext arethmetic() throws RecognitionException {
		ArethmeticContext _localctx = new ArethmeticContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arethmetic);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMS || _la==VALIDWORDS) {
				{
				{
				setState(60);
				char_();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			space();
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 124L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(68);
			space();
			setState(69);
			char_();
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					arethmetic();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class AssignmentContext extends ParserRuleContext {
		public List<CharContext> char_() {
			return getRuleContexts(CharContext.class);
		}
		public CharContext char_(int i) {
			return getRuleContext(CharContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public ArethmeticContext arethmetic() {
			return getRuleContext(ArethmeticContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				char_();
				setState(77);
				space();
				setState(78);
				match(T__6);
				setState(79);
				space();
				setState(80);
				char_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				char_();
				setState(83);
				space();
				setState(84);
				match(T__7);
				setState(85);
				space();
				setState(86);
				char_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				char_();
				setState(89);
				space();
				setState(90);
				match(T__8);
				setState(91);
				space();
				setState(92);
				char_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				char_();
				setState(95);
				space();
				setState(96);
				match(T__9);
				setState(97);
				space();
				setState(98);
				char_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				char_();
				setState(101);
				space();
				setState(102);
				match(T__10);
				setState(103);
				space();
				setState(104);
				char_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				char_();
				setState(107);
				space();
				setState(108);
				match(T__6);
				setState(109);
				space();
				setState(110);
				arethmetic();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				char_();
				setState(113);
				space();
				setState(114);
				match(T__6);
				setState(115);
				space();
				setState(116);
				array();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				char_();
				setState(119);
				space();
				setState(120);
				match(T__6);
				setState(121);
				space();
				setState(122);
				string();
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
	public static class ArrayContext extends ParserRuleContext {
		public List<ArrcharsContext> arrchars() {
			return getRuleContexts(ArrcharsContext.class);
		}
		public ArrcharsContext arrchars(int i) {
			return getRuleContext(ArrcharsContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__11);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMS || _la==VALIDWORDS) {
				{
				{
				setState(127);
				arrchars();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__12);
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
	public static class ArrcharsContext extends ParserRuleContext {
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public ArrcharsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrchars; }
	}

	public final ArrcharsContext arrchars() throws RecognitionException {
		ArrcharsContext _localctx = new ArrcharsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrchars);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				char_();
				setState(136);
				match(T__13);
				setState(137);
				space();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				char_();
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
	public static class If_else_blockContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Elif_blockContext elif_block() {
			return getRuleContext(Elif_blockContext.class,0);
		}
		public If_else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_block; }
	}

	public final If_else_blockContext if_else_block() throws RecognitionException {
		If_else_blockContext _localctx = new If_else_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			if_block();
			setState(143);
			match(T__0);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(144);
				else_block();
				}
				break;
			case T__17:
				{
				setState(145);
				elif_block();
				}
				break;
			case EOF:
			case T__0:
			case T__14:
			case T__31:
			case T__32:
			case NUMS:
			case VALIDWORDS:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class If_blockContext extends ParserRuleContext {
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__14);
			setState(150);
			space();
			setState(151);
			condition_statement();
			setState(152);
			match(T__15);
			setState(157); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(153);
					match(T__0);
					setState(154);
					tab();
					setState(155);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Else_blockContext extends ParserRuleContext {
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__16);
			setState(166); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(162);
					match(T__0);
					setState(163);
					tab();
					setState(164);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Elif_blockContext extends ParserRuleContext {
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Elif_blockContext elif_block() {
			return getRuleContext(Elif_blockContext.class,0);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Elif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_block; }
	}

	public final Elif_blockContext elif_block() throws RecognitionException {
		Elif_blockContext _localctx = new Elif_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elif_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__17);
			setState(171);
			space();
			setState(172);
			condition_statement();
			setState(173);
			match(T__15);
			setState(178); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(174);
					match(T__0);
					setState(175);
					tab();
					setState(176);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(182);
				match(T__0);
				setState(183);
				else_block();
				}
				break;
			case 2:
				{
				setState(184);
				match(T__0);
				setState(185);
				elif_block();
				}
				break;
			case 3:
				{
				}
				break;
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
	public static class ConditionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case NUMS:
			case VALIDWORDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				var();
				setState(190);
				space();
				setState(191);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				space();
				setState(193);
				var();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(T__24);
				setState(196);
				space();
				setState(197);
				var();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(T__25);
				setState(200);
				condition();
				setState(201);
				match(T__26);
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
	public static class Condition_statementContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public Condition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_statement; }
	}

	public final Condition_statementContext condition_statement() throws RecognitionException {
		Condition_statementContext _localctx = new Condition_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			condition();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2952790016L) != 0)) {
				{
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(206);
					space();
					setState(207);
					match(T__27);
					setState(208);
					space();
					setState(209);
					condition();
					}
					break;
				case 2:
					{
					setState(211);
					space();
					setState(212);
					match(T__28);
					setState(213);
					space();
					setState(214);
					condition();
					}
					break;
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class VarContext extends ParserRuleContext {
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				char_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				string();
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
	public static class StringContext extends ParserRuleContext {
		public List<CharContext> char_() {
			return getRuleContexts(CharContext.class);
		}
		public CharContext char_(int i) {
			return getRuleContext(CharContext.class,i);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			char_();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(227);
					space();
					setState(228);
					char_();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class CharContext extends ParserRuleContext {
		public TerminalNode NUMS() { return getToken(ExprParser.NUMS, 0); }
		public TerminalNode VALIDWORDS() { return getToken(ExprParser.VALIDWORDS, 0); }
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==NUMS || _la==VALIDWORDS) ) {
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
	public static class TabContext extends ParserRuleContext {
		public TabContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab; }
	}

	public final TabContext tab() throws RecognitionException {
		TabContext _localctx = new TabContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tab);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(237);
				match(T__29);
				}
				}
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__29 );
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
	public static class SpaceContext extends ParserRuleContext {
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_space);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__30);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class While_loopContext extends ParserRuleContext {
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_loop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__31);
			setState(247);
			space();
			setState(248);
			condition_statement();
			setState(249);
			match(T__15);
			setState(254); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(250);
					match(T__0);
					setState(251);
					tab();
					setState(252);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(256); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class For_loopContext extends ParserRuleContext {
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IterableContext iterable() {
			return getRuleContext(IterableContext.class,0);
		}
		public List<TabContext> tab() {
			return getRuleContexts(TabContext.class);
		}
		public TabContext tab(int i) {
			return getRuleContext(TabContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_loop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__32);
			setState(259);
			space();
			setState(260);
			var();
			setState(261);
			space();
			setState(262);
			match(T__33);
			setState(263);
			space();
			setState(264);
			iterable();
			setState(265);
			match(T__15);
			setState(270); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(266);
					match(T__0);
					setState(267);
					tab();
					setState(268);
					expr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(272); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class IterableContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Range_exprContext range_expr() {
			return getRuleContext(Range_exprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IterableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterable; }
	}

	public final IterableContext iterable() throws RecognitionException {
		IterableContext _localctx = new IterableContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iterable);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				range_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				string();
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
	public static class Range_exprContext extends ParserRuleContext {
		public Range_paramsContext range_params() {
			return getRuleContext(Range_paramsContext.class,0);
		}
		public Range_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_expr; }
	}

	public final Range_exprContext range_expr() throws RecognitionException {
		Range_exprContext _localctx = new Range_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_range_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__34);
			setState(281);
			match(T__25);
			setState(282);
			range_params();
			setState(283);
			match(T__26);
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
	public static class Range_paramsContext extends ParserRuleContext {
		public List<CharContext> char_() {
			return getRuleContexts(CharContext.class);
		}
		public CharContext char_(int i) {
			return getRuleContext(CharContext.class,i);
		}
		public Range_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_params; }
	}

	public final Range_paramsContext range_params() throws RecognitionException {
		Range_paramsContext _localctx = new Range_paramsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_range_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			char_();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(286);
				match(T__13);
				setState(287);
				char_();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\u0004\u0001(\u0126\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001;\b\u0001\u0001\u0002\u0005\u0002>\b\u0002\n\u0002"+
		"\f\u0002A\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003}\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u0081\b\u0004\n\u0004\f\u0004"+
		"\u0084\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u008d\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u009e\b\u0007\u000b\u0007\f\u0007\u009f\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00a7\b\b\u000b\b\f\b\u00a8"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u00b3\b\t\u000b\t\f\t\u00b4\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u00bc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00cc"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00d9\b\u000b\n\u000b\f\u000b\u00dc\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00e1\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e7\b\r"+
		"\n\r\f\r\u00ea\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00ef"+
		"\b\u000f\u000b\u000f\f\u000f\u00f0\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00f5\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00ff\b\u0011\u000b\u0011"+
		"\f\u0011\u0100\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u010f\b\u0012\u000b\u0012\f\u0012\u0110\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0117\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0121\b\u0015\n\u0015\f\u0015\u0124\t\u0015"+
		"\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0003\u0001\u0000"+
		"\u0002\u0006\u0001\u0000\u0013\u0018\u0001\u0000$%\u0135\u0000,\u0001"+
		"\u0000\u0000\u0000\u0002:\u0001\u0000\u0000\u0000\u0004?\u0001\u0000\u0000"+
		"\u0000\u0006|\u0001\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000\n\u008c"+
		"\u0001\u0000\u0000\u0000\f\u008e\u0001\u0000\u0000\u0000\u000e\u0095\u0001"+
		"\u0000\u0000\u0000\u0010\u00a1\u0001\u0000\u0000\u0000\u0012\u00aa\u0001"+
		"\u0000\u0000\u0000\u0014\u00cb\u0001\u0000\u0000\u0000\u0016\u00cd\u0001"+
		"\u0000\u0000\u0000\u0018\u00e0\u0001\u0000\u0000\u0000\u001a\u00e2\u0001"+
		"\u0000\u0000\u0000\u001c\u00eb\u0001\u0000\u0000\u0000\u001e\u00ee\u0001"+
		"\u0000\u0000\u0000 \u00f4\u0001\u0000\u0000\u0000\"\u00f6\u0001\u0000"+
		"\u0000\u0000$\u0102\u0001\u0000\u0000\u0000&\u0116\u0001\u0000\u0000\u0000"+
		"(\u0118\u0001\u0000\u0000\u0000*\u011d\u0001\u0000\u0000\u0000,1\u0003"+
		"\u0002\u0001\u0000-0\u0005\u0001\u0000\u0000.0\u0003\u0002\u0001\u0000"+
		"/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000024\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000045\u0005\u0000\u0000\u00015\u0001"+
		"\u0001\u0000\u0000\u00006;\u0003\u0006\u0003\u00007;\u0003\f\u0006\u0000"+
		"8;\u0003\"\u0011\u00009;\u0003$\u0012\u0000:6\u0001\u0000\u0000\u0000"+
		":7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;\u0003\u0001\u0000\u0000\u0000<>\u0003\u001c\u000e\u0000=<\u0001"+
		"\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000BC\u0003 \u0010\u0000CD\u0007\u0000\u0000\u0000DE\u0003 \u0010\u0000"+
		"EI\u0003\u001c\u000e\u0000FH\u0003\u0004\u0002\u0000GF\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LM\u0003\u001c\u000e\u0000MN\u0003 \u0010\u0000NO\u0005\u0007\u0000\u0000"+
		"OP\u0003 \u0010\u0000PQ\u0003\u001c\u000e\u0000Q}\u0001\u0000\u0000\u0000"+
		"RS\u0003\u001c\u000e\u0000ST\u0003 \u0010\u0000TU\u0005\b\u0000\u0000"+
		"UV\u0003 \u0010\u0000VW\u0003\u001c\u000e\u0000W}\u0001\u0000\u0000\u0000"+
		"XY\u0003\u001c\u000e\u0000YZ\u0003 \u0010\u0000Z[\u0005\t\u0000\u0000"+
		"[\\\u0003 \u0010\u0000\\]\u0003\u001c\u000e\u0000]}\u0001\u0000\u0000"+
		"\u0000^_\u0003\u001c\u000e\u0000_`\u0003 \u0010\u0000`a\u0005\n\u0000"+
		"\u0000ab\u0003 \u0010\u0000bc\u0003\u001c\u000e\u0000c}\u0001\u0000\u0000"+
		"\u0000de\u0003\u001c\u000e\u0000ef\u0003 \u0010\u0000fg\u0005\u000b\u0000"+
		"\u0000gh\u0003 \u0010\u0000hi\u0003\u001c\u000e\u0000i}\u0001\u0000\u0000"+
		"\u0000jk\u0003\u001c\u000e\u0000kl\u0003 \u0010\u0000lm\u0005\u0007\u0000"+
		"\u0000mn\u0003 \u0010\u0000no\u0003\u0004\u0002\u0000o}\u0001\u0000\u0000"+
		"\u0000pq\u0003\u001c\u000e\u0000qr\u0003 \u0010\u0000rs\u0005\u0007\u0000"+
		"\u0000st\u0003 \u0010\u0000tu\u0003\b\u0004\u0000u}\u0001\u0000\u0000"+
		"\u0000vw\u0003\u001c\u000e\u0000wx\u0003 \u0010\u0000xy\u0005\u0007\u0000"+
		"\u0000yz\u0003 \u0010\u0000z{\u0003\u001a\r\u0000{}\u0001\u0000\u0000"+
		"\u0000|L\u0001\u0000\u0000\u0000|R\u0001\u0000\u0000\u0000|X\u0001\u0000"+
		"\u0000\u0000|^\u0001\u0000\u0000\u0000|d\u0001\u0000\u0000\u0000|j\u0001"+
		"\u0000\u0000\u0000|p\u0001\u0000\u0000\u0000|v\u0001\u0000\u0000\u0000"+
		"}\u0007\u0001\u0000\u0000\u0000~\u0082\u0005\f\u0000\u0000\u007f\u0081"+
		"\u0003\n\u0005\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\r\u0000\u0000\u0086\t\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0003\u001c\u000e\u0000\u0088\u0089\u0005\u000e"+
		"\u0000\u0000\u0089\u008a\u0003 \u0010\u0000\u008a\u008d\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0003\u001c\u000e\u0000\u008c\u0087\u0001\u0000\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u000b\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0003\u000e\u0007\u0000\u008f\u0093\u0005\u0001\u0000"+
		"\u0000\u0090\u0094\u0003\u0010\b\u0000\u0091\u0094\u0003\u0012\t\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0094\r\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096"+
		"\u0097\u0003 \u0010\u0000\u0097\u0098\u0003\u0016\u000b\u0000\u0098\u009d"+
		"\u0005\u0010\u0000\u0000\u0099\u009a\u0005\u0001\u0000\u0000\u009a\u009b"+
		"\u0003\u001e\u000f\u0000\u009b\u009c\u0003\u0002\u0001\u0000\u009c\u009e"+
		"\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u000f\u0001\u0000\u0000\u0000\u00a1\u00a6"+
		"\u0005\u0011\u0000\u0000\u00a2\u00a3\u0005\u0001\u0000\u0000\u00a3\u00a4"+
		"\u0003\u001e\u000f\u0000\u00a4\u00a5\u0003\u0002\u0001\u0000\u00a5\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u0011\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0012\u0000\u0000\u00ab\u00ac\u0003 \u0010\u0000\u00ac\u00ad\u0003"+
		"\u0016\u000b\u0000\u00ad\u00b2\u0005\u0010\u0000\u0000\u00ae\u00af\u0005"+
		"\u0001\u0000\u0000\u00af\u00b0\u0003\u001e\u000f\u0000\u00b0\u00b1\u0003"+
		"\u0002\u0001\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u0001\u0000\u0000\u00b7\u00bc\u0003"+
		"\u0010\b\u0000\u00b8\u00b9\u0005\u0001\u0000\u0000\u00b9\u00bc\u0003\u0012"+
		"\t\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0018\f\u0000"+
		"\u00be\u00bf\u0003 \u0010\u0000\u00bf\u00c0\u0007\u0001\u0000\u0000\u00c0"+
		"\u00c1\u0003 \u0010\u0000\u00c1\u00c2\u0003\u0018\f\u0000\u00c2\u00cc"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0019\u0000\u0000\u00c4\u00c5"+
		"\u0003 \u0010\u0000\u00c5\u00c6\u0003\u0018\f\u0000\u00c6\u00cc\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005\u001a\u0000\u0000\u00c8\u00c9\u0003"+
		"\u0014\n\u0000\u00c9\u00ca\u0005\u001b\u0000\u0000\u00ca\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cb\u00bd\u0001\u0000\u0000\u0000\u00cb\u00c3\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cc\u0015\u0001\u0000"+
		"\u0000\u0000\u00cd\u00da\u0003\u0014\n\u0000\u00ce\u00cf\u0003 \u0010"+
		"\u0000\u00cf\u00d0\u0005\u001c\u0000\u0000\u00d0\u00d1\u0003 \u0010\u0000"+
		"\u00d1\u00d2\u0003\u0014\n\u0000\u00d2\u00d9\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0003 \u0010\u0000\u00d4\u00d5\u0005\u001d\u0000\u0000\u00d5\u00d6"+
		"\u0003 \u0010\u0000\u00d6\u00d7\u0003\u0014\n\u0000\u00d7\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00ce\u0001\u0000\u0000\u0000\u00d8\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u0017\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e1\u0003"+
		"\u001c\u000e\u0000\u00de\u00e1\u0003\b\u0004\u0000\u00df\u00e1\u0003\u001a"+
		"\r\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u0019\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e8\u0003\u001c\u000e\u0000\u00e3\u00e4\u0003 \u0010\u0000"+
		"\u00e4\u00e5\u0003\u001c\u000e\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u001b\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0007\u0002\u0000\u0000\u00ec\u001d\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0005\u001e\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u001f\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f5\u0005\u001f\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5!\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7\u00f8"+
		"\u0003 \u0010\u0000\u00f8\u00f9\u0003\u0016\u000b\u0000\u00f9\u00fe\u0005"+
		"\u0010\u0000\u0000\u00fa\u00fb\u0005\u0001\u0000\u0000\u00fb\u00fc\u0003"+
		"\u001e\u000f\u0000\u00fc\u00fd\u0003\u0002\u0001\u0000\u00fd\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101#\u0001\u0000\u0000\u0000\u0102\u0103\u0005!\u0000"+
		"\u0000\u0103\u0104\u0003 \u0010\u0000\u0104\u0105\u0003\u0018\f\u0000"+
		"\u0105\u0106\u0003 \u0010\u0000\u0106\u0107\u0005\"\u0000\u0000\u0107"+
		"\u0108\u0003 \u0010\u0000\u0108\u0109\u0003&\u0013\u0000\u0109\u010e\u0005"+
		"\u0010\u0000\u0000\u010a\u010b\u0005\u0001\u0000\u0000\u010b\u010c\u0003"+
		"\u001e\u000f\u0000\u010c\u010d\u0003\u0002\u0001\u0000\u010d\u010f\u0001"+
		"\u0000\u0000\u0000\u010e\u010a\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111%\u0001\u0000\u0000\u0000\u0112\u0117\u0003\u0018"+
		"\f\u0000\u0113\u0117\u0003(\u0014\u0000\u0114\u0117\u0003\b\u0004\u0000"+
		"\u0115\u0117\u0003\u001a\r\u0000\u0116\u0112\u0001\u0000\u0000\u0000\u0116"+
		"\u0113\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\'\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0005#\u0000\u0000\u0119\u011a\u0005\u001a\u0000\u0000\u011a\u011b\u0003"+
		"*\u0015\u0000\u011b\u011c\u0005\u001b\u0000\u0000\u011c)\u0001\u0000\u0000"+
		"\u0000\u011d\u0122\u0003\u001c\u000e\u0000\u011e\u011f\u0005\u000e\u0000"+
		"\u0000\u011f\u0121\u0003\u001c\u000e\u0000\u0120\u011e\u0001\u0000\u0000"+
		"\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123+\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0018/1:?I|\u0082\u008c\u0093\u009f"+
		"\u00a8\u00b4\u00bb\u00cb\u00d8\u00da\u00e0\u00e8\u00f0\u00f4\u0100\u0110"+
		"\u0116\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}