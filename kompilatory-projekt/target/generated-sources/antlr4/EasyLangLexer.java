// Generated from EasyLang.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T_END_LINE=18, T_INTEGER=19, T_STRING=20, T_BOOL=21, T_IF_CLAUSE=22, T_ELSE_CLAUSE=23, 
		T_UNTIL_CLAUSE=24, T_AND=25, T_OR=26, T_NOT=27, T_FUNCTION=28, T_RETURN=29, 
		T_PRINT=30, T_START=31, T_COMMENT=32, T_INTEGER_VAL=33, T_BOOL_TRUE=34, 
		T_BOOL_FALSE=35, T_STRING_VAL=36, T_ID=37, T_WHITESPACE=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T_END_LINE", "T_INTEGER", "T_STRING", "T_BOOL", "T_IF_CLAUSE", "T_ELSE_CLAUSE", 
		"T_UNTIL_CLAUSE", "T_AND", "T_OR", "T_NOT", "T_FUNCTION", "T_RETURN", 
		"T_PRINT", "T_START", "T_COMMENT", "T_INTEGER_VAL", "T_BOOL_TRUE", "T_BOOL_FALSE", 
		"T_STRING_VAL", "T_ID", "T_WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'()'", "'{'", "'}'", "'='", "'*'", "'/'", "'+'", 
		"'-'", "','", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "T_END_LINE", "T_INTEGER", "T_STRING", 
		"T_BOOL", "T_IF_CLAUSE", "T_ELSE_CLAUSE", "T_UNTIL_CLAUSE", "T_AND", "T_OR", 
		"T_NOT", "T_FUNCTION", "T_RETURN", "T_PRINT", "T_START", "T_COMMENT", 
		"T_INTEGER_VAL", "T_BOOL_TRUE", "T_BOOL_FALSE", "T_STRING_VAL", "T_ID", 
		"T_WHITESPACE"
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
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u008b\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00a8\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00be\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00e0\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\7!\u00f1\n"+
		"!\f!\16!\u00f4\13!\3!\3!\3\"\5\"\u00f9\n\"\3\"\6\"\u00fc\n\"\r\"\16\""+
		"\u00fd\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0111\n$"+
		"\3%\3%\6%\u0115\n%\r%\16%\u0116\3%\3%\3&\3&\7&\u011d\n&\f&\16&\u0120\13"+
		"&\3\'\3\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\b\22\2\13\f\"\"\62;==C\\"+
		"aac|\u00f5\u00f5\u0107\u0107\u0109\u0109\u011b\u011b\u0144\u0144\u0146"+
		"\u0146\u015d\u015d\u017c\u017c\u017e\u017e\3\2//\3\2\62;\16\2C\\aac|\u00f5"+
		"\u00f5\u0107\u0107\u0109\u0109\u011b\u011b\u0144\u0144\u0146\u0146\u015d"+
		"\u015d\u017c\u017c\u017e\u017e\17\2\62;C\\aac|\u00f5\u00f5\u0107\u0107"+
		"\u0109\u0109\u011b\u011b\u0144\u0144\u0146\u0146\u015d\u015d\u017c\u017c"+
		"\u017e\u017e\4\2\13\f\"\"\2\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3"+
		"O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\"+
		"\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33"+
		"h\3\2\2\2\35j\3\2\2\2\37m\3\2\2\2!p\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'\u008a"+
		"\3\2\2\2)\u008c\3\2\2\2+\u0092\3\2\2\2-\u00a7\3\2\2\2/\u00a9\3\2\2\2\61"+
		"\u00bd\3\2\2\2\63\u00bf\3\2\2\2\65\u00c4\3\2\2\2\67\u00c9\3\2\2\29\u00cd"+
		"\3\2\2\2;\u00df\3\2\2\2=\u00e1\3\2\2\2?\u00e8\3\2\2\2A\u00ee\3\2\2\2C"+
		"\u00f8\3\2\2\2E\u00ff\3\2\2\2G\u0110\3\2\2\2I\u0112\3\2\2\2K\u011a\3\2"+
		"\2\2M\u0121\3\2\2\2OP\7*\2\2P\4\3\2\2\2QR\7+\2\2R\6\3\2\2\2ST\7*\2\2T"+
		"U\7+\2\2U\b\3\2\2\2VW\7}\2\2W\n\3\2\2\2XY\7\177\2\2Y\f\3\2\2\2Z[\7?\2"+
		"\2[\16\3\2\2\2\\]\7,\2\2]\20\3\2\2\2^_\7\61\2\2_\22\3\2\2\2`a\7-\2\2a"+
		"\24\3\2\2\2bc\7/\2\2c\26\3\2\2\2de\7.\2\2e\30\3\2\2\2fg\7@\2\2g\32\3\2"+
		"\2\2hi\7>\2\2i\34\3\2\2\2jk\7@\2\2kl\7?\2\2l\36\3\2\2\2mn\7>\2\2no\7?"+
		"\2\2o \3\2\2\2pq\7?\2\2qr\7?\2\2r\"\3\2\2\2st\7#\2\2tu\7?\2\2u$\3\2\2"+
		"\2vw\7\60\2\2w&\3\2\2\2xy\7e\2\2yz\7c\2\2z{\7n\2\2{|\7m\2\2|}\7q\2\2}"+
		"~\7y\2\2~\177\7k\2\2\177\u0080\7v\2\2\u0080\u008b\7{\2\2\u0081\u0082\7"+
		"e\2\2\u0082\u0083\7c\2\2\u0083\u0084\7\u0144\2\2\u0084\u0085\7m\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7y\2\2\u0087\u0088\7k\2\2\u0088\u0089\7v\2\2"+
		"\u0089\u008b\7{\2\2\u008ax\3\2\2\2\u008a\u0081\3\2\2\2\u008b(\3\2\2\2"+
		"\u008c\u008d\7p\2\2\u008d\u008e\7c\2\2\u008e\u008f\7r\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7u\2\2\u0091*\3\2\2\2\u0092\u0093\7n\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7i\2\2\u0095\u0096\7k\2\2\u0096\u0097\7e\2\2\u0097"+
		"\u0098\7|\2\2\u0098\u0099\7p\2\2\u0099\u009a\7{\2\2\u009a,\3\2\2\2\u009b"+
		"\u009c\7l\2\2\u009c\u009d\7g\2\2\u009d\u009e\7\u017e\2\2\u009e\u009f\7"+
		"g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a8\7k\2\2\u00a1\u00a2\7l\2\2\u00a2\u00a3"+
		"\7g\2\2\u00a3\u00a4\7|\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7n\2\2\u00a6"+
		"\u00a8\7k\2\2\u00a7\u009b\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8.\3\2\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7e\2\2"+
		"\u00ad\u00ae\7|\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7l\2\2\u00b0\60\3\2"+
		"\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5"+
		"\7\u00f5\2\2\u00b5\u00b6\7m\2\2\u00b6\u00be\7k\2\2\u00b7\u00b8\7f\2\2"+
		"\u00b8\u00b9\7q\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7m\2\2\u00bc\u00be\7k\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b7\3\2\2\2\u00be"+
		"\62\3\2\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7|\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7d\2\2\u00c7\u00c8\7q\2\2\u00c8\66\3\2\2\2\u00c9\u00ca\7p\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7g\2\2\u00cc8\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce"+
		"\u00cf\7w\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7m\2\2\u00d1\u00d2\7e\2\2"+
		"\u00d2\u00d3\7l\2\2\u00d3\u00d4\7c\2\2\u00d4:\3\2\2\2\u00d5\u00d6\7|\2"+
		"\2\u00d6\u00d7\7y\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7\u00f5\2\2\u00d9"+
		"\u00e0\7\u0109\2\2\u00da\u00db\7|\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7"+
		"t\2\2\u00dd\u00de\7q\2\2\u00de\u00e0\7e\2\2\u00df\u00d5\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7{\2\2\u00e3"+
		"\u00e4\7r\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7|\2\2"+
		"\u00e7>\3\2\2\2\u00e8\u00e9\7u\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7c\2"+
		"\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7v\2\2\u00ed@\3\2\2\2\u00ee\u00f2\7"+
		"%\2\2\u00ef\u00f1\t\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f6\7%\2\2\u00f6B\3\2\2\2\u00f7\u00f9\t\3\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00fc\t\4\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00feD\3\2\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7t\2\2\u0101\u0102"+
		"\7c\2\2\u0102\u0103\7y\2\2\u0103\u0104\7f\2\2\u0104\u0105\7c\2\2\u0105"+
		"F\3\2\2\2\u0106\u0107\7h\2\2\u0107\u0108\7c\2\2\u0108\u0109\7\u0144\2"+
		"\2\u0109\u010a\7u\2\2\u010a\u0111\7|\2\2\u010b\u010c\7h\2\2\u010c\u010d"+
		"\7c\2\2\u010d\u010e\7n\2\2\u010e\u010f\7u\2\2\u010f\u0111\7|\2\2\u0110"+
		"\u0106\3\2\2\2\u0110\u010b\3\2\2\2\u0111H\3\2\2\2\u0112\u0114\7$\2\2\u0113"+
		"\u0115\t\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7$\2\2\u0119"+
		"J\3\2\2\2\u011a\u011e\t\5\2\2\u011b\u011d\t\6\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fL\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\t\7\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\b\'\2\2\u0124N\3\2\2\2\r\2\u008a\u00a7\u00bd\u00df\u00f2\u00f8"+
		"\u00fd\u0110\u0116\u011e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}