package com.company.devices;

public class Car {
    public String carMake;
    public String model;
    public Integer productionYear;
    //Integer displacement;
    public Double engineCapacity;
    private Integer price;

    public Car(String carMake, String model, Integer productionYear, Double engineCapacity) {
        this.carMake = carMake;
        this.model = model;
        this.productionYear = productionYear;
        this.engineCapacity = engineCapacity;
    }

    public Car(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString(){
        return carMake + " " + model + " " + productionYear;
    }
}
