package br.com.home.java14.nullpointerexception;

class Aluno {
    private final String nome = null;

    public String getNome() {
        return nome;
    }
}

public class NullPointerExceptionExample {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println(aluno.getNome().substring(1));
    }
}
