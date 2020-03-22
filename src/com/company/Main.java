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

        System.out.println(Math.PI);



        me.pet.feed();
        me.pet.feed();
        me.pet.feed();

        me.pet.takeOnWalk();
        me.pet.takeOnWalk();
        me.pet.takeOnWalk();
        me.pet.takeOnWalk();

//        Animal dog = new Animal("dog");
//        dog.name = "Ruk";

//        me.pet = dog;

//        dog.feed();
//        dog.feed();



//        System.out.println(Animal.DEFAULT_WEIGHT);
//        System.out.println(dog.name);
//        System.out.println(me.pet.name);


//        System.out.println(dog.weight);
//        dog.feed();
//        System.out.println(dog.weight);


    }
}
