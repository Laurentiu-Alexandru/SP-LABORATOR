package sp.models;

public class ToC_Visitor implements Visitor{


    ToC toc = new ToC();
    int counter = 0;
    public ToC_Visitor() {
    }

    @Override
    public void visitBook(Book b) {
    }

    @Override
    public void visitSection(Section s) {
        toc.addToList(s.title + "....." + counter);
    }

    @Override
    public void visitParagraph(Paragraph p) {
        counter++;
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        counter++;
    }

    @Override
    public void visitImage(Image im) {
        counter++;
    }

    @Override
    public void visitTable(Table t) {
        counter++;
    }

    @Override
    public void printStatistics() {

    }

    public ToC getToC(){
        return toc;
    }
}
