import java.util.ArrayList;
import java.util.List;

public class Book extends TableOfContents{
    String title;
    String author;

    List<Chapter> chapters = new ArrayList<Chapter>();
    public Book(String title) {
        this.title = title;
    }

    public void addAuthor (String author){
        this.author=author;
    }

    public int createChapter(String chapter){
        Chapter capitol = new Chapter(chapter);
        chapters.add(capitol);
        for (int i = 0 ; i < chapters.size() ; i++)
        {
            capitol = chapters.get(i);
            return i;
        }
    return 0;
    }

    public Chapter getChapter(int index) {

        return chapters.get(index);
    }
}
