/**
 * This class provides the extension for an empty implementation of {@link EasyLangListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class EasyLangBaseListenerExt extends EasyLangBaseListener implements EasyLangListenerExt {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLogicalExpression(EasyLangParser.LogicalExpressionContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLogicalExpression(EasyLangParser.LogicalExpressionContext ctx) {

    }
}
