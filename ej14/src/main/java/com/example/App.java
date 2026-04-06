package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Body b = new Body(new Texto("Hola"));
        System.out.println(b.imprimirse() + "\n");
        b.add(new P(new Texto("Este es el examen de poo")));
        b.add(new Img("nombreDeUnaImg.jpg"));
        b.add(new P(new Texto("Espero que hayas estudiado")));
        b.add(new A("http://unlink.html", new Texto("texto del link")));
        System.out.println(b.imprimirse()+ "\n");
        b.add(new A("http://unlink.html", new Img("ImagenDentroDeUnLink.jpg")));
        b.add(new P(new A("link2.com", new Texto("Este es otro texto del link"))));
        System.out.println(b.imprimirse()+ "\n");
    }
}
