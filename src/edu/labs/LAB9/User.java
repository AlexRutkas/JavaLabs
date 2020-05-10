package edu.labs.LAB9;

public class User {
    private String name;
    private Device device;

    public User(String name, Device device) {
        this.name = name;
        this.device = device;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public void surfingTheInternet (){
        device.surfingTheInternet(name);
    }

    public void playGame(){
        device.playGames(name);
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
