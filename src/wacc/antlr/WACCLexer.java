// Generated from ./WACCLexer.g4 by ANTLR 4.4
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WACCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENTS=2, BEGIN=3, END=4, SKIP=5, EXIT=6, IS=7, ASSIGNMENT=8, 
		READ=9, FREE=10, RETURN=11, PRINT=12, PRINTLN=13, IF=14, THEN=15, ELSE=16, 
		FI=17, WHILE=18, DO=19, DONE=20, CALL=21, NEWPAIR=22, FST=23, SND=24, 
		NULL=25, ID=26, INT=27, INT_SIGN=28, BOOL=29, CHAR=30, ESCAPED_CHAR=31, 
		INT_TYPE=32, BOOL_TYPE=33, CHAR_TYPE=34, STRING_TYPE=35, PAIR_TYPE=36, 
		ADD=37, SUB=38, MULT=39, DIV=40, MOD=41, AND=42, OR=43, GT=44, GTE=45, 
		LT=46, LTE=47, EQ=48, NEQ=49, NOT=50, MINUS=51, ORD=52, CHR=53, LEN=54, 
		OPEN_PARENTHESES=55, CLOSE_PARENTHESES=56, OPEN_SQUARE_BRACKET=57, CLOSE_SQUARE_BRACKET=58, 
		COMMA=59, APOSTROPHE=60, DOUBLEQUOTE=61, BACKSLASH=62, SEMICOLON=63;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "':'", "';'", 
		"'<'", "'='", "'>'", "'?'"
	};
	public static final String[] ruleNames = {
		"WS", "COMMENTS", "BEGIN", "END", "SKIP", "EXIT", "IS", "ASSIGNMENT", 
		"READ", "FREE", "RETURN", "PRINT", "PRINTLN", "IF", "THEN", "ELSE", "FI", 
		"WHILE", "DO", "DONE", "CALL", "NEWPAIR", "FST", "SND", "NULL", "ID", 
		"DIGIT", "INT", "POS", "NEG", "INT_SIGN", "TRUE", "FALSE", "BOOL", "CHAR", 
		"ESCAPED_CHAR", "INT_TYPE", "BOOL_TYPE", "CHAR_TYPE", "STRING_TYPE", "PAIR_TYPE", 
		"ADD", "SUB", "MULT", "DIV", "MOD", "AND", "OR", "GT", "GTE", "LT", "LTE", 
		"EQ", "NEQ", "NOT", "MINUS", "ORD", "CHR", "LEN", "OPEN_PARENTHESES", 
		"CLOSE_PARENTHESES", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "COMMA", 
		"APOSTROPHE", "DOUBLEQUOTE", "BACKSLASH", "SEMICOLON"
	};


	public WACCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WACCLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2A\u0196\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\6\2\u008d\n\2\r\2"+
		"\16\2\u008e\3\2\3\2\3\3\3\3\7\3\u0095\n\3\f\3\16\3\u0098\13\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\7\33\u0110\n\33\f\33\16"+
		"\33\u0113\13\33\3\34\3\34\3\35\6\35\u0118\n\35\r\35\16\35\u0119\3\36\3"+
		"\36\3\37\3\37\3 \3 \5 \u0122\n \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\5#\u0131\n#\3$\3$\3$\3$\5$\u0137\n$\3%\3%\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38"+
		"\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A"+
		"\3A\3B\3B\3C\3C\3D\3D\3E\3E\2\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\29\35;\2=\2?\36A\2C\2E\37G I!K\"M#O$Q%S&U\'W(Y)"+
		"[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67w8y9{:};\177<\u0081=\u0083"+
		">\u0085?\u0087@\u0089A\3\2\t\4\2\13\f\"\"\3\2\f\f\5\2C\\aac|\6\2\62;C"+
		"\\aac|\3\2\62;\b\2\"\"CGJJMNQW~~\13\2$$))\62\62^^ddhhppttvv\u0197\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2?\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008c\3\2\2\2"+
		"\5\u0092\3\2\2\2\7\u009d\3\2\2\2\t\u00a3\3\2\2\2\13\u00a7\3\2\2\2\r\u00ac"+
		"\3\2\2\2\17\u00b1\3\2\2\2\21\u00b4\3\2\2\2\23\u00b6\3\2\2\2\25\u00bb\3"+
		"\2\2\2\27\u00c0\3\2\2\2\31\u00c7\3\2\2\2\33\u00cd\3\2\2\2\35\u00d5\3\2"+
		"\2\2\37\u00d8\3\2\2\2!\u00dd\3\2\2\2#\u00e2\3\2\2\2%\u00e5\3\2\2\2\'\u00eb"+
		"\3\2\2\2)\u00ee\3\2\2\2+\u00f3\3\2\2\2-\u00f8\3\2\2\2/\u0100\3\2\2\2\61"+
		"\u0104\3\2\2\2\63\u0108\3\2\2\2\65\u010d\3\2\2\2\67\u0114\3\2\2\29\u0117"+
		"\3\2\2\2;\u011b\3\2\2\2=\u011d\3\2\2\2?\u0121\3\2\2\2A\u0123\3\2\2\2C"+
		"\u0128\3\2\2\2E\u0130\3\2\2\2G\u0136\3\2\2\2I\u0138\3\2\2\2K\u013a\3\2"+
		"\2\2M\u013e\3\2\2\2O\u0143\3\2\2\2Q\u0148\3\2\2\2S\u014f\3\2\2\2U\u0154"+
		"\3\2\2\2W\u0156\3\2\2\2Y\u0158\3\2\2\2[\u015a\3\2\2\2]\u015c\3\2\2\2_"+
		"\u015e\3\2\2\2a\u0161\3\2\2\2c\u0164\3\2\2\2e\u0166\3\2\2\2g\u0169\3\2"+
		"\2\2i\u016b\3\2\2\2k\u016e\3\2\2\2m\u0171\3\2\2\2o\u0174\3\2\2\2q\u0176"+
		"\3\2\2\2s\u0178\3\2\2\2u\u017c\3\2\2\2w\u0180\3\2\2\2y\u0184\3\2\2\2{"+
		"\u0186\3\2\2\2}\u0188\3\2\2\2\177\u018a\3\2\2\2\u0081\u018c\3\2\2\2\u0083"+
		"\u018e\3\2\2\2\u0085\u0190\3\2\2\2\u0087\u0192\3\2\2\2\u0089\u0194\3\2"+
		"\2\2\u008b\u008d\t\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\2"+
		"\2\2\u0091\4\3\2\2\2\u0092\u0096\7%\2\2\u0093\u0095\n\3\2\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\f\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u009c\b\3\2\2\u009c\6\3\2\2\2\u009d\u009e\7d\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7i\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7p\2\2\u00a2"+
		"\b\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6"+
		"\n\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7m\2\2\u00a9\u00aa\7k\2\2\u00aa"+
		"\u00ab\7r\2\2\u00ab\f\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7z\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7v\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\20\3\2\2\2\u00b4\u00b5\7?\2\2\u00b5\22\3\2\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7f\2\2"+
		"\u00ba\24\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7"+
		"g\2\2\u00be\u00bf\7g\2\2\u00bf\26\3\2\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\30\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9\7t\2\2\u00c9"+
		"\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\32\3\2\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2"+
		"\u00d1\u00d2\7v\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7p\2\2\u00d4\34\3\2"+
		"\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7h\2\2\u00d7\36\3\2\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7p\2\2\u00dc"+
		" \3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\"\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7k\2\2\u00e4"+
		"$\3\2\2\2\u00e5\u00e6\7y\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7n\2\2\u00e9\u00ea\7g\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec"+
		"\u00ed\7q\2\2\u00ed(\3\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"\u00f1\7p\2\2\u00f1\u00f2\7g\2\2\u00f2*\3\2\2\2\u00f3\u00f4\7e\2\2\u00f4"+
		"\u00f5\7c\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7n\2\2\u00f7,\3\2\2\2\u00f8"+
		"\u00f9\7p\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc\7r\2\2"+
		"\u00fc\u00fd\7c\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7t\2\2\u00ff.\3\2\2"+
		"\2\u0100\u0101\7h\2\2\u0101\u0102\7u\2\2\u0102\u0103\7v\2\2\u0103\60\3"+
		"\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7p\2\2\u0106\u0107\7f\2\2\u0107"+
		"\62\3\2\2\2\u0108\u0109\7p\2\2\u0109\u010a\7w\2\2\u010a\u010b\7n\2\2\u010b"+
		"\u010c\7n\2\2\u010c\64\3\2\2\2\u010d\u0111\t\4\2\2\u010e\u0110\t\5\2\2"+
		"\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\66\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\t\6\2\2\u0115"+
		"8\3\2\2\2\u0116\u0118\5\67\34\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2"+
		"\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a:\3\2\2\2\u011b\u011c"+
		"\7-\2\2\u011c<\3\2\2\2\u011d\u011e\7/\2\2\u011e>\3\2\2\2\u011f\u0122\5"+
		";\36\2\u0120\u0122\5=\37\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"@\3\2\2\2\u0123\u0124\7v\2\2\u0124\u0125\7t\2\2\u0125\u0126\7w\2\2\u0126"+
		"\u0127\7g\2\2\u0127B\3\2\2\2\u0128\u0129\7h\2\2\u0129\u012a\7c\2\2\u012a"+
		"\u012b\7n\2\2\u012b\u012c\7u\2\2\u012c\u012d\7g\2\2\u012dD\3\2\2\2\u012e"+
		"\u0131\5A!\2\u012f\u0131\5C\"\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2"+
		"\2\u0131F\3\2\2\2\u0132\u0137\n\7\2\2\u0133\u0134\5\u0087D\2\u0134\u0135"+
		"\5I%\2\u0135\u0137\3\2\2\2\u0136\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0137"+
		"H\3\2\2\2\u0138\u0139\t\b\2\2\u0139J\3\2\2\2\u013a\u013b\7k\2\2\u013b"+
		"\u013c\7p\2\2\u013c\u013d\7v\2\2\u013dL\3\2\2\2\u013e\u013f\7d\2\2\u013f"+
		"\u0140\7q\2\2\u0140\u0141\7q\2\2\u0141\u0142\7n\2\2\u0142N\3\2\2\2\u0143"+
		"\u0144\7e\2\2\u0144\u0145\7j\2\2\u0145\u0146\7c\2\2\u0146\u0147\7t\2\2"+
		"\u0147P\3\2\2\2\u0148\u0149\7u\2\2\u0149\u014a\7v\2\2\u014a\u014b\7t\2"+
		"\2\u014b\u014c\7k\2\2\u014c\u014d\7p\2\2\u014d\u014e\7i\2\2\u014eR\3\2"+
		"\2\2\u014f\u0150\7r\2\2\u0150\u0151\7c\2\2\u0151\u0152\7k\2\2\u0152\u0153"+
		"\7t\2\2\u0153T\3\2\2\2\u0154\u0155\7-\2\2\u0155V\3\2\2\2\u0156\u0157\7"+
		"/\2\2\u0157X\3\2\2\2\u0158\u0159\7,\2\2\u0159Z\3\2\2\2\u015a\u015b\7\61"+
		"\2\2\u015b\\\3\2\2\2\u015c\u015d\7\'\2\2\u015d^\3\2\2\2\u015e\u015f\7"+
		"(\2\2\u015f\u0160\7(\2\2\u0160`\3\2\2\2\u0161\u0162\7~\2\2\u0162\u0163"+
		"\7~\2\2\u0163b\3\2\2\2\u0164\u0165\7@\2\2\u0165d\3\2\2\2\u0166\u0167\7"+
		"@\2\2\u0167\u0168\7?\2\2\u0168f\3\2\2\2\u0169\u016a\7>\2\2\u016ah\3\2"+
		"\2\2\u016b\u016c\7>\2\2\u016c\u016d\7?\2\2\u016dj\3\2\2\2\u016e\u016f"+
		"\7?\2\2\u016f\u0170\7?\2\2\u0170l\3\2\2\2\u0171\u0172\7#\2\2\u0172\u0173"+
		"\7?\2\2\u0173n\3\2\2\2\u0174\u0175\7#\2\2\u0175p\3\2\2\2\u0176\u0177\7"+
		"/\2\2\u0177r\3\2\2\2\u0178\u0179\7q\2\2\u0179\u017a\7t\2\2\u017a\u017b"+
		"\7f\2\2\u017bt\3\2\2\2\u017c\u017d\7e\2\2\u017d\u017e\7j\2\2\u017e\u017f"+
		"\7t\2\2\u017fv\3\2\2\2\u0180\u0181\7n\2\2\u0181\u0182\7g\2\2\u0182\u0183"+
		"\7p\2\2\u0183x\3\2\2\2\u0184\u0185\7*\2\2\u0185z\3\2\2\2\u0186\u0187\7"+
		"+\2\2\u0187|\3\2\2\2\u0188\u0189\7]\2\2\u0189~\3\2\2\2\u018a\u018b\7_"+
		"\2\2\u018b\u0080\3\2\2\2\u018c\u018d\7.\2\2\u018d\u0082\3\2\2\2\u018e"+
		"\u018f\7)\2\2\u018f\u0084\3\2\2\2\u0190\u0191\7$\2\2\u0191\u0086\3\2\2"+
		"\2\u0192\u0193\7^\2\2\u0193\u0088\3\2\2\2\u0194\u0195\7=\2\2\u0195\u008a"+
		"\3\2\2\2\n\2\u008e\u0096\u0111\u0119\u0121\u0130\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}