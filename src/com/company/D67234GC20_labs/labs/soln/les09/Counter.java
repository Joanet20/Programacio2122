package com.company.D67234GC20_labs.labs.soln.les09;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Counter {
    public final int MAX_COUNT = 100;
    
    public void displayCount(){
        for(int count = 1; count <= MAX_COUNT; count++){
            if(count % 12 == 0){
                System.out.print(count + " ");
            }
        }
    }    
}
