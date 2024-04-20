package intermediate_representation;

import java.util.ArrayList;

public class Expressions {
    private final ArrayList<Statement> statements = new ArrayList<>();

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName()).append("{\nstatements=\n");

        for(Statement statement:statements){
            stringBuilder.append(statement).append("\n");
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
