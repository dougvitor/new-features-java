package br.com.home.java11.stringnovosmetodos;

import java.util.List;

public class StringNovosMetodosExample {

    public static void main(String[] args) {
        var listaDeStrings = List.of("                ", " Tem\n conteúdo\n nessa\n String\n sim.", "");
        listaDeStrings.forEach(string -> System.out.println(string.isBlank()));

        System.out.println(listaDeStrings.get(1));
        System.out.println(listaDeStrings.get(1).lines().reduce("", (s1, s2) -> s1 + s2));

        System.out.println(listaDeStrings.get(1).repeat(3));

    }
}
