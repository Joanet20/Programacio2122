package com.company.D67234GC20_labs.labs.examples.les13;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenny
 */
public class TestArray {
    
    int[] intArray;
    
    public TestArray (int size) {
        intArray = new int[size];
    }
       
    public void addElement(int index, int value) {
        intArray[index] = value;
    }
    
}
