package sp.services;

import sp.models.Paragraph;

public class AlignCenter implements AlignStrategy{


    @Override
    public String render(String p) {
        return ("##" + p + "##");
    }
}