package com.company;

//import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human me = new Human();
        me.firstName = "Leszek";
        me.lastName = "Leszner";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";

        Car bmw = new Car("BMW", "E56", 2019, 2.2);
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

        //me.setCar(passat);



    }
}
