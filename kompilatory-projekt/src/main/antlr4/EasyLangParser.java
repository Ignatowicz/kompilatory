// Generated from EasyLang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EasyLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T_END_LINE=2, T_INTEGER=3, T_STRING=4, T_BOOL=5, T_IF_CLAUSE=6, 
		T_ELSE_CLAUSE=7, T_UNTIL_CLAUSE=8, T_AND=9, T_OR=10, T_NOT=11, T_ASTERISK=12, 
		T_SLASH=13, T_PLUS=14, T_MINUS=15, T_COMMA=16, T_LEQ=17, T_GEQ=18, T_L=19, 
		T_G=20, T_NEQ=21, T_EQ=22, T_FUNCTION=23, T_RETURN=24, T_PRINT=25, T_START=26, 
		T_COMMENT=27, T_INTEGER_VAL=28, T_BOOL_TRUE=29, T_BOOL_FALSE=30, T_STRING_VAL=31, 
		T_ID=32, T_LBRACKET=33, T_RBRACKET=34, T_LCURLYBRACKET=35, T_RCURLYBRACKET=36, 
		T_EQUALS=37, T_WHITESPACE=38;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_code = 2, RULE_expression = 3, 
		RULE_flowExpression = 4, RULE_printExpression = 5, RULE_startFunction = 6, 
		RULE_bool_val = 7, RULE_type = 8, RULE_value = 9, RULE_varDeclaration = 10, 
		RULE_varExpression = 11, RULE_factor = 12, RULE_returnn = 13, RULE_function = 14, 
		RULE_typedArgList = 15, RULE_argList = 16, RULE_functionCall = 17, RULE_logicalExpression = 18, 
		RULE_arithmeticExpression = 19, RULE_compareExpression = 20, RULE_conditionalExpression = 21, 
		RULE_untilExpression = 22;
	public static final String[] ruleNames = {
		"start", "program", "code", "expression", "flowExpression", "printExpression", 
		"startFunction", "bool_val", "type", "value", "varDeclaration", "varExpression", 
		"factor", "returnn", "function", "typedArgList", "argList", "functionCall", 
		"logicalExpression", "arithmeticExpression", "compareExpression", "conditionalExpression", 
		"untilExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'()'", null, null, null, null, null, null, null, null, null, null, 
		"'*'", "'/'", "'+'", "'-'", "','", "'<='", "'>='", "'<'", "'>'", "'!='", 
		"'=='", null, null, null, null, null, null, null, null, null, null, "'('", 
		"')'", "'{'", "'}'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "T_END_LINE", "T_INTEGER", "T_STRING", "T_BOOL", "T_IF_CLAUSE", 
		"T_ELSE_CLAUSE", "T_UNTIL_CLAUSE", "T_AND", "T_OR", "T_NOT", "T_ASTERISK", 
		"T_SLASH", "T_PLUS", "T_MINUS", "T_COMMA", "T_LEQ", "T_GEQ", "T_L", "T_G", 
		"T_NEQ", "T_EQ", "T_FUNCTION", "T_RETURN", "T_PRINT", "T_START", "T_COMMENT", 
		"T_INTEGER_VAL", "T_BOOL_TRUE", "T_BOOL_FALSE", "T_STRING_VAL", "T_ID", 
		"T_LBRACKET", "T_RBRACKET", "T_LCURLYBRACKET", "T_RCURLYBRACKET", "T_EQUALS", 
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

	@Override
	public String getGrammarFileName() { return "EasyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EasyLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			program();
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

	public static class ProgramContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode T_COMMENT() { return getToken(EasyLangParser.T_COMMENT, 0); }
		public StartFunctionContext startFunction() {
			return getRuleContext(StartFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EasyLangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				function();
				setState(49);
				program();
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T_COMMENT);
				setState(52);
				program();
				}
				break;
			case T_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				startFunction();
				setState(54);
				match(EOF);
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

	public static class CodeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode T_END_LINE() { return getToken(EasyLangParser.T_END_LINE, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public FlowExpressionContext flowExpression() {
			return getRuleContext(FlowExpressionContext.class,0);
		}
		public TerminalNode T_COMMENT() { return getToken(EasyLangParser.T_COMMENT, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				expression();
				setState(59);
				match(T_END_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				expression();
				setState(62);
				match(T_END_LINE);
				setState(63);
				code();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				flowExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				flowExpression();
				setState(67);
				code();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(T_COMMENT);
				setState(70);
				code();
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

	public static class ExpressionContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarExpressionContext varExpression() {
			return getRuleContext(VarExpressionContext.class,0);
		}
		public PrintExpressionContext printExpression() {
			return getRuleContext(PrintExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				varExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				printExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				logicalExpression(0);
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

	public static class FlowExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UntilExpressionContext untilExpression() {
			return getRuleContext(UntilExpressionContext.class,0);
		}
		public FlowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterFlowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitFlowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitFlowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowExpressionContext flowExpression() throws RecognitionException {
		FlowExpressionContext _localctx = new FlowExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_flowExpression);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IF_CLAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				conditionalExpression();
				}
				break;
			case T_UNTIL_CLAUSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				untilExpression();
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

	public static class PrintExpressionContext extends ParserRuleContext {
		public TerminalNode T_PRINT() { return getToken(EasyLangParser.T_PRINT, 0); }
		public TerminalNode T_LBRACKET() { return getToken(EasyLangParser.T_LBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode T_RBRACKET() { return getToken(EasyLangParser.T_RBRACKET, 0); }
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public PrintExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitPrintExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitPrintExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpressionContext printExpression() throws RecognitionException {
		PrintExpressionContext _localctx = new PrintExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printExpression);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T_PRINT);
				setState(85);
				match(T_LBRACKET);
				setState(86);
				value();
				setState(87);
				match(T_RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T_PRINT);
				setState(90);
				match(T_LBRACKET);
				setState(91);
				match(T_ID);
				setState(92);
				match(T_RBRACKET);
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

	public static class StartFunctionContext extends ParserRuleContext {
		public TerminalNode T_START() { return getToken(EasyLangParser.T_START, 0); }
		public TerminalNode T_LCURLYBRACKET() { return getToken(EasyLangParser.T_LCURLYBRACKET, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode T_RCURLYBRACKET() { return getToken(EasyLangParser.T_RCURLYBRACKET, 0); }
		public StartFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterStartFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitStartFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitStartFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartFunctionContext startFunction() throws RecognitionException {
		StartFunctionContext _localctx = new StartFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T_START);
			setState(96);
			match(T__0);
			setState(97);
			match(T_LCURLYBRACKET);
			setState(98);
			code();
			setState(99);
			match(T_RCURLYBRACKET);
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

	public static class Bool_valContext extends ParserRuleContext {
		public TerminalNode T_BOOL_TRUE() { return getToken(EasyLangParser.T_BOOL_TRUE, 0); }
		public TerminalNode T_BOOL_FALSE() { return getToken(EasyLangParser.T_BOOL_FALSE, 0); }
		public Bool_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterBool_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitBool_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitBool_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valContext bool_val() throws RecognitionException {
		Bool_valContext _localctx = new Bool_valContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==T_BOOL_TRUE || _la==T_BOOL_FALSE) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_INTEGER() { return getToken(EasyLangParser.T_INTEGER, 0); }
		public TerminalNode T_STRING() { return getToken(EasyLangParser.T_STRING, 0); }
		public TerminalNode T_BOOL() { return getToken(EasyLangParser.T_BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INTEGER) | (1L << T_STRING) | (1L << T_BOOL))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode T_INTEGER_VAL() { return getToken(EasyLangParser.T_INTEGER_VAL, 0); }
		public TerminalNode T_STRING_VAL() { return getToken(EasyLangParser.T_STRING_VAL, 0); }
		public Bool_valContext bool_val() {
			return getRuleContext(Bool_valContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INTEGER_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T_INTEGER_VAL);
				}
				break;
			case T_STRING_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T_STRING_VAL);
				}
				break;
			case T_BOOL_TRUE:
			case T_BOOL_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				bool_val();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public TerminalNode T_EQUALS() { return getToken(EasyLangParser.T_EQUALS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDeclaration);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				type();
				setState(111);
				match(T_ID);
				setState(112);
				match(T_EQUALS);
				setState(113);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				type();
				setState(116);
				match(T_ID);
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

	public static class VarExpressionContext extends ParserRuleContext {
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public TerminalNode T_EQUALS() { return getToken(EasyLangParser.T_EQUALS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public VarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarExpressionContext varExpression() throws RecognitionException {
		VarExpressionContext _localctx = new VarExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T_ID);
			setState(121);
			match(T_EQUALS);
			setState(122);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				arithmeticExpression(0);
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

	public static class ReturnnContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(EasyLangParser.T_RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode T_END_LINE() { return getToken(EasyLangParser.T_END_LINE, 0); }
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public ReturnnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterReturnn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitReturnn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitReturnn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnnContext returnn() throws RecognitionException {
		ReturnnContext _localctx = new ReturnnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnn);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T_RETURN);
				setState(130);
				value();
				setState(131);
				match(T_END_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T_RETURN);
				setState(134);
				match(T_ID);
				setState(135);
				match(T_END_LINE);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(EasyLangParser.T_FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public TerminalNode T_LBRACKET() { return getToken(EasyLangParser.T_LBRACKET, 0); }
		public TypedArgListContext typedArgList() {
			return getRuleContext(TypedArgListContext.class,0);
		}
		public TerminalNode T_RBRACKET() { return getToken(EasyLangParser.T_RBRACKET, 0); }
		public TerminalNode T_LCURLYBRACKET() { return getToken(EasyLangParser.T_LCURLYBRACKET, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ReturnnContext returnn() {
			return getRuleContext(ReturnnContext.class,0);
		}
		public TerminalNode T_RCURLYBRACKET() { return getToken(EasyLangParser.T_RCURLYBRACKET, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T_FUNCTION);
			setState(139);
			type();
			setState(140);
			match(T_ID);
			setState(141);
			match(T_LBRACKET);
			setState(142);
			typedArgList();
			setState(143);
			match(T_RBRACKET);
			setState(144);
			match(T_LCURLYBRACKET);
			setState(145);
			code();
			setState(146);
			returnn();
			setState(147);
			match(T_RCURLYBRACKET);
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

	public static class TypedArgListContext extends ParserRuleContext {
		public TypeContext left;
		public TypedArgListContext right;
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public TerminalNode T_COMMA() { return getToken(EasyLangParser.T_COMMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedArgListContext typedArgList() {
			return getRuleContext(TypedArgListContext.class,0);
		}
		public TypedArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedArgList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterTypedArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitTypedArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitTypedArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedArgListContext typedArgList() throws RecognitionException {
		TypedArgListContext _localctx = new TypedArgListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typedArgList);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((TypedArgListContext)_localctx).left = type();
				setState(150);
				match(T_ID);
				setState(151);
				match(T_COMMA);
				setState(152);
				((TypedArgListContext)_localctx).right = typedArgList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				type();
				setState(155);
				match(T_ID);
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

	public static class ArgListContext extends ParserRuleContext {
		public FactorContext left;
		public ArgListContext right;
		public TerminalNode T_COMMA() { return getToken(EasyLangParser.T_COMMA, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argList);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((ArgListContext)_localctx).left = factor();
				setState(160);
				match(T_COMMA);
				setState(161);
				((ArgListContext)_localctx).right = argList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				factor();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public TerminalNode T_LBRACKET() { return getToken(EasyLangParser.T_LBRACKET, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode T_RBRACKET() { return getToken(EasyLangParser.T_RBRACKET, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T_ID);
			setState(167);
			match(T_LBRACKET);
			setState(168);
			argList();
			setState(169);
			match(T_RBRACKET);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
	 
		public LogicalExpressionContext() { }
		public void copyFrom(LogicalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicCompareExprContext extends LogicalExpressionContext {
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public LogicCompareExprContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterLogicCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitLogicCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitLogicCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicFunctionCallContext extends LogicalExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LogicFunctionCallContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterLogicFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitLogicFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitLogicFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicParenthesisContext extends LogicalExpressionContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicParenthesisContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterLogicParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitLogicParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitLogicParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicAndOrContext extends LogicalExpressionContext {
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode T_AND() { return getToken(EasyLangParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(EasyLangParser.T_OR, 0); }
		public LogicAndOrContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterLogicAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitLogicAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitLogicAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicNotContext extends LogicalExpressionContext {
		public TerminalNode T_NOT() { return getToken(EasyLangParser.T_NOT, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public LogicNotContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterLogicNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitLogicNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitLogicNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicIdContext extends LogicalExpressionContext {
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public LogicIdContext(LogicalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterLogicId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitLogicId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitLogicId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new LogicParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(172);
				match(T_LBRACKET);
				setState(173);
				logicalExpression(0);
				setState(174);
				match(T_RBRACKET);
				}
				break;
			case 2:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(T_NOT);
				setState(177);
				logicalExpression(4);
				}
				break;
			case 3:
				{
				_localctx = new LogicCompareExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				compareExpression();
				}
				break;
			case 4:
				{
				_localctx = new LogicFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new LogicIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(T_ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicAndOrContext(new LogicalExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(183);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(184);
					_la = _input.LA(1);
					if ( !(_la==T_AND || _la==T_OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(185);
					logicalExpression(6);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode T_LBRACKET() { return getToken(EasyLangParser.T_LBRACKET, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode T_RBRACKET() { return getToken(EasyLangParser.T_RBRACKET, 0); }
		public TerminalNode T_INTEGER_VAL() { return getToken(EasyLangParser.T_INTEGER_VAL, 0); }
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public TerminalNode T_ASTERISK() { return getToken(EasyLangParser.T_ASTERISK, 0); }
		public TerminalNode T_SLASH() { return getToken(EasyLangParser.T_SLASH, 0); }
		public TerminalNode T_PLUS() { return getToken(EasyLangParser.T_PLUS, 0); }
		public TerminalNode T_MINUS() { return getToken(EasyLangParser.T_MINUS, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_arithmeticExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LBRACKET:
				{
				setState(192);
				match(T_LBRACKET);
				setState(193);
				arithmeticExpression(0);
				setState(194);
				match(T_RBRACKET);
				}
				break;
			case T_INTEGER_VAL:
				{
				setState(196);
				match(T_INTEGER_VAL);
				}
				break;
			case T_ID:
				{
				setState(197);
				match(T_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==T_ASTERISK || _la==T_SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						arithmeticExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						_la = _input.LA(1);
						if ( !(_la==T_PLUS || _la==T_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompareExpressionContext extends ParserRuleContext {
		public FactorContext left;
		public FactorContext right;
		public TerminalNode T_G() { return getToken(EasyLangParser.T_G, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode T_L() { return getToken(EasyLangParser.T_L, 0); }
		public TerminalNode T_GEQ() { return getToken(EasyLangParser.T_GEQ, 0); }
		public TerminalNode T_LEQ() { return getToken(EasyLangParser.T_LEQ, 0); }
		public TerminalNode T_EQ() { return getToken(EasyLangParser.T_EQ, 0); }
		public TerminalNode T_NEQ() { return getToken(EasyLangParser.T_NEQ, 0); }
		public CompareExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareExpressionContext compareExpression() throws RecognitionException {
		CompareExpressionContext _localctx = new CompareExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compareExpression);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((CompareExpressionContext)_localctx).left = factor();
				setState(212);
				match(T_G);
				setState(213);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				((CompareExpressionContext)_localctx).left = factor();
				setState(216);
				match(T_L);
				setState(217);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				((CompareExpressionContext)_localctx).left = factor();
				setState(220);
				match(T_GEQ);
				setState(221);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				((CompareExpressionContext)_localctx).left = factor();
				setState(224);
				match(T_LEQ);
				setState(225);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				((CompareExpressionContext)_localctx).left = factor();
				setState(228);
				match(T_EQ);
				setState(229);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				((CompareExpressionContext)_localctx).left = factor();
				setState(232);
				match(T_NEQ);
				setState(233);
				((CompareExpressionContext)_localctx).right = factor();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public TerminalNode T_IF_CLAUSE() { return getToken(EasyLangParser.T_IF_CLAUSE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode T_ELSE_CLAUSE() { return getToken(EasyLangParser.T_ELSE_CLAUSE, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conditionalExpression);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T_IF_CLAUSE);
				setState(238);
				match(T_LBRACKET);
				setState(239);
				logicalExpression(0);
				setState(240);
				match(T_RBRACKET);
				setState(241);
				match(T_LCURLYBRACKET);
				setState(242);
				code();
				setState(243);
				match(T_RCURLYBRACKET);
				setState(244);
				match(T_ELSE_CLAUSE);
				setState(245);
				match(T_LCURLYBRACKET);
				setState(246);
				code();
				setState(247);
				match(T_RCURLYBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T_IF_CLAUSE);
				setState(250);
				match(T_LBRACKET);
				setState(251);
				logicalExpression(0);
				setState(252);
				match(T_RBRACKET);
				setState(253);
				match(T_LCURLYBRACKET);
				setState(254);
				code();
				setState(255);
				match(T_RCURLYBRACKET);
				setState(256);
				match(T_ELSE_CLAUSE);
				setState(257);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(T_IF_CLAUSE);
				setState(260);
				match(T_LBRACKET);
				setState(261);
				logicalExpression(0);
				setState(262);
				match(T_RBRACKET);
				setState(263);
				match(T_LCURLYBRACKET);
				setState(264);
				code();
				setState(265);
				match(T_RCURLYBRACKET);
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

	public static class UntilExpressionContext extends ParserRuleContext {
		public TerminalNode T_UNTIL_CLAUSE() { return getToken(EasyLangParser.T_UNTIL_CLAUSE, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public UntilExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterUntilExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitUntilExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitUntilExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UntilExpressionContext untilExpression() throws RecognitionException {
		UntilExpressionContext _localctx = new UntilExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_untilExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T_UNTIL_CLAUSE);
			setState(270);
			match(T_LBRACKET);
			setState(271);
			logicalExpression(0);
			setState(272);
			match(T_RBRACKET);
			setState(273);
			match(T_LCURLYBRACKET);
			setState(274);
			code();
			setState(275);
			match(T_RCURLYBRACKET);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		case 19:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0118\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\5"+
		"\6U\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13o\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\fy\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0082\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008b\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00a0\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a7\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b8"+
		"\n\24\3\24\3\24\3\24\7\24\u00bd\n\24\f\24\16\24\u00c0\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00c9\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00d1\n\25\f\25\16\25\u00d4\13\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00ee\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010e\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\4&(\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\7\3\2\37 \3\2\5\7\3\2\13\f\3\2\16\17\3\2\20\21"+
		"\2\u0124\2\60\3\2\2\2\4:\3\2\2\2\6I\3\2\2\2\bP\3\2\2\2\nT\3\2\2\2\f_\3"+
		"\2\2\2\16a\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24n\3\2\2\2\26x\3\2\2\2\30"+
		"z\3\2\2\2\32\u0081\3\2\2\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u009f\3"+
		"\2\2\2\"\u00a6\3\2\2\2$\u00a8\3\2\2\2&\u00b7\3\2\2\2(\u00c8\3\2\2\2*\u00ed"+
		"\3\2\2\2,\u010d\3\2\2\2.\u010f\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\63"+
		"\5\36\20\2\63\64\5\4\3\2\64;\3\2\2\2\65\66\7\35\2\2\66;\5\4\3\2\678\5"+
		"\16\b\289\7\2\2\39;\3\2\2\2:\62\3\2\2\2:\65\3\2\2\2:\67\3\2\2\2;\5\3\2"+
		"\2\2<=\5\b\5\2=>\7\4\2\2>J\3\2\2\2?@\5\b\5\2@A\7\4\2\2AB\5\6\4\2BJ\3\2"+
		"\2\2CJ\5\n\6\2DE\5\n\6\2EF\5\6\4\2FJ\3\2\2\2GH\7\35\2\2HJ\5\6\4\2I<\3"+
		"\2\2\2I?\3\2\2\2IC\3\2\2\2ID\3\2\2\2IG\3\2\2\2J\7\3\2\2\2KQ\5\26\f\2L"+
		"Q\5\30\r\2MQ\5\f\7\2NQ\5$\23\2OQ\5&\24\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2"+
		"PN\3\2\2\2PO\3\2\2\2Q\t\3\2\2\2RU\5,\27\2SU\5.\30\2TR\3\2\2\2TS\3\2\2"+
		"\2U\13\3\2\2\2VW\7\33\2\2WX\7#\2\2XY\5\24\13\2YZ\7$\2\2Z`\3\2\2\2[\\\7"+
		"\33\2\2\\]\7#\2\2]^\7\"\2\2^`\7$\2\2_V\3\2\2\2_[\3\2\2\2`\r\3\2\2\2ab"+
		"\7\34\2\2bc\7\3\2\2cd\7%\2\2de\5\6\4\2ef\7&\2\2f\17\3\2\2\2gh\t\2\2\2"+
		"h\21\3\2\2\2ij\t\3\2\2j\23\3\2\2\2ko\7\36\2\2lo\7!\2\2mo\5\20\t\2nk\3"+
		"\2\2\2nl\3\2\2\2nm\3\2\2\2o\25\3\2\2\2pq\5\22\n\2qr\7\"\2\2rs\7\'\2\2"+
		"st\5\32\16\2ty\3\2\2\2uv\5\22\n\2vw\7\"\2\2wy\3\2\2\2xp\3\2\2\2xu\3\2"+
		"\2\2y\27\3\2\2\2z{\7\"\2\2{|\7\'\2\2|}\5\32\16\2}\31\3\2\2\2~\u0082\7"+
		"\"\2\2\177\u0082\5\24\13\2\u0080\u0082\5(\25\2\u0081~\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0080\3\2\2\2\u0082\33\3\2\2\2\u0083\u0084\7\32\2\2\u0084"+
		"\u0085\5\24\13\2\u0085\u0086\7\4\2\2\u0086\u008b\3\2\2\2\u0087\u0088\7"+
		"\32\2\2\u0088\u0089\7\"\2\2\u0089\u008b\7\4\2\2\u008a\u0083\3\2\2\2\u008a"+
		"\u0087\3\2\2\2\u008b\35\3\2\2\2\u008c\u008d\7\31\2\2\u008d\u008e\5\22"+
		"\n\2\u008e\u008f\7\"\2\2\u008f\u0090\7#\2\2\u0090\u0091\5 \21\2\u0091"+
		"\u0092\7$\2\2\u0092\u0093\7%\2\2\u0093\u0094\5\6\4\2\u0094\u0095\5\34"+
		"\17\2\u0095\u0096\7&\2\2\u0096\37\3\2\2\2\u0097\u0098\5\22\n\2\u0098\u0099"+
		"\7\"\2\2\u0099\u009a\7\22\2\2\u009a\u009b\5 \21\2\u009b\u00a0\3\2\2\2"+
		"\u009c\u009d\5\22\n\2\u009d\u009e\7\"\2\2\u009e\u00a0\3\2\2\2\u009f\u0097"+
		"\3\2\2\2\u009f\u009c\3\2\2\2\u00a0!\3\2\2\2\u00a1\u00a2\5\32\16\2\u00a2"+
		"\u00a3\7\22\2\2\u00a3\u00a4\5\"\22\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\5"+
		"\32\16\2\u00a6\u00a1\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7#\3\2\2\2\u00a8"+
		"\u00a9\7\"\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\5\"\22\2\u00ab\u00ac\7$"+
		"\2\2\u00ac%\3\2\2\2\u00ad\u00ae\b\24\1\2\u00ae\u00af\7#\2\2\u00af\u00b0"+
		"\5&\24\2\u00b0\u00b1\7$\2\2\u00b1\u00b8\3\2\2\2\u00b2\u00b3\7\r\2\2\u00b3"+
		"\u00b8\5&\24\6\u00b4\u00b8\5*\26\2\u00b5\u00b8\5$\23\2\u00b6\u00b8\7\""+
		"\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00be\3\2\2\2\u00b9\u00ba\f\7"+
		"\2\2\u00ba\u00bb\t\4\2\2\u00bb\u00bd\5&\24\b\u00bc\u00b9\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\'\3\2\2\2"+
		"\u00c0\u00be\3\2\2\2\u00c1\u00c2\b\25\1\2\u00c2\u00c3\7#\2\2\u00c3\u00c4"+
		"\5(\25\2\u00c4\u00c5\7$\2\2\u00c5\u00c9\3\2\2\2\u00c6\u00c9\7\36\2\2\u00c7"+
		"\u00c9\7\"\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\u00d2\3\2\2\2\u00ca\u00cb\f\6\2\2\u00cb\u00cc\t\5\2\2\u00cc"+
		"\u00d1\5(\25\7\u00cd\u00ce\f\5\2\2\u00ce\u00cf\t\6\2\2\u00cf\u00d1\5("+
		"\25\6\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3)\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d5\u00d6\5\32\16\2\u00d6\u00d7\7\26\2\2\u00d7\u00d8\5\32\16\2\u00d8"+
		"\u00ee\3\2\2\2\u00d9\u00da\5\32\16\2\u00da\u00db\7\25\2\2\u00db\u00dc"+
		"\5\32\16\2\u00dc\u00ee\3\2\2\2\u00dd\u00de\5\32\16\2\u00de\u00df\7\24"+
		"\2\2\u00df\u00e0\5\32\16\2\u00e0\u00ee\3\2\2\2\u00e1\u00e2\5\32\16\2\u00e2"+
		"\u00e3\7\23\2\2\u00e3\u00e4\5\32\16\2\u00e4\u00ee\3\2\2\2\u00e5\u00e6"+
		"\5\32\16\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00ee\3\2"+
		"\2\2\u00e9\u00ea\5\32\16\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec\5\32\16\2"+
		"\u00ec\u00ee\3\2\2\2\u00ed\u00d5\3\2\2\2\u00ed\u00d9\3\2\2\2\u00ed\u00dd"+
		"\3\2\2\2\u00ed\u00e1\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee"+
		"+\3\2\2\2\u00ef\u00f0\7\b\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\5&\24\2\u00f2"+
		"\u00f3\7$\2\2\u00f3\u00f4\7%\2\2\u00f4\u00f5\5\6\4\2\u00f5\u00f6\7&\2"+
		"\2\u00f6\u00f7\7\t\2\2\u00f7\u00f8\7%\2\2\u00f8\u00f9\5\6\4\2\u00f9\u00fa"+
		"\7&\2\2\u00fa\u010e\3\2\2\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\7#\2\2\u00fd"+
		"\u00fe\5&\24\2\u00fe\u00ff\7$\2\2\u00ff\u0100\7%\2\2\u0100\u0101\5\6\4"+
		"\2\u0101\u0102\7&\2\2\u0102\u0103\7\t\2\2\u0103\u0104\5,\27\2\u0104\u010e"+
		"\3\2\2\2\u0105\u0106\7\b\2\2\u0106\u0107\7#\2\2\u0107\u0108\5&\24\2\u0108"+
		"\u0109\7$\2\2\u0109\u010a\7%\2\2\u010a\u010b\5\6\4\2\u010b\u010c\7&\2"+
		"\2\u010c\u010e\3\2\2\2\u010d\u00ef\3\2\2\2\u010d\u00fb\3\2\2\2\u010d\u0105"+
		"\3\2\2\2\u010e-\3\2\2\2\u010f\u0110\7\n\2\2\u0110\u0111\7#\2\2\u0111\u0112"+
		"\5&\24\2\u0112\u0113\7$\2\2\u0113\u0114\7%\2\2\u0114\u0115\5\6\4\2\u0115"+
		"\u0116\7&\2\2\u0116/\3\2\2\2\24:IPT_nx\u0081\u008a\u009f\u00a6\u00b7\u00be"+
		"\u00c8\u00d0\u00d2\u00ed\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}