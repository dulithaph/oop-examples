package com.company;


public class Main {

    public static void main(String[] args) {

        //create two objects using two classes
        Dog dog1 = new Dog();
        Cat cat =new Cat();

        dog1.setName("Woofy");
        dog1.getName();

        cat.setName("cat");
        cat.getName();

        dog1.bark();
        dog1.eat();
        cat.eat();

    }
}
