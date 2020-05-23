package edu.labs.LAB9;

public class Main {
    public static void main (String [] args){
        User user = new User("Alexey");

        user.setDevice(new Computer());
        user.playGame();
        user.surfingTheInternet();

        user.setDevice(new SmartPhone());
        user.playGame();
        user.surfingTheInternet();

        user.setDevice(new Laptop());
        user.playGame();
        user.surfingTheInternet();

        user.setDevice(new Tablet());
        user.playGame();
        user.surfingTheInternet();
    }
}
