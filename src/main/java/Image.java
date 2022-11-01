import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    String imageName;

    public Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("\n" + "Image with name: " + imageName);
    }

    @Override
    public void add(Element e) {
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void get(int i) {

    }

    @Override
    public void url() {

    }

    @Override
    public void dim() {

    }

    @Override
    public void content() {

    }
}