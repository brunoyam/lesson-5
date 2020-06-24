package com.brunoyam.animals;

public abstract class Animal implements Movable {

    String name;
    int age;
    String color;

    Animal() {}

    abstract void voice();

    void breathe() {
        System.out.println("Im breathing");
    }
}
