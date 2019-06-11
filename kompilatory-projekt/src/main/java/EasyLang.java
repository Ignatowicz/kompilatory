import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class EasyLang {

    public static void main(String[] args) {

        ANTLRInputStream inputStream = new ANTLRInputStream(
                "funkcja calkowity dodawanie(calkowity x, calkowity y) {\n" +
                        "\tcalkowity a = (x + y).\n" +
                        "\tzwróć a.\n" +
                        "}\n" +
                        "\n" +
                        "start () {\n" +
                        "\twypisz(5).\n" +
                        "    x = zmiennanasza.\n" +
                        "\n" +
                        "    logiczny a = prawda.\n" +
                        "    logiczny b = fałsz.\n" +
                        "\n" +
                        "    c = a + b * (d - 3) / 1.\n" +
                        "\n" +
                        "    napis cos = \"coscosik\".\n" +
                        "    \n" +
                        "    jezeli (nie jestem) {\n" +
                        "        wypisz(\"nie ma mnie\").\n" +
                        "    }\n" +
                        "\n" +
                        "    dodawanie(9).\n" +
                        "\n" +
                        "\tdopoki(2 != 3 oraz 2 > 4) {\n" +
                        "\t\twypisz(\"dziala\").\n" +
                        "\n" +
                        "\t\tjezeli (x) {\n" +
                        "\t\t\tdodawanie(2, 3).\n" +
                        "\t\t} inaczej jezeli (1 <= 2) {\n" +
                        "\t\t\twypisz(5).\n" +
                        "\t\t\tdopoki(4 > 5) {\n" +
                        "\t\t\t\tdodawanie(4, 5, 1).\n" +
                        "\t\t\t}\n" +
                        "\t\t} inaczej {\n" +
                        "\t\t\twypisz(\"nie dziala\").\n" +
                        "\t\t}\n" +
                        "\t}\n" +
                        "}\n");

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
