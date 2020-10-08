package edu.labs.LAB9;

public class SmartPhone implements Device{
    @Override
    public void surfingTheInternet(String nameOfUser) {
        System.out.println(nameOfUser +" surfing the internet using smatphone");
    }

    @Override
    public void playGames(String nameOfUser) {
        System.out.println(nameOfUser +" play smatphone games");
    }
}
