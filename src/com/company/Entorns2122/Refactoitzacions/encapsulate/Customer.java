package com.company.Entorns2122.Refactoitzacions.encapsulate;

public class Customer {
    private String name;
    private int id;

    public Customer() {
        init();
    }

    public void init() {
        name = "Eugene Krabs";
        id = 42;
    }

    public String toString() {
        return id + ":" + name;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getId (){
        return id;
    }

    public void setId (int id){
        this.id = id;
    }
}
