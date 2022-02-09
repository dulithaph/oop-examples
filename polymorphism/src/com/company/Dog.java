package com.company;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println(name + " Baw Baw");
    }



    //overloading
    public static void run(String a){
        System.out.println("Normaly Dog Run " + a);

    }

    public static void run(String b, String c){
        System.out.println("Some times Dog Run " + b + c);
    }



}
