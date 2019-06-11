public interface EasyLangListenerExt extends EasyLangListener {

    void enterArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx);

    void exitArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx);
}
