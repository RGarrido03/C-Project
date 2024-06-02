import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.ST;

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
      // TODO ver lexer things
      // parser.addErrorListener(new ErrorHandlingListener());
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
        // write on ./generated_files/main.py
        // write file
        File file = new File("../generated_files/main.py");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(result.render());
        writer.close();
      }
    } catch (IOException | RecognitionException e) {
      e.printStackTrace();
      System.exit(1);
    }
  }
}
