package edu.labs.LAB3;

public class Duck implements Swimming, Flying, Walking, Talking {

    @Override
    public void swim() {
        System.out.println("The fish is swimming... method works");
    }

    @Override
    public void talk() {
        System.out.println("I am duck. I am very clever!");
    }

    @Override
    public void fly() {
        System.out.println("The fish is flying... method works");
    }

    @Override
    public void walk() {
        System.out.println("The fish is walking... method works");
    }
}
