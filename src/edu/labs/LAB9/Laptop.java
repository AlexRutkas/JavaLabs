package edu.labs.LAB9;

public class Laptop implements Device{

    @Override
    public void surfingTheInternet(String nameOfUser) {
        System.out.println(nameOfUser +" surfing the internet using laptop");
    }

    @Override
    public void playGames(String nameOfUser) {
        System.out.println(nameOfUser +" play laptop games");
    }
}
