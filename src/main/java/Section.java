import java.util.*;

public class Section implements Element{
    String name;

    List<Element> listoflists = new ArrayList<Element>();
    public void addContent(Paragraph paragraph) {
        listoflists.add(paragraph);
    }

    public void addContent(Section section){
        listoflists.add(section);

    }

    public Section(String name) {
        this.name = name;
    }

    public void addAuthor(Author author){

        listoflists.add(author);
    }

    public void print() {
        System.out.println(name);

        for (Element e: listoflists
             ) {
            e.print();
        }

    }

    @Override
    public void add(Element e) {
        listoflists.add(e);
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public Element getElemenent(int i) {
        return null;
    }


}

