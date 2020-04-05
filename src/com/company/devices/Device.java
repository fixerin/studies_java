package com.company.devices;

import com.company.Saleable;
//import com.company.creatures.Human;

public abstract class Device implements Saleable {
    public String model;
    protected String weight;
    public String producer;
    public Integer productionYear;
    public Integer price;

    public Device(String model, String weight, String producer, Integer productionYear, Integer price) {
        this.model = model;
        this.weight = weight;
        this.producer = producer;
        this.productionYear = productionYear;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString(){
        return producer + ", " + model + ", " + weight;
    }

    abstract void turnOn();

    public void sell(){
            System.out.println("Item has been sold.");
    }


}
