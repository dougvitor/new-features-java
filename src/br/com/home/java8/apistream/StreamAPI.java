package br.com.home.java8.apistream;

import br.com.home.java9.domain.Produto;
import java.util.*;
import java.util.stream.Collectors;

class OrdenaProdutoPorPreco implements Comparator<Produto> {
    public int compare(Produto p1, Produto p2) {
        return p1.getPreco().compareTo(p2.getPreco());
    }
}

public class StreamAPI {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<Produto>();
        listaProdutos.add(new Produto(1000, "Geladeira 470L", 2999.00));
        listaProdutos.add(new Produto(2000, "TV UHD 50''", 3500.00));
        listaProdutos.add(new Produto(1001, "TV UHD 65''", 5000.00));
        listaProdutos.add(new Produto(3000, "Microondas 20L", 399.00));
        listaProdutos.add(new Produto(1001, "Geladeira 120L", 900.00));
        listaProdutos.add(new Produto(4000, "Computador i5 2.9Ghz 4GB 1TB HD", 2429.00));
        listaProdutos.add(new Produto(1002, "Geladeira 500L", 3100.00));

        System.out.println("Usando a forma 'antiga'...");

        List<Produto> listaGeladeiras = new ArrayList<Produto>();
        for (Produto p : listaProdutos) {
            if (p.getNome().contains("Geladeira")) {
                listaGeladeiras.add(p);
            }
        }

        listaGeladeiras.sort(new OrdenaProdutoPorPreco());

        List<String> listaNomesGeladeiras = new ArrayList<String>();
        for (Produto p : listaGeladeiras) {
            listaNomesGeladeiras.add(p.getNome().toUpperCase());
        }

        for (String nome : listaNomesGeladeiras) {
            System.out.println(nome);
        }

        /*************************************************************/

        System.out.println("\nUsando Java Streams...");

        List<String> listaGeladeirasStream =
                listaProdutos.stream()
                        .filter(produto -> produto.getNome().contains("Geladeira"))
                        .sorted(Comparator.comparing(Produto::getPreco, Comparator.reverseOrder()))
                        .map(geladeira -> geladeira.getNome().toUpperCase(Locale.ROOT))
                        .collect(Collectors.toList());

        listaGeladeirasStream.forEach(System.out::println);


    }
}
