import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EasyLangListenerImpl extends EasyLangBaseListener {

    public String finalCode = "";
    public int indent = 0;

    @Override
    public void enterArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {
        super.enterArithmeticExpression(ctx);
        if(ctx.T_INTEGER_VAL() != null){
            finalCode += ctx.getText();
        }
    }

    @Override
    public void exitArithmeticExpression(EasyLangParser.ArithmeticExpressionContext ctx) {
        super.exitArithmeticExpression(ctx);
    }

    @Override
    public void enterStart(EasyLangParser.StartContext ctx) {
        super.enterStart(ctx);
        finalCode += "public class Main {\n";
        indent++;
    }

    @Override
    public void exitStart(EasyLangParser.StartContext ctx) {
        super.exitStart(ctx);
        finalCode += "}\n";
        indent--;
    }

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
        addIndent();
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

    @Override
    public void enterPrintExpression(EasyLangParser.PrintExpressionContext ctx) {
        super.enterPrintExpression(ctx);
        finalCode += "System.out.println";

    }

    @Override
    public void exitPrintExpression(EasyLangParser.PrintExpressionContext ctx) {
        super.exitPrintExpression(ctx);
    }

    @Override
    public void enterStartFunction(EasyLangParser.StartFunctionContext ctx) {
        super.enterStartFunction(ctx);
        addIndent();
        indent++;
        finalCode += "public static void main(String[] argv)";
    }

    @Override
    public void exitStartFunction(EasyLangParser.StartFunctionContext ctx) {
        super.exitStartFunction(ctx);
        indent--;
    }

    @Override
    public void enterBool_val(EasyLangParser.Bool_valContext ctx) {
        super.enterBool_val(ctx);
        if( ctx.T_BOOL_FALSE() != null){
            finalCode += "false";
        }
        if( ctx.T_BOOL_TRUE() != null){
            finalCode += "true";
        }
    }

    @Override
    public void exitBool_val(EasyLangParser.Bool_valContext ctx) {
        super.exitBool_val(ctx);
    }

    @Override
    public void enterType(EasyLangParser.TypeContext ctx) {
        super.enterType(ctx);
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

    @Override
    public void exitType(EasyLangParser.TypeContext ctx) {
        super.exitType(ctx);
    }

    @Override
    public void enterValue(EasyLangParser.ValueContext ctx) {
        super.enterValue(ctx);
        if(ctx.bool_val() == null) {
            finalCode += ctx.getText();
        }
    }

    @Override
    public void exitValue(EasyLangParser.ValueContext ctx) {
        super.exitValue(ctx);
    }

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
    }

    @Override
    public void exitVarExpression(EasyLangParser.VarExpressionContext ctx) {
        super.exitVarExpression(ctx);
    }

    @Override
    public void enterFactor(EasyLangParser.FactorContext ctx) {
        super.enterFactor(ctx);
    }

    @Override
    public void exitFactor(EasyLangParser.FactorContext ctx) {
        super.exitFactor(ctx);
    }

    @Override
    public void enterReturnn(EasyLangParser.ReturnnContext ctx) {
        super.enterReturnn(ctx);
        addIndent();
        finalCode += "return ";
    }

    @Override
    public void exitReturnn(EasyLangParser.ReturnnContext ctx) {
        super.exitReturnn(ctx);
    }

    @Override
    public void enterFunction(EasyLangParser.FunctionContext ctx) {
        super.enterFunction(ctx);
        addIndent();
        indent++;
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
    public void enterLogicCompareExpr(EasyLangParser.LogicCompareExprContext ctx) {
        super.enterLogicCompareExpr(ctx);
    }

    @Override
    public void exitLogicCompareExpr(EasyLangParser.LogicCompareExprContext ctx) {
        super.exitLogicCompareExpr(ctx);
    }

    @Override
    public void enterLogicFunctionCall(EasyLangParser.LogicFunctionCallContext ctx) {
        super.enterLogicFunctionCall(ctx);
    }

    @Override
    public void exitLogicFunctionCall(EasyLangParser.LogicFunctionCallContext ctx) {
        super.exitLogicFunctionCall(ctx);
    }

    @Override
    public void enterLogicParenthesis(EasyLangParser.LogicParenthesisContext ctx) {
        super.enterLogicParenthesis(ctx);
    }

    @Override
    public void exitLogicParenthesis(EasyLangParser.LogicParenthesisContext ctx) {
        super.exitLogicParenthesis(ctx);
    }

    @Override
    public void enterLogicAndOr(EasyLangParser.LogicAndOrContext ctx) {
        super.enterLogicAndOr(ctx);
    }

    @Override
    public void exitLogicAndOr(EasyLangParser.LogicAndOrContext ctx) {
        super.exitLogicAndOr(ctx);
    }

    @Override
    public void enterLogicNot(EasyLangParser.LogicNotContext ctx) {
        super.enterLogicNot(ctx);
    }

    @Override
    public void exitLogicNot(EasyLangParser.LogicNotContext ctx) {
        super.exitLogicNot(ctx);
    }

    @Override
    public void enterLogicId(EasyLangParser.LogicIdContext ctx) {
        super.enterLogicId(ctx);
    }

    @Override
    public void exitLogicId(EasyLangParser.LogicIdContext ctx) {
        super.exitLogicId(ctx);
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
        indent++;
    }

    @Override
    public void exitConditionalExpression(EasyLangParser.ConditionalExpressionContext ctx) {
        super.exitConditionalExpression(ctx);
    }

    @Override
    public void enterUntilExpression(EasyLangParser.UntilExpressionContext ctx) {
        super.enterUntilExpression(ctx);
        indent++;
        finalCode += "while ";
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

        if(node.getSymbol().getType() == EasyLangParser.T_ID
                || node.getSymbol().getType() == EasyLangParser.T_LBRACKET
                || node.getSymbol().getType() == EasyLangParser.T_RBRACKET
                || node.getSymbol().getType() == EasyLangParser.T_COMMA
                || node.getSymbol().getType() == EasyLangParser.T_EQUALS
                || node.getSymbol().getType() == EasyLangParser.T_ASTERISK
                || node.getSymbol().getType() == EasyLangParser.T_SLASH
                || node.getSymbol().getType() == EasyLangParser.T_PLUS
                || node.getSymbol().getType() == EasyLangParser.T_MINUS) {
            finalCode += node.getSymbol().getText(); }

        if(node.getSymbol().getType() == EasyLangParser.T_END_LINE){
            finalCode += ";\n";
        }

        if(node.getSymbol().getType() == EasyLangParser.T_LCURLYBRACKET){
            finalCode += "{\n";
        }

        if(node.getSymbol().getType() == EasyLangParser.T_RCURLYBRACKET){
            indent--;
            addIndent();
            finalCode += "}\n";
        }

        if(node.getSymbol().getType() == EasyLangParser.T_IF_CLAUSE){
            if(finalCode.endsWith("else ")){
                indent--;
            }
            finalCode += "if ";
        }

        if(node.getSymbol().getType() == EasyLangParser.T_ELSE_CLAUSE){
            addIndent();
            indent++;
            finalCode += "else ";
        }

        if(node.getSymbol().getType() == EasyLangParser.T_NOT){
            finalCode += "! ";
        }

        if(node.getSymbol().getType() == EasyLangParser.T_OR){
            finalCode += " || ";
        }

        if(node.getSymbol().getType() == EasyLangParser.T_AND){
            finalCode += " && ";
        }

        if(node.getSymbol().getType() == EasyLangParser.T_EQ ||
                node.getSymbol().getType() == EasyLangParser.T_LEQ ||
                node.getSymbol().getType() == EasyLangParser.T_GEQ ||
                node.getSymbol().getType() == EasyLangParser.T_L ||
                node.getSymbol().getType() == EasyLangParser.T_G ||
                node.getSymbol().getType() == EasyLangParser.T_NEQ ||
                node.getSymbol().getType() == EasyLangParser.T_EQ ||
                node.getSymbol().getType() == EasyLangParser.T_EQ
        ){
            finalCode += node.getSymbol().getText();
        }
        
        if(node.getSymbol().getType() == EasyLangParser.T_COMMENT){
            finalCode += "//" + node.getSymbol().getText().substring(1,node.getSymbol().getText().length() - 1) + "\n";
        }
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    public void addIndent(){
        for (int i = 0; i < indent; i++) {
            finalCode += "\t";
        }
    }
}

