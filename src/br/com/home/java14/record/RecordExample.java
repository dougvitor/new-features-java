package br.com.home.java14.record;

interface Figura2D{
    double area();
}

record Retangulo(double base, double altura) implements Figura2D{

    @Override
    public double area() {
        return (base *  altura) / 2;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}


public class RecordExample {

    public static void main(String[] args) {
        var r1 = new Retangulo(60, 30);
        System.out.print(r1.base() + " " + r1.altura() + "\n");
        System.out.println(r1);
        System.out.println(r1.area());
    }
}
