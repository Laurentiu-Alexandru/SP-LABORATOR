package sp.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NoArgsConstructor
public class Section implements Element, Visitee{
    public String getTitle() {
        return title;
    }
    @Id
    @GeneratedValue
    int id;
    String title;
    @OneToMany
    @Transient
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
    public Element get(int i) {
        return ListofContent.get(i);
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

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
    }
}

