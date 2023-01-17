package sp.models;

public interface Visitor {


    public void visitBook(Book b);
    public void visitSection(Section s);
    public void visitParagraph(Paragraph p);
    public void visitImageProxy(ImageProxy ip);
    public void visitImage(Image im);
    public void visitTable(Table t);
    public void printStatistics();
}
