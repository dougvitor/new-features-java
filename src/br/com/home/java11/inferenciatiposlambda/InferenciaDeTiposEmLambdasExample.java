package br.com.home.java11.inferenciatiposlambda;

import java.util.function.Function;

public class InferenciaDeTiposEmLambdasExample {
    public static void main(String[] args) {
        Function<String, String> concatenaExclamacao = (var s) -> s + "!";
        System.out.println(concatenaExclamacao.apply("Hello World"));
    }
}
