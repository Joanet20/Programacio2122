package com.company.D67234GC20_labs.labs.les06;

import com.company.D67234GC20_labs.labs.les05.Person;

public class PersonTwo {
    public String name = "Johan";
    public String surname = "Villabuena";
    public int age = 20;

    public void displayPersonInfo(){
        StringBuilder myStringBuider = new StringBuilder("Nom: ");
        StringBuilder myStringBuider2 = new StringBuilder("Llinatge: ");
        StringBuilder myStringBuider3 = new StringBuilder("Edat: ");

        System.out.println(myStringBuider.append(name));
        System.out.println(myStringBuider2.append(surname));
        System.out.println(myStringBuider3.append(age));
    }
}
