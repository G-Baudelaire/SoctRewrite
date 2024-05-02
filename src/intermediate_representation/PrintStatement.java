package intermediate_representation;

public class PrintStatement implements StatementValue{
    private String string;
    public PrintStatement(String string){
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
