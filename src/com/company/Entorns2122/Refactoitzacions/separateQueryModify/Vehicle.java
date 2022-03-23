package com.company.Entorns2122.Refactoitzacions.separateQueryModify;

public class Vehicle {
    private int horsePower;
    private String type;

    public Vehicle(int power) {
        setType(power);
    }

    private void init (int power){
        setHorsePower(power);
        setType(power);
    }

    private String setType(int power) {
        horsePower = power;

        if (power >= 10) {
            type = "Truck";
        } else if (power > 5 && power < 10) {
            type = "Car";
        } else {
            type = "Bike";
        }

        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }
}
