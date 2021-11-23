package com.company.D67234GC20_labs.labs.les10;

public class Customer {

    public  String name;
    public  String surname;


    public  void setCustomerInfo(String nom){
        name = nom;
    }

    public  void setCustomerInfo(String nom, String llinatge){
        name = nom;
        surname = llinatge;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(surname);
    }
}
