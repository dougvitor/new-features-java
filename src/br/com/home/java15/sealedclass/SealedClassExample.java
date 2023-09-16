package br.com.home.java15.sealedclass;

interface Animal{
    void quemSouEu();
}

sealed abstract class Carnivoro implements Animal permits Leao{
    public void quemSouEu(){
        System.out.println(" eu sou carnívoro");
    }
}

sealed abstract class Herbivoro implements Animal permits Coelho{
    public void quemSouEu(){
        System.out.println(" eu sou herbívoro");
    }
}

non-sealed class Leao extends Carnivoro{
    @Override
    public void quemSouEu(){
        System.out.print("Eu sou um Leão,");
        super.quemSouEu();
    }
}

final class Coelho extends Herbivoro{
    @Override
    public void quemSouEu() {
        System.out.print("Eu sou um Coelho,");
        super.quemSouEu();
    }
}

public class SealedClassExample {

    public static void main(String[] args) {
        Animal leao = new Leao();
        leao.quemSouEu();

        Animal coelho = new Coelho();
        coelho.quemSouEu();
    }
}
