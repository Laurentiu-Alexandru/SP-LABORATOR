package sp.models;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
public class Book extends Section{
    @Transient
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

    public Iterable<? extends Author> getAuthors() {
        return Authors;
    }
}
