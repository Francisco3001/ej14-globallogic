package com.example;

public class Texto implements Html{
    String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    @Override
    public String imprimirse() {
        return texto;
    }

}
