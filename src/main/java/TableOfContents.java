import java.util.*;

public class TableOfContents implements Element{

    List<String> bookContentList = new ArrayList<String>();


    @Override
    public String toString() {
        return "TableOfContents{" +
                "bookContentList=" + bookContentList +
                '}';
    }

    @Override
    public void print() {

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
