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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T_END_LINE=18, T_INTEGER=19, T_STRING=20, T_BOOL=21, T_IF_CLAUSE=22, T_ELSE_CLAUSE=23, 
		T_UNTIL_CLAUSE=24, T_AND=25, T_OR=26, T_NOT=27, T_FUNCTION=28, T_RETURN=29, 
		T_PRINT=30, T_START=31, T_COMMENT=32, T_INTEGER_VAL=33, T_BOOL_TRUE=34, 
		T_BOOL_FALSE=35, T_STRING_VAL=36, T_ID=37, T_WHITESPACE=38;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_expression = 2, RULE_flowExpression = 3, 
		RULE_printExpression = 4, RULE_startFunction = 5, RULE_bool_val = 6, RULE_type = 7, 
		RULE_value = 8, RULE_varDeclaration = 9, RULE_varExpression = 10, RULE_factor = 11, 
		RULE_arithmeticExpression = 12, RULE_returnn = 13, RULE_function = 14, 
		RULE_typedArgList = 15, RULE_argList = 16, RULE_functionCall = 17, RULE_logicalExpression = 18, 
		RULE_compareExpression = 19, RULE_conditionalExpression = 20, RULE_untilExpression = 21;
	public static final String[] ruleNames = {
		"program", "code", "expression", "flowExpression", "printExpression", 
		"startFunction", "bool_val", "type", "value", "varDeclaration", "varExpression", 
		"factor", "arithmeticExpression", "returnn", "function", "typedArgList", 
		"argList", "functionCall", "logicalExpression", "compareExpression", "conditionalExpression", 
		"untilExpression"
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
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				function();
				setState(45);
				program();
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(T_COMMENT);
				setState(48);
				program();
				}
				break;
			case T_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				startFunction();
				setState(50);
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
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				expression();
				setState(55);
				match(T_END_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				expression();
				setState(58);
				match(T_END_LINE);
				setState(59);
				code();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				flowExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				flowExpression();
				setState(63);
				code();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				match(T_COMMENT);
				setState(66);
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
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				varExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				printExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
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
		enterRule(_localctx, 6, RULE_flowExpression);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_IF_CLAUSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				conditionalExpression();
				}
				break;
			case T_UNTIL_CLAUSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
		enterRule(_localctx, 8, RULE_printExpression);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T_PRINT);
				setState(80);
				match(T__0);
				setState(81);
				value();
				setState(82);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T_PRINT);
				setState(85);
				match(T__0);
				setState(86);
				match(T_ID);
				setState(87);
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
		enterRule(_localctx, 10, RULE_startFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T_START);
			setState(91);
			match(T__2);
			setState(92);
			match(T__3);
			setState(93);
			code();
			setState(94);
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
		enterRule(_localctx, 12, RULE_bool_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INTEGER_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T_INTEGER_VAL);
				}
				break;
			case T_STRING_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T_STRING_VAL);
				}
				break;
			case T_BOOL_TRUE:
			case T_BOOL_FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
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
		enterRule(_localctx, 18, RULE_varDeclaration);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				type();
				setState(106);
				match(T_ID);
				setState(107);
				match(T__5);
				setState(108);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				type();
				setState(111);
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
		enterRule(_localctx, 20, RULE_varExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T_ID);
			setState(116);
			match(T__5);
			setState(117);
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
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode T_INTEGER_VAL() { return getToken(EasyLangParser.T_INTEGER_VAL, 0); }
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INTEGER_VAL:
				{
				setState(125);
				match(T_INTEGER_VAL);
				}
				break;
			case T_ID:
				{
				setState(126);
				match(T_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						match(T__6);
						setState(131);
						arithmeticExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						match(T__7);
						setState(134);
						arithmeticExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						match(T__8);
						setState(137);
						arithmeticExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						match(T__9);
						setState(140);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T_RETURN);
				setState(147);
				value();
				setState(148);
				match(T_END_LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T_RETURN);
				setState(151);
				match(T_ID);
				setState(152);
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
			setState(155);
			match(T_FUNCTION);
			setState(156);
			type();
			setState(157);
			match(T_ID);
			setState(158);
			match(T__0);
			setState(159);
			typedArgList();
			setState(160);
			match(T__1);
			setState(161);
			match(T__3);
			setState(162);
			code();
			setState(163);
			returnn();
			setState(164);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
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
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				type();
				setState(167);
				match(T_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				type();
				setState(170);
				match(T_ID);
				setState(171);
				match(T__10);
				setState(172);
				typedArgList();
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				factor();
				setState(178);
				match(T__10);
				setState(179);
				argList();
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
			setState(183);
			match(T_ID);
			setState(184);
			match(T__0);
			setState(185);
			argList();
			setState(186);
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
		public TerminalNode T_NOT() { return getToken(EasyLangParser.T_NOT, 0); }
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public TerminalNode T_ID() { return getToken(EasyLangParser.T_ID, 0); }
		public CompareExpressionContext compareExpression() {
			return getRuleContext(CompareExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode T_OR() { return getToken(EasyLangParser.T_OR, 0); }
		public TerminalNode T_AND() { return getToken(EasyLangParser.T_AND, 0); }
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLangListener ) ((EasyLangListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EasyLangVisitor ) return ((EasyLangVisitor<? extends T>)visitor).visitLogicalExpression(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(189);
				match(T_NOT);
				setState(190);
				logicalExpression(4);
				}
				break;
			case 2:
				{
				setState(191);
				match(T_ID);
				}
				break;
			case 3:
				{
				setState(192);
				compareExpression();
				}
				break;
			case 4:
				{
				setState(193);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(196);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(197);
						match(T_OR);
						setState(198);
						logicalExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(200);
						match(T_AND);
						setState(201);
						logicalExpression(6);
						}
						break;
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
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
		enterRule(_localctx, 38, RULE_compareExpression);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				factor();
				setState(208);
				match(T__11);
				setState(209);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				factor();
				setState(212);
				match(T__12);
				setState(213);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				factor();
				setState(216);
				match(T__13);
				setState(217);
				factor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				factor();
				setState(220);
				match(T__14);
				setState(221);
				factor();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				factor();
				setState(224);
				match(T__15);
				setState(225);
				factor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				factor();
				setState(228);
				match(T__16);
				setState(229);
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
		enterRule(_localctx, 40, RULE_conditionalExpression);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T_IF_CLAUSE);
				setState(234);
				match(T__0);
				setState(235);
				logicalExpression(0);
				setState(236);
				match(T__1);
				setState(237);
				match(T__3);
				setState(238);
				code();
				setState(239);
				match(T__4);
				setState(240);
				match(T_ELSE_CLAUSE);
				setState(241);
				match(T__3);
				setState(242);
				code();
				setState(243);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T_IF_CLAUSE);
				setState(246);
				match(T__0);
				setState(247);
				logicalExpression(0);
				setState(248);
				match(T__1);
				setState(249);
				match(T__3);
				setState(250);
				code();
				setState(251);
				match(T__4);
				setState(252);
				match(T_ELSE_CLAUSE);
				setState(253);
				conditionalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(T_IF_CLAUSE);
				setState(256);
				match(T__0);
				setState(257);
				logicalExpression(0);
				setState(258);
				match(T__1);
				setState(259);
				match(T__3);
				setState(260);
				code();
				setState(261);
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
		enterRule(_localctx, 42, RULE_untilExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T_UNTIL_CLAUSE);
			setState(266);
			match(T__0);
			setState(267);
			logicalExpression(0);
			setState(268);
			match(T__1);
			setState(269);
			match(T__3);
			setState(270);
			code();
			setState(271);
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
		case 12:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 18:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\67\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\3\5\5\5P\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"t\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r}\n\r\3\16\3\16\3\16\5\16\u0082"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u0090\n\16\f\16\16\16\u0093\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u009c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b1\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00b8\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00c5\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00cd\n"+
		"\24\f\24\16\24\u00d0\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00ea\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010a\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\2\4\32&\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,\2\4\3\2$%\3\2\25\27\2\u0121\2\66\3\2\2\2\4E\3\2\2\2\6K\3\2\2"+
		"\2\bO\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22i\3\2\2"+
		"\2\24s\3\2\2\2\26u\3\2\2\2\30|\3\2\2\2\32\u0081\3\2\2\2\34\u009b\3\2\2"+
		"\2\36\u009d\3\2\2\2 \u00b0\3\2\2\2\"\u00b7\3\2\2\2$\u00b9\3\2\2\2&\u00c4"+
		"\3\2\2\2(\u00e9\3\2\2\2*\u0109\3\2\2\2,\u010b\3\2\2\2./\5\36\20\2/\60"+
		"\5\2\2\2\60\67\3\2\2\2\61\62\7\"\2\2\62\67\5\2\2\2\63\64\5\f\7\2\64\65"+
		"\7\2\2\3\65\67\3\2\2\2\66.\3\2\2\2\66\61\3\2\2\2\66\63\3\2\2\2\67\3\3"+
		"\2\2\289\5\6\4\29:\7\24\2\2:F\3\2\2\2;<\5\6\4\2<=\7\24\2\2=>\5\4\3\2>"+
		"F\3\2\2\2?F\5\b\5\2@A\5\b\5\2AB\5\4\3\2BF\3\2\2\2CD\7\"\2\2DF\5\4\3\2"+
		"E8\3\2\2\2E;\3\2\2\2E?\3\2\2\2E@\3\2\2\2EC\3\2\2\2F\5\3\2\2\2GL\5\24\13"+
		"\2HL\5\26\f\2IL\5\n\6\2JL\5$\23\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2"+
		"\2\2L\7\3\2\2\2MP\5*\26\2NP\5,\27\2OM\3\2\2\2ON\3\2\2\2P\t\3\2\2\2QR\7"+
		" \2\2RS\7\3\2\2ST\5\22\n\2TU\7\4\2\2U[\3\2\2\2VW\7 \2\2WX\7\3\2\2XY\7"+
		"\'\2\2Y[\7\4\2\2ZQ\3\2\2\2ZV\3\2\2\2[\13\3\2\2\2\\]\7!\2\2]^\7\5\2\2^"+
		"_\7\6\2\2_`\5\4\3\2`a\7\7\2\2a\r\3\2\2\2bc\t\2\2\2c\17\3\2\2\2de\t\3\2"+
		"\2e\21\3\2\2\2fj\7#\2\2gj\7&\2\2hj\5\16\b\2if\3\2\2\2ig\3\2\2\2ih\3\2"+
		"\2\2j\23\3\2\2\2kl\5\20\t\2lm\7\'\2\2mn\7\b\2\2no\5\30\r\2ot\3\2\2\2p"+
		"q\5\20\t\2qr\7\'\2\2rt\3\2\2\2sk\3\2\2\2sp\3\2\2\2t\25\3\2\2\2uv\7\'\2"+
		"\2vw\7\b\2\2wx\5\30\r\2x\27\3\2\2\2y}\7\'\2\2z}\5\22\n\2{}\5\32\16\2|"+
		"y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\31\3\2\2\2~\177\b\16\1\2\177\u0082\7#\2"+
		"\2\u0080\u0082\7\'\2\2\u0081~\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0091"+
		"\3\2\2\2\u0083\u0084\f\b\2\2\u0084\u0085\7\t\2\2\u0085\u0090\5\32\16\t"+
		"\u0086\u0087\f\7\2\2\u0087\u0088\7\n\2\2\u0088\u0090\5\32\16\b\u0089\u008a"+
		"\f\6\2\2\u008a\u008b\7\13\2\2\u008b\u0090\5\32\16\7\u008c\u008d\f\5\2"+
		"\2\u008d\u008e\7\f\2\2\u008e\u0090\5\32\16\6\u008f\u0083\3\2\2\2\u008f"+
		"\u0086\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093\u0091"+
		"\3\2\2\2\u0094\u0095\7\37\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\24\2"+
		"\2\u0097\u009c\3\2\2\2\u0098\u0099\7\37\2\2\u0099\u009a\7\'\2\2\u009a"+
		"\u009c\7\24\2\2\u009b\u0094\3\2\2\2\u009b\u0098\3\2\2\2\u009c\35\3\2\2"+
		"\2\u009d\u009e\7\36\2\2\u009e\u009f\5\20\t\2\u009f\u00a0\7\'\2\2\u00a0"+
		"\u00a1\7\3\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\7\6"+
		"\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7\7\7\2\2\u00a7"+
		"\37\3\2\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\7\'\2\2\u00aa\u00b1\3\2\2"+
		"\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\7\'\2\2\u00ad\u00ae\7\r\2\2\u00ae"+
		"\u00af\5 \21\2\u00af\u00b1\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ab\3\2"+
		"\2\2\u00b1!\3\2\2\2\u00b2\u00b8\5\30\r\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5"+
		"\7\r\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b8\3\2\2\2\u00b7\u00b2\3\2\2\2"+
		"\u00b7\u00b3\3\2\2\2\u00b8#\3\2\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00bb\7"+
		"\3\2\2\u00bb\u00bc\5\"\22\2\u00bc\u00bd\7\4\2\2\u00bd%\3\2\2\2\u00be\u00bf"+
		"\b\24\1\2\u00bf\u00c0\7\35\2\2\u00c0\u00c5\5&\24\6\u00c1\u00c5\7\'\2\2"+
		"\u00c2\u00c5\5(\25\2\u00c3\u00c5\5$\23\2\u00c4\u00be\3\2\2\2\u00c4\u00c1"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00ce\3\2\2\2\u00c6"+
		"\u00c7\f\b\2\2\u00c7\u00c8\7\34\2\2\u00c8\u00cd\5&\24\t\u00c9\u00ca\f"+
		"\7\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cd\5&\24\b\u00cc\u00c6\3\2\2\2\u00cc"+
		"\u00c9\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\'\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\30\r\2\u00d2\u00d3"+
		"\7\16\2\2\u00d3\u00d4\5\30\r\2\u00d4\u00ea\3\2\2\2\u00d5\u00d6\5\30\r"+
		"\2\u00d6\u00d7\7\17\2\2\u00d7\u00d8\5\30\r\2\u00d8\u00ea\3\2\2\2\u00d9"+
		"\u00da\5\30\r\2\u00da\u00db\7\20\2\2\u00db\u00dc\5\30\r\2\u00dc\u00ea"+
		"\3\2\2\2\u00dd\u00de\5\30\r\2\u00de\u00df\7\21\2\2\u00df\u00e0\5\30\r"+
		"\2\u00e0\u00ea\3\2\2\2\u00e1\u00e2\5\30\r\2\u00e2\u00e3\7\22\2\2\u00e3"+
		"\u00e4\5\30\r\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\7"+
		"\23\2\2\u00e7\u00e8\5\30\r\2\u00e8\u00ea\3\2\2\2\u00e9\u00d1\3\2\2\2\u00e9"+
		"\u00d5\3\2\2\2\u00e9\u00d9\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e1\3\2"+
		"\2\2\u00e9\u00e5\3\2\2\2\u00ea)\3\2\2\2\u00eb\u00ec\7\30\2\2\u00ec\u00ed"+
		"\7\3\2\2\u00ed\u00ee\5&\24\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\7\6\2\2\u00f0"+
		"\u00f1\5\4\3\2\u00f1\u00f2\7\7\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\7"+
		"\6\2\2\u00f4\u00f5\5\4\3\2\u00f5\u00f6\7\7\2\2\u00f6\u010a\3\2\2\2\u00f7"+
		"\u00f8\7\30\2\2\u00f8\u00f9\7\3\2\2\u00f9\u00fa\5&\24\2\u00fa\u00fb\7"+
		"\4\2\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\5\4\3\2\u00fd\u00fe\7\7\2\2\u00fe"+
		"\u00ff\7\31\2\2\u00ff\u0100\5*\26\2\u0100\u010a\3\2\2\2\u0101\u0102\7"+
		"\30\2\2\u0102\u0103\7\3\2\2\u0103\u0104\5&\24\2\u0104\u0105\7\4\2\2\u0105"+
		"\u0106\7\6\2\2\u0106\u0107\5\4\3\2\u0107\u0108\7\7\2\2\u0108\u010a\3\2"+
		"\2\2\u0109\u00eb\3\2\2\2\u0109\u00f7\3\2\2\2\u0109\u0101\3\2\2\2\u010a"+
		"+\3\2\2\2\u010b\u010c\7\32\2\2\u010c\u010d\7\3\2\2\u010d\u010e\5&\24\2"+
		"\u010e\u010f\7\4\2\2\u010f\u0110\7\6\2\2\u0110\u0111\5\4\3\2\u0111\u0112"+
		"\7\7\2\2\u0112-\3\2\2\2\25\66EKOZis|\u0081\u008f\u0091\u009b\u00b0\u00b7"+
		"\u00c4\u00cc\u00ce\u00e9\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}