package edu.labs.LAB14.port;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Port {
    private int docksCount;
    private int totalCargoWeight;
    private ExecutorService portExecutorService;
    private String portName;

    public Port(String portName) {
        this.docksCount = 3;
        this.totalCargoWeight = 0;
        this.portExecutorService = Executors.newFixedThreadPool(docksCount);
        this.portName = portName;
    }


    public void dealWithShip(Ship ship){
        ship.setCurrentPort(this);
        portExecutorService.submit(ship);
    }

    public int getTotalCargoWeight() {
        return totalCargoWeight;
    }

    public void setTotalCargoWeight(int totalCargoWeight) {
        this.totalCargoWeight = totalCargoWeight;
    }

    public void closePort(){
        portExecutorService.shutdown();
    }

    public String getPortName() {
        return portName;
    }
}
