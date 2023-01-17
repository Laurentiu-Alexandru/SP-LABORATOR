package sp.services;

import sp.models.Paragraph;

public class AlignRight implements AlignStrategy{

    @Override
    public String render(String p) {
        return ("##" + p);
    }

}

