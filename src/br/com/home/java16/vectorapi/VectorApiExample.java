package br.com.home.java16.vectorapi;

import jdk.incubator.vector.IntVector;

import java.util.Arrays;

public class VectorApiExample {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] b = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

        var c = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }

        System.out.println("Valor inicial de c: " + Arrays.toString(c));

        var vectorA = IntVector.fromArray(IntVector.SPECIES_64, a, 5);
        var vectorB = IntVector.fromArray(IntVector.SPECIES_64, b, 0);
        var vectorC = vectorA.mul(vectorB);
        vectorC.intoArray(c, 0);

        System.out.println("Valor final de c: " + Arrays.toString(c));
    }
}
