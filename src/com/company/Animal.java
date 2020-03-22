package com.company;

import java.io.File;

public class Animal {
    final String species;
    private Double weight;
    public String name;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.12;
    public static final Double DEFAULT_LION_WEIGHT = 23.0;


    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "mouse") {
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        }
    }


    void feed(){
        if (alive()) {
            weight++;
            System.out.println("Thx for food bro, my weight is now: " + weight);
        } else if (!alive()){
            System.out.println("You can't feed dead animal.");
        }
    }

    void takeOnWalk(){
        if (weight >= 3) {
            weight--;
            System.out.println("Thx for a walk bro, my weight is now: " + weight);
        } else if (alive()){
            weight--;
            System.out.println("Thx for a walk bro, but I'm hungry.");
        } else {
            System.out.println("You can't walk with dead animal.");
        }
    }
    boolean alive(){
        if (weight > 0) {
            return true;
        } else {
            return false;
        }
    }
}
