package edu.labs.LAB14.port;

public class Ship implements Runnable {
    private final int maxWeight;
    private int currentWeight;

    private boolean isLoaded;
    private Port currentPort;

    public Ship(int maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void loadCargoFromPort(Port port) {
        System.out.println("loading ship, in port " + port.getPortName() + " thread: " + Thread.currentThread());
        if (port.getTotalCargoWeight() > maxWeight) {
            port.setTotalCargoWeight(port.getTotalCargoWeight() - (maxWeight-currentWeight));
            currentWeight = maxWeight;
        } else {
            currentWeight = port.getTotalCargoWeight();
            port.setTotalCargoWeight(0);
        }
    }

    public void unloadСargoInPort(Port port) {
        System.out.println("unloading ship,in port " + port.getPortName() + " thread: " + Thread.currentThread());
        port.setTotalCargoWeight(port.getTotalCargoWeight() + currentWeight);
        currentWeight = 0;
    }

    @Override
    public void run() {
        if (currentWeight<maxWeight) loadCargoFromPort(currentPort);
        else unloadСargoInPort(currentPort);
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public Port getCurrentPort() {
        return currentPort;
    }

    public void setCurrentPort(Port currentPort) {
        this.currentPort = currentPort;
    }
}
