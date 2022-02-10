package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();


        //Normal way (Sub class variable and subclass object)
        Dog dg = new Dog();
        dg.name = "Dog";
        dg.makeSound();
        dg.run("Fast");
        dg.run("Slow", "?");

        Cat cat = new Cat();
        cat.name = "Cat";
        cat.makeSound();

        //upcasting ( Put subclass object to super class reference variable) use to deal only with parent class
        Animal dogSuper = new Dog();
        dogSuper.name = "Dog";
        dogSuper.makeSound();

        //down casting ( Get subclass object to subclass reference variable) access child class behaviors ok
        Dog dogSub = (Dog) dogSuper;
        dogSub.run("Fast");

    }
}
