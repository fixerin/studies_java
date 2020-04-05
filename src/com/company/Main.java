package com.company;

//import jdk.swing.interop.SwingInterOpUtils;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human me = new Human();
        me.firstName = "Leszek";
        me.lastName = "Leszner";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";

        Car bmw = new Car("BMW", "E56", "xzc", 2019, 20000, "BMW", 2000.0);
        bmw.setPrice(25000);

        System.out.println(Math.PI);



//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();
//
//        me.pet.takeOnWalk();
//        me.pet.takeOnWalk();
//        me.pet.takeOnWalk();
//        me.pet.takeOnWalk();

        System.out.println("my salary is: " + me.getSalary());

        me.setSalary(3000.0);
        me.setCar(bmw);
        System.out.println("I'm driving " + me.getCar().model);

//        Car passat = new Car("Passat", "Passat", 2005, 1.4);
//        passat.setPrice(4000);

        Human you = new Human();
        you.firstName = "Anna";
        you.lastName = "Likusz";
        you.setSalary(3000.0);
        you.setCar(bmw);

        System.out.println(me.getCar());
        System.out.println(you.getCar());
        System.out.println(me);

        System.out.println(me.species);
        me.feed();

        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);

        System.out.println(me.pet instanceof Human);
        System.out.println(me.pet instanceof Animal);

        System.out.println(me instanceof Object);
        System.out.println(me.pet instanceof Object);
        System.out.println(me.getCar() instanceof Object);


        //me.setCar(passat);



    }
}
