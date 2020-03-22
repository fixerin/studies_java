package com.company;

public class Car {
    String carMake;
    String model;
    Integer productionYear;
    //Integer displacement;
    Double engineCapacity;
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
}
