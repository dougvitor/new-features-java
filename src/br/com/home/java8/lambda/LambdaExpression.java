package br.com.home.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        Thread t = new Thread( () -> {
            // filtrar todos os nomes que iniciam com J
            languages.stream().filter(l -> l.toUpperCase().startsWith("J")).forEach(lj -> System.out.println(lj));

            // filtrar todos os nomes que possuem mais de 5 caracteres
            languages.stream().filter(l -> l.length() > 5).forEach(l5 -> System.out.println(l5));

            // Transformar esta lista em uma lista de inteiros contendo o tamanho de cada palavra e imprimir
            List<Integer> collect = languages.stream().map(l -> l.length()).collect(Collectors.toList());

            collect.forEach(c -> System.out.println(c));
        });
        t.start();
    }
}
