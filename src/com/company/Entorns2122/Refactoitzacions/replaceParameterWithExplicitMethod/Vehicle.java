package com.company.Entorns2122.Refactoitzacions.replaceParameterWithExplicitMethod;

public class Vehicle {

    private int acceleration;
    private int speed;

    public Vehicle(int acceleration, int speed) {
        this.acceleration = acceleration;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getSpeed() {
        return speed;
    }

}
