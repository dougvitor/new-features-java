package br.com.home.java9.streamapimelhorias;

import br.com.home.java9.domain.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiMelhoriasExample {

    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<Produto>();
        listaProdutos.add(new Produto(1000, "Geladeira 470L", 2999.00));
        listaProdutos.add(new Produto(1001, "Geladeira 120L", 900.00));
        listaProdutos.add(new Produto(2000, "TV UHD 50''", 3500.00));
        listaProdutos.add(new Produto(1001, "TV UHD 65''", 5000.00));
        listaProdutos.add(new Produto(3000, "Microondas 20L", 399.00));
        listaProdutos.add(new Produto(4000, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
        listaProdutos.add(new Produto(1002, "Geladeira 500L", 3100.00));
        listaProdutos.add(new Produto(4000, "Computador i7 3.9Ghz 16GB 2TB HD", 12429.00));

        List<String> listarSequenciaInicialVerdadeira =
                listaProdutos.stream()
                        .takeWhile(produto -> produto.getNome().contains("Geladeira"))
                        .map(geladeira -> geladeira.getNome().toUpperCase(Locale.ROOT))
                        .collect(Collectors.toList());

        listarSequenciaInicialVerdadeira.forEach(System.out::println);

        System.out.println("*******************************************************");

        List<String> ListarAposSequenciaInicialVerdadeira =
                listaProdutos.stream()
                        .dropWhile(produto -> produto.getNome().contains("Geladeira"))
                        .map(geladeira -> geladeira.getNome().toUpperCase(Locale.ROOT))
                        .collect(Collectors.toList());

        ListarAposSequenciaInicialVerdadeira.forEach(System.out::println);


    }
}

