package com.company.Entorns2122.Refactoitzacions.encapsulate;

public class Customer {
    private String name;
    private int id;

    private Customer() {
        init();
    }

    public void init() {
        name = "Eugene Krabs";
        id = 42;
    }

    public String toString() {
        return id + ":" + name;
    }
}
