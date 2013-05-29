// Generated from L3.g4 by ANTLR 4.0
package l3interpreter.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L3Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LC=1, RC=2, DEF=3, LA=4, RA=5, IF=6, ELSE=7, WHILE=8, DO=9, RETURN=10, 
		SEMI=11, BREAK=12, CONTINUE=13, TRUE=14, FALSE=15, COMA=16, LB=17, RB=18, 
		MUL=19, DIV=20, MOD=21, ADD=22, SUB=23, LT=24, GT=25, LET=26, GET=27, 
		AND=28, EQ=29, NEQ=30, OR=31, QM=32, CL=33, ASSIGN=34, NEW=35, IMPORT=36, 
		DOT=37, VAR=38, Identifier=39, WS=40, STRING=41, LETTER=42, INTEGER=43, 
		FLOAT=44, COMMENT=45, LINE_COMMENT=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'}'", "'def'", "'('", "')'", "'if'", "'else'", "'while'", "'do'", 
		"'return'", "';'", "'break'", "'continue'", "'true'", "'false'", "','", 
		"'['", "']'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'<='", 
		"'>='", "'&&'", "'=='", "'!='", "'||'", "'?'", "':'", "'='", "'new'", 
		"'import'", "'.'", "'var'", "Identifier", "WS", "STRING", "LETTER", "INTEGER", 
		"FLOAT", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"LC", "RC", "DEF", "LA", "RA", "IF", "ELSE", "WHILE", "DO", "RETURN", 
		"SEMI", "BREAK", "CONTINUE", "TRUE", "FALSE", "COMA", "LB", "RB", "MUL", 
		"DIV", "MOD", "ADD", "SUB", "LT", "GT", "LET", "GET", "AND", "EQ", "NEQ", 
		"OR", "QM", "CL", "ASSIGN", "NEW", "IMPORT", "DOT", "VAR", "Identifier", 
		"WS", "STRING", "LETTER", "INTEGER", "FLOAT", "COMMENT", "LINE_COMMENT", 
		"ESC", "DIGIT"
	};


	public L3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L3.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 39: WS_action((RuleContext)_localctx, actionIndex); break;

		case 44: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 45: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\60\u0130\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u00e4\n"+
		"(\f(\16(\u00e7\13(\3)\6)\u00ea\n)\r)\16)\u00eb\3)\3)\3*\3*\3*\7*\u00f3"+
		"\n*\f*\16*\u00f6\13*\3*\3*\3+\3+\3,\6,\u00fd\n,\r,\16,\u00fe\3-\6-\u0102"+
		"\n-\r-\16-\u0103\3-\3-\6-\u0108\n-\r-\16-\u0109\3.\3.\3.\3.\7.\u0110\n"+
		".\f.\16.\u0113\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u011e\n/\f/\16/\u0121"+
		"\13/\3/\5/\u0124\n/\3/\3/\5/\u0128\n/\3/\3/\3\60\3\60\3\60\3\61\3\61\4"+
		"\u00f4\u0111\62\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1"+
		";\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\2S+\1U,\1W-\1Y.\1["+
		"/\3]\60\4_\2\1a\2\1\3\2\7\5\13\f\17\17\"\"\6C\\aac|~~\4\f\f\17\17\b$$"+
		"^^ddppttvv\3\62;\u0139\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\ro\3\2"+
		"\2\2\17r\3\2\2\2\21w\3\2\2\2\23}\3\2\2\2\25\u0080\3\2\2\2\27\u0087\3\2"+
		"\2\2\31\u0089\3\2\2\2\33\u008f\3\2\2\2\35\u0098\3\2\2\2\37\u009d\3\2\2"+
		"\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00a9\3\2\2\2)\u00ab"+
		"\3\2\2\2+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00b1\3\2\2\2\61\u00b3\3\2\2\2"+
		"\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00bd\3\2\2\2;\u00c0"+
		"\3\2\2\2=\u00c3\3\2\2\2?\u00c6\3\2\2\2A\u00c9\3\2\2\2C\u00cb\3\2\2\2E"+
		"\u00cd\3\2\2\2G\u00cf\3\2\2\2I\u00d3\3\2\2\2K\u00da\3\2\2\2M\u00dc\3\2"+
		"\2\2O\u00e0\3\2\2\2Q\u00e9\3\2\2\2S\u00ef\3\2\2\2U\u00f9\3\2\2\2W\u00fc"+
		"\3\2\2\2Y\u0101\3\2\2\2[\u010b\3\2\2\2]\u0119\3\2\2\2_\u012b\3\2\2\2a"+
		"\u012e\3\2\2\2cd\7}\2\2d\4\3\2\2\2ef\7\177\2\2f\6\3\2\2\2gh\7f\2\2hi\7"+
		"g\2\2ij\7h\2\2j\b\3\2\2\2kl\7*\2\2l\n\3\2\2\2mn\7+\2\2n\f\3\2\2\2op\7"+
		"k\2\2pq\7h\2\2q\16\3\2\2\2rs\7g\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v\20\3\2"+
		"\2\2wx\7y\2\2xy\7j\2\2yz\7k\2\2z{\7n\2\2{|\7g\2\2|\22\3\2\2\2}~\7f\2\2"+
		"~\177\7q\2\2\177\24\3\2\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082"+
		"\u0083\7v\2\2\u0083\u0084\7w\2\2\u0084\u0085\7t\2\2\u0085\u0086\7p\2\2"+
		"\u0086\26\3\2\2\2\u0087\u0088\7=\2\2\u0088\30\3\2\2\2\u0089\u008a\7d\2"+
		"\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d\u008e"+
		"\7m\2\2\u008e\32\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7q\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7w\2\2\u0096\u0097\7g\2\2\u0097\34\3\2\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7t\2\2\u009a\u009b\7w\2\2\u009b\u009c\7g\2\2\u009c\36\3\2\2\2\u009d"+
		"\u009e\7h\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\"\3\2\2\2"+
		"\u00a5\u00a6\7]\2\2\u00a6$\3\2\2\2\u00a7\u00a8\7_\2\2\u00a8&\3\2\2\2\u00a9"+
		"\u00aa\7,\2\2\u00aa(\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac*\3\2\2\2\u00ad"+
		"\u00ae\7\'\2\2\u00ae,\3\2\2\2\u00af\u00b0\7-\2\2\u00b0.\3\2\2\2\u00b1"+
		"\u00b2\7/\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\62\3\2\2\2\u00b5"+
		"\u00b6\7@\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\u00b9\7?\2\2\u00b9"+
		"\66\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc\7?\2\2\u00bc8\3\2\2\2\u00bd"+
		"\u00be\7(\2\2\u00be\u00bf\7(\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7?\2\2\u00c1"+
		"\u00c2\7?\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4\u00c5\7?\2\2\u00c5"+
		">\3\2\2\2\u00c6\u00c7\7~\2\2\u00c7\u00c8\7~\2\2\u00c8@\3\2\2\2\u00c9\u00ca"+
		"\7A\2\2\u00caB\3\2\2\2\u00cb\u00cc\7<\2\2\u00ccD\3\2\2\2\u00cd\u00ce\7"+
		"?\2\2\u00ceF\3\2\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7y\2\2\u00d2H\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6"+
		"\7r\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"J\3\2\2\2\u00da\u00db\7\60\2\2\u00dbL\3\2\2\2\u00dc\u00dd\7x\2\2\u00dd"+
		"\u00de\7c\2\2\u00de\u00df\7t\2\2\u00dfN\3\2\2\2\u00e0\u00e5\5U+\2\u00e1"+
		"\u00e4\5U+\2\u00e2\u00e4\5a\61\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2"+
		"\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6P"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\t\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\b)\2\2\u00eeR\3\2\2\2\u00ef\u00f4\7$\2\2\u00f0\u00f3"+
		"\5_\60\2\u00f1\u00f3\13\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2"+
		"\u00f3\u00f6\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8T\3\2\2\2\u00f9\u00fa"+
		"\t\3\2\2\u00faV\3\2\2\2\u00fb\u00fd\5a\61\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffX\3\2\2\2"+
		"\u0100\u0102\5a\61\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\7\60\2\2"+
		"\u0106\u0108\5a\61\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010aZ\3\2\2\2\u010b\u010c\7\61\2\2\u010c"+
		"\u010d\7,\2\2\u010d\u0111\3\2\2\2\u010e\u0110\13\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7,\2\2\u0115\u0116\7\61"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\b.\3\2\u0118\\\3\2\2\2\u0119\u011a"+
		"\7\61\2\2\u011a\u011b\7\61\2\2\u011b\u011f\3\2\2\2\u011c\u011e\n\4\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0127\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7\17\2\2"+
		"\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128"+
		"\7\f\2\2\u0126\u0128\7\1\2\2\u0127\u0123\3\2\2\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\b/\4\2\u012a^\3\2\2\2\u012b\u012c\7^\2\2\u012c"+
		"\u012d\t\5\2\2\u012d`\3\2\2\2\u012e\u012f\t\6\2\2\u012fb\3\2\2\2\17\2"+
		"\u00e3\u00e5\u00eb\u00f2\u00f4\u00fe\u0103\u0109\u0111\u011f\u0123\u0127";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}