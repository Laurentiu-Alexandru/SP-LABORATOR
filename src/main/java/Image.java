import java.util.List;

public class Image implements Element{

    String image;

    public Image(String name) {
        this.image = name;
    }

    public void print() {

        System.out.println(image);
    }
}