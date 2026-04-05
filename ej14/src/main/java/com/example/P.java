package com.example;

public class P implements Html {
    private Html html;

    public P(Html html){
        this.html = html;
    }

    public String imprimirse(){
        return "<p> " + html.imprimirse() + " </p>";
    }
}
