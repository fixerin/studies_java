package com.company.devices;

public class Electric extends Car{
    Integer batteryCap;
    public Electric(String model, Double weight, String producer, Integer productionYear, Integer price, String carMake, Double engineCapacity, Integer batteryCap) {
        super( model, weight, producer, productionYear, price, carMake, engineCapacity );
        this.batteryCap = batteryCap;
    }

    @Override
    public void refuel(Integer actualPower){
        Integer amount = 0;
        while (actualPower <= batteryCap){
            actualPower += 1;
            amount += 1;
        }
        System.out.println("Naładowano ilością" + amount + " mAh");
    }
}
