package sp.services;

import sp.models.*;

public class PrintVisitor implements Visitor {


    @Override
    public void visitSection(Section s) {
        System.out.println(s.getTitle());

        int i = 0;
        while (true) {
            try {
                Element child = s.get(i);
                ((Visitee)child).accept(this);
            }
            catch (Exception e) {
                return;
            }
        }

    }

    @Override
    public void visitBook(Book b) {
        System.out.println(b.getTitle());

        System.out.println("\nAuthors:");

        for (Author a:b.getAuthors()
        ) {
            a.print();
        }

        visitSection(b);
    }

    @Override
    public void visitTable(Table t) {

    }

    @Override
    public void printStatistics() {

    }

    @Override
    public void visitParagraph(Paragraph p) {

    }

    @Override
    public void visitImageProxy(ImageProxy ip) {

    }

    @Override
    public void visitImage(Image img) {

    }
}
