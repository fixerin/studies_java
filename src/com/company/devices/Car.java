package com.company.devices;


public abstract class Car extends Device {
    public String carMake;
    //public String model;
//    public Integer productionYear;
    //Integer displacement;
    public Double engineCapacity;
//    private Integer price;

//    public Car(String carMake, String model, Integer productionYear, Double engineCapacity) {
//        this.carMake = carMake;
//        this.model = model;
//        this.productionYear = productionYear;
//        this.engineCapacity = engineCapacity;
//    }

//    public Car(Double engineCapacity) {
//        this.engineCapacity = engineCapacity;
//    }


    public Car(String model, Double weight, String producer, Integer productionYear, Integer price, String carMake, Double engineCapacity) {
        super(model, weight, producer, productionYear, price);
        this.carMake = carMake;
        this.engineCapacity = engineCapacity;
    }

    public void turnOn() {
        System.out.println("Engine is on");
    }

    public String toString() {
        return carMake + " " + model + " " + productionYear;
    }

    public abstract void refuel(Integer actualState);
}
