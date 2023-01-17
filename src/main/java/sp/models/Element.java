package sp.models;

public interface Element {

    void print();
    void add(Element e);
    void remove(Element e);
    default Element get(int i) {
        throw new UnsupportedOperationException();
    }

    void accept(Visitor v);
}