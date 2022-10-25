import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    String title;

    Author author;
    Section capitol;
    List<Author> authors = new ArrayList<Author>();
    public Book(String title) {
        super(title);
        this.title = title;
    }


}
