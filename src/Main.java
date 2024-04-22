import intermediate_representation.Expressions;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Check if the user provided a file path as a command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java Main <file_path>");
            return;
        }

        String filePath = args[0]; // Get the file path from the command-line arguments

        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder codeInputBuilder = new StringBuilder();

            // Read each line from the file and append it to the codeInputBuilder
            String line;
            while ((line = reader.readLine()) != null) {
                codeInputBuilder.append(line).append("\n");
            }

            // Close the reader
            reader.close();

            // Get the code input as a string
            String codeInput = codeInputBuilder.toString();

            // Proceed with your existing code
            SoctLexer lexer = new SoctLexer(CharStreams.fromString(codeInput));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SoctParser parser = new SoctParser(tokens);

            ParseTree tree = parser.program();
            ParseTreeWalker walker = new ParseTreeWalker();
            CustomListener listener = new CustomListener();
            walker.walk(listener, tree);

            Expressions expressions = listener.getExpressions();
            expressions.execute();
            System.out.println(expressions);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
