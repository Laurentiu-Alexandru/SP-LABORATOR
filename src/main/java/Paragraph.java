import java.util.List;

public class Paragraph implements Element{

    String paragraph;

    public Paragraph(String name) {
        this.paragraph = name;
    }
    @Override
    public void print() {

        System.out.println(paragraph);
    }

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element getElemenent(int i) {
        return null;
    }
}
