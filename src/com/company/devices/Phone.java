package com.company.devices;

public class Phone extends Device {
    //    String producer;
//    String model;
    Double screenSize;
    String system;

    public Phone(String model, double weight, String producer, Integer productionYear, Integer price, Double screenSize, String system) {
        super(model, weight, producer, productionYear, price);
        this.screenSize = screenSize;
        this.system = system;
    }

    void turnOn() {
        System.out.println("Hello kitty");
    }
    public String toString() {
        return screenSize + " " + model + " " + system;
    }
}
