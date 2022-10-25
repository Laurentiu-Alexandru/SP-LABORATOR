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

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element getElemenent(int i) {
        return null;
    }
}
