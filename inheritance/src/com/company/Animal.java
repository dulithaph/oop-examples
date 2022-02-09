package com.company;

public class Animal {

    private String name;

    public void eat(){
        System.out.println(name + " can eat");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
