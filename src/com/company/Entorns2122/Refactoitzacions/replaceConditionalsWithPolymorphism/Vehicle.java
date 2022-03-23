package com.company.Entorns2122.Refactoitzacions.replaceConditionalsWithPolymorphism;

public abstract class Vehicle {

    private int speed;
    private int acceleration;

    public Vehicle(int speed, int acceleration) {
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public abstract int move ();
        /*int result = 0;
        switch (vehicleType) {
            case CAR:
                result = speed * acceleration * 5;
                break;
            case BIKE:
                result = speed * 10;
                break;
            case PLANE:
                result = acceleration * 2;
                break;
        }
        return result;*/

    public int getSpeed() {
        return speed;
    }

    public int getAcceleration() {
        return acceleration;
    }
}
