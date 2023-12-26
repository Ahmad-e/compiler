// Generated from java-escape by ANTLR 4.11.1
package CLASSES.src.JsGrammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Const=1, HomePage=2, Function=3, Use_State_word=4, Return=5, Div=6, H1=7, 
		Close_Product=8, Space=9, Equal=10, DIGITS=11, Esc=12, Slash=13, Colon=14, 
		DColon=15, DQuote=16, LParen=17, RParen=18, LBrack=19, RBrack=20, RArrow=21, 
		Lt=22, Gt=23, EE=24, NE=25, NOT=26, Question=27, Star=28, Plus=29, PlusAssign=30, 
		Underscore=31, Pipe=32, Dollar=33, COMMA=34, Dot=35, LETTER=36, ARRAY_STRING_VALUES=37, 
		ARRAY_NUMERIC_VALUES=38;
	public static final int
		RULE_program = 0, RULE_lunchingProgram = 1, RULE_classHeader = 2, RULE_div = 3, 
		RULE_h1 = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "lunchingProgram", "classHeader", "div", "h1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", null, null, null, "'return'", "'div'", "'h1'", null, 
			"' '", "'='", null, "'\\'", "'/'", "':'", "'::'", "'\"'", "'('", "')'", 
			"'{'", "'}'", "'->'", "'<'", "'>'", "'=='", "'!='", "'!'", "'?'", "'*'", 
			"'+'", "'+='", "'_'", "'|'", "'$'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Const", "HomePage", "Function", "Use_State_word", "Return", "Div", 
			"H1", "Close_Product", "Space", "Equal", "DIGITS", "Esc", "Slash", "Colon", 
			"DColon", "DQuote", "LParen", "RParen", "LBrack", "RBrack", "RArrow", 
			"Lt", "Gt", "EE", "NE", "NOT", "Question", "Star", "Plus", "PlusAssign", 
			"Underscore", "Pipe", "Dollar", "COMMA", "Dot", "LETTER", "ARRAY_STRING_VALUES", 
			"ARRAY_NUMERIC_VALUES"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public LunchingProgramContext lunchingProgram() {
			return getRuleContext(LunchingProgramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			lunchingProgram();
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
	public static class LunchingProgramContext extends ParserRuleContext {
		public ClassHeaderContext classHeader() {
			return getRuleContext(ClassHeaderContext.class,0);
		}
		public LunchingProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lunchingProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterLunchingProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitLunchingProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitLunchingProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LunchingProgramContext lunchingProgram() throws RecognitionException {
		LunchingProgramContext _localctx = new LunchingProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lunchingProgram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			classHeader();
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
	public static class ClassHeaderContext extends ParserRuleContext {
		public ClassHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classHeader; }
	 
		public ClassHeaderContext() { }
		public void copyFrom(ClassHeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassHeadersContext extends ClassHeaderContext {
		public TerminalNode Const() { return getToken(MyLanguageParser.Const, 0); }
		public TerminalNode ARRAY_STRING_VALUES() { return getToken(MyLanguageParser.ARRAY_STRING_VALUES, 0); }
		public List<TerminalNode> Equal() { return getTokens(MyLanguageParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(MyLanguageParser.Equal, i);
		}
		public TerminalNode LParen() { return getToken(MyLanguageParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(MyLanguageParser.RParen, 0); }
		public TerminalNode Gt() { return getToken(MyLanguageParser.Gt, 0); }
		public TerminalNode LBrack() { return getToken(MyLanguageParser.LBrack, 0); }
		public TerminalNode RBrack() { return getToken(MyLanguageParser.RBrack, 0); }
		public ClassHeadersContext(ClassHeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterClassHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitClassHeaders(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitClassHeaders(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassHeaderContext classHeader() throws RecognitionException {
		ClassHeaderContext _localctx = new ClassHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classHeader);
		try {
			_localctx = new ClassHeadersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(Const);
			setState(15);
			match(ARRAY_STRING_VALUES);
			setState(16);
			match(Equal);
			setState(17);
			match(LParen);
			setState(18);
			match(RParen);
			setState(19);
			match(Equal);
			setState(20);
			match(Gt);
			setState(21);
			match(LBrack);
			setState(22);
			match(RBrack);
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
	public static class DivContext extends ParserRuleContext {
		public List<TerminalNode> Lt() { return getTokens(MyLanguageParser.Lt); }
		public TerminalNode Lt(int i) {
			return getToken(MyLanguageParser.Lt, i);
		}
		public List<TerminalNode> Div() { return getTokens(MyLanguageParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(MyLanguageParser.Div, i);
		}
		public List<TerminalNode> Gt() { return getTokens(MyLanguageParser.Gt); }
		public TerminalNode Gt(int i) {
			return getToken(MyLanguageParser.Gt, i);
		}
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(Lt);
			setState(25);
			match(Div);
			setState(26);
			match(Gt);
			setState(27);
			match(Lt);
			setState(28);
			match(Slash);
			setState(29);
			match(Div);
			setState(30);
			match(Gt);
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
	public static class H1Context extends ParserRuleContext {
		public List<TerminalNode> Lt() { return getTokens(MyLanguageParser.Lt); }
		public TerminalNode Lt(int i) {
			return getToken(MyLanguageParser.Lt, i);
		}
		public List<TerminalNode> H1() { return getTokens(MyLanguageParser.H1); }
		public TerminalNode H1(int i) {
			return getToken(MyLanguageParser.H1, i);
		}
		public List<TerminalNode> Gt() { return getTokens(MyLanguageParser.Gt); }
		public TerminalNode Gt(int i) {
			return getToken(MyLanguageParser.Gt, i);
		}
		public TerminalNode Slash() { return getToken(MyLanguageParser.Slash, 0); }
		public H1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).enterH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageParserListener ) ((MyLanguageParserListener)listener).exitH1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageParserVisitor ) return ((MyLanguageParserVisitor<? extends T>)visitor).visitH1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H1Context h1() throws RecognitionException {
		H1Context _localctx = new H1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_h1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(Lt);
			setState(33);
			match(H1);
			setState(34);
			match(Gt);
			setState(35);
			match(Lt);
			setState(36);
			match(Slash);
			setState(37);
			match(H1);
			setState(38);
			match(Gt);
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
		"\u0004\u0001&)\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000#\u0000\n\u0001"+
		"\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u000e\u0001\u0000"+
		"\u0000\u0000\u0006\u0018\u0001\u0000\u0000\u0000\b \u0001\u0000\u0000"+
		"\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\u0001\u0001\u0000\u0000\u0000"+
		"\f\r\u0003\u0004\u0002\u0000\r\u0003\u0001\u0000\u0000\u0000\u000e\u000f"+
		"\u0005\u0001\u0000\u0000\u000f\u0010\u0005%\u0000\u0000\u0010\u0011\u0005"+
		"\n\u0000\u0000\u0011\u0012\u0005\u0011\u0000\u0000\u0012\u0013\u0005\u0012"+
		"\u0000\u0000\u0013\u0014\u0005\n\u0000\u0000\u0014\u0015\u0005\u0017\u0000"+
		"\u0000\u0015\u0016\u0005\u0013\u0000\u0000\u0016\u0017\u0005\u0014\u0000"+
		"\u0000\u0017\u0005\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0016\u0000"+
		"\u0000\u0019\u001a\u0005\u0006\u0000\u0000\u001a\u001b\u0005\u0017\u0000"+
		"\u0000\u001b\u001c\u0005\u0016\u0000\u0000\u001c\u001d\u0005\r\u0000\u0000"+
		"\u001d\u001e\u0005\u0006\u0000\u0000\u001e\u001f\u0005\u0017\u0000\u0000"+
		"\u001f\u0007\u0001\u0000\u0000\u0000 !\u0005\u0016\u0000\u0000!\"\u0005"+
		"\u0007\u0000\u0000\"#\u0005\u0017\u0000\u0000#$\u0005\u0016\u0000\u0000"+
		"$%\u0005\r\u0000\u0000%&\u0005\u0007\u0000\u0000&\'\u0005\u0017\u0000"+
		"\u0000\'\t\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}