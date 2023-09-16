package br.com.home.java8.parallelarraysorting;

import java.util.Arrays;

public class ParallelArraySorting {

    public static void main (String [] args){
        int[] arrayDeInteiros = {1, 2, 10, 5, 3, 14, 18, 8, 6, 20, 12, 19, 11, 7};

        Arrays.stream(arrayDeInteiros).forEach(System.out::print);

        System.out.println("\n*********************************");

        Arrays.parallelSort(arrayDeInteiros, 3, 10);

        Arrays.stream(arrayDeInteiros).forEach(System.out::print);
    }
}
