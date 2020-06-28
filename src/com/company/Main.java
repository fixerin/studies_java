package com.company;

//import jdk.swing.interop.SwingInterOpUtils;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Disel;
import com.company.devices.Phone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Human me = new Human();
        me.firstName = "Leszek";
        me.lastName = "Leszner";
        me.pet = new Pet("mouse");
        me.pet.name = "Rulo";
        me.cash = 10000.0;
        //me.phone = new Phone( "Galaxy 7", 0.06, "Samsung", 2010, 900, 14.5, "Android 5");

        //Car bmw = new Car("E56", 700.0, "BMW", 2019, 20000, "BMW", 2000.0);

        Disel bmw = new Disel("E56", 700.0, "BMW", 2019, 20000, "BMW", 2000.0, 200);


        bmw.setPrice(25000);
        //Car bmw2 = new Car("E56", 700.0, "BMW", 2019, 20000, "BMW", 2000.0);
        //System.out.println(Math.PI);


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
//        System.out.println(me.getCar());
//        System.out.println(you.getCar());
//
//        //these're 2 different objects but with same fields and values
//        System.out.println(bmw);
//        System.out.println(bmw2);
//
//        System.out.println(me);
//
//        System.out.println(me.phone);
//
//        System.out.println(me.species);
        me.feed();

//        System.out.println(me instanceof Human);
//        System.out.println(me instanceof Animal);
//
//        System.out.println(me.pet instanceof Human);
//        System.out.println(me.pet instanceof Animal);
//
//        System.out.println(me instanceof Object);
//        System.out.println(me.pet instanceof Object);
//        System.out.println(me.getCar() instanceof Object);


        System.out.println(bmw.toString());
        bmw.turnOn();
        me.getCar().turnOn();
        //System.out.println(me.phone.toString());
        //me.phone.turnOn();

        //me.setCar(passat);

//        me.sell();
//       me.getCar().sell();
//        me.pet.sell();
        System.out.println("Anna's cash: " + you.cash);
        System.out.println("Leszek's cash: " + me.cash);

        //phone
/*
        try {
            me.phone.sellable(you, me, 900.0);
        } catch (NullPointerException ex) {
            System.out.println("Seller don't even have the item which wants to sell.");
        }

        me.phone = new Phone( "Galaxy 7", 0.06, "Samsung", 2010, 900, 14.5, "Android 5");
        try {
            me.phone.sellable(you, me, 900.0);
        } catch (NullPointerException ex) {
            System.out.println("Seller don't even have the item which wants to sell.");
        }

        System.out.println("Anna's cash: " + you.cash);
        System.out.println("Leszek's cash: " + me.cash);
        try {
            me.getCar().sellable(me, you, 20000.0);
        } catch (NullPointerException ex) {
            System.out.println("Seller don't even have the item which wants to sell.");
        }
        me.sellable(you, me, 10000.0);
        //me.sellable(you, me, 300.0, );
*/
        me.phone = new Phone( "Mi 9", 0.3,  "Xiaomi", 2019, 1500, 14.4, "Android 10");

        String[] apps = {"Muber Eatz", "Allogro"};
        me.phone.installAnApp( apps );

        me.phone.installAnApp( "Spotimy", "v10.3" );


        //me.pet.feed();
        //me.pet.feed();
        //me.pet.feed();

        me.getCar().refuel( 40);


        Scanner in = new Scanner(System.in);
    }
}
