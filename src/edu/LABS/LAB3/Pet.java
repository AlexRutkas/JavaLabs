package edu.labs.LAB3;

public abstract class Pet {
    protected String name;
    protected int age;

    public Pet() {
        this.name = "undefined";
        this.age = 0;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
