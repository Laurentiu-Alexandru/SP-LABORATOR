package sp.models;

public class Table implements Element{
    String title;

    public Table(String table) {
        this.title = table;
    }

    public void  print(){
        System.out.println("Tabel: " + title);
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
    public void accept(Visitor v) {

    }
}
