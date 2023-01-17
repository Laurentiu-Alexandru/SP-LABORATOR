package sp.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue
    int id;
    String name;

    public Author(String name) {
        this.name = name;
    }

    public void  print(){
        System.out.print("ro.uvt.sp.models.Author: " + name);
        System.out.println();
    }
}
