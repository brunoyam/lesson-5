package com.brunoyam.animals;

public class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }

    void woaf() {
        System.out.println("WOAF");
    }

    @Override
    void voice() {
        this.woaf();
    }

    @Override
    public void move() {
        System.out.println("Im moving");
    }
}
