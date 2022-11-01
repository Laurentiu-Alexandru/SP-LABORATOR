public class ImageProxy implements Picture, Element {
    String url;
    Image realImage = null;
    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage(){
        if( realImage == null ){
            realImage = new Image(url);
        }
        return realImage;
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

    @Override
    public void print() {
        loadImage().print();
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
}
