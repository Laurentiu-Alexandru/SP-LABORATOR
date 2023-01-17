package sp.models;

import java.util.ArrayList;
import java.util.List;

public class ToC implements Element{

    List<String> listOfContent = new ArrayList<>();


    @Override
    public void print() {
        for (String s: listOfContent
        ) {
            System.out.println(s);
        }
    }

    public void addToList(String s) {
        listOfContent.add(s);
    }
    @Override
    public void add(Element e) {
    }

    @Override
    public void remove(Element e) {
    }

    @Override
    public Element get(int i) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
    }
}
