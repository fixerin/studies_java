package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    private Car car;
    public Phone phone;
    public Animal pet;
    private Double salary = 1000.0;
    public Double cash;

    public final static double DEFAULT_HUMAN_WEIGHT = 70.0;

    public Human() {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("Wypłata to nie długi, nie może być ujemna.");
        } else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Musisz odebrać aneks do umowy od pani Hani z kadr w ciągu 14 dni.");
            System.out.println("ZUS i US już znają wartość twojej wypłaty. Nie ma sensu jej ukrywać");
            this.salary = salary;
            System.out.println("Twoja nowa wypłata to: " + salary);
        }

    }

    public void setCar(Car car) {
        if (car.getPrice() <= salary) {
            System.out.println("Udało Ci się kupić auto z jednej wypłaty");
            this.car = car;
        } else if (car.getPrice() / 12 < salary) {
            System.out.println("Udało Ci się kupić auto na 12 rat.");
            this.car = car;
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");

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
