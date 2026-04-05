package com.example;

public class Img implements Html{
    private String ref;

    public Img(String ref){
        this.ref=ref;
    }

    @Override
    public String imprimirse() {
        return "<img href=\"" + this.ref + "\"/>";
    }
    

}
