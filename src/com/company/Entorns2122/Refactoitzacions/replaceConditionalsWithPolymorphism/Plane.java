package com.company.Entorns2122.Refactoitzacions.replaceConditionalsWithPolymorphism;

public class Plane extends Vehicle{

    public Plane (int speed, int acceleration){
        super(speed, acceleration);
    }

    @Override
    public int move() {
        return getAcceleration() * 2;
    }
}
