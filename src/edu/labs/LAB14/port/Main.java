package edu.labs.LAB14.port;

import java.util.Random;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Port kievPort = new Port("Kiev");
        kievPort.setTotalCargoWeight(5000);

        System.out.println("Kiev:" + kievPort.getTotalCargoWeight());
        for (int i = 0; i < 40; i++) {
            int rand = new Random().nextInt(500);
            Ship ship = new Ship(rand);
            ship.setLoaded(rand > 249);
            kievPort.dealWithShip(ship);
        }
        //
        Thread.yield();
        System.out.println("Kiev:" + kievPort.getTotalCargoWeight());
        kievPort.closePort();

    }
}
