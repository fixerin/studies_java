package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public class Animal implements Edible, Saleable {
    public final String species;
    protected Double weight;
    public String name;
    public File pic;

    private static final Double DEFAULT_DOG_WEIGHT = 10.0;
    private static final Double DEFAULT_MOUSE_WEIGHT = 0.12;
    private static final Double DEFAULT_LION_WEIGHT = 23.0;


    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
        }
    }


    public void feed(){
        if (alive()) {
            weight++;
            System.out.println("Thx for food bro, my weight is now: " + weight);
        } else if (!alive()){
            System.out.println("You can't feed dead animal.");
        }
    }

    public void takeOnWalk(){
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
    private boolean alive(){
        if (weight > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void beEaten(){
        if (this instanceof Human){
//            throw new Exception("no way you cannibal");
            System.out.println("no way you cannibal");
        } else {
            System.out.println("adioos");
            this.weight = 0.0;
        }
    }

    public void sell(){
        if (this instanceof Human){
            System.out.println("Slavery restricted.");
        } else{
            System.out.println("Pet has been sold.");
        }
    }
}
