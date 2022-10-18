import java.util.*;

public class Chapter {
    private String name;

    List<SubChapter> subchapters = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String subchapter){
        SubChapter subcapitol = new SubChapter(subchapter);
        subchapters.add(subcapitol);
        for (int i = 0 ; i < subchapters.size() ; i++)
        {
            subcapitol = subchapters.get(i);
            return i;
        }
        return 0;
    }

    public SubChapter getSubChapter(int index) {

        return subchapters.get(index);
    }

    public void print(){

        System.out.println("Numele capitolului este: " + name);

    }
}
