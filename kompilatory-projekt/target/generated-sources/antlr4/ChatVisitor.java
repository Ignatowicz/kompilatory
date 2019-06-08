// Generated from EasyLang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChatParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ChatParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(ChatParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ChatParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#flowExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowExpression(ChatParser.FlowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(ChatParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#startFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartFunction(ChatParser.StartFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#bool_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_val(ChatParser.Bool_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ChatParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ChatParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(ChatParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#varExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpression(ChatParser.VarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ChatParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(ChatParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#returnn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnn(ChatParser.ReturnnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ChatParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#typedArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedArgList(ChatParser.TypedArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(ChatParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ChatParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(ChatParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(ChatParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(ChatParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChatParser#untilExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilExpression(ChatParser.UntilExpressionContext ctx);
}