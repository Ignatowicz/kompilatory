// Generated from EasyLang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EasyLangParser}.
 */
public interface EasyLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(EasyLangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(EasyLangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EasyLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EasyLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(EasyLangParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(EasyLangParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EasyLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EasyLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#flowExpression}.
	 * @param ctx the parse tree
	 */
	void enterFlowExpression(EasyLangParser.FlowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#flowExpression}.
	 * @param ctx the parse tree
	 */
	void exitFlowExpression(EasyLangParser.FlowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(EasyLangParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(EasyLangParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#startFunction}.
	 * @param ctx the parse tree
	 */
	void enterStartFunction(EasyLangParser.StartFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#startFunction}.
	 * @param ctx the parse tree
	 */
	void exitStartFunction(EasyLangParser.StartFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void enterBool_val(EasyLangParser.Bool_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void exitBool_val(EasyLangParser.Bool_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EasyLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EasyLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(EasyLangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(EasyLangParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(EasyLangParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(EasyLangParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#varExpression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpression(EasyLangParser.VarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#varExpression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpression(EasyLangParser.VarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(EasyLangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(EasyLangParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericAtomExp(EasyLangParser.NumericAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericAtomExp(EasyLangParser.NumericAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExp(EasyLangParser.MulDivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExp(EasyLangParser.MulDivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(EasyLangParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(EasyLangParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdAtomExp(EasyLangParser.IdAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtomExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdAtomExp(EasyLangParser.IdAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExp(EasyLangParser.AddSubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExp(EasyLangParser.AddSubExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#returnn}.
	 * @param ctx the parse tree
	 */
	void enterReturnn(EasyLangParser.ReturnnContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#returnn}.
	 * @param ctx the parse tree
	 */
	void exitReturnn(EasyLangParser.ReturnnContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(EasyLangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(EasyLangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#typedArgList}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgList(EasyLangParser.TypedArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#typedArgList}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgList(EasyLangParser.TypedArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(EasyLangParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(EasyLangParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(EasyLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(EasyLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(EasyLangParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(EasyLangParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(EasyLangParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(EasyLangParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(EasyLangParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(EasyLangParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLangParser#untilExpression}.
	 * @param ctx the parse tree
	 */
	void enterUntilExpression(EasyLangParser.UntilExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLangParser#untilExpression}.
	 * @param ctx the parse tree
	 */
	void exitUntilExpression(EasyLangParser.UntilExpressionContext ctx);
}