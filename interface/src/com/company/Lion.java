package com.company;


//multiple inheritance

class Lion implements Animal,WildAnimal {

    @Override
    public void animalSound() {
        System.out.println("Lion: Grrw Grww");
    }

    @Override
    public void behave() {
        System.out.println("Wild animals are Rough");
    }
}
