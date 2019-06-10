// Generated from EasyLang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EasyLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EasyLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(EasyLangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EasyLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(EasyLangParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EasyLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#flowExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowExpression(EasyLangParser.FlowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#printExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(EasyLangParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#startFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartFunction(EasyLangParser.StartFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#bool_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_val(EasyLangParser.Bool_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(EasyLangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(EasyLangParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(EasyLangParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#varExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpression(EasyLangParser.VarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(EasyLangParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#returnn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnn(EasyLangParser.ReturnnContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(EasyLangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#typedArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedArgList(EasyLangParser.TypedArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(EasyLangParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(EasyLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(EasyLangParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(EasyLangParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(EasyLangParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EasyLangParser#untilExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntilExpression(EasyLangParser.UntilExpressionContext ctx);
}