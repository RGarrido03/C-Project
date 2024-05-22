import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;

import java.io.IOException;

public class pdrawMain {

    public static void main(String[] args) {
        try {
            // create a CharStream that reads from standard input:
            CharStream input = CharStreams.fromStream(System.in);
            // create a lexer that feeds off of input CharStream:
            pdrawLexer lexer = new pdrawLexer(input);
            // create a buffer of tokens pulled from the lexer:
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer:
            pdrawParser parser = new pdrawParser(tokens);
            // replace error listener:
            //parser.removeErrorListeners(); // remove ConsoleErrorListener
            //parser.addErrorListener(new ErrorHandlingListener());
            // begin parsing at main rule:
            ParseTree tree = parser.main();
            if (parser.getNumberOfSyntaxErrors() == 0) {
                SemanticAnalysis analysis = new SemanticAnalysis();
                Compiler compiler = new Compiler();

                if (!analysis.visit(tree)) {
                    // TODO: Show errors
                    System.out.println("Syntax error");
                    return;
                }

                ST result = compiler.visit(tree);
                System.out.println(result.render());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (RecognitionException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
