package edu.labs.LAB9;


public class Tablet  implements Device{
    @Override
    public void surfingTheInternet(String nameOfUser) {
        System.out.println(nameOfUser +" surfing the internet using tablet");
    }

    @Override
    public void playGames(String nameOfUser) {
        System.out.println(nameOfUser +" play tablet games");
    }
}
