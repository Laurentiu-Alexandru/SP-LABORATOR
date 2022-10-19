import java.util.List;

public class Table implements Element{

    String table;

    public Table(String name) {
        this.table = name;
    }

    @Override
    public void print() {
        System.out.println(table);
    }
}
