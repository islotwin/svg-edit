package islotwin.tkom.gen;// Generated from /Users/iga/Desktop/STUDIA/SEM6/TKOM/extra/Gram.g4 by ANTLR 4.7

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, STARTCBRACKET=4, ENDCBRACKET=5, STARTNBRACKET=6, 
		ENDNBRACKET=7, STARTSBRACKET=8, ENDSBRACKET=9, ASSIGNOP=10, EXPRESSIONOP=11, 
		MATHOP=12, ANDOP=13, MODLISTOP=14, EXOP=15, COMMA=16, SEMICOLON=17, GETATTR=18, 
		SETATTR=19, DELETEATTR=20, SAVE=21, READ=22, PRINT=23, CREATE=24, SIZE=25, 
		FILTERBYATTR=26, FILTERBYTAG=27, NUMBERVAR=28, STRINGVAR=29, LISTVAR=30, 
		ELEMVAR=31, NUMBER=32, VARNAME=33, TEXT=34, WHITESPACE=35;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_ifStmt = 2, RULE_elseFun = 3, 
		RULE_whileStmt = 4, RULE_mathStmt = 5, RULE_saveDocStmt = 6, RULE_printStmt = 7, 
		RULE_initListStmt = 8, RULE_onVarStmt = 9, RULE_onVarFun = 10, RULE_initListFun = 11, 
		RULE_createFun = 12, RULE_readFun = 13, RULE_filterFun = 14, RULE_filterAttrFun = 15, 
		RULE_filterTagFun = 16, RULE_modListFun = 17, RULE_sizeFun = 18, RULE_initElemStmt = 19, 
		RULE_initElemFun = 20, RULE_createElemFun = 21, RULE_getElemFun = 22, 
		RULE_modAttrFun = 23, RULE_setAttrFun = 24, RULE_deleteAttrFun = 25, RULE_getAttrFun = 26, 
		RULE_initValStmt = 27, RULE_expression = 28, RULE_textArgument = 29, RULE_numberArgument = 30, 
		RULE_argument = 31;
	public static final String[] ruleNames = {
		"program", "statement", "ifStmt", "elseFun", "whileStmt", "mathStmt", 
		"saveDocStmt", "printStmt", "initListStmt", "onVarStmt", "onVarFun", "initListFun", 
		"createFun", "readFun", "filterFun", "filterAttrFun", "filterTagFun", 
		"modListFun", "sizeFun", "initElemStmt", "initElemFun", "createElemFun", 
		"getElemFun", "modAttrFun", "setAttrFun", "deleteAttrFun", "getAttrFun", 
		"initValStmt", "expression", "textArgument", "numberArgument", "argument"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'while'", "'{'", "'}'", "'('", "')'", "'['", 
		"']'", "'='", null, null, null, null, "'.'", "','", "';'", "'getAttr'", 
		"'setAttr'", "'deleteAttr'", "'save'", "'read'", "'print'", "'create'", 
		"'size'", "'filterByAttr'", "'filterByTag'", "'num'", "'string'", "'list'", 
		"'elem'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IF", "ELSE", "WHILE", "STARTCBRACKET", "ENDCBRACKET", "STARTNBRACKET", 
		"ENDNBRACKET", "STARTSBRACKET", "ENDSBRACKET", "ASSIGNOP", "EXPRESSIONOP", 
		"MATHOP", "ANDOP", "MODLISTOP", "EXOP", "COMMA", "SEMICOLON", "GETATTR", 
		"SETATTR", "DELETEATTR", "SAVE", "READ", "PRINT", "CREATE", "SIZE", "FILTERBYATTR", 
		"FILTERBYTAG", "NUMBERVAR", "STRINGVAR", "LISTVAR", "ELEMVAR", "NUMBER", 
		"VARNAME", "TEXT", "WHITESPACE"
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
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SAVE) | (1L << PRINT) | (1L << NUMBERVAR) | (1L << STRINGVAR) | (1L << LISTVAR) | (1L << ELEMVAR) | (1L << VARNAME))) != 0) );
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				ifStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				initListStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				initElemStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				initValStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				mathStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				onVarStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				printStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				saveDocStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
		public TerminalNode STARTCBRACKET() { return getToken(GramParser.STARTCBRACKET, 0); }
		public TerminalNode ENDCBRACKET() { return getToken(GramParser.ENDCBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseFunContext elseFun() {
			return getRuleContext(ElseFunContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IF);
			setState(81);
			match(STARTNBRACKET);
			setState(82);
			expression();
			setState(83);
			match(ENDNBRACKET);
			setState(84);
			match(STARTCBRACKET);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				statement();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SAVE) | (1L << PRINT) | (1L << NUMBERVAR) | (1L << STRINGVAR) | (1L << LISTVAR) | (1L << ELEMVAR) | (1L << VARNAME))) != 0) );
			setState(90);
			match(ENDCBRACKET);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(91);
				elseFun();
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

	public static class ElseFunContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GramParser.ELSE, 0); }
		public TerminalNode STARTCBRACKET() { return getToken(GramParser.STARTCBRACKET, 0); }
		public TerminalNode ENDCBRACKET() { return getToken(GramParser.ENDCBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).enterElseFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramListener ) ((GramListener)listener).exitElseFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramVisitor ) return ((GramVisitor<? extends T>)visitor).visitElseFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseFunContext elseFun() throws RecognitionException {
		ElseFunContext _localctx = new ElseFunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elseFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ELSE);
			setState(95);
			match(STARTCBRACKET);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				statement();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SAVE) | (1L << PRINT) | (1L << NUMBERVAR) | (1L << STRINGVAR) | (1L << LISTVAR) | (1L << ELEMVAR) | (1L << VARNAME))) != 0) );
			setState(101);
			match(ENDCBRACKET);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
		public TerminalNode STARTCBRACKET() { return getToken(GramParser.STARTCBRACKET, 0); }
		public TerminalNode ENDCBRACKET() { return getToken(GramParser.ENDCBRACKET, 0); }
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
		enterRule(_localctx, 8, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(WHILE);
			setState(104);
			match(STARTNBRACKET);
			setState(105);
			expression();
			setState(106);
			match(ENDNBRACKET);
			setState(107);
			match(STARTCBRACKET);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				statement();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SAVE) | (1L << PRINT) | (1L << NUMBERVAR) | (1L << STRINGVAR) | (1L << LISTVAR) | (1L << ELEMVAR) | (1L << VARNAME))) != 0) );
			setState(113);
			match(ENDCBRACKET);
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
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public List<NumberArgumentContext> numberArgument() {
			return getRuleContexts(NumberArgumentContext.class);
		}
		public NumberArgumentContext numberArgument(int i) {
			return getRuleContext(NumberArgumentContext.class,i);
		}
		public TerminalNode MATHOP() { return getToken(GramParser.MATHOP, 0); }
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
		enterRule(_localctx, 10, RULE_mathStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(VARNAME);
			setState(116);
			match(ASSIGNOP);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(117);
				numberArgument();
				setState(118);
				match(MATHOP);
				setState(119);
				numberArgument();
				}
				}
				break;
			case 2:
				{
				setState(121);
				argument();
				}
				break;
			}
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

	public static class SaveDocStmtContext extends ParserRuleContext {
		public TerminalNode SAVE() { return getToken(GramParser.SAVE, 0); }
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode COMMA() { return getToken(GramParser.COMMA, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 12, RULE_saveDocStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SAVE);
			setState(127);
			match(STARTNBRACKET);
			setState(128);
			match(VARNAME);
			setState(129);
			match(COMMA);
			setState(130);
			textArgument();
			setState(131);
			match(ENDNBRACKET);
			setState(132);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 14, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(PRINT);
			setState(135);
			match(STARTNBRACKET);
			setState(136);
			textArgument();
			setState(137);
			match(ENDNBRACKET);
			setState(138);
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
		enterRule(_localctx, 16, RULE_initListStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LISTVAR);
			setState(141);
			match(VARNAME);
			setState(142);
			match(ASSIGNOP);
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
			case CREATE:
				{
				setState(143);
				initListFun();
				}
				break;
			case VARNAME:
				{
				setState(144);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					modListFun();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			case 2:
				{
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					filterFun();
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			}
			setState(159);
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
		public TerminalNode STARTSBRACKET() { return getToken(GramParser.STARTSBRACKET, 0); }
		public NumberArgumentContext numberArgument() {
			return getRuleContext(NumberArgumentContext.class,0);
		}
		public TerminalNode ENDSBRACKET() { return getToken(GramParser.ENDSBRACKET, 0); }
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
		enterRule(_localctx, 18, RULE_onVarStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(VARNAME);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STARTSBRACKET) {
				{
				setState(162);
				match(STARTSBRACKET);
				setState(163);
				numberArgument();
				setState(164);
				match(ENDSBRACKET);
				}
			}

			setState(168);
			onVarFun();
			setState(169);
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
		enterRule(_localctx, 20, RULE_onVarFun);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					modListFun();
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					filterFun();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(181);
					modAttrFun();
					}
					}
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXOP );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				getAttrFun();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
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
		enterRule(_localctx, 22, RULE_initListFun);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				createFun();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 24, RULE_createFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CREATE);
			setState(195);
			match(STARTNBRACKET);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARNAME) {
				{
				setState(196);
				match(VARNAME);
				}
			}

			setState(199);
			match(ENDNBRACKET);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 26, RULE_readFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(READ);
			setState(202);
			match(STARTNBRACKET);
			setState(203);
			textArgument();
			setState(204);
			match(ENDNBRACKET);
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
		enterRule(_localctx, 28, RULE_filterFun);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				filterAttrFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GramParser.COMMA, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 30, RULE_filterAttrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(EXOP);
			setState(211);
			match(FILTERBYATTR);
			setState(212);
			match(STARTNBRACKET);
			setState(213);
			textArgument();
			setState(214);
			match(COMMA);
			setState(215);
			argument();
			setState(216);
			match(ENDNBRACKET);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 32, RULE_filterTagFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(EXOP);
			setState(219);
			match(FILTERBYTAG);
			setState(220);
			match(STARTNBRACKET);
			setState(221);
			textArgument();
			setState(222);
			match(ENDNBRACKET);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 34, RULE_modListFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(EXOP);
			setState(225);
			match(MODLISTOP);
			setState(226);
			match(STARTNBRACKET);
			setState(227);
			match(VARNAME);
			setState(228);
			match(ENDNBRACKET);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 36, RULE_sizeFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(EXOP);
			setState(231);
			match(SIZE);
			setState(232);
			match(STARTNBRACKET);
			setState(233);
			match(ENDNBRACKET);
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
		enterRule(_localctx, 38, RULE_initElemStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ELEMVAR);
			setState(236);
			match(VARNAME);
			setState(237);
			match(ASSIGNOP);
			setState(238);
			initElemFun();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXOP) {
				{
				setState(239);
				setAttrFun();
				}
			}

			setState(242);
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
		enterRule(_localctx, 40, RULE_initElemFun);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				createElemFun();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 42, RULE_createElemFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(CREATE);
			setState(249);
			match(STARTNBRACKET);
			setState(250);
			textArgument();
			setState(251);
			match(ENDNBRACKET);
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
		public TerminalNode STARTSBRACKET() { return getToken(GramParser.STARTSBRACKET, 0); }
		public NumberArgumentContext numberArgument() {
			return getRuleContext(NumberArgumentContext.class,0);
		}
		public TerminalNode ENDSBRACKET() { return getToken(GramParser.ENDSBRACKET, 0); }
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
		enterRule(_localctx, 44, RULE_getElemFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(VARNAME);
			setState(254);
			match(STARTSBRACKET);
			setState(255);
			numberArgument();
			setState(256);
			match(ENDSBRACKET);
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
		enterRule(_localctx, 46, RULE_modAttrFun);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				setAttrFun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GramParser.COMMA, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 48, RULE_setAttrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(EXOP);
			setState(263);
			match(SETATTR);
			setState(264);
			match(STARTNBRACKET);
			setState(265);
			textArgument();
			setState(266);
			match(COMMA);
			setState(267);
			argument();
			setState(268);
			match(ENDNBRACKET);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 50, RULE_deleteAttrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(EXOP);
			setState(271);
			match(DELETEATTR);
			setState(272);
			match(STARTNBRACKET);
			setState(273);
			textArgument();
			setState(274);
			match(ENDNBRACKET);
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
		public TerminalNode STARTNBRACKET() { return getToken(GramParser.STARTNBRACKET, 0); }
		public TextArgumentContext textArgument() {
			return getRuleContext(TextArgumentContext.class,0);
		}
		public TerminalNode ENDNBRACKET() { return getToken(GramParser.ENDNBRACKET, 0); }
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
		enterRule(_localctx, 52, RULE_getAttrFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(EXOP);
			setState(277);
			match(GETATTR);
			setState(278);
			match(STARTNBRACKET);
			setState(279);
			textArgument();
			setState(280);
			match(ENDNBRACKET);
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
		public List<TerminalNode> VARNAME() { return getTokens(GramParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(GramParser.VARNAME, i);
		}
		public TerminalNode ASSIGNOP() { return getToken(GramParser.ASSIGNOP, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramParser.SEMICOLON, 0); }
		public TerminalNode NUMBERVAR() { return getToken(GramParser.NUMBERVAR, 0); }
		public TerminalNode STRINGVAR() { return getToken(GramParser.STRINGVAR, 0); }
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
		enterRule(_localctx, 54, RULE_initValStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==NUMBERVAR || _la==STRINGVAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(283);
			match(VARNAME);
			setState(284);
			match(ASSIGNOP);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(285);
				argument();
				}
				break;
			case 2:
				{
				{
				setState(286);
				numberArgument();
				setState(287);
				match(MATHOP);
				setState(288);
				numberArgument();
				}
				}
				break;
			case 3:
				{
				setState(290);
				match(VARNAME);
				setState(291);
				sizeFun();
				}
				break;
			}
			setState(294);
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
		enterRule(_localctx, 56, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			numberArgument();
			setState(297);
			match(EXPRESSIONOP);
			setState(298);
			numberArgument();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDOP) {
				{
				{
				setState(299);
				match(ANDOP);
				setState(300);
				numberArgument();
				setState(301);
				match(EXPRESSIONOP);
				setState(302);
				numberArgument();
				}
				}
				setState(308);
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
		enterRule(_localctx, 58, RULE_textArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 60, RULE_numberArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		public TerminalNode VARNAME() { return getToken(GramParser.VARNAME, 0); }
		public TerminalNode TEXT() { return getToken(GramParser.TEXT, 0); }
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
		enterRule(_localctx, 62, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << VARNAME) | (1L << TEXT))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\6\2D\n\2\r\2\16\2E\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\4\3\4\5\4_\n\4\3\5\3\5"+
		"\3\5\6\5d\n\5\r\5\16\5e\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6p\n\6\r\6\16"+
		"\6q\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0094"+
		"\n\n\3\n\6\n\u0097\n\n\r\n\16\n\u0098\3\n\6\n\u009c\n\n\r\n\16\n\u009d"+
		"\5\n\u00a0\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a9\n\13\3\13\3"+
		"\13\3\13\3\f\6\f\u00af\n\f\r\f\16\f\u00b0\3\f\6\f\u00b4\n\f\r\f\16\f\u00b5"+
		"\3\f\6\f\u00b9\n\f\r\f\16\f\u00ba\3\f\3\f\5\f\u00bf\n\f\3\r\3\r\5\r\u00c3"+
		"\n\r\3\16\3\16\3\16\5\16\u00c8\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00f3\n\25\3\25\3\25\3\26\3\26"+
		"\5\26\u00f9\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\5\31\u0107\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0127\n\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u0133\n\36\f\36\16\36\u0136\13\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@\2\6\3\2\36\37\3\2#$\3\2\"#\3\2\"$\2\u0141\2C\3"+
		"\2\2\2\4P\3\2\2\2\6R\3\2\2\2\b`\3\2\2\2\ni\3\2\2\2\fu\3\2\2\2\16\u0080"+
		"\3\2\2\2\20\u0088\3\2\2\2\22\u008e\3\2\2\2\24\u00a3\3\2\2\2\26\u00be\3"+
		"\2\2\2\30\u00c2\3\2\2\2\32\u00c4\3\2\2\2\34\u00cb\3\2\2\2\36\u00d2\3\2"+
		"\2\2 \u00d4\3\2\2\2\"\u00dc\3\2\2\2$\u00e2\3\2\2\2&\u00e8\3\2\2\2(\u00ed"+
		"\3\2\2\2*\u00f8\3\2\2\2,\u00fa\3\2\2\2.\u00ff\3\2\2\2\60\u0106\3\2\2\2"+
		"\62\u0108\3\2\2\2\64\u0110\3\2\2\2\66\u0116\3\2\2\28\u011c\3\2\2\2:\u012a"+
		"\3\2\2\2<\u0137\3\2\2\2>\u0139\3\2\2\2@\u013b\3\2\2\2BD\5\4\3\2CB\3\2"+
		"\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GQ\5\6\4\2HQ\5\22\n\2IQ\5"+
		"(\25\2JQ\58\35\2KQ\5\f\7\2LQ\5\24\13\2MQ\5\20\t\2NQ\5\16\b\2OQ\5\n\6\2"+
		"PG\3\2\2\2PH\3\2\2\2PI\3\2\2\2PJ\3\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2"+
		"PN\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RS\7\3\2\2ST\7\b\2\2TU\5:\36\2UV\7\t\2"+
		"\2VX\7\6\2\2WY\5\4\3\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2"+
		"\2\2\\^\7\7\2\2]_\5\b\5\2^]\3\2\2\2^_\3\2\2\2_\7\3\2\2\2`a\7\4\2\2ac\7"+
		"\6\2\2bd\5\4\3\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7"+
		"\7\2\2h\t\3\2\2\2ij\7\5\2\2jk\7\b\2\2kl\5:\36\2lm\7\t\2\2mo\7\6\2\2np"+
		"\5\4\3\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\7\2\2t"+
		"\13\3\2\2\2uv\7#\2\2v|\7\f\2\2wx\5> \2xy\7\16\2\2yz\5> \2z}\3\2\2\2{}"+
		"\5@!\2|w\3\2\2\2|{\3\2\2\2}~\3\2\2\2~\177\7\23\2\2\177\r\3\2\2\2\u0080"+
		"\u0081\7\27\2\2\u0081\u0082\7\b\2\2\u0082\u0083\7#\2\2\u0083\u0084\7\22"+
		"\2\2\u0084\u0085\5<\37\2\u0085\u0086\7\t\2\2\u0086\u0087\7\23\2\2\u0087"+
		"\17\3\2\2\2\u0088\u0089\7\31\2\2\u0089\u008a\7\b\2\2\u008a\u008b\5<\37"+
		"\2\u008b\u008c\7\t\2\2\u008c\u008d\7\23\2\2\u008d\21\3\2\2\2\u008e\u008f"+
		"\7 \2\2\u008f\u0090\7#\2\2\u0090\u0093\7\f\2\2\u0091\u0094\5\30\r\2\u0092"+
		"\u0094\7#\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u009f\3\2"+
		"\2\2\u0095\u0097\5$\23\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a0\3\2\2\2\u009a\u009c\5\36"+
		"\20\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u009b\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\23\2\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a8\7#\2\2\u00a4\u00a5\7\n\2\2\u00a5\u00a6\5> \2\u00a6"+
		"\u00a7\7\13\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a9\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\5\26\f\2\u00ab\u00ac\7\23\2\2\u00ac"+
		"\25\3\2\2\2\u00ad\u00af\5$\23\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00bf\3\2\2\2\u00b2\u00b4"+
		"\5\36\20\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00bf\3\2\2\2\u00b7\u00b9\5\60\31\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bf\3\2\2\2\u00bc\u00bf\5\66\34\2\u00bd\u00bf\5&\24\2\u00be\u00ae\3"+
		"\2\2\2\u00be\u00b3\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\27\3\2\2\2\u00c0\u00c3\5\32\16\2\u00c1\u00c3\5\34"+
		"\17\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c5"+
		"\7\32\2\2\u00c5\u00c7\7\b\2\2\u00c6\u00c8\7#\2\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\t\2\2\u00ca\33\3\2\2"+
		"\2\u00cb\u00cc\7\30\2\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce\5<\37\2\u00ce"+
		"\u00cf\7\t\2\2\u00cf\35\3\2\2\2\u00d0\u00d3\5 \21\2\u00d1\u00d3\5\"\22"+
		"\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\37\3\2\2\2\u00d4\u00d5"+
		"\7\21\2\2\u00d5\u00d6\7\34\2\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\5<\37\2"+
		"\u00d8\u00d9\7\22\2\2\u00d9\u00da\5@!\2\u00da\u00db\7\t\2\2\u00db!\3\2"+
		"\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00de\7\35\2\2\u00de\u00df\7\b\2\2\u00df"+
		"\u00e0\5<\37\2\u00e0\u00e1\7\t\2\2\u00e1#\3\2\2\2\u00e2\u00e3\7\21\2\2"+
		"\u00e3\u00e4\7\20\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\7#\2\2\u00e6\u00e7"+
		"\7\t\2\2\u00e7%\3\2\2\2\u00e8\u00e9\7\21\2\2\u00e9\u00ea\7\33\2\2\u00ea"+
		"\u00eb\7\b\2\2\u00eb\u00ec\7\t\2\2\u00ec\'\3\2\2\2\u00ed\u00ee\7!\2\2"+
		"\u00ee\u00ef\7#\2\2\u00ef\u00f0\7\f\2\2\u00f0\u00f2\5*\26\2\u00f1\u00f3"+
		"\5\62\32\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2"+
		"\u00f4\u00f5\7\23\2\2\u00f5)\3\2\2\2\u00f6\u00f9\5,\27\2\u00f7\u00f9\5"+
		".\30\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9+\3\2\2\2\u00fa\u00fb"+
		"\7\32\2\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\5<\37\2\u00fd\u00fe\7\t\2\2"+
		"\u00fe-\3\2\2\2\u00ff\u0100\7#\2\2\u0100\u0101\7\n\2\2\u0101\u0102\5>"+
		" \2\u0102\u0103\7\13\2\2\u0103/\3\2\2\2\u0104\u0107\5\62\32\2\u0105\u0107"+
		"\5\64\33\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\61\3\2\2\2\u0108"+
		"\u0109\7\21\2\2\u0109\u010a\7\25\2\2\u010a\u010b\7\b\2\2\u010b\u010c\5"+
		"<\37\2\u010c\u010d\7\22\2\2\u010d\u010e\5@!\2\u010e\u010f\7\t\2\2\u010f"+
		"\63\3\2\2\2\u0110\u0111\7\21\2\2\u0111\u0112\7\26\2\2\u0112\u0113\7\b"+
		"\2\2\u0113\u0114\5<\37\2\u0114\u0115\7\t\2\2\u0115\65\3\2\2\2\u0116\u0117"+
		"\7\21\2\2\u0117\u0118\7\24\2\2\u0118\u0119\7\b\2\2\u0119\u011a\5<\37\2"+
		"\u011a\u011b\7\t\2\2\u011b\67\3\2\2\2\u011c\u011d\t\2\2\2\u011d\u011e"+
		"\7#\2\2\u011e\u0126\7\f\2\2\u011f\u0127\5@!\2\u0120\u0121\5> \2\u0121"+
		"\u0122\7\16\2\2\u0122\u0123\5> \2\u0123\u0127\3\2\2\2\u0124\u0125\7#\2"+
		"\2\u0125\u0127\5&\24\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\23\2\2\u01299\3\2\2\2\u012a"+
		"\u012b\5> \2\u012b\u012c\7\r\2\2\u012c\u0134\5> \2\u012d\u012e\7\17\2"+
		"\2\u012e\u012f\5> \2\u012f\u0130\7\r\2\2\u0130\u0131\5> \2\u0131\u0133"+
		"\3\2\2\2\u0132\u012d\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135;\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\t\3\2\2"+
		"\u0138=\3\2\2\2\u0139\u013a\t\4\2\2\u013a?\3\2\2\2\u013b\u013c\t\5\2\2"+
		"\u013cA\3\2\2\2\32EPZ^eq|\u0093\u0098\u009d\u009f\u00a8\u00b0\u00b5\u00ba"+
		"\u00be\u00c2\u00c7\u00d2\u00f2\u00f8\u0106\u0126\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}