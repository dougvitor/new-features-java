package br.com.home.others;

import br.com.home.java9.domain.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MemoryLeakExample {

    public static void main(String[] args) {
        List< Produto> produtos = new ArrayList<>();

        var count = 0;

        while (true){
            Produto produto = new Produto(count, "Nome"+count, count * new Random(10000).nextDouble());

            produtos.add(produto);

            System.out.println("List size: " + produtos.size());

            count++;
        }
    }
}
