package sp.models;

import sp.services.AlignStrategy;

public class Paragraph implements Element, Visitee{
    private String text;
    public Paragraph(String paragraph) {
        this.text = paragraph;
    }

    public void  print(){
        System.out.println("ro.uvt.sp.models.Paragraph: " + text);
    }
    public void setAlignStrategy(AlignStrategy poz){
        text = poz.render(text);
    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }
}