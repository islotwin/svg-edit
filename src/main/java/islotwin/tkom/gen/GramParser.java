package islotwin.tkom.gen;// Generated from /Users/iga/Desktop/STUDIA/SEM6/TKOM/extra/Gram.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, LCBRACKET=4, RCBRACKET=5, LNBRACKET=6, RNBRACKET=7, 
		LSBRACKET=8, RSBRACKET=9, ASSIGNOP=10, EXPRESSIONOP=11, MATHOP=12, ANDOP=13, 
		MODLISTOP=14, EXOP=15, COMMA=16, SEMICOLON=17, GETATTR=18, SETATTR=19, 
		DELETEATTR=20, SAVE=21, READ=22, PRINT=23, CREATE=24, SIZE=25, FILTERBYATTR=26, 
		FILTERBYTAG=27, VALVAR=28, LISTVAR=29, ELEMVAR=30, NUMBER=31, VARNAME=32, 
		TEXT=33;
	public static final int
		RULE_statement = 0, RULE_ifStmt = 1, RULE_whileStmt = 2, RULE_mathStmt = 3, 
		RULE_saveDocStmt = 4, RULE_printStmt = 5, RULE_initListStmt = 6, RULE_onVarStmt = 7, 
		RULE_onVarFun = 8, RULE_initListFun = 9, RULE_createFun = 10, RULE_readFun = 11, 
		RULE_filterFun = 12, RULE_filterAttrFun = 13, RULE_filterTagFun = 14, 
		RULE_modListFun = 15, RULE_sizeFun = 16, RULE_initElemStmt = 17, RULE_initElemFun = 18, 
		RULE_createElemFun = 19, RULE_getElemFun = 20, RULE_modAttrFun = 21, RULE_setAttrFun = 22, 
		RULE_deleteAttrFun = 23, RULE_getAttrFun = 24, RULE_initValStmt = 25, 
		RULE_expression = 26, RULE_textArgument = 27, RULE_numberArgument = 28, 
		RULE_argument = 29;
	public static final String[] ruleNames = {
		"statement", "ifStmt", "whileStmt", "mathStmt", "saveDocStmt", "printStmt", 
		"initListStmt", "onVarStmt", "onVarFun", "initListFun", "createFun", "readFun", 
		"filterFun", "filterAttrFun", "filterTagFun", "modListFun", "sizeFun", 
		"initElemStmt", "initElemFun", "createElemFun", "getElemFun", "modAttrFun", 
		"setAttrFun", "deleteAttrFun", "getAttrFun", "initValStmt", "expression", 
		"textArgument", "numberArgument", "argument"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'{'", "'}'", "'('", "')'", "'['", 
		"']'", "'='", null, null, null, null, "'.'", "','", "';'", "'getAttr'", 
		"'setAttr'", "'deleteAttr'", "'save'", "'read'", "'print'", "'create'", 
		"'size'", "'filterByAttr'", "'filterByTag'", "'val'", "'list'", "'elem'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "WHILE", "LCBRACKET", "RCBRACKET", "LNBRACKET", "RNBRACKET", 
		"LSBRACKET", "RSBRACKET", "ASSIGNOP", "EXPRESSIONOP", "MATHOP", "ANDOP", 
		"MODLISTOP", "EXOP", "COMMA", "SEMICOLON", "GETATTR", "SETATTR", "DELETEATTR", 
		"SAVE", "READ", "PRINT", "CREATE", "SIZE", "FILTERBYATTR", "FILTERBYTAG", 
		"VALVAR", "LISTVAR", "ELEMVAR", "NUMBER", "VARNAME", "TEXT"
	};
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
	public String getGrammarFileName() { return "Gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public InitListStmtContext initListStmt() {
			return getRuleContext(InitListStmtContext.class,0);
		}
		public InitElemStmtContext initElemStmt() {
			return getRuleContext(InitElemStmtContext.class,0);
		}
		public InitValStmtContext initValStmt() {
			return getRuleContext(InitValStmtContext.class,0);
		}
		public MathStmtContext mathStmt() {
			return getRuleContext(MathStmtContext.class,0);
		}
		public OnVarStmtContext onVarStmt() {
			return getRuleContext(OnVarStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public SaveDocStmtContext saveDocStmt() {
			return getRuleContext(SaveDocStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				ifStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				initListStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				initElemStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				initValStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				mathStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				onVarStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				printStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				saveDocStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(68);
				whileStmt();
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramParser.IF, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public List<TerminalNode> LCBRACKET() { return getTokens(GramParser.LCBRACKET); }
		public TerminalNode LCBRACKET(int i) {
			return getToken(GramParser.LCBRACKET, i);
		}
		public List<TerminalNode> RCBRACKET() { return getTokens(GramParser.RCBRACKET); }
		public TerminalNode RCBRACKET(int i) {
			return getToken(GramParser.RCBRACKET, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GramParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IF);
			setState(72);
			match(LNBRACKET);
			setState(73);
			expression();
			setState(74);
			match(RNBRACKET);
			setState(75);
			match(LCBRACKET);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SAVE) | (1L << PRINT) | (1L << VALVAR) | (1L << LISTVAR) | (1L << ELEMVAR) | (1L << VARNAME))) != 0) );
			setState(81);
			match(RCBRACKET);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(82);
				match(ELSE);
				setState(83);
				match(LCBRACKET);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					statement();
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SAVE) | (1L << PRINT) | (1L << VALVAR) | (1L << LISTVAR) | (1L << ELEMVAR) | (1L << VARNAME))) != 0) );
				setState(89);
				match(RCBRACKET);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramParser.WHILE, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public TerminalNode LCBRACKET() { return getToken(GramParser.LCBRACKET, 0); }
		public TerminalNode RCBRACKET() { return getToken(GramParser.RCBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(WHILE);
			setState(94);
			match(LNBRACKET);
			setState(95);
			expression();
			setState(96);
			match(RNBRACKET);
			setState(97);
			match(LCBRACKET);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				statement();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SAVE) | (1L << PRINT) | (1L << VALVAR) | (1L << LISTVAR) | (1L << ELEMVAR) | (1L << VARNAME))) != 0) );
			setState(103);
			match(RCBRACKET);
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

	public static class MathStmtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode ASSIGNOP() { return getToken(GramParser.ASSIGNOP, 0); }
		public List<NumberArgumentContext> numberArgument() {
			return getRuleContexts(NumberArgumentContext.class);
		}
		public NumberArgumentContext numberArgument(int i) {
			return getRuleContext(NumberArgumentContext.class,i);
		}
		public TerminalNode MATHOP() { return getToken(GramParser.MATHOP, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public MathStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterMathStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitMathStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitMathStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathStmtContext mathStmt() throws RecognitionException {
		MathStmtContext _localctx = new MathStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mathStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(VARNAME);
			setState(106);
			match(ASSIGNOP);
			setState(107);
			numberArgument();
			setState(108);
			match(MATHOP);
			setState(109);
			numberArgument();
			setState(110);
			match(SEMICOLON);
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

	public static class SaveDocStmtContext extends ParserRuleContext {
		public TerminalNode SAVE() { return getToken(GramParser.SAVE, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode COMMA() { return getToken(GramParser.COMMA, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public SaveDocStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveDocStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSaveDocStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSaveDocStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSaveDocStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaveDocStmtContext saveDocStmt() throws RecognitionException {
		SaveDocStmtContext _localctx = new SaveDocStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_saveDocStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SAVE);
			setState(113);
			match(LNBRACKET);
			setState(114);
			match(VARNAME);
			setState(115);
			match(COMMA);
			setState(116);
			textArgument();
			setState(117);
			match(RNBRACKET);
			setState(118);
			match(SEMICOLON);
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

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GramParser.PRINT, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(PRINT);
			setState(121);
			match(LNBRACKET);
			setState(122);
			textArgument();
			setState(123);
			match(RNBRACKET);
			setState(124);
			match(SEMICOLON);
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

	public static class InitListStmtContext extends ParserRuleContext {
		public TerminalNode LISTVAR() { return getToken(GramParser.LISTVAR, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(GramParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(GramParser.VARNAME, i);
		}
		public TerminalNode ASSIGNOP() { return getToken(GramParser.ASSIGNOP, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public InitListFunContext initListFun() {
			return getRuleContext(InitListFunContext.class,0);
		}
		public List<ModListFunContext> modListFun() {
			return getRuleContexts(ModListFunContext.class);
		}
		public ModListFunContext modListFun(int i) {
			return getRuleContext(ModListFunContext.class,i);
		}
		public List<FilterFunContext> filterFun() {
			return getRuleContexts(FilterFunContext.class);
		}
		public FilterFunContext filterFun(int i) {
			return getRuleContext(FilterFunContext.class,i);
		}
		public InitListStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initListStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitListStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitListStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitListStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitListStmtContext initListStmt() throws RecognitionException {
		InitListStmtContext _localctx = new InitListStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initListStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LISTVAR);
			setState(127);
			match(VARNAME);
			setState(128);
			match(ASSIGNOP);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case CREATE:
				{
				setState(129);
				initListFun();
				}
				break;
			case VARNAME:
				{
				setState(130);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					modListFun();
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			case 2:
				{
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					filterFun();
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			}
			setState(145);
			match(SEMICOLON);
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

	public static class OnVarStmtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public OnVarFunContext onVarFun() {
			return getRuleContext(OnVarFunContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public TerminalNode LSBRACKET() { return getToken(GramParser.LSBRACKET, 0); }
		public NumberArgumentContext numberArgument() {
			return getRuleContext(NumberArgumentContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(GramParser.RSBRACKET, 0); }
		public OnVarStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onVarStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterOnVarStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitOnVarStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitOnVarStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnVarStmtContext onVarStmt() throws RecognitionException {
		OnVarStmtContext _localctx = new OnVarStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_onVarStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(VARNAME);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSBRACKET) {
				{
				setState(148);
				match(LSBRACKET);
				setState(149);
				numberArgument();
				setState(150);
				match(RSBRACKET);
				}
			}

			setState(154);
			onVarFun();
			setState(155);
			match(SEMICOLON);
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

	public static class OnVarFunContext extends ParserRuleContext {
		public List<ModListFunContext> modListFun() {
			return getRuleContexts(ModListFunContext.class);
		}
		public ModListFunContext modListFun(int i) {
			return getRuleContext(ModListFunContext.class,i);
		}
		public List<FilterFunContext> filterFun() {
			return getRuleContexts(FilterFunContext.class);
		}
		public FilterFunContext filterFun(int i) {
			return getRuleContext(FilterFunContext.class,i);
		}
		public List<ModAttrFunContext> modAttrFun() {
			return getRuleContexts(ModAttrFunContext.class);
		}
		public ModAttrFunContext modAttrFun(int i) {
			return getRuleContext(ModAttrFunContext.class,i);
		}
		public GetAttrFunContext getAttrFun() {
			return getRuleContext(GetAttrFunContext.class,0);
		}
		public SizeFunContext sizeFun() {
			return getRuleContext(SizeFunContext.class,0);
		}
		public OnVarFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onVarFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterOnVarFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitOnVarFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitOnVarFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnVarFunContext onVarFun() throws RecognitionException {
		OnVarFunContext _localctx = new OnVarFunContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_onVarFun);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					modListFun();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					filterFun();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					modAttrFun();
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				getAttrFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				sizeFun();
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

	public static class InitListFunContext extends ParserRuleContext {
		public CreateFunContext createFun() {
			return getRuleContext(CreateFunContext.class,0);
		}
		public ReadFunContext readFun() {
			return getRuleContext(ReadFunContext.class,0);
		}
		public InitListFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initListFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitListFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitListFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitListFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitListFunContext initListFun() throws RecognitionException {
		InitListFunContext _localctx = new InitListFunContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initListFun);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				createFun();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				readFun();
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

	public static class CreateFunContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(GramParser.CREATE, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public CreateFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterCreateFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitCreateFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitCreateFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunContext createFun() throws RecognitionException {
		CreateFunContext _localctx = new CreateFunContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CREATE);
			setState(181);
			match(LNBRACKET);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(182);
				match(VARNAME);
				}
			}

			setState(185);
			match(RNBRACKET);
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

	public static class ReadFunContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(GramParser.READ, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public ReadFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterReadFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitReadFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitReadFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadFunContext readFun() throws RecognitionException {
		ReadFunContext _localctx = new ReadFunContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(READ);
			setState(188);
			match(LNBRACKET);
			setState(189);
			textArgument();
			setState(190);
			match(RNBRACKET);
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

	public static class FilterFunContext extends ParserRuleContext {
		public FilterAttrFunContext filterAttrFun() {
			return getRuleContext(FilterAttrFunContext.class,0);
		}
		public FilterTagFunContext filterTagFun() {
			return getRuleContext(FilterTagFunContext.class,0);
		}
		public FilterFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFilterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFilterFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFilterFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterFunContext filterFun() throws RecognitionException {
		FilterFunContext _localctx = new FilterFunContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_filterFun);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				filterAttrFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				filterTagFun();
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

	public static class FilterAttrFunContext extends ParserRuleContext {
		public TerminalNode EXOP() { return getToken(GramParser.EXOP, 0); }
		public TerminalNode FILTERBYATTR() { return getToken(GramParser.FILTERBYATTR, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GramParser.COMMA, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public FilterAttrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterAttrFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFilterAttrFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFilterAttrFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFilterAttrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterAttrFunContext filterAttrFun() throws RecognitionException {
		FilterAttrFunContext _localctx = new FilterAttrFunContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_filterAttrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(EXOP);
			setState(197);
			match(FILTERBYATTR);
			setState(198);
			match(LNBRACKET);
			setState(199);
			textArgument();
			setState(200);
			match(COMMA);
			setState(201);
			argument();
			setState(202);
			match(RNBRACKET);
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

	public static class FilterTagFunContext extends ParserRuleContext {
		public TerminalNode EXOP() { return getToken(GramParser.EXOP, 0); }
		public TerminalNode FILTERBYTAG() { return getToken(GramParser.FILTERBYTAG, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public FilterTagFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterTagFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterFilterTagFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitFilterTagFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitFilterTagFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterTagFunContext filterTagFun() throws RecognitionException {
		FilterTagFunContext _localctx = new FilterTagFunContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_filterTagFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(EXOP);
			setState(205);
			match(FILTERBYTAG);
			setState(206);
			match(LNBRACKET);
			setState(207);
			textArgument();
			setState(208);
			match(RNBRACKET);
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

	public static class ModListFunContext extends ParserRuleContext {
		public TerminalNode EXOP() { return getToken(GramParser.EXOP, 0); }
		public TerminalNode MODLISTOP() { return getToken(GramParser.MODLISTOP, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public ModListFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modListFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterModListFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitModListFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitModListFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModListFunContext modListFun() throws RecognitionException {
		ModListFunContext _localctx = new ModListFunContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modListFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(EXOP);
			setState(211);
			match(MODLISTOP);
			setState(212);
			match(LNBRACKET);
			setState(213);
			match(VARNAME);
			setState(214);
			match(RNBRACKET);
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

	public static class SizeFunContext extends ParserRuleContext {
		public TerminalNode EXOP() { return getToken(GramParser.EXOP, 0); }
		public TerminalNode SIZE() { return getToken(GramParser.SIZE, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public SizeFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSizeFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSizeFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSizeFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeFunContext sizeFun() throws RecognitionException {
		SizeFunContext _localctx = new SizeFunContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sizeFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(EXOP);
			setState(217);
			match(SIZE);
			setState(218);
			match(LNBRACKET);
			setState(219);
			match(RNBRACKET);
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

	public static class InitElemStmtContext extends ParserRuleContext {
		public TerminalNode ELEMVAR() { return getToken(GramParser.ELEMVAR, 0); }
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode ASSIGNOP() { return getToken(GramParser.ASSIGNOP, 0); }
		public InitElemFunContext initElemFun() {
			return getRuleContext(InitElemFunContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public SetAttrFunContext setAttrFun() {
			return getRuleContext(SetAttrFunContext.class,0);
		}
		public InitElemStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initElemStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitElemStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitElemStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitElemStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitElemStmtContext initElemStmt() throws RecognitionException {
		InitElemStmtContext _localctx = new InitElemStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_initElemStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ELEMVAR);
			setState(222);
			match(VARNAME);
			setState(223);
			match(ASSIGNOP);
			setState(224);
			initElemFun();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXOP) {
				{
				setState(225);
				setAttrFun();
				}
			}

			setState(228);
			match(SEMICOLON);
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

	public static class InitElemFunContext extends ParserRuleContext {
		public CreateElemFunContext createElemFun() {
			return getRuleContext(CreateElemFunContext.class,0);
		}
		public GetElemFunContext getElemFun() {
			return getRuleContext(GetElemFunContext.class,0);
		}
		public InitElemFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initElemFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitElemFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitElemFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitElemFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitElemFunContext initElemFun() throws RecognitionException {
		InitElemFunContext _localctx = new InitElemFunContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_initElemFun);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				createElemFun();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				getElemFun();
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

	public static class CreateElemFunContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(GramParser.CREATE, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public CreateElemFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createElemFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterCreateElemFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitCreateElemFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitCreateElemFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateElemFunContext createElemFun() throws RecognitionException {
		CreateElemFunContext _localctx = new CreateElemFunContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_createElemFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(CREATE);
			setState(235);
			match(LNBRACKET);
			setState(236);
			textArgument();
			setState(237);
			match(RNBRACKET);
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

	public static class GetElemFunContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode LSBRACKET() { return getToken(GramParser.LSBRACKET, 0); }
		public NumberArgumentContext numberArgument() {
			return getRuleContext(NumberArgumentContext.class,0);
		}
		public TerminalNode RSBRACKET() { return getToken(GramParser.RSBRACKET, 0); }
		public GetElemFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getElemFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterGetElemFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitGetElemFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitGetElemFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetElemFunContext getElemFun() throws RecognitionException {
		GetElemFunContext _localctx = new GetElemFunContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_getElemFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(VARNAME);
			setState(240);
			match(LSBRACKET);
			setState(241);
			numberArgument();
			setState(242);
			match(RSBRACKET);
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

	public static class ModAttrFunContext extends ParserRuleContext {
		public SetAttrFunContext setAttrFun() {
			return getRuleContext(SetAttrFunContext.class,0);
		}
		public DeleteAttrFunContext deleteAttrFun() {
			return getRuleContext(DeleteAttrFunContext.class,0);
		}
		public ModAttrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modAttrFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterModAttrFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitModAttrFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitModAttrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModAttrFunContext modAttrFun() throws RecognitionException {
		ModAttrFunContext _localctx = new ModAttrFunContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modAttrFun);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				setAttrFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				deleteAttrFun();
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

	public static class SetAttrFunContext extends ParserRuleContext {
		public TerminalNode EXOP() { return getToken(GramParser.EXOP, 0); }
		public TerminalNode SETATTR() { return getToken(GramParser.SETATTR, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GramParser.COMMA, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public SetAttrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAttrFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterSetAttrFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitSetAttrFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitSetAttrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAttrFunContext setAttrFun() throws RecognitionException {
		SetAttrFunContext _localctx = new SetAttrFunContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_setAttrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(EXOP);
			setState(249);
			match(SETATTR);
			setState(250);
			match(LNBRACKET);
			setState(251);
			textArgument();
			setState(252);
			match(COMMA);
			setState(253);
			argument();
			setState(254);
			match(RNBRACKET);
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

	public static class DeleteAttrFunContext extends ParserRuleContext {
		public TerminalNode EXOP() { return getToken(GramParser.EXOP, 0); }
		public TerminalNode DELETEATTR() { return getToken(GramParser.DELETEATTR, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public DeleteAttrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteAttrFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterDeleteAttrFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitDeleteAttrFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitDeleteAttrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteAttrFunContext deleteAttrFun() throws RecognitionException {
		DeleteAttrFunContext _localctx = new DeleteAttrFunContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_deleteAttrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(EXOP);
			setState(257);
			match(DELETEATTR);
			setState(258);
			match(LNBRACKET);
			setState(259);
			textArgument();
			setState(260);
			match(RNBRACKET);
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

	public static class GetAttrFunContext extends ParserRuleContext {
		public TerminalNode EXOP() { return getToken(GramParser.EXOP, 0); }
		public TerminalNode GETATTR() { return getToken(GramParser.GETATTR, 0); }
		public TerminalNode LNBRACKET() { return getToken(GramParser.LNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode RNBRACKET() { return getToken(GramParser.RNBRACKET, 0); }
		public GetAttrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAttrFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterGetAttrFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitGetAttrFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitGetAttrFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetAttrFunContext getAttrFun() throws RecognitionException {
		GetAttrFunContext _localctx = new GetAttrFunContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_getAttrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(EXOP);
			setState(263);
			match(GETATTR);
			setState(264);
			match(LNBRACKET);
			setState(265);
			textArgument();
			setState(266);
			match(RNBRACKET);
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

	public static class InitValStmtContext extends ParserRuleContext {
		public TerminalNode VALVAR() { return getToken(GramParser.VALVAR, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(GramParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(GramParser.VARNAME, i);
		}
		public TerminalNode ASSIGNOP() { return getToken(GramParser.ASSIGNOP, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public SizeFunContext sizeFun() {
			return getRuleContext(SizeFunContext.class,0);
		}
		public List<NumberArgumentContext> numberArgument() {
			return getRuleContexts(NumberArgumentContext.class);
		}
		public NumberArgumentContext numberArgument(int i) {
			return getRuleContext(NumberArgumentContext.class,i);
		}
		public TerminalNode MATHOP() { return getToken(GramParser.MATHOP, 0); }
		public InitValStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initValStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterInitValStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitInitValStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitInitValStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitValStmtContext initValStmt() throws RecognitionException {
		InitValStmtContext _localctx = new InitValStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_initValStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(VALVAR);
			setState(269);
			match(VARNAME);
			setState(270);
			match(ASSIGNOP);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(271);
				argument();
				}
				break;
			case 2:
				{
				{
				setState(272);
				numberArgument();
				setState(273);
				match(MATHOP);
				setState(274);
				numberArgument();
				}
				}
				break;
			case 3:
				{
				setState(276);
				match(VARNAME);
				setState(277);
				sizeFun();
				}
				break;
			}
			setState(280);
			match(SEMICOLON);
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
		public List<NumberArgumentContext> numberArgument() {
			return getRuleContexts(NumberArgumentContext.class);
		}
		public NumberArgumentContext numberArgument(int i) {
			return getRuleContext(NumberArgumentContext.class,i);
		}
		public List<TerminalNode> EXPRESSIONOP() { return getTokens(GramParser.EXPRESSIONOP); }
		public TerminalNode EXPRESSIONOP(int i) {
			return getToken(GramParser.EXPRESSIONOP, i);
		}
		public List<TerminalNode> ANDOP() { return getTokens(GramParser.ANDOP); }
		public TerminalNode ANDOP(int i) {
			return getToken(GramParser.ANDOP, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			numberArgument();
			setState(283);
			match(EXPRESSIONOP);
			setState(284);
			numberArgument();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDOP) {
				{
				{
				setState(285);
				match(ANDOP);
				setState(286);
				numberArgument();
				setState(287);
				match(EXPRESSIONOP);
				setState(288);
				numberArgument();
				}
				}
				setState(294);
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

	public static class TextArgumentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode TEXT() { return getToken(GramParser.TEXT, 0); }
		public TextArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterTextArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitTextArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitTextArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextArgumentContext textArgument() throws RecognitionException {
		TextArgumentContext _localctx = new TextArgumentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_textArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==VARNAME || _la==TEXT) ) {
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

	public static class NumberArgumentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode NUMBER() { return getToken(GramParser.NUMBER, 0); }
		public NumberArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterNumberArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitNumberArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitNumberArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberArgumentContext numberArgument() throws RecognitionException {
		NumberArgumentContext _localctx = new NumberArgumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numberArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==VARNAME) ) {
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

	public static class ArgumentContext extends ParserRuleContext {
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(GramParser.NUMBER, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_argument);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				textArgument();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(NUMBER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2H\n\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3P\n\3\r"+
		"\3\16\3Q\3\3\3\3\3\3\3\3\6\3X\n\3\r\3\16\3Y\3\3\3\3\5\3^\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\6\4f\n\4\r\4\16\4g\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0086\n\b\3\b\6\b\u0089\n\b\r\b\16\b\u008a\3\b\6\b\u008e\n"+
		"\b\r\b\16\b\u008f\5\b\u0092\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u009b"+
		"\n\t\3\t\3\t\3\t\3\n\6\n\u00a1\n\n\r\n\16\n\u00a2\3\n\6\n\u00a6\n\n\r"+
		"\n\16\n\u00a7\3\n\6\n\u00ab\n\n\r\n\16\n\u00ac\3\n\3\n\5\n\u00b1\n\n\3"+
		"\13\3\13\5\13\u00b5\n\13\3\f\3\f\3\f\5\f\u00ba\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\5\16\u00c5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00e5\n\23\3\23\3\23"+
		"\3\24\3\24\5\24\u00eb\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\5\27\u00f9\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0119\n\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0125\n\34\f\34\16\34\u0128\13"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u0130\n\37\3\37\2\2 \2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\4\3\2\"#\3\2!"+
		"\"\2\u0136\2G\3\2\2\2\4I\3\2\2\2\6_\3\2\2\2\bk\3\2\2\2\nr\3\2\2\2\fz\3"+
		"\2\2\2\16\u0080\3\2\2\2\20\u0095\3\2\2\2\22\u00b0\3\2\2\2\24\u00b4\3\2"+
		"\2\2\26\u00b6\3\2\2\2\30\u00bd\3\2\2\2\32\u00c4\3\2\2\2\34\u00c6\3\2\2"+
		"\2\36\u00ce\3\2\2\2 \u00d4\3\2\2\2\"\u00da\3\2\2\2$\u00df\3\2\2\2&\u00ea"+
		"\3\2\2\2(\u00ec\3\2\2\2*\u00f1\3\2\2\2,\u00f8\3\2\2\2.\u00fa\3\2\2\2\60"+
		"\u0102\3\2\2\2\62\u0108\3\2\2\2\64\u010e\3\2\2\2\66\u011c\3\2\2\28\u0129"+
		"\3\2\2\2:\u012b\3\2\2\2<\u012f\3\2\2\2>H\5\4\3\2?H\5\16\b\2@H\5$\23\2"+
		"AH\5\64\33\2BH\5\b\5\2CH\5\20\t\2DH\5\f\7\2EH\5\n\6\2FH\5\6\4\2G>\3\2"+
		"\2\2G?\3\2\2\2G@\3\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2"+
		"\2\2GF\3\2\2\2H\3\3\2\2\2IJ\7\3\2\2JK\7\b\2\2KL\5\66\34\2LM\7\t\2\2MO"+
		"\7\6\2\2NP\5\2\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2S"+
		"]\7\7\2\2TU\7\4\2\2UW\7\6\2\2VX\5\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2"+
		"YZ\3\2\2\2Z[\3\2\2\2[\\\7\7\2\2\\^\3\2\2\2]T\3\2\2\2]^\3\2\2\2^\5\3\2"+
		"\2\2_`\7\5\2\2`a\7\b\2\2ab\5\66\34\2bc\7\t\2\2ce\7\6\2\2df\5\2\2\2ed\3"+
		"\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\7\2\2j\7\3\2\2\2kl"+
		"\7\"\2\2lm\7\f\2\2mn\5:\36\2no\7\16\2\2op\5:\36\2pq\7\23\2\2q\t\3\2\2"+
		"\2rs\7\27\2\2st\7\b\2\2tu\7\"\2\2uv\7\22\2\2vw\58\35\2wx\7\t\2\2xy\7\23"+
		"\2\2y\13\3\2\2\2z{\7\31\2\2{|\7\b\2\2|}\58\35\2}~\7\t\2\2~\177\7\23\2"+
		"\2\177\r\3\2\2\2\u0080\u0081\7\37\2\2\u0081\u0082\7\"\2\2\u0082\u0085"+
		"\7\f\2\2\u0083\u0086\5\24\13\2\u0084\u0086\7\"\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0084\3\2\2\2\u0086\u0091\3\2\2\2\u0087\u0089\5 \21\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0092\3\2\2\2\u008c\u008e\5\32\16\2\u008d\u008c\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u0088\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\7\23\2\2\u0094\17\3\2\2\2\u0095\u009a\7\"\2\2\u0096\u0097"+
		"\7\n\2\2\u0097\u0098\5:\36\2\u0098\u0099\7\13\2\2\u0099\u009b\3\2\2\2"+
		"\u009a\u0096\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\5\22\n\2\u009d\u009e\7\23\2\2\u009e\21\3\2\2\2\u009f\u00a1\5 \21\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00b1\3\2\2\2\u00a4\u00a6\5\32\16\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b1\3\2"+
		"\2\2\u00a9\u00ab\5,\27\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b1\5\62"+
		"\32\2\u00af\u00b1\5\"\22\2\u00b0\u00a0\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0"+
		"\u00aa\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\23\3\2\2"+
		"\2\u00b2\u00b5\5\26\f\2\u00b3\u00b5\5\30\r\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\25\3\2\2\2\u00b6\u00b7\7\32\2\2\u00b7\u00b9\7\b\2"+
		"\2\u00b8\u00ba\7\"\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc\27\3\2\2\2\u00bd\u00be\7\30\2\2\u00be"+
		"\u00bf\7\b\2\2\u00bf\u00c0\58\35\2\u00c0\u00c1\7\t\2\2\u00c1\31\3\2\2"+
		"\2\u00c2\u00c5\5\34\17\2\u00c3\u00c5\5\36\20\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\33\3\2\2\2\u00c6\u00c7\7\21\2\2\u00c7\u00c8\7\34"+
		"\2\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\58\35\2\u00ca\u00cb\7\22\2\2\u00cb"+
		"\u00cc\5<\37\2\u00cc\u00cd\7\t\2\2\u00cd\35\3\2\2\2\u00ce\u00cf\7\21\2"+
		"\2\u00cf\u00d0\7\35\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\58\35\2\u00d2"+
		"\u00d3\7\t\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7\21\2\2\u00d5\u00d6\7\20"+
		"\2\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\7\"\2\2\u00d8\u00d9\7\t\2\2\u00d9"+
		"!\3\2\2\2\u00da\u00db\7\21\2\2\u00db\u00dc\7\33\2\2\u00dc\u00dd\7\b\2"+
		"\2\u00dd\u00de\7\t\2\2\u00de#\3\2\2\2\u00df\u00e0\7 \2\2\u00e0\u00e1\7"+
		"\"\2\2\u00e1\u00e2\7\f\2\2\u00e2\u00e4\5&\24\2\u00e3\u00e5\5.\30\2\u00e4"+
		"\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\23"+
		"\2\2\u00e7%\3\2\2\2\u00e8\u00eb\5(\25\2\u00e9\u00eb\5*\26\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\'\3\2\2\2\u00ec\u00ed\7\32\2\2\u00ed"+
		"\u00ee\7\b\2\2\u00ee\u00ef\58\35\2\u00ef\u00f0\7\t\2\2\u00f0)\3\2\2\2"+
		"\u00f1\u00f2\7\"\2\2\u00f2\u00f3\7\n\2\2\u00f3\u00f4\5:\36\2\u00f4\u00f5"+
		"\7\13\2\2\u00f5+\3\2\2\2\u00f6\u00f9\5.\30\2\u00f7\u00f9\5\60\31\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9-\3\2\2\2\u00fa\u00fb\7\21\2\2"+
		"\u00fb\u00fc\7\25\2\2\u00fc\u00fd\7\b\2\2\u00fd\u00fe\58\35\2\u00fe\u00ff"+
		"\7\22\2\2\u00ff\u0100\5<\37\2\u0100\u0101\7\t\2\2\u0101/\3\2\2\2\u0102"+
		"\u0103\7\21\2\2\u0103\u0104\7\26\2\2\u0104\u0105\7\b\2\2\u0105\u0106\5"+
		"8\35\2\u0106\u0107\7\t\2\2\u0107\61\3\2\2\2\u0108\u0109\7\21\2\2\u0109"+
		"\u010a\7\24\2\2\u010a\u010b\7\b\2\2\u010b\u010c\58\35\2\u010c\u010d\7"+
		"\t\2\2\u010d\63\3\2\2\2\u010e\u010f\7\36\2\2\u010f\u0110\7\"\2\2\u0110"+
		"\u0118\7\f\2\2\u0111\u0119\5<\37\2\u0112\u0113\5:\36\2\u0113\u0114\7\16"+
		"\2\2\u0114\u0115\5:\36\2\u0115\u0119\3\2\2\2\u0116\u0117\7\"\2\2\u0117"+
		"\u0119\5\"\22\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0116\3"+
		"\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\7\23\2\2\u011b\65\3\2\2\2\u011c"+
		"\u011d\5:\36\2\u011d\u011e\7\r\2\2\u011e\u0126\5:\36\2\u011f\u0120\7\17"+
		"\2\2\u0120\u0121\5:\36\2\u0121\u0122\7\r\2\2\u0122\u0123\5:\36\2\u0123"+
		"\u0125\3\2\2\2\u0124\u011f\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\67\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a"+
		"\t\2\2\2\u012a9\3\2\2\2\u012b\u012c\t\3\2\2\u012c;\3\2\2\2\u012d\u0130"+
		"\58\35\2\u012e\u0130\7!\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"=\3\2\2\2\31GQY]g\u0085\u008a\u008f\u0091\u009a\u00a2\u00a7\u00ac\u00b0"+
		"\u00b4\u00b9\u00c4\u00e4\u00ea\u00f8\u0118\u0126\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}