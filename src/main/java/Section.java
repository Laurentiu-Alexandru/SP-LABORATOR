import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    String title;
    List<Element> ListofContent = new ArrayList<>();
    public Section(String title) {
        this.title = title;
    }

    public void add(Element e) {
        ListofContent.add(e);
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void get(int i) {
    }
    public void addContent(Paragraph paragraph) {
        ListofContent.add(paragraph);
    }
    public void addContent(Section section){
        ListofContent.add(section);
    }

    public void print() {
        System.out.print(title);

        for (Element e:ListofContent
        ) {
            e.print();
        }
    }
}

