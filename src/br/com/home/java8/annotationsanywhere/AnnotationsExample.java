package br.com.home.java8.annotationsanywhere;

import br.com.home.java9.domain.Produto;

public class AnnotationsExample {

    public static void main(String[] args) throws NoSuchMethodException {
        final Produto novo = new Produto(1000, "Geladeira 470L", 2999.00);

        /*  VERSÃO JAVA 8
       Voltage[] volts = novo.getClass().getAnnotationsByType(Voltage.class);
        Arrays.stream(volts).map(Voltage::volts).forEach(System.out::println);
        */
    }
}
