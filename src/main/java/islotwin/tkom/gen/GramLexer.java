package islotwin.tkom.gen;// Generated from /Users/iga/Desktop/STUDIA/SEM6/TKOM/extra/Gram.g4 by ANTLR 4.7

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IF", "ELSE", "WHILE", "STARTCBRACKET", "ENDCBRACKET", "STARTNBRACKET", 
		"ENDNBRACKET", "STARTSBRACKET", "ENDSBRACKET", "ASSIGNOP", "EXPRESSIONOP", 
		"MATHOP", "ANDOP", "MODLISTOP", "EXOP", "COMMA", "SEMICOLON", "GETATTR", 
		"SETATTR", "DELETEATTR", "SAVE", "READ", "PRINT", "CREATE", "SIZE", "FILTERBYATTR", 
		"FILTERBYTAG", "NUMBERVAR", "STRINGVAR", "LISTVAR", "ELEMVAR", "NUMBER", 
		"VARNAME", "TEXT", "WHITESPACE"
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


	public GramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 34:
			WHITESPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\5\16w\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0082\n"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\5!\u00f1\n!\3!\3!\7!\u00f5"+
		"\n!\f!\16!\u00f8\13!\5!\u00fa\n!\3\"\3\"\3\"\7\"\u00ff\n\"\f\"\16\"\u0102"+
		"\13\"\3#\3#\6#\u0106\n#\r#\16#\u0107\3#\3#\3$\3$\3$\3\u0107\2%\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%\3\2\b\4\2>>@@\5\2,-//\61\61\3\2\63;\3\2\62;\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u0119\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5L\3\2\2\2\7Q\3\2\2\2\tW\3\2\2\2\13Y\3\2"+
		"\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27n\3"+
		"\2\2\2\31p\3\2\2\2\33v\3\2\2\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0085"+
		"\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u0091\3\2\2\2)\u0099\3\2\2\2"+
		"+\u00a4\3\2\2\2-\u00a9\3\2\2\2/\u00ae\3\2\2\2\61\u00b4\3\2\2\2\63\u00bb"+
		"\3\2\2\2\65\u00c0\3\2\2\2\67\u00cd\3\2\2\29\u00d9\3\2\2\2;\u00dd\3\2\2"+
		"\2=\u00e4\3\2\2\2?\u00e9\3\2\2\2A\u00f9\3\2\2\2C\u00fb\3\2\2\2E\u0103"+
		"\3\2\2\2G\u010b\3\2\2\2IJ\7k\2\2JK\7h\2\2K\4\3\2\2\2LM\7g\2\2MN\7n\2\2"+
		"NO\7u\2\2OP\7g\2\2P\6\3\2\2\2QR\7y\2\2RS\7j\2\2ST\7k\2\2TU\7n\2\2UV\7"+
		"g\2\2V\b\3\2\2\2WX\7}\2\2X\n\3\2\2\2YZ\7\177\2\2Z\f\3\2\2\2[\\\7*\2\2"+
		"\\\16\3\2\2\2]^\7+\2\2^\20\3\2\2\2_`\7]\2\2`\22\3\2\2\2ab\7_\2\2b\24\3"+
		"\2\2\2cd\7?\2\2d\26\3\2\2\2eo\t\2\2\2fg\7>\2\2go\7?\2\2hi\7@\2\2io\7?"+
		"\2\2jk\7?\2\2ko\7?\2\2lm\7#\2\2mo\7?\2\2ne\3\2\2\2nf\3\2\2\2nh\3\2\2\2"+
		"nj\3\2\2\2nl\3\2\2\2o\30\3\2\2\2pq\t\3\2\2q\32\3\2\2\2rs\7(\2\2sw\7(\2"+
		"\2tu\7~\2\2uw\7~\2\2vr\3\2\2\2vt\3\2\2\2w\34\3\2\2\2xy\7c\2\2yz\7f\2\2"+
		"z\u0082\7f\2\2{|\7t\2\2|}\7g\2\2}~\7o\2\2~\177\7q\2\2\177\u0080\7x\2\2"+
		"\u0080\u0082\7g\2\2\u0081x\3\2\2\2\u0081{\3\2\2\2\u0082\36\3\2\2\2\u0083"+
		"\u0084\7\60\2\2\u0084 \3\2\2\2\u0085\u0086\7.\2\2\u0086\"\3\2\2\2\u0087"+
		"\u0088\7=\2\2\u0088$\3\2\2\2\u0089\u008a\7i\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\7v\2\2\u008c\u008d\7C\2\2\u008d\u008e\7v\2\2\u008e\u008f\7v\2\2"+
		"\u008f\u0090\7t\2\2\u0090&\3\2\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2"+
		"\2\u0093\u0094\7v\2\2\u0094\u0095\7C\2\2\u0095\u0096\7v\2\2\u0096\u0097"+
		"\7v\2\2\u0097\u0098\7t\2\2\u0098(\3\2\2\2\u0099\u009a\7f\2\2\u009a\u009b"+
		"\7g\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d\u009e\7v\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7v\2\2"+
		"\u00a2\u00a3\7t\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7c\2"+
		"\2\u00a6\u00a7\7x\2\2\u00a7\u00a8\7g\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7"+
		"t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7f\2\2\u00ad."+
		"\3\2\2\2\u00ae\u00af\7r\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7v\2\2"+
		"\u00b9\u00ba\7g\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7"+
		"k\2\2\u00bd\u00be\7|\2\2\u00be\u00bf\7g\2\2\u00bf\64\3\2\2\2\u00c0\u00c1"+
		"\7h\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7D\2\2\u00c7\u00c8\7{\2\2"+
		"\u00c8\u00c9\7C\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d3"+
		"\u00d4\7D\2\2\u00d4\u00d5\7{\2\2\u00d5\u00d6\7V\2\2\u00d6\u00d7\7c\2\2"+
		"\u00d7\u00d8\7i\2\2\u00d88\3\2\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7w\2"+
		"\2\u00db\u00dc\7o\2\2\u00dc:\3\2\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7"+
		"v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3"+
		"\7i\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7"+
		"\7u\2\2\u00e7\u00e8\7v\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7o\2\2\u00ed@\3\2\2\2\u00ee\u00fa"+
		"\7\62\2\2\u00ef\u00f1\7/\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f6\t\4\2\2\u00f3\u00f5\t\5\2\2\u00f4\u00f3\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f0\3\2"+
		"\2\2\u00faB\3\2\2\2\u00fb\u0100\t\6\2\2\u00fc\u00ff\t\6\2\2\u00fd\u00ff"+
		"\5A!\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101D\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0103\u0105\7$\2\2\u0104\u0106\13\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\7$\2\2\u010aF\3\2\2\2\u010b\u010c\t\7\2\2\u010c\u010d\b$\2\2\u010d"+
		"H\3\2\2\2\f\2nv\u0081\u00f0\u00f6\u00f9\u00fe\u0100\u0107\3\3$\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}