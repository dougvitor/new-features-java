package br.com.home.java8.reflexaometodosparametros;

import br.com.home.java9.domain.Produto;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class ReflexaoMetodosEParametrosExemplo {

    public static void main(String[] args) {
        Produto novo = new Produto(1000, "Geladeira 470L", 2999.00);

        Class<? extends Produto> produtoClass = novo.getClass();

        final Method[] methods = produtoClass.getDeclaredMethods();

        for(Method method : methods){
            System.out.println(method.getName());

            for(Parameter parameter: method.getParameters()){
                System.out.println(parameter.getName());
            }

            Arrays.stream(method.getParameters()).forEach(System.out::println);
        }
    }
}
