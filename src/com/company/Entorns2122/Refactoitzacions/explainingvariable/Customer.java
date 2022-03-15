package com.company.Entorns2122.Refactoitzacions.explainingvariable;

public class Customer {

    private String name;
    private int age;
    private float salary;

    public Customer(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public boolean isEdatLaboral(){
        if (age > 17 && age < 66){
            return true;
        }
        return false;
    }

    public boolean isSalary(){
        if ((salary - (salary * 0.2f)) < 1000f){
            return true;
        }
        return false;
    }

    public boolean isPlus(float totalAmount){
        if (totalAmount * 0.5 < 100){
            return true;
        }
        return false;
    }


    public float applyDiscount (float totalAmount) {
        if ((isEdatLaboral()) && isSalary() && isPlus(totalAmount)) {
            return totalAmount * 0.9f;
        } else {
            return totalAmount;
        }
    }
}
