// Generated from JsonPath.g4 by ANTLR 4.9.1

package org.jsfr.json.compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, ANY_INDEX=21, OPEN_SQ_BRACKET=22, CLOSE_SQ_BRACKET=23, 
		TO=24, COMMA=25, COLON=26, NegationOperator=27, AndOperator=28, OrOperator=29, 
		NUM=30, QUOTED_STRING=31, REGEX=32, BOOL=33, NE=34, KEY=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "ANY_INDEX", "OPEN_SQ_BRACKET", "CLOSE_SQ_BRACKET", 
			"TO", "COMMA", "COLON", "NegationOperator", "AndOperator", "OrOperator", 
			"NUM", "QUOTED_STRING", "REGEX", "BOOL", "NE", "KEY", "INT", "EXP", "ESC", 
			"UNICODE", "HEX", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$'", "'lax'", "'LAX'", "'strict'", "'STRICT'", "'..'", "'.*'", 
			"'*'", "'.'", "'[?('", "')]'", "'('", "')'", "'@'", "'>'", "'>='", "'<'", 
			"'<='", "'=='", "'=~'", "'[*]'", "'['", "']'", "'to'", "','", "':'", 
			"'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "ANY_INDEX", "OPEN_SQ_BRACKET", 
			"CLOSE_SQ_BRACKET", "TO", "COMMA", "COLON", "NegationOperator", "AndOperator", 
			"OrOperator", "NUM", "QUOTED_STRING", "REGEX", "BOOL", "NE", "KEY", "WS"
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


	public JsonPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonPath.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0125\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\5\37\u00ad\n\37\3\37\3\37\3\37"+
		"\6\37\u00b2\n\37\r\37\16\37\u00b3\3\37\5\37\u00b7\n\37\3\37\5\37\u00ba"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u00c0\n\37\3\37\5\37\u00c3\n\37\3 \3 \3"+
		" \3 \7 \u00c9\n \f \16 \u00cc\13 \3 \3 \3 \3 \3 \7 \u00d3\n \f \16 \u00d6"+
		"\13 \3 \5 \u00d9\n \3!\3!\3!\3!\7!\u00df\n!\f!\16!\u00e2\13!\3!\3!\7!"+
		"\u00e6\n!\f!\16!\u00e9\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00f4"+
		"\n\"\3#\3#\3#\3#\5#\u00fa\n#\3$\3$\6$\u00fe\n$\r$\16$\u00ff\3%\3%\3%\7"+
		"%\u0105\n%\f%\16%\u0108\13%\5%\u010a\n%\3&\3&\5&\u010e\n&\3&\3&\3\'\3"+
		"\'\3\'\5\'\u0115\n\'\3(\3(\3(\3(\3(\3(\3)\3)\3*\6*\u0120\n*\r*\16*\u0121"+
		"\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I\2K\2M\2O\2Q\2S&\3\2\16\3\2\62;\4\2))^^\4\2$"+
		"$^^\4\2\61\61^^\t\2WWffkkoouuwwzz\f\2\13\f\17\17\"$(,..\60\60<<>B]_~~"+
		"\3\2\63;\4\2GGgg\4\2--//\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\13\f"+
		"\17\17\"\"\2\u0137\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7[\3\2\2\2\t_\3\2"+
		"\2\2\13f\3\2\2\2\rm\3\2\2\2\17p\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3"+
		"\2\2\2\27{\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0084"+
		"\3\2\2\2!\u0086\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u008e\3\2\2\2"+
		")\u0091\3\2\2\2+\u0094\3\2\2\2-\u0098\3\2\2\2/\u009a\3\2\2\2\61\u009c"+
		"\3\2\2\2\63\u009f\3\2\2\2\65\u00a1\3\2\2\2\67\u00a3\3\2\2\29\u00a5\3\2"+
		"\2\2;\u00a8\3\2\2\2=\u00c2\3\2\2\2?\u00d8\3\2\2\2A\u00da\3\2\2\2C\u00f3"+
		"\3\2\2\2E\u00f9\3\2\2\2G\u00fd\3\2\2\2I\u0109\3\2\2\2K\u010b\3\2\2\2M"+
		"\u0111\3\2\2\2O\u0116\3\2\2\2Q\u011c\3\2\2\2S\u011f\3\2\2\2UV\7&\2\2V"+
		"\4\3\2\2\2WX\7n\2\2XY\7c\2\2YZ\7z\2\2Z\6\3\2\2\2[\\\7N\2\2\\]\7C\2\2]"+
		"^\7Z\2\2^\b\3\2\2\2_`\7u\2\2`a\7v\2\2ab\7t\2\2bc\7k\2\2cd\7e\2\2de\7v"+
		"\2\2e\n\3\2\2\2fg\7U\2\2gh\7V\2\2hi\7T\2\2ij\7K\2\2jk\7E\2\2kl\7V\2\2"+
		"l\f\3\2\2\2mn\7\60\2\2no\7\60\2\2o\16\3\2\2\2pq\7\60\2\2qr\7,\2\2r\20"+
		"\3\2\2\2st\7,\2\2t\22\3\2\2\2uv\7\60\2\2v\24\3\2\2\2wx\7]\2\2xy\7A\2\2"+
		"yz\7*\2\2z\26\3\2\2\2{|\7+\2\2|}\7_\2\2}\30\3\2\2\2~\177\7*\2\2\177\32"+
		"\3\2\2\2\u0080\u0081\7+\2\2\u0081\34\3\2\2\2\u0082\u0083\7B\2\2\u0083"+
		"\36\3\2\2\2\u0084\u0085\7@\2\2\u0085 \3\2\2\2\u0086\u0087\7@\2\2\u0087"+
		"\u0088\7?\2\2\u0088\"\3\2\2\2\u0089\u008a\7>\2\2\u008a$\3\2\2\2\u008b"+
		"\u008c\7>\2\2\u008c\u008d\7?\2\2\u008d&\3\2\2\2\u008e\u008f\7?\2\2\u008f"+
		"\u0090\7?\2\2\u0090(\3\2\2\2\u0091\u0092\7?\2\2\u0092\u0093\7\u0080\2"+
		"\2\u0093*\3\2\2\2\u0094\u0095\7]\2\2\u0095\u0096\7,\2\2\u0096\u0097\7"+
		"_\2\2\u0097,\3\2\2\2\u0098\u0099\7]\2\2\u0099.\3\2\2\2\u009a\u009b\7_"+
		"\2\2\u009b\60\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e\7q\2\2\u009e\62\3"+
		"\2\2\2\u009f\u00a0\7.\2\2\u00a0\64\3\2\2\2\u00a1\u00a2\7<\2\2\u00a2\66"+
		"\3\2\2\2\u00a3\u00a4\7#\2\2\u00a48\3\2\2\2\u00a5\u00a6\7(\2\2\u00a6\u00a7"+
		"\7(\2\2\u00a7:\3\2\2\2\u00a8\u00a9\7~\2\2\u00a9\u00aa\7~\2\2\u00aa<\3"+
		"\2\2\2\u00ab\u00ad\7/\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00af\5I%\2\u00af\u00b1\7\60\2\2\u00b0\u00b2\t\2"+
		"\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5K&\2\u00b6\u00b5\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00c3\3\2\2\2\u00b8\u00ba\7/\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5I%\2\u00bc"+
		"\u00bd\5K&\2\u00bd\u00c3\3\2\2\2\u00be\u00c0\7/\2\2\u00bf\u00be\3\2\2"+
		"\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\5I%\2\u00c2\u00ac"+
		"\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3>\3\2\2\2\u00c4"+
		"\u00ca\7)\2\2\u00c5\u00c9\n\3\2\2\u00c6\u00c7\7^\2\2\u00c7\u00c9\13\2"+
		"\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00d9\7)\2\2\u00ce\u00d4\7$\2\2\u00cf\u00d3\n\4\2\2\u00d0\u00d1"+
		"\7^\2\2\u00d1\u00d3\13\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7$\2\2\u00d8\u00c4\3\2\2\2\u00d8"+
		"\u00ce\3\2\2\2\u00d9@\3\2\2\2\u00da\u00e0\7\61\2\2\u00db\u00df\n\5\2\2"+
		"\u00dc\u00dd\7^\2\2\u00dd\u00df\13\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e7\7\61\2\2\u00e4\u00e6\t"+
		"\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8B\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ec\u00ed\7w\2\2\u00ed\u00f4\7g\2\2\u00ee\u00ef\7h\2\2"+
		"\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f4"+
		"\7g\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4D\3\2\2\2\u00f5\u00f6"+
		"\7>\2\2\u00f6\u00fa\7@\2\2\u00f7\u00f8\7#\2\2\u00f8\u00fa\7?\2\2\u00f9"+
		"\u00f5\3\2\2\2\u00f9\u00f7\3\2\2\2\u00faF\3\2\2\2\u00fb\u00fe\5M\'\2\u00fc"+
		"\u00fe\n\7\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100H\3\2\2\2\u0101\u010a"+
		"\7\62\2\2\u0102\u0106\t\b\2\2\u0103\u0105\t\2\2\2\u0104\u0103\3\2\2\2"+
		"\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010a"+
		"\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0101\3\2\2\2\u0109\u0102\3\2\2\2\u010a"+
		"J\3\2\2\2\u010b\u010d\t\t\2\2\u010c\u010e\t\n\2\2\u010d\u010c\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5I%\2\u0110L\3\2"+
		"\2\2\u0111\u0114\7^\2\2\u0112\u0115\t\13\2\2\u0113\u0115\5O(\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115N\3\2\2\2\u0116\u0117\7w\2\2\u0117\u0118"+
		"\5Q)\2\u0118\u0119\5Q)\2\u0119\u011a\5Q)\2\u011a\u011b\5Q)\2\u011bP\3"+
		"\2\2\2\u011c\u011d\t\f\2\2\u011dR\3\2\2\2\u011e\u0120\t\r\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\b*\2\2\u0124T\3\2\2\2\32\2\u00ac\u00b3\u00b6"+
		"\u00b9\u00bf\u00c2\u00c8\u00ca\u00d2\u00d4\u00d8\u00de\u00e0\u00e7\u00f3"+
		"\u00f9\u00fd\u00ff\u0106\u0109\u010d\u0114\u0121\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}