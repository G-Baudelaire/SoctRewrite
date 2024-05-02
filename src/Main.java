import intermediate_representation.Program;
import intermediate_representation.Statement;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

            // Create a lexer and parser for the input
            SoctLexer lexer = new SoctLexer(CharStreams.fromString(codeInput));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SoctParser parser = new SoctParser(tokens);

            // Parse the input to get the parse tree
            ParseTree tree = parser.program();

            // Create a visitor and visit the parse tree
            CustomVisitor visitor = new CustomVisitor();
            visitor.visit(tree);

            // Retrieve the processed expressions from the visitor
            Program program = visitor.getProgram();
            program.execute();  // Assuming `execute` is a method to process/run the expressions
            System.out.println(program);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}