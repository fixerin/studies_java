package com.company.devices;

public class LPG extends Car {
    Integer gasTankCap;
    public LPG(String model, Double weight, String producer, Integer productionYear, Integer price, String carMake, Double engineCapacity, Integer gasTankCap) {
        super( model, weight, producer, productionYear, price, carMake, engineCapacity );
        this.gasTankCap = gasTankCap;
    }

    @Override
    public void refuel(Integer actualGas){
        Integer amount = 0;
        while (actualGas <= gasTankCap){
            actualGas += 1;
            amount += 1;
        }
        System.out.println("Zatankowano " + amount + " litrów gazu.");
    }
}
