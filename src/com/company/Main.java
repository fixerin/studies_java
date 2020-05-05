package com.company;

//import jdk.swing.interop.SwingInterOpUtils;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Human me = new Human();
        me.firstName = "Leszek";
        me.lastName = "Leszner";
//        me.pet = new Animal("mouse");
//        me.pet.name = "Myszojeleń";
        me.cash = 10000.0;
        me.phone = new Phone( "Galaxy 7", 0.06, "Samsung", 2010, 900, 14.5, "Android 5");

        Car bmw = new Car("E56", 700.0, "BMW", 2019, 20000, "BMW", 2000.0);
        bmw.setPrice(25000);
        Car bmw2 = new Car("E56", 700.0, "BMW", 2019, 20000, "BMW", 2000.0);
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
        System.out.println("my salary is: " + me.getSalary());
        me.setSalary(-100.0);
        System.out.println("my salary is : " + me.getSalary());

        me.setCar(bmw);
        System.out.println("I'm driving " + me.getCar().model);

//        Car passat = new Car("Passat", "Passat", 2005, 1.4);
//        passat.setPrice(4000);

        Human you = new Human();
        you.firstName = "Anna";
        you.lastName = "Likusz";
        you.setSalary(3000.0);
        you.setCar(bmw);
        you.cash = 1000.0;

        // its the same car - same object.
        System.out.println(me.getCar());
        System.out.println(you.getCar());

        //these're 2 different objects but with same fields and values
        System.out.println(bmw);
        System.out.println(bmw2);

        System.out.println(me);

        System.out.println(me.phone);

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

//        me.sell();
//        me.getCar().sell();
//        me.pet.sell();
        me.phone.sellable(you, me, 900.0);
        me.getCar().sellable(me, you, 200000.0);

    }
}
