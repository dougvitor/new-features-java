package br.com.home.java9.factorymethodstreamapi;

import java.util.List;

public class FactoryMethodStreamAPIExample {

    public static void main(String[] args) {
        List<String> lista = List.of("banana", "manzana", "abacaxi");
        lista.forEach(System.out::println);

        // Lista imutável, não permite adicionar novos elementos (gera runtime exception)
        lista.add("uva");
        lista.forEach(System.out::println);
    }
}
