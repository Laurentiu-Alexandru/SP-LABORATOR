import java.util.List;

public class Image implements Element{

    String image;

    public Image(String name) {
        this.image = name;
    }

    @Override
     public void print() {

        System.out.println(image);

    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Element getElemenent(int i) {
        return null;
    }
}
