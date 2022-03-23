package com.company.Entorns2122.Refactoitzacions.replaceConditionalsWithPolymorphism;

public class Bike extends Vehicle{

    public Bike (int speed, int acceleration){
        super(speed, acceleration);
    }

    @Override
    public int move() {
        return getSpeed() * 10;
    }
}
