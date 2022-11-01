import java.util.ArrayList;
import java.util.List;
public class Book extends Section{
    List<Author> Authors = new ArrayList<>();
    public Book(String bookTitle) {
        super(bookTitle);
    }

    public void addAuthor(Author author){
        Authors.add(author);
    }
    public void print(){
        System.out.println(title);
        System.out.println("\nAuthors:");
        for (Author a:Authors
        ) {
            a.print();
        }
        System.out.println();
        for (Element e:ListofContent
        ) {
            e.print();
        }
    }

}
