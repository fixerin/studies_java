package com.company.devices;

public class Disel extends Car {
    Integer diselTankCap;
    //Integer actualFuel;

    public Disel(String model, Double weight, String producer, Integer productionYear, Integer price, String carMake, Double engineCapacity, Integer diselTankCap) {
        super( model, weight, producer, productionYear, price, carMake, engineCapacity );
        this.diselTankCap = diselTankCap;
            }

    @Override
    public void refuel(Integer actualFuel){
        Integer amount = 0;
        while (actualFuel < diselTankCap){
            actualFuel += 1;
            amount += 1;
        }
        System.out.println("Zatankowano " + amount + " litrów disla.");
    }

}
