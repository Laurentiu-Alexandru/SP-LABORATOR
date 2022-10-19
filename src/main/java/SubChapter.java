import java.util.*;

public class SubChapter{
    String name;


    List<Element> listoflists = new ArrayList<Element>();


    public void createNewParagraph(String paragraph) {
        Paragraph paragraf = new Paragraph(paragraph);
        listoflists.add(paragraf);
    }

    public void createNewImage(String image) {
        Image imagine = new Image(image);
        listoflists.add(imagine);
    }

    public void createNewTable(String table) {
        Table tabela = new Table(table);
        listoflists.add(tabela);
    }

    public SubChapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
        for (Element e: listoflists
             ) {
            e.print();
        }

    }


}

