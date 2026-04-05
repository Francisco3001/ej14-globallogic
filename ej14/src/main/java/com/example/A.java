package com.example;

public class A implements Html{
    private String ref;
    private Html html;

    public A(String ref, Html html){
        this.ref = ref;
        this.html=html;
    }

    @Override
    public String imprimirse() {
        return "<a href=\"" + ref + "\">" + html.imprimirse() + "</a>";
    }

}
