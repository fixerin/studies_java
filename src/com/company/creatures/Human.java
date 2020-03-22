package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    public String firstName;
    public String lastName;
    private Car car;
    public Phone phone;
    public Animal pet;
    private Double salary = 1000.0;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        System.out.println("Your salary is now:" + salary);
        this.salary = salary;
    }

    public void setCar(Car car) {
        if (car.getPrice() <= salary) {
            System.out.println("Udało Ci się kupić auto z jednej wypłaty");
            this.car = car;
        } else if (car.getPrice() / 12 < salary) {
            System.out.println("Udało Ci się kupić auto na 12 rat.");
            this.car = car;
        } else {
            System.out.println("Nie stać Cię na to auto, wybierz inne.");

        }

    }

    public Car getCar() {
        //System.out.println("Your car: " + car.carMake);
        return car;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
