public class AlignCenter implements AlignStrategy{


    @Override
    public String render(Paragraph p) {
        return ("##" + p.text + "##");
    }
}