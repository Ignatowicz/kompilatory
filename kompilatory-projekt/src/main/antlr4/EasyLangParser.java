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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T_END_LINE=7, T_INTEGER=8, 
		T_STRING=9, T_BOOL=10, T_IF_CLAUSE=11, T_ELSE_CLAUSE=12, T_UNTIL_CLAUSE=13, 
		T_AND=14, T_OR=15, T_NOT=16, T_ASTERISK=17, T_SLASH=18, T_PLUS=19, T_MINUS=20, 
		T_COMMA=21, T_LEQ=22, T_GEQ=23, T_L=24, T_G=25, T_NEQ=26, T_EQ=27, T_FUNCTION=28, 
		T_RETURN=29, T_PRINT=30, T_START=31, T_COMMENT=32, T_INTEGER_VAL=33, T_BOOL_TRUE=34, 
		T_BOOL_FALSE=35, T_STRING_VAL=36, T_ID=37, T_WHITESPACE=38;
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
		null, "'('", "')'", "'()'", "'{'", "'}'", "'='", null, null, null, null, 
		null, null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", "','", 
		"'<='", "'>='", "'<'", "'>'", "'!='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "T_END_LINE", "T_INTEGER", "T_STRING", 
		"T_BOOL", "T_IF_CLAUSE", "T_ELSE_CLAUSE", "T_UNTIL_CLAUSE", "T_AND", "T_OR", 
		"T_NOT", "T_ASTERISK", "T_SLASH", "T_PLUS", "T_MINUS", "T_COMMA", "T_LEQ", 
		"T_GEQ", "T_L", "T_G", "T_NEQ", "T_EQ", "T_FUNCTION", "T_RETURN", "T_PRINT", 
		"T_START", "T_COMMENT", "T_INTEGER_VAL", "T_BOOL_TRUE", "T_BOOL_FALSE", 
		"T_STRING_VAL", "T_ID", "T_WHITESPACE"
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
			setState(77);
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IF_CLAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				conditionalExpression();
				}
				break;
			case T_UNTIL_CLAUSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T_PRINT);
				setState(84);
				match(T__0);
				setState(85);
				value();
				setState(86);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T_PRINT);
				setState(89);
				match(T__0);
				setState(90);
				match(T_ID);
				setState(91);
				match(T__1);
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
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
			setState(94);
			match(T_START);
			setState(95);
			match(T__2);
			setState(96);
			match(T__3);
			setState(97);
			code();
			setState(98);
			match(T__4);
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
			setState(100);
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
			setState(102);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INTEGER_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T_INTEGER_VAL);
				}
				break;
			case T_STRING_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T_STRING_VAL);
				}
				break;
			case T_BOOL_TRUE:
			case T_BOOL_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				type();
				setState(110);
				match(T_ID);
				setState(111);
				match(T__5);
				setState(112);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				type();
				setState(115);
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
			setState(119);
			match(T_ID);
			setState(120);
			match(T__5);
			setState(121);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T_RETURN);
				setState(129);
				value();
				setState(130);
				match(T_END_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T_RETURN);
				setState(133);
				match(T_ID);
				setState(134);
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
		public TypedArgListContext typedArgList() {
			return getRuleContext(TypedArgListContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ReturnnContext returnn() {
			return getRuleContext(ReturnnContext.class,0);
		}
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
			setState(137);
			match(T_FUNCTION);
			setState(138);
			type();
			setState(139);
			match(T_ID);
			setState(140);
			match(T__0);
			setState(141);
			typedArgList();
			setState(142);
			match(T__1);
			setState(143);
			match(T__3);
			setState(144);
			code();
			setState(145);
			returnn();
			setState(146);
			match(T__4);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((TypedArgListContext)_localctx).left = type();
				setState(149);
				match(T_ID);
				setState(150);
				match(T_COMMA);
				setState(151);
				((TypedArgListContext)_localctx).right = typedArgList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				type();
				setState(154);
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((ArgListContext)_localctx).left = factor();
				setState(159);
				match(T_COMMA);
				setState(160);
				((ArgListContext)_localctx).right = argList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
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
			setState(165);
			match(T_ID);
			setState(166);
			match(T__0);
			setState(167);
			argList();
			setState(168);
			match(T__1);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new LogicParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(T__0);
				setState(172);
				logicalExpression(0);
				setState(173);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new LogicNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(T_NOT);
				setState(176);
				logicalExpression(4);
				}
				break;
			case 3:
				{
				_localctx = new LogicCompareExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				compareExpression();
				}
				break;
			case 4:
				{
				_localctx = new LogicFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new LogicIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(T_ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
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
					setState(182);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(183);
					_la = _input.LA(1);
					if ( !(_la==T_AND || _la==T_OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(184);
					logicalExpression(6);
					}
					} 
				}
				setState(189);
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
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
	 
		public ArithmeticExpressionContext() { }
		public void copyFrom(ArithmeticExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericAtomExpContext extends ArithmeticExpressionContext {
		public TerminalNode T_INTEGER_VAL() { return getToken(EasyLangParser.T_INTEGER_VAL, 0); }
		public NumericAtomExpContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterNumericAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitNumericAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitNumericAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExpContext extends ArithmeticExpressionContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode T_ASTERISK() { return getToken(EasyLangParser.T_ASTERISK, 0); }
		public TerminalNode T_SLASH() { return getToken(EasyLangParser.T_SLASH, 0); }
		public MulDivExpContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterMulDivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitMulDivExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitMulDivExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpContext extends ArithmeticExpressionContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public ParenthesisExpContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterParenthesisExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitParenthesisExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitParenthesisExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomExpContext extends ArithmeticExpressionContext {
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public IdAtomExpContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterIdAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitIdAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitIdAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExpContext extends ArithmeticExpressionContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode T_PLUS() { return getToken(EasyLangParser.T_PLUS, 0); }
		public TerminalNode T_MINUS() { return getToken(EasyLangParser.T_MINUS, 0); }
		public AddSubExpContext(ArithmeticExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterAddSubExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitAddSubExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitAddSubExp(this);
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
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParenthesisExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				match(T__0);
				setState(192);
				arithmeticExpression(0);
				setState(193);
				match(T__1);
				}
				break;
			case T_INTEGER_VAL:
				{
				_localctx = new NumericAtomExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T_INTEGER_VAL);
				}
				break;
			case T_ID:
				{
				_localctx = new IdAtomExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200);
						_la = _input.LA(1);
						if ( !(_la==T_ASTERISK || _la==T_SLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						arithmeticExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpContext(new ArithmeticExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						_la = _input.LA(1);
						if ( !(_la==T_PLUS || _la==T_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(209);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((CompareExpressionContext)_localctx).left = factor();
				setState(211);
				match(T_G);
				setState(212);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((CompareExpressionContext)_localctx).left = factor();
				setState(215);
				match(T_L);
				setState(216);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				((CompareExpressionContext)_localctx).left = factor();
				setState(219);
				match(T_GEQ);
				setState(220);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				((CompareExpressionContext)_localctx).left = factor();
				setState(223);
				match(T_LEQ);
				setState(224);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				((CompareExpressionContext)_localctx).left = factor();
				setState(227);
				match(T_EQ);
				setState(228);
				((CompareExpressionContext)_localctx).right = factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				((CompareExpressionContext)_localctx).left = factor();
				setState(231);
				match(T_NEQ);
				setState(232);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T_IF_CLAUSE);
				setState(237);
				match(T__0);
				setState(238);
				logicalExpression(0);
				setState(239);
				match(T__1);
				setState(240);
				match(T__3);
				setState(241);
				code();
				setState(242);
				match(T__4);
				setState(243);
				match(T_ELSE_CLAUSE);
				setState(244);
				match(T__3);
				setState(245);
				code();
				setState(246);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T_IF_CLAUSE);
				setState(249);
				match(T__0);
				setState(250);
				logicalExpression(0);
				setState(251);
				match(T__1);
				setState(252);
				match(T__3);
				setState(253);
				code();
				setState(254);
				match(T__4);
				setState(255);
				match(T_ELSE_CLAUSE);
				setState(256);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(T_IF_CLAUSE);
				setState(259);
				match(T__0);
				setState(260);
				logicalExpression(0);
				setState(261);
				match(T__1);
				setState(262);
				match(T__3);
				setState(263);
				code();
				setState(264);
				match(T__4);
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
			setState(268);
			match(T_UNTIL_CLAUSE);
			setState(269);
			match(T__0);
			setState(270);
			logicalExpression(0);
			setState(271);
			match(T__1);
			setState(272);
			match(T__3);
			setState(273);
			code();
			setState(274);
			match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\5\6T"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\5\13n\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\fx\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0081\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u008a\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u009f\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a6\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b7"+
		"\n\24\3\24\3\24\3\24\7\24\u00bc\n\24\f\24\16\24\u00bf\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00c8\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00d0\n\25\f\25\16\25\u00d3\13\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00ed\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u010d\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\2\4&(\31\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\2\7\3\2$%\3\2\n\f\3\2\20\21\3\2\23\24\3\2\25\26"+
		"\2\u0122\2\60\3\2\2\2\4:\3\2\2\2\6I\3\2\2\2\bO\3\2\2\2\nS\3\2\2\2\f^\3"+
		"\2\2\2\16`\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24m\3\2\2\2\26w\3\2\2\2\30"+
		"y\3\2\2\2\32\u0080\3\2\2\2\34\u0089\3\2\2\2\36\u008b\3\2\2\2 \u009e\3"+
		"\2\2\2\"\u00a5\3\2\2\2$\u00a7\3\2\2\2&\u00b6\3\2\2\2(\u00c7\3\2\2\2*\u00ec"+
		"\3\2\2\2,\u010c\3\2\2\2.\u010e\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\63"+
		"\5\36\20\2\63\64\5\4\3\2\64;\3\2\2\2\65\66\7\"\2\2\66;\5\4\3\2\678\5\16"+
		"\b\289\7\2\2\39;\3\2\2\2:\62\3\2\2\2:\65\3\2\2\2:\67\3\2\2\2;\5\3\2\2"+
		"\2<=\5\b\5\2=>\7\t\2\2>J\3\2\2\2?@\5\b\5\2@A\7\t\2\2AB\5\6\4\2BJ\3\2\2"+
		"\2CJ\5\n\6\2DE\5\n\6\2EF\5\6\4\2FJ\3\2\2\2GH\7\"\2\2HJ\5\6\4\2I<\3\2\2"+
		"\2I?\3\2\2\2IC\3\2\2\2ID\3\2\2\2IG\3\2\2\2J\7\3\2\2\2KP\5\26\f\2LP\5\30"+
		"\r\2MP\5\f\7\2NP\5$\23\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\t\3"+
		"\2\2\2QT\5,\27\2RT\5.\30\2SQ\3\2\2\2SR\3\2\2\2T\13\3\2\2\2UV\7 \2\2VW"+
		"\7\3\2\2WX\5\24\13\2XY\7\4\2\2Y_\3\2\2\2Z[\7 \2\2[\\\7\3\2\2\\]\7\'\2"+
		"\2]_\7\4\2\2^U\3\2\2\2^Z\3\2\2\2_\r\3\2\2\2`a\7!\2\2ab\7\5\2\2bc\7\6\2"+
		"\2cd\5\6\4\2de\7\7\2\2e\17\3\2\2\2fg\t\2\2\2g\21\3\2\2\2hi\t\3\2\2i\23"+
		"\3\2\2\2jn\7#\2\2kn\7&\2\2ln\5\20\t\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\25"+
		"\3\2\2\2op\5\22\n\2pq\7\'\2\2qr\7\b\2\2rs\5\32\16\2sx\3\2\2\2tu\5\22\n"+
		"\2uv\7\'\2\2vx\3\2\2\2wo\3\2\2\2wt\3\2\2\2x\27\3\2\2\2yz\7\'\2\2z{\7\b"+
		"\2\2{|\5\32\16\2|\31\3\2\2\2}\u0081\7\'\2\2~\u0081\5\24\13\2\177\u0081"+
		"\5(\25\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\33\3\2"+
		"\2\2\u0082\u0083\7\37\2\2\u0083\u0084\5\24\13\2\u0084\u0085\7\t\2\2\u0085"+
		"\u008a\3\2\2\2\u0086\u0087\7\37\2\2\u0087\u0088\7\'\2\2\u0088\u008a\7"+
		"\t\2\2\u0089\u0082\3\2\2\2\u0089\u0086\3\2\2\2\u008a\35\3\2\2\2\u008b"+
		"\u008c\7\36\2\2\u008c\u008d\5\22\n\2\u008d\u008e\7\'\2\2\u008e\u008f\7"+
		"\3\2\2\u008f\u0090\5 \21\2\u0090\u0091\7\4\2\2\u0091\u0092\7\6\2\2\u0092"+
		"\u0093\5\6\4\2\u0093\u0094\5\34\17\2\u0094\u0095\7\7\2\2\u0095\37\3\2"+
		"\2\2\u0096\u0097\5\22\n\2\u0097\u0098\7\'\2\2\u0098\u0099\7\27\2\2\u0099"+
		"\u009a\5 \21\2\u009a\u009f\3\2\2\2\u009b\u009c\5\22\n\2\u009c\u009d\7"+
		"\'\2\2\u009d\u009f\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u009b\3\2\2\2\u009f"+
		"!\3\2\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\27\2\2\u00a2\u00a3\5\"\22"+
		"\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\5\32\16\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6#\3\2\2\2\u00a7\u00a8\7\'\2\2\u00a8\u00a9\7\3\2\2"+
		"\u00a9\u00aa\5\"\22\2\u00aa\u00ab\7\4\2\2\u00ab%\3\2\2\2\u00ac\u00ad\b"+
		"\24\1\2\u00ad\u00ae\7\3\2\2\u00ae\u00af\5&\24\2\u00af\u00b0\7\4\2\2\u00b0"+
		"\u00b7\3\2\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b7\5&\24\6\u00b3\u00b7\5"+
		"*\26\2\u00b4\u00b7\5$\23\2\u00b5\u00b7\7\'\2\2\u00b6\u00ac\3\2\2\2\u00b6"+
		"\u00b1\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2"+
		"\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\f\7\2\2\u00b9\u00ba\t\4\2\2\u00ba"+
		"\u00bc\5&\24\b\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\'\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1"+
		"\b\25\1\2\u00c1\u00c2\7\3\2\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\7\4\2\2"+
		"\u00c4\u00c8\3\2\2\2\u00c5\u00c8\7#\2\2\u00c6\u00c8\7\'\2\2\u00c7\u00c0"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00d1\3\2\2\2\u00c9"+
		"\u00ca\f\6\2\2\u00ca\u00cb\t\5\2\2\u00cb\u00d0\5(\25\7\u00cc\u00cd\f\5"+
		"\2\2\u00cd\u00ce\t\6\2\2\u00ce\u00d0\5(\25\6\u00cf\u00c9\3\2\2\2\u00cf"+
		"\u00cc\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2)\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6"+
		"\7\33\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00ed\3\2\2\2\u00d8\u00d9\5\32\16"+
		"\2\u00d9\u00da\7\32\2\2\u00da\u00db\5\32\16\2\u00db\u00ed\3\2\2\2\u00dc"+
		"\u00dd\5\32\16\2\u00dd\u00de\7\31\2\2\u00de\u00df\5\32\16\2\u00df\u00ed"+
		"\3\2\2\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\7\30\2\2\u00e2\u00e3\5\32\16"+
		"\2\u00e3\u00ed\3\2\2\2\u00e4\u00e5\5\32\16\2\u00e5\u00e6\7\35\2\2\u00e6"+
		"\u00e7\5\32\16\2\u00e7\u00ed\3\2\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00ea"+
		"\7\34\2\2\u00ea\u00eb\5\32\16\2\u00eb\u00ed\3\2\2\2\u00ec\u00d4\3\2\2"+
		"\2\u00ec\u00d8\3\2\2\2\u00ec\u00dc\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e4"+
		"\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ef\7\r\2\2\u00ef"+
		"\u00f0\7\3\2\2\u00f0\u00f1\5&\24\2\u00f1\u00f2\7\4\2\2\u00f2\u00f3\7\6"+
		"\2\2\u00f3\u00f4\5\6\4\2\u00f4\u00f5\7\7\2\2\u00f5\u00f6\7\16\2\2\u00f6"+
		"\u00f7\7\6\2\2\u00f7\u00f8\5\6\4\2\u00f8\u00f9\7\7\2\2\u00f9\u010d\3\2"+
		"\2\2\u00fa\u00fb\7\r\2\2\u00fb\u00fc\7\3\2\2\u00fc\u00fd\5&\24\2\u00fd"+
		"\u00fe\7\4\2\2\u00fe\u00ff\7\6\2\2\u00ff\u0100\5\6\4\2\u0100\u0101\7\7"+
		"\2\2\u0101\u0102\7\16\2\2\u0102\u0103\5,\27\2\u0103\u010d\3\2\2\2\u0104"+
		"\u0105\7\r\2\2\u0105\u0106\7\3\2\2\u0106\u0107\5&\24\2\u0107\u0108\7\4"+
		"\2\2\u0108\u0109\7\6\2\2\u0109\u010a\5\6\4\2\u010a\u010b\7\7\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u00ee\3\2\2\2\u010c\u00fa\3\2\2\2\u010c\u0104\3\2"+
		"\2\2\u010d-\3\2\2\2\u010e\u010f\7\17\2\2\u010f\u0110\7\3\2\2\u0110\u0111"+
		"\5&\24\2\u0111\u0112\7\4\2\2\u0112\u0113\7\6\2\2\u0113\u0114\5\6\4\2\u0114"+
		"\u0115\7\7\2\2\u0115/\3\2\2\2\24:IOS^mw\u0080\u0089\u009e\u00a5\u00b6"+
		"\u00bd\u00c7\u00cf\u00d1\u00ec\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}