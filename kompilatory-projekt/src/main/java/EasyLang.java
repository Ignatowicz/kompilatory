import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class EasyLang {

    public static void main(String[] args) {

        String file = FileManager.readFile("EasyLangCode.txt");

        EasyLangLexer easyLangLexer = new EasyLangLexer(CharStreams.fromString(file));
        CommonTokenStream commonTokenStream = new CommonTokenStream(easyLangLexer);
        EasyLangParser easyLangParser = new EasyLangParser(commonTokenStream);

        ParseTree tree = easyLangParser.start();
        ParseTreeWalker walker = new ParseTreeWalker();

        EasyLangListenerImpl listener = new EasyLangListenerImpl();

        walker.walk(listener, tree);

        FileManager.saveFile(listener.finalCode, "JavaCode.txt");
        System.out.println(listener.finalCode);

    }
}
