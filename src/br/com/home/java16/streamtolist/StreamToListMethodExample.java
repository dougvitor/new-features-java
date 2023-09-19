package br.com.home.java16.streamtolist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToListMethodExample {

    public static void main(String[] args) {

        List<String> integerAsString = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "11", "12", "13", "14", "15", "16");

        List<Integer> ints = integerAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> intsEquivalent = integerAsString.stream().map(Integer::parseInt).toList();

        System.out.print(ints.equals(intsEquivalent));

    }
}
