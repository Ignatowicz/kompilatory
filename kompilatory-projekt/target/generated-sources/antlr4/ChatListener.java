// Generated from Chat.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChatParser}.
 */
public interface ChatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChatParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ChatParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ChatParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(ChatParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(ChatParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ChatParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ChatParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#flowExpression}.
	 * @param ctx the parse tree
	 */
	void enterFlowExpression(ChatParser.FlowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#flowExpression}.
	 * @param ctx the parse tree
	 */
	void exitFlowExpression(ChatParser.FlowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(ChatParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#printExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(ChatParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#startFunction}.
	 * @param ctx the parse tree
	 */
	void enterStartFunction(ChatParser.StartFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#startFunction}.
	 * @param ctx the parse tree
	 */
	void exitStartFunction(ChatParser.StartFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void enterBool_val(ChatParser.Bool_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#bool_val}.
	 * @param ctx the parse tree
	 */
	void exitBool_val(ChatParser.Bool_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ChatParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ChatParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ChatParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ChatParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(ChatParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(ChatParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#varExpression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpression(ChatParser.VarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#varExpression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpression(ChatParser.VarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ChatParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ChatParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(ChatParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(ChatParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#returnn}.
	 * @param ctx the parse tree
	 */
	void enterReturnn(ChatParser.ReturnnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#returnn}.
	 * @param ctx the parse tree
	 */
	void exitReturnn(ChatParser.ReturnnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ChatParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ChatParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#typedArgList}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgList(ChatParser.TypedArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#typedArgList}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgList(ChatParser.TypedArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(ChatParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(ChatParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ChatParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ChatParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(ChatParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(ChatParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(ChatParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#compareExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(ChatParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(ChatParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(ChatParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatParser#untilExpression}.
	 * @param ctx the parse tree
	 */
	void enterUntilExpression(ChatParser.UntilExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatParser#untilExpression}.
	 * @param ctx the parse tree
	 */
	void exitUntilExpression(ChatParser.UntilExpressionContext ctx);
}