// Generated from EasyLang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EasyLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T_END_LINE=14, T_INTEGER=15, T_STRING=16, 
		T_BOOL=17, T_IF_CLAUSE=18, T_ELSE_CLAUSE=19, T_UNTIL_CLAUSE=20, T_AND=21, 
		T_OR=22, T_NOT=23, T_FUNCTION=24, T_RETURN=25, T_PRINT=26, T_START=27, 
		T_COMMENT=28, T_INTEGER_VAL=29, T_BOOL_TRUE=30, T_BOOL_FALSE=31, T_STRING_VAL=32, 
		T_ID=33, T_WHITESPACE=34, T_ASTERISK=35, T_SLASH=36, T_PLUS=37, T_MINUS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T_END_LINE", "T_INTEGER", "T_STRING", 
		"T_BOOL", "T_IF_CLAUSE", "T_ELSE_CLAUSE", "T_UNTIL_CLAUSE", "T_AND", "T_OR", 
		"T_NOT", "T_FUNCTION", "T_RETURN", "T_PRINT", "T_START", "T_COMMENT", 
		"T_INTEGER_VAL", "T_BOOL_TRUE", "T_BOOL_FALSE", "T_STRING_VAL", "T_ID", 
		"T_WHITESPACE", "T_ASTERISK", "T_SLASH", "T_PLUS", "T_MINUS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'()'", "'{'", "'}'", "'='", "','", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'!='", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "T_END_LINE", "T_INTEGER", "T_STRING", "T_BOOL", "T_IF_CLAUSE", 
		"T_ELSE_CLAUSE", "T_UNTIL_CLAUSE", "T_AND", "T_OR", "T_NOT", "T_FUNCTION", 
		"T_RETURN", "T_PRINT", "T_START", "T_COMMENT", "T_INTEGER_VAL", "T_BOOL_TRUE", 
		"T_BOOL_FALSE", "T_STRING_VAL", "T_ID", "T_WHITESPACE", "T_ASTERISK", 
		"T_SLASH", "T_PLUS", "T_MINUS"
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


	public EasyLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EasyLang.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0125\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0083\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00a0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b6\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00d8\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u00e9\n\35\f\35\16\35\u00ec\13"+
		"\35\3\35\3\35\3\36\5\36\u00f1\n\36\3\36\6\36\u00f4\n\36\r\36\16\36\u00f5"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0109"+
		"\n \3!\3!\6!\u010d\n!\r!\16!\u010e\3!\3!\3\"\3\"\7\"\u0115\n\"\f\"\16"+
		"\"\u0118\13\"\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\2\2(\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(\3\2\b\22\2\13\f\"\"\62;==C\\aac|\u00f5\u00f5\u0107\u0107\u0109"+
		"\u0109\u011b\u011b\u0144\u0144\u0146\u0146\u015d\u015d\u017c\u017c\u017e"+
		"\u017e\3\2//\3\2\62;\16\2C\\aac|\u00f5\u00f5\u0107\u0107\u0109\u0109\u011b"+
		"\u011b\u0144\u0144\u0146\u0146\u015d\u015d\u017c\u017c\u017e\u017e\17"+
		"\2\62;C\\aac|\u00f5\u00f5\u0107\u0107\u0109\u0109\u011b\u011b\u0144\u0144"+
		"\u0146\u0146\u015d\u015d\u017c\u017c\u017e\u017e\4\2\13\f\"\"\2\u012e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\t"+
		"V\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2"+
		"\25b\3\2\2\2\27e\3\2\2\2\31h\3\2\2\2\33k\3\2\2\2\35n\3\2\2\2\37\u0082"+
		"\3\2\2\2!\u0084\3\2\2\2#\u008a\3\2\2\2%\u009f\3\2\2\2\'\u00a1\3\2\2\2"+
		")\u00b5\3\2\2\2+\u00b7\3\2\2\2-\u00bc\3\2\2\2/\u00c1\3\2\2\2\61\u00c5"+
		"\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9\3\2\2\2\67\u00e0\3\2\2\29\u00e6\3\2"+
		"\2\2;\u00f0\3\2\2\2=\u00f7\3\2\2\2?\u0108\3\2\2\2A\u010a\3\2\2\2C\u0112"+
		"\3\2\2\2E\u0119\3\2\2\2G\u011d\3\2\2\2I\u011f\3\2\2\2K\u0121\3\2\2\2M"+
		"\u0123\3\2\2\2OP\7*\2\2P\4\3\2\2\2QR\7+\2\2R\6\3\2\2\2ST\7*\2\2TU\7+\2"+
		"\2U\b\3\2\2\2VW\7}\2\2W\n\3\2\2\2XY\7\177\2\2Y\f\3\2\2\2Z[\7?\2\2[\16"+
		"\3\2\2\2\\]\7.\2\2]\20\3\2\2\2^_\7@\2\2_\22\3\2\2\2`a\7>\2\2a\24\3\2\2"+
		"\2bc\7@\2\2cd\7?\2\2d\26\3\2\2\2ef\7>\2\2fg\7?\2\2g\30\3\2\2\2hi\7?\2"+
		"\2ij\7?\2\2j\32\3\2\2\2kl\7#\2\2lm\7?\2\2m\34\3\2\2\2no\7\60\2\2o\36\3"+
		"\2\2\2pq\7e\2\2qr\7c\2\2rs\7n\2\2st\7m\2\2tu\7q\2\2uv\7y\2\2vw\7k\2\2"+
		"wx\7v\2\2x\u0083\7{\2\2yz\7e\2\2z{\7c\2\2{|\7\u0144\2\2|}\7m\2\2}~\7q"+
		"\2\2~\177\7y\2\2\177\u0080\7k\2\2\u0080\u0081\7v\2\2\u0081\u0083\7{\2"+
		"\2\u0082p\3\2\2\2\u0082y\3\2\2\2\u0083 \3\2\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7r\2\2\u0087\u0088\7k\2\2\u0088\u0089\7u\2\2"+
		"\u0089\"\3\2\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2\u008c\u008d\7i"+
		"\2\2\u008d\u008e\7k\2\2\u008e\u008f\7e\2\2\u008f\u0090\7|\2\2\u0090\u0091"+
		"\7p\2\2\u0091\u0092\7{\2\2\u0092$\3\2\2\2\u0093\u0094\7l\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7\u017e\2\2\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2"+
		"\u0098\u00a0\7k\2\2\u0099\u009a\7l\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7|\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u00a0\7k\2\2\u009f"+
		"\u0093\3\2\2\2\u009f\u0099\3\2\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7p\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7|\2\2"+
		"\u00a6\u00a7\7g\2\2\u00a7\u00a8\7l\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7f\2"+
		"\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7\u00f5\2\2\u00ad"+
		"\u00ae\7m\2\2\u00ae\u00b6\7k\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7q\2\2"+
		"\u00b1\u00b2\7r\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7m\2\2\u00b4\u00b6"+
		"\7k\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00af\3\2\2\2\u00b6*\3\2\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7|\2\2\u00bb"+
		",\3\2\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7d\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\7p\2\2\u00c8\u00c9\7m\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7l\2\2"+
		"\u00cb\u00cc\7c\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\7|\2\2\u00ce\u00cf\7"+
		"y\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7\u00f5\2\2\u00d1\u00d8\7\u0109\2"+
		"\2\u00d2\u00d3\7|\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6"+
		"\7q\2\2\u00d6\u00d8\7e\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8"+
		"\64\3\2\2\2\u00d9\u00da\7y\2\2\u00da\u00db\7{\2\2\u00db\u00dc\7r\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7|\2\2\u00df\66\3\2\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7t\2\2"+
		"\u00e4\u00e5\7v\2\2\u00e58\3\2\2\2\u00e6\u00ea\7%\2\2\u00e7\u00e9\t\2"+
		"\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7%"+
		"\2\2\u00ee:\3\2\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\t\4\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6<\3\2\2\2"+
		"\u00f7\u00f8\7r\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb"+
		"\7y\2\2\u00fb\u00fc\7f\2\2\u00fc\u00fd\7c\2\2\u00fd>\3\2\2\2\u00fe\u00ff"+
		"\7h\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7\u0144\2\2\u0101\u0102\7u\2\2"+
		"\u0102\u0109\7|\2\2\u0103\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105\u0106"+
		"\7n\2\2\u0106\u0107\7u\2\2\u0107\u0109\7|\2\2\u0108\u00fe\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0109@\3\2\2\2\u010a\u010c\7$\2\2\u010b\u010d\t\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7$\2\2\u0111B\3\2\2\2\u0112\u0116"+
		"\t\5\2\2\u0113\u0115\t\6\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117D\3\2\2\2\u0118\u0116\3\2\2\2"+
		"\u0119\u011a\t\7\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b#\2\2\u011cF\3\2"+
		"\2\2\u011d\u011e\7,\2\2\u011eH\3\2\2\2\u011f\u0120\7\61\2\2\u0120J\3\2"+
		"\2\2\u0121\u0122\7-\2\2\u0122L\3\2\2\2\u0123\u0124\7/\2\2\u0124N\3\2\2"+
		"\2\r\2\u0082\u009f\u00b5\u00d7\u00ea\u00f0\u00f5\u0108\u010e\u0116\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}