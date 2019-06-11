import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EasyLangListenerImpl extends EasyLangBaseListenerExt {

    public String finalCode = "";


//    @Override
//    public void enterStart(EasyLangParser.StartContext ctx) {
//        super.enterStart(ctx);
//
//        finalCode += "public class Main {\n";
//    }
//
//    @Override
//    public void exitStart(EasyLangParser.StartContext ctx) {
//        super.exitStart(ctx);
//
//        finalCode += "}";
//    }

    @Override
    public void enterProgram(EasyLangParser.ProgramContext ctx) {
        super.enterProgram(ctx);
    }

    @Override
    public void exitProgram(EasyLangParser.ProgramContext ctx) {
        super.exitProgram(ctx);
    }

    private void ifProgram(EasyLangParser.ProgramContext ctx) {

    }

    @Override
    public void enterCode(EasyLangParser.CodeContext ctx) {
        super.enterCode(ctx);
    }

    @Override
    public void exitCode(EasyLangParser.CodeContext ctx) {
        super.exitCode(ctx);
    }

    private void ifCode(EasyLangParser.CodeContext ctx) {

    }

//    @Override
//    public void enterExpression(EasyLangParser.ExpressionContext ctx) {
//        super.enterExpression(ctx);
//
//        ifExpression(ctx);
//    }
//
//    @Override
//    public void exitExpression(EasyLangParser.ExpressionContext ctx) {
//        super.exitExpression(ctx);
//    }

    private void ifExpression(EasyLangParser.ExpressionContext ctx) {
        if (ctx.varDeclaration() != null)
            ifVarDeclaration(ctx.varDeclaration());
        if (ctx.varExpression() != null)
            enterVarExpression(ctx.varExpression());
        if (ctx.printExpression() != null)
            ifPrint(ctx.printExpression());
        if (ctx.functionCall() != null)
            enterFunctionCall(ctx.functionCall());
    }

    @Override
    public void enterFlowExpression(EasyLangParser.FlowExpressionContext ctx) {
        super.enterFlowExpression(ctx);
    }

    @Override
    public void exitFlowExpression(EasyLangParser.FlowExpressionContext ctx) {
        super.exitFlowExpression(ctx);
    }

//    @Override
//    public void enterPrintExpression(EasyLangParser.PrintExpressionContext ctx) {
//        super.enterPrintExpression(ctx);
//
//        ifPrint(ctx);
//    }
//
//    @Override
//    public void exitPrintExpression(EasyLangParser.PrintExpressionContext ctx) {
//        super.exitPrintExpression(ctx);
//    }

    private void ifPrint(EasyLangParser.PrintExpressionContext ctx) {
        if (ctx.T_ID() != null) {
            finalCode += "System.out.println(" + ctx.T_ID() + ")";
        }

        if (ctx.T_PRINT() != null){
            finalCode += "System.out.println(" + ctx.value().getText() + ")";
        }
    }

//    @Override
//    public void enterStartFunction(EasyLangParser.StartFunctionContext ctx) {
//        super.enterStartFunction(ctx);
//
//        finalCode += "\n\tpublic static void main(String[] args) {\n";
//
//        ifCode(ctx.code());
//    }
//
//    @Override
//    public void exitStartFunction(EasyLangParser.StartFunctionContext ctx) {
//        super.exitStartFunction(ctx);
//
//        finalCode += "\t}\n";
//    }

//    @Override
//    public void enterBool_val(EasyLangParser.Bool_valContext ctx) {
//        super.enterBool_val(ctx);
//
//        ifBool(ctx);
//    }
//
//    @Override
//    public void exitBool_val(EasyLangParser.Bool_valContext ctx) {
//        super.exitBool_val(ctx);
//    }
//
    private void ifBool(EasyLangParser.Bool_valContext ctx) {
        if (ctx.T_BOOL_TRUE() != null) {
            finalCode += "true";
        }

        if (ctx.T_BOOL_FALSE() != null) {
            finalCode += "false";
        }
    }

//    @Override
//    public void enterType(EasyLangParser.TypeContext ctx) {
//        super.enterType(ctx);
//
//        ifType(ctx);
//    }
//
//    @Override
//    public void exitType(EasyLangParser.TypeContext ctx) {
//        super.exitType(ctx);
//    }

    private void ifType(EasyLangParser.TypeContext ctx) {
        if (ctx.T_INTEGER() != null) {
            finalCode += "int ";
        }

        if (ctx.T_BOOL() != null) {
            finalCode += "boolean ";
        }

        if (ctx.T_STRING() != null) {
            finalCode += "String ";
        }
    }

//    @Override
//    public void enterValue(EasyLangParser.ValueContext ctx) {
//        super.enterValue(ctx);
//
//        ifValue(ctx);
//    }
//
//    @Override
//    public void exitValue(EasyLangParser.ValueContext ctx) {
//        super.exitValue(ctx);
//    }

    private void ifValue(EasyLangParser.ValueContext ctx) {
        if (ctx.T_INTEGER_VAL() != null) {
            finalCode += ctx.T_INTEGER_VAL();
        }

        if (ctx.T_STRING_VAL() != null) {
            finalCode += ctx.T_STRING_VAL();
        }

        if (ctx.bool_val() != null) {
            ifBool(ctx.bool_val());
        }
    }

//    @Override
//    public void enterVarDeclaration(EasyLangParser.VarDeclarationContext ctx) {
//        super.enterVarDeclaration(ctx);
//
//        ifVarDeclaration(ctx);
//    }
//
//    @Override
//    public void exitVarDeclaration(EasyLangParser.VarDeclarationContext ctx) {
//        super.exitVarDeclaration(ctx);
//    }

    private void ifVarDeclaration(EasyLangParser.VarDeclarationContext ctx) {
        if (ctx.factor() != null) {
            ifType(ctx.type());

            finalCode += ctx.T_ID() + " = ";

            ifFactor(ctx.factor());
        } else {
            ifType(ctx.type());

            finalCode += ctx.T_ID();
        }
    }

//    @Override
//    public void enterVarExpression(EasyLangParser.VarExpressionContext ctx) {
//        super.enterVarExpression(ctx);
//
//        finalCode += ctx.T_ID() + " = ";
//        ifFactor(ctx.factor());
//    }
//
//    @Override
//    public void exitVarExpression(EasyLangParser.VarExpressionContext ctx) {
//        super.exitVarExpression(ctx);
//    }

//    @Override
//    public void enterFactor(EasyLangParser.FactorContext ctx) {
//        super.enterFactor(ctx);
//
//        ifFactor(ctx);
//    }
//
//    @Override
//    public void exitFactor(EasyLangParser.FactorContext ctx) {
//        super.exitFactor(ctx);
//    }

    private void ifFactor(EasyLangParser.FactorContext ctx) {
        if (ctx.T_ID() != null) {
            finalCode += ctx.T_ID();
        }

        if (ctx.value() != null) {
            ifValue(ctx.value());
        }

        if (ctx.arithmeticExpression() != null) {
            ifArithmeticExpression(ctx.arithmeticExpression());
        }
    }

// TODO done
    @Override
    public void enterArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {
        super.enterArithmeticExpression(ctx);
    }

    @Override
    public void exitArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {
        super.exitArithmeticExpression(ctx);
    }

    private void ifArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {
        enterArithmeticExpression(ctx);
    }

//    @Override
//    public void enterParenthesisExp(EasyLangParser.ParenthesisExpContext ctx) {
//        super.enterParenthesisExp(ctx);
//
//        finalCode += '(';
//    }
//
//    @Override
//    public void exitParenthesisExp(EasyLangParser.ParenthesisExpContext ctx) {
//        super.exitParenthesisExp(ctx);
//
//        finalCode += ')';
//    }
//
//    @Override
//    public void enterMulDivExp(EasyLangParser.MulDivExpContext ctx) {
//        super.enterMulDivExp(ctx);
//
//
//        ifEnterMulDiv(ctx);
//    }

    private void ifEnterMulDiv(EasyLangParser.MulDivExpContext ctx) {
        String left = ctx.arithmeticExpression(0).getText();
        String right = ctx.arithmeticExpression(1).getText();

        if (left.length() == 1 && right.length() == 1) {
            if (ctx.T_ASTERISK() != null)
                finalCode += left + " * " + right;
            else if (ctx.T_SLASH() != null)
                finalCode += left + " / " + right;
        }

        if (left.length() == 1 && right.length() != 1) {
            if (ctx.T_ASTERISK() != null)
                finalCode += left + " * ";
            else if (ctx.T_SLASH() != null)
                finalCode += left + " / ";
        }
    }

//    @Override
//    public void exitMulDivExp(EasyLangParser.MulDivExpContext ctx) {
//        super.exitMulDivExp(ctx);
//
//        ifExitMulDiv(ctx);
//    }

    private void ifExitMulDiv(EasyLangParser.MulDivExpContext ctx) {
        String left = ctx.arithmeticExpression(0).getText();
        String right = ctx.arithmeticExpression(1).getText();

        if (left.length() != 1 && right.length() == 1) {
            if (ctx.T_ASTERISK() != null)
                finalCode += " * " + right;
            else if (ctx.T_SLASH() != null)
                finalCode += " / " + right;
        }
    }

//    @Override
//    public void enterAddSubExp(EasyLangParser.AddSubExpContext ctx) {
//        super.enterAddSubExp(ctx);
//
//        ifEnterAddSub(ctx);
//    }

    private void ifEnterAddSub(EasyLangParser.AddSubExpContext ctx) {
        String left = ctx.arithmeticExpression(0).getText();
        String right = ctx.arithmeticExpression(1).getText();

        if (left.length() == 1 && right.length() == 1) {
            if (ctx.T_PLUS() != null)
                finalCode += left + " + " + right;
            else if (ctx.T_MINUS() != null)
                finalCode += left + " - " + right;
        }

        if (left.length() == 1 && right.length() != 1) {
            if (ctx.T_PLUS() != null)
                finalCode += left + " + ";
            else if (ctx.T_MINUS() != null)
                finalCode += left + " - ";
        }
    }

//    @Override
//    public void exitAddSubExp(EasyLangParser.AddSubExpContext ctx) {
//        super.exitAddSubExp(ctx);
//
//        ifExitAddSub(ctx);
//    }

    private void ifExitAddSub(EasyLangParser.AddSubExpContext ctx) {
        String left = ctx.arithmeticExpression(0).getText();
        String right = ctx.arithmeticExpression(1).getText();

        if (left.length() != 1 && right.length() == 1) {
            if (ctx.T_PLUS() != null)
                finalCode += " + " + right;
            else if (ctx.T_MINUS() != null)
                finalCode += " - " + right;
        }
    }

//    @Override
//    public void enterReturnn(EasyLangParser.ReturnnContext ctx) {
//        super.enterReturnn(ctx);
//
//        ifReturnn(ctx);
//    }
//
//    @Override
//    public void exitReturnn(EasyLangParser.ReturnnContext ctx) {
//        super.exitReturnn(ctx);
//    }

    private void ifReturnn(EasyLangParser.ReturnnContext ctx) {
        if (ctx.T_ID() != null) {
            finalCode += "return " + ctx.T_ID() + ";";
        }

        if (ctx.value() != null) {
            ifValue(ctx.value());
        }
    }

//    @Override
//    public void enterFunction(EasyLangParser.FunctionContext ctx) {
//        super.enterFunction(ctx);
//
//        finalCode += "function ";
//
//        ifType(ctx.type());
//
//        finalCode += ctx.T_ID() + "(";
//
//        ifTypedArgList(ctx.typedArgList());
//
//        finalCode += ") {\n";
//
//        ifCode(ctx.code());
//
//        ifReturnn(ctx.returnn());
//
//        finalCode += "\n}";
//    }
//
//    @Override
//    public void exitFunction(EasyLangParser.FunctionContext ctx) {
//        super.exitFunction(ctx);
//    }

    // TODO Nie nadpisywac! usunac na koniec bo to zło czyste
//    @Override
//    public void enterTypedArgList(EasyLangParser.TypedArgListContext ctx) {
//        super.enterTypedArgList(ctx);
//    }
//
//    @Override
//    public void exitTypedArgList(EasyLangParser.TypedArgListContext ctx) {
//        super.exitTypedArgList(ctx);
//    }

    private void ifTypedArgList(EasyLangParser.TypedArgListContext ctx) {
        if (ctx.T_COMMA() != null) {
            ifType(ctx.left);
            finalCode += ctx.T_ID() + ", ";
            ifTypedArgList(ctx.right);
        }
        if (ctx.T_COMMA() == null) {
            ifType(ctx.type());
            finalCode += ctx.T_ID();
        }
    }

    // TODO Nie nadpisywac! usunac na koniec bo to zło czyste
//    @Override
//    public void enterArgList(EasyLangParser.ArgListContext ctx) {
//        super.enterArgList(ctx);
//
////        System.out.println(ctx.getText());
//        ifEnterArgList(ctx);
//    }
//
//
//    @Override
//    public void exitArgList(EasyLangParser.ArgListContext ctx) {
//        super.exitArgList(ctx);
//    }

    private void ifArgList(EasyLangParser.ArgListContext ctx) {
        if (ctx.T_COMMA() != null) {
            finalCode += ctx.left.getText() + ", ";
            ifArgList(ctx.right);
        }
        if (ctx.T_COMMA() == null)
            ifFactor(ctx.factor());
    }

//    @Override
//    public void enterFunctionCall(EasyLangParser.FunctionCallContext ctx) {
//        super.enterFunctionCall(ctx);
//
//        finalCode += ctx.T_ID().getText() + '(';
//
//        ifArgList(ctx.argList());
//
//        finalCode += ')';
//    }
//
//    @Override
//    public void exitFunctionCall(EasyLangParser.FunctionCallContext ctx) {
//        super.exitFunctionCall(ctx);
//    }

    @Override
    public void enterLogicalExpression(EasyLangParser.LogicalExpressionContext ctx) {
        super.enterLogicalExpression(ctx);
    }

    @Override
    public void exitLogicalExpression(EasyLangParser.LogicalExpressionContext ctx) {
        super.exitLogicalExpression(ctx);
    }

//    @Override
//    public void enterCompareExpression(EasyLangParser.CompareExpressionContext ctx) {
//        super.enterCompareExpression(ctx);
//
//        ifCompare(ctx);
//    }
//
//
//    @Override
//    public void exitCompareExpression(EasyLangParser.CompareExpressionContext ctx) {
//        super.exitCompareExpression(ctx);
//    }

    private void ifCompare(EasyLangParser.CompareExpressionContext ctx) {
        if (ctx.T_EQ() != null) {
            ifFactor(ctx.left);
            finalCode += " = ";
            ifFactor(ctx.right);
        }
        if (ctx.T_NEQ() != null) {
            ifFactor(ctx.left);
            finalCode += " != ";
            ifFactor(ctx.right);
        }
        if (ctx.T_L() != null) {
            ifFactor(ctx.left);
            finalCode += " < ";
            ifFactor(ctx.right);
        }
        if (ctx.T_G() != null) {
            ifFactor(ctx.left);
            finalCode += " > ";
            ifFactor(ctx.right);
        }
        if (ctx.T_LEQ() != null) {
            ifFactor(ctx.left);
            finalCode += " <= ";
            ifFactor(ctx.right);
        }
        if (ctx.T_GEQ() != null) {
            ifFactor(ctx.left);
            finalCode += " >= ";
            ifFactor(ctx.right);
        }
    }


    @Override
    public void enterConditionalExpression(EasyLangParser.ConditionalExpressionContext ctx) {
        super.enterConditionalExpression(ctx);
    }

    @Override
    public void exitConditionalExpression(EasyLangParser.ConditionalExpressionContext ctx) {
        super.exitConditionalExpression(ctx);
    }

    @Override
    public void enterUntilExpression(EasyLangParser.UntilExpressionContext ctx) {
        super.enterUntilExpression(ctx);
    }

    @Override
    public void exitUntilExpression(EasyLangParser.UntilExpressionContext ctx) {
        super.exitUntilExpression(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
