package edu.labs.LAB2;

public class Dog {
    private int age;
    private String name;
    private static int count = 0;

    public Dog() {
        count++;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public Dog(int age) {
        this.age = age;
        count++;
    }

    public Dog(int age, String name) {
        if (age == 0) {
            name = "Unknown";
        }
        this.name = name;
        this.age = age;
    }

    public void voice() {
        for (int i = 0; i < age; i++) {
            System.out.println("bark");
        }
    }

    public static void main(String[] args) {
        Dog first = new Dog("Jay", 4);
        Dog second = new Dog();
        second.age = 3;
        second.name = "Rocky";
        second.voice();
        Dog third = new Dog(1);
        System.out.println(Dog.count);
        Dog dog1 = new Dog("Zuma", 5);
        Dog dog2 = new Dog();
        System.out.println(Dog.count);
    }
}
