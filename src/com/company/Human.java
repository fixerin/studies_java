package com.company;

public class Human {
    String firstName;
    String lastName;
    private Car car;
    Phone phone;
    Animal pet;
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
}
