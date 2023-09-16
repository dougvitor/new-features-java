package br.com.home.java9.inferenciatiposclasseanonima;

public class InferenciaTiposClasseAnonimaExample {

    public static void main(String[] args) {

        SomaTudo<Integer> somaInteiros = new SomaTudo<>() {
            @Override
            public Integer soma(Integer a, Integer b) {
                return a + b;
            }
        };

        System.out.println(somaInteiros.soma(7, 24));
    }
}
