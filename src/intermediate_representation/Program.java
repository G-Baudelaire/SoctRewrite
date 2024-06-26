package intermediate_representation;

import java.util.ArrayList;

public class Program {
    private final ArrayList<Statement> statements = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName())
                .append("{")
                .append(Statement.class.getSimpleName())
                .append("=");

        for (Statement statement : statements) {
            stringBuilder.append(statement).append(", ");
        }
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void execute() {
        statements.forEach(Statement::execute);
    }
}
