package br.com.home.java10.inferenciatiposvariaveislocais;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class InferenciaTiposVariaveisLocaisExample {

    public static void main(String[] args) {
        var frutas = new ArrayList(List.of("Banana", "Maça", "Abacaxi"));

        for (var fruta : frutas) {
            System.out.println(fruta);
        }

        for (var i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        var e = new ConcurrentModificationException("Operação não é permitida nesse momento!");

        try {
            frutas.forEach(frutas::remove);
        } catch (ConcurrentModificationException exception ) {
            throw e;
        }
    }
}
