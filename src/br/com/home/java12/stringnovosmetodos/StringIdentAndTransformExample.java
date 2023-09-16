package br.com.home.java12.stringnovosmetodos;

public class StringIdentAndTransformExample {

    public static void main(String[] args) {
        String texto = "Olá Mundo!\nEste é o módulo Java 12.";

        texto = texto.indent(10);
        System.out.println(texto);

        texto = texto.indent(-5);
        System.out.println(texto);

        texto = texto.transform(s -> new StringBuilder(s).reverse().toString());
        System.out.println(texto);
    }

}
