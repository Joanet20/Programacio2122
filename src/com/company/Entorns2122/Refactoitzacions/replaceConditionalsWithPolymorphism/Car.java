package com.company.Entorns2122.Refactoitzacions.replaceConditionalsWithPolymorphism;

public class Car extends Vehicle{

    public Car (int speed, int acceleration){
        super(speed, acceleration);
    }

    @Override
    public int move() {
        return getSpeed() * getAcceleration() * 5;
    }
}
