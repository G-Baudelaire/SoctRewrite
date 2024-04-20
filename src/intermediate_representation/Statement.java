package intermediate_representation;

import java.util.ArrayList;

public class Statement {
    private final ArrayList<Solo> solos;

    public Statement() {
        solos = new ArrayList<>();
    }

    public void addSolo(Solo solo) {
        solos.add(solo);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "solos=" + solos +
                "}";
    }
}
