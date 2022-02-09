package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Lion lion = new Lion();


        dog1.animalSound();
        System.out.println(dog1.name);
        System.out.println(dog1.a);

        lion.animalSound();
        lion.behave();
    }
}
