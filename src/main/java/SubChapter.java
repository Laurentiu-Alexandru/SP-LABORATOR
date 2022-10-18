import java.util.*;

public class SubChapter{
    String name;

    List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    List<Image> images = new ArrayList<Image>();
    List<Table> tables = new ArrayList<Table>();
    List<List> listoflists = new ArrayList<List>();

    List<String> creators = new ArrayList<String>();

    public void createNewParagraph(String paragraph) {
        Paragraph paragraf = new Paragraph(paragraph);
        paragraphs.add(paragraf);
    }

    public void createNewImage(String image) {
        Image imagine = new Image(image);
        images.add(imagine);
    }

    public void createNewTable(String table) {
        Table tabela = new Table(table);
        tables.add(tabela);
    }

    public SubChapter(String name) {
        this.name = name;
    }
    public void creator(){
        listoflists.add(paragraphs);
        listoflists.add(images);
        listoflists.add(tables);
        for (int i = 0 ; i < listoflists.size() ; i++)
            for ( int j = 0 ; j < listoflists.get(i).size() ; j++ )
                System.out.println(((listoflists.get(i)).get(j)));

    }
    public void print() {
        System.out.println(name);
        this.creator();

    }


}

