import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EasyLangListenerImpl extends EasyLangBaseListener {

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

    @Override
    public void enterCode(EasyLangParser.CodeContext ctx) {
        super.enterCode(ctx);
    }

    @Override
    public void exitCode(EasyLangParser.CodeContext ctx) {
        super.exitCode(ctx);
    }

    @Override
    public void enterExpression(EasyLangParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(EasyLangParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
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
//        if (ctx.T_ID() != null) {
//            finalCode += "System.out.println(" + ctx.T_ID() + ")";
//        } else {
//            finalCode += "System.out.println(" + ctx.value().getText() + ")";
//        }
//    }
//
//    @Override
//    public void exitPrintExpression(EasyLangParser.PrintExpressionContext ctx) {
//        super.exitPrintExpression(ctx);
//    }

//    @Override
//    public void enterStartFunction(EasyLangParser.StartFunctionContext ctx) {
//        super.enterStartFunction(ctx);
//
//        finalCode += "\n\tpublic static void main(String[] args) {\n";
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
//        if (ctx.T_BOOL_TRUE() != null) {
//            finalCode += "true";
//        } else if (ctx.T_BOOL_FALSE() != null) {
//            finalCode += "false";
//        }
//    }
//
//    @Override
//    public void exitBool_val(EasyLangParser.Bool_valContext ctx) {
//        super.exitBool_val(ctx);
//    }

//    @Override
//    public void enterType(EasyLangParser.TypeContext ctx) {
//        super.enterType(ctx);
//
//        if (ctx.T_INTEGER() != null) {
//            finalCode += "int ";
//        } else if (ctx.T_BOOL() != null) {
//            finalCode += "boolean ";
//        } else if (ctx.T_STRING() != null) {
//            finalCode += "String ";
//        }
//    }
//
//    @Override
//    public void exitType(EasyLangParser.TypeContext ctx) {
//        super.exitType(ctx);
//    }

//    @Override
//    public void enterValue(EasyLangParser.ValueContext ctx) {
//        super.enterValue(ctx);
//
//        if (ctx.T_INTEGER_VAL() != null) {
//            finalCode += ctx.T_INTEGER_VAL();
//        } else if (ctx.T_STRING_VAL() != null) {
//            finalCode += ctx.T_STRING_VAL();
//        } else if (ctx.bool_val() != null) {
//            if (ctx.bool_val().getText().equals("prawda")) {
//                finalCode += "true";
//            } else {
//                finalCode += "false";
//            }
//        }
//    }
//
//    @Override
//    public void exitValue(EasyLangParser.ValueContext ctx) {
//        super.exitValue(ctx);
//    }

    @Override
    public void enterVarDeclaration(EasyLangParser.VarDeclarationContext ctx) {
        super.enterVarDeclaration(ctx);
    }

    @Override
    public void exitVarDeclaration(EasyLangParser.VarDeclarationContext ctx) {
        super.exitVarDeclaration(ctx);
    }

    @Override
    public void enterVarExpression(EasyLangParser.VarExpressionContext ctx) {
        super.enterVarExpression(ctx);

//        finalCode += ctx.T_ID() + " = ";
    }

    @Override
    public void exitVarExpression(EasyLangParser.VarExpressionContext ctx) {
        super.exitVarExpression(ctx);
    }

    @Override
    public void enterFactor(EasyLangParser.FactorContext ctx) {
        super.enterFactor(ctx);

//        if (ctx.T_ID() != null) {
//            finalCode += ctx.T_ID();
//        }
//        else {
//            finalCode += ctx.arithmeticExpression();
//        }
    }

    @Override
    public void exitFactor(EasyLangParser.FactorContext ctx) {
        super.exitFactor(ctx);
    }

    @Override
    public void enterArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {
        super.enterArithmeticExpression(ctx);

        if (ctx.T_ID() != null) {
            finalCode += ctx.T_ID();
        } else if (ctx.T_INTEGER_VAL() != null) {
            finalCode += ctx.T_INTEGER_VAL();
        }
        else if (ctx.arithmeticExpression().contains("*")) {
            finalCode += ""; // TODO
        }
    }

    @Override
    public void exitArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {
        super.exitArithmeticExpression(ctx);
    }

//    @Override
//    public void enterReturnn(EasyLangParser.ReturnnContext ctx) {
//        super.enterReturnn(ctx);
//
//        if (ctx.T_ID() != null) {
//            finalCode += "return " + ctx.T_ID() + ";";
//        } else {
//            finalCode += "return " + ctx.value().getText() + ";";
//        }
//    }
//
//    @Override
//    public void exitReturnn(EasyLangParser.ReturnnContext ctx) {
//        super.exitReturnn(ctx);
//    }

    @Override
    public void enterFunction(EasyLangParser.FunctionContext ctx) {
        super.enterFunction(ctx);
    }

    @Override
    public void exitFunction(EasyLangParser.FunctionContext ctx) {
        super.exitFunction(ctx);
    }

    @Override
    public void enterTypedArgList(EasyLangParser.TypedArgListContext ctx) {
        super.enterTypedArgList(ctx);
    }

    @Override
    public void exitTypedArgList(EasyLangParser.TypedArgListContext ctx) {
        super.exitTypedArgList(ctx);
    }

    @Override
    public void enterArgList(EasyLangParser.ArgListContext ctx) {
        super.enterArgList(ctx);
    }

    @Override
    public void exitArgList(EasyLangParser.ArgListContext ctx) {
        super.exitArgList(ctx);
    }

    @Override
    public void enterFunctionCall(EasyLangParser.FunctionCallContext ctx) {
        super.enterFunctionCall(ctx);
    }

    @Override
    public void exitFunctionCall(EasyLangParser.FunctionCallContext ctx) {
        super.exitFunctionCall(ctx);
    }

    @Override
    public void enterLogicalExpression(EasyLangParser.LogicalExpressionContext ctx) {
        super.enterLogicalExpression(ctx);
    }

    @Override
    public void exitLogicalExpression(EasyLangParser.LogicalExpressionContext ctx) {
        super.exitLogicalExpression(ctx);
    }

    @Override
    public void enterCompareExpression(EasyLangParser.CompareExpressionContext ctx) {
        super.enterCompareExpression(ctx);
    }

    @Override
    public void exitCompareExpression(EasyLangParser.CompareExpressionContext ctx) {
        super.exitCompareExpression(ctx);
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
