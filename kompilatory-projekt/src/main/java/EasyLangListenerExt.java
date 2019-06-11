/**
 * This interface defines the extension to complete listener for a parse tree produced by me
 * {@link EasyLangParser}.
 */
public interface EasyLangListenerExt extends EasyLangListener {
    /**
     * Enter a parse tree produced by me {@link EasyLangParser#arithmeticExpression()}.
     * @param ctx the parse tree
     */
    void enterArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx);
    /**
     * Exit a parse tree produced by me {@link EasyLangParser#arithmeticExpression()}.
     * @param ctx the parse tree
     */
    void exitArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx);
    /**
     * Enter a parse tree produced by me {@link EasyLangParser#logicalExpression()}.
     * @param ctx the parse tree
     */
    void enterLogicalExpression(EasyLangParser.LogicalExpressionContext ctx);
    /**
     * Exit a parse tree produced by me {@link EasyLangParser#logicalExpression()}.
     * @param ctx the parse tree
     */
    void exitLogicalExpression(EasyLangParser.LogicalExpressionContext ctx);
}
