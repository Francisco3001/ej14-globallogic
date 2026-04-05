package com.example;
import java.util.ArrayList;
import java.util.List;

public class Body {
    private List<Html> tags;

    public Body() {
        this.tags = new ArrayList<>();
    }

    public Body(Html html) {
        this();
        tags.add(html);
    }

    public String imprimirse(){
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("<body> ");
        
        for (Html html : tags) {
            cadena.append(html.imprimirse());
        }
        cadena.append("</body>");
        return cadena.toString();
    }
}
