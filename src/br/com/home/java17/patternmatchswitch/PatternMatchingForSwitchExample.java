package br.com.home.java17.patternmatchswitch;

interface Forma {
    double area();
}

record Circulo(double raio) implements Forma {
    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}

record Retangulo(double largura, double altura) implements Forma {
    @Override
    public double area() {
        return largura * altura;
    }
}

record Ponto(double x, double y) {}

public class PatternMatchingForSwitchExample {
    public static void main(String[] args) {
        Ponto p = new Ponto(1, 2);
        Circulo c = new Circulo(3.0);
        Retangulo r = new Retangulo(4.0, 5.0);
        String s = "Java 17";
        Object n = null;

        imprimirInformacoes(p);
        imprimirInformacoes(c);
        imprimirInformacoes(r);
        imprimirInformacoes(s);
        imprimirInformacoes(n);
    }

    public static void imprimirInformacoes(Object obj) {
        String info = switch (obj) {
            case null -> "Objeto nulo";
            case Ponto p -> "Ponto (" + p.x() + ", " + p.y() + ")";
            case Circulo c -> "Circulo de raio " + c.raio() + " e área " + c.area();
            case Retangulo r -> "Retangulo de largura " + r.largura() + ", altura " + r.altura() + " e área " + r.area();
            default -> obj.getClass().getName() + ": " + obj.toString();
        };
        System.out.println(info);
    }

}
