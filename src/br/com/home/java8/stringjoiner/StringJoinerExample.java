package br.com.home.java8.stringjoiner;

import java.util.*;

public class StringJoinerExample {

    public static void main(String args[]) {
        String nomes = "Giovanna,David,Pedro,Golias,Maju,Lari-Matoso";

        StringTokenizer st = new StringTokenizer(nomes, ",");
        StringJoiner sj = new StringJoiner("|");

        st.asIterator().forEachRemaining(e -> sj.add((String) e));
        System.out.println(sj);

    }
}
