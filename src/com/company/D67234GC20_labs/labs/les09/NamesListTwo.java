package com.company.D67234GC20_labs.labs.les09;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NamesListTwo {
    public static ArrayList listOfNames;
    
    public void setList(){
        listOfNames = new ArrayList();
        listOfNames.add("Joe Smith");
        listOfNames.add("Mary Palmer");
        listOfNames.add("Jose Gonzalez");
        listOfNames.add("Linda Baker");
        System.out.println("Size of ArrayList is: " + listOfNames.size());
    }

    public static void displayList(){
        for (int i = 0; i <= 3; i++){
            System.out.println(listOfNames.get(i));
        }
    }
       
}
