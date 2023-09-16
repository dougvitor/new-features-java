package br.com.home.java14.instanceofcast;

import java.util.Random;

class Animal {
}

class Dog extends Animal {
    public String woof() {
        return "AU AU AU";
    }
}

class Cat extends Animal {
    public String meow(){
        return "MIAU MIAU MIAU";
    }
}

public class InstanceofCastExample {

    public static void main(String[] args) {
        Animal animal;
        var escolha = new Random().nextInt(2);

        if(escolha == 0){
            animal = new Cat();
        }else{
            animal = new Dog();
        }

        if (animal instanceof Cat cat){
            System.out.println(cat.meow());
        }

        if(animal instanceof Dog dog){
            System.out.println(dog.woof());
        }
    }
}
