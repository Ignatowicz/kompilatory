import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class EasyLang {

    public static void main(String[] args) {

        ANTLRInputStream inputStream = new ANTLRInputStream(
                "start () {\n" +
                        "    dopoki(2 != 3 oraz 2 > 4) {\n" +
                        "    \twypisz(\"dziala\").\n" +
                        "    }\n" +
                        "}");

        EasyLangLexer easyLangLexer = new EasyLangLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(easyLangLexer);
        EasyLangParser easyLangParser = new EasyLangParser(commonTokenStream);

        ParseTree tree = easyLangParser.start();
        ParseTreeWalker walker = new ParseTreeWalker();

        EasyLangListenerImpl listener = new EasyLangListenerImpl();

        walker.walk(listener, tree);

        System.out.println(listener.finalCode);

    }
}
