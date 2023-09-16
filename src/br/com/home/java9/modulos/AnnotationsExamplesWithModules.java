package br.com.home.java9.modulos;

import br.com.home.java9.domain.Produto;

public class AnnotationsExamplesWithModules {

    public static void main(String[] args) throws NoSuchMethodException {
        final Produto novo = new Produto(1000, "Geladeira 470L", 2999.00);
        novo.getVolts().forEach(System.out::println);
    }
}
