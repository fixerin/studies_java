package com.company.creatures;

public class FarmAnimal extends Animal{
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten(){
        this.weight = 0.0;
        System.out.println("Animal has been eaten.");
    }
}
