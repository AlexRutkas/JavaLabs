package edu.labs.LAB3;

import java.util.ArrayList;

public class Application1 {
    public static void main(String[] args) {
        /* Dog first = new Dog("Jay", 4);
        Dog second = new Dog();
        second.age = 6;
        second.name = "Rocky";
        second.voice();
        Dog third = new Dog(1);
        System.out.println(Dog.count);
        Dog dog1 = new Dog("Zuma", 5);
        Dog dog2 = new Dog();
        System.out.println(Dog.count);*/
        PetOwner po = new PetOwner();
        po.addPet("Chase", 7);
        po.addPet("Marshall", 6);
        po.addPet("Skye", 7);
        po.addPet("Rubble", 5);
        po.addPet("Rocky", 6);
        po.addPet("Zuma", 5);
        po.addPet("Everest", 8);
        /*if (po.removePet("Rubble")) {
            System.out.println("To the Lookout!");
        }
        else {
            System.out.println("Pet is outside Adventure Bay");
        }*/
        po.showPet();
        HomePets home = new HomePets();
        ArrayList owners1 = new ArrayList();
        owners1.add("Julia");
        owners1.add("Alex");
        owners1.add("Katie");
        owners1.add("Jake");
        home.addHomePet("Marshall", owners1);
        ArrayList owners2 = new ArrayList();
        owners2.add("Annie");
        owners2.add("Billy");
        home.addHomePet("Chase", owners2);
        ArrayList owners3 = new ArrayList();
        owners3.add("Danny");
        owners3.add("Danny's mom");
        owners3.add("Danny's dad");
        home.addHomePet("Skye", owners3);
        ArrayList owners4 = new ArrayList();
        owners4.add("Molly");
        owners4.add("Molly's mom");
        owners4.add("Molly's dad");
        home.addHomePet("Rubble", owners4);
        ArrayList owners5 = new ArrayList();
        owners5.add("Christina");
        owners5.add("Marcus");
        home.addHomePet("Rocky", owners5);
        ArrayList owners6 = new ArrayList();
        owners6.add("Roger");
        owners6.add("Roger's mom");
        owners6.add("Roger's dad");
        home.addHomePet("Zuma", owners6);
        ArrayList owners7 = new ArrayList();
        owners7.add("Liam");
        owners7.add("Katie");
        owners7.add("Chuck");
        home.addHomePet("Everest", owners7);
        home.showHomePets();
    }
}
