import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

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
        // print LISP-style tree:
        // System.out.println(tree.toStringTree(parser));
        SemanticAnalysis visitor0 = new SemanticAnalysis();
        Compiler visitor1 = new Compiler();
        visitor0.visit(tree);
        visitor1.visit(tree);
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