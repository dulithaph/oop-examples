package com.company;

public class Animal {

    private String name;

    public void eat(){
        System.out.println(name + " can eat");
    }


    //set name to private, therefore should use setter to set it public and get to get it
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
