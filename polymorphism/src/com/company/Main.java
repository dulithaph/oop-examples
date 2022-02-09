package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.name = "Woofy";
        dog.makeSound();
        dog.run("Fast");
        dog.run("Slow", "?");

        Cat cat = new Cat();
        cat.name = "Kitty";
        cat.makeSound();

    }
}
