package com.brunoyam.animals;

public class Horse {

    private String name;
    private String color;
    private int age;

    public Horse(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }


    static void igogo() {
        System.out.println("IGOGOGOGOG");
    }
}
