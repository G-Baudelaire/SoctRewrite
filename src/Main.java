import intermediate_representation.Expressions;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    // Main method to test our Foo class
    public static void main(String[] args) {
        // Assuming you have already generated the lexer and parser classes
        String codeInput = "run (x!x | x?y) " + "run (x!y)" + "run (y!y)";
        SoctLexer lexer = new SoctLexer(CharStreams.fromString(codeInput));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SoctParser parser = new SoctParser(tokens);

        // Create a parse tree from the start rule
        ParseTree tree = parser.program();

        // Create a walker
        ParseTreeWalker walker = new ParseTreeWalker();

        // Instantiate your custom listener
        CustomListener listener = new CustomListener();

        // Walk the parse tree with your listener
        walker.walk(listener, tree);

        Expressions expressions = listener.getExpressions();
        System.out.println(expressions);
    }
}