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
}
