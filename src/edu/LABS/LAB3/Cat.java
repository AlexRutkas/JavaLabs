package edu.labs.LAB3;

public class Cat implements Walking, Talking {

    @Override
    public void walk() {
        System.out.println("Cat is walking... method works.");
    }

    @Override
    public void talk() {
        System.out.println("I am cat. Play with me!");
    }
}
