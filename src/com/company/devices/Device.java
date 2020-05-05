package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;
//import com.company.creatures.Human;

public abstract class Device implements Saleable {
    public String model;
    protected double weight;
    public String producer;
    public Integer productionYear;
    public Integer price;

    public Device(String model, double weight, String producer, Integer productionYear, Integer price) {
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

    public String toString() {
        return producer + ", " + model + ", " + weight;
    }

    abstract void turnOn();

    @Override
    public void sellable(Human buyer, Human seller, Double price) {
        if (buyer.cash >= price) {
            System.out.println(seller.firstName + " sold item to " + buyer.firstName);
        } else {
            System.out.println(buyer.firstName + " has not enought cash.");
        }
    }


}
