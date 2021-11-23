package com.company.D67234GC20_labs.labs.les09;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class VacationScaleTwo {
    public static ArrayList vacationDays;
    
    public void setVacationScale(){
        vacationDays = new ArrayList(7);
        vacationDays.add(10);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(20);
        vacationDays.add(20);
        vacationDays.add(25);
    }

    public static void displayVacationDays(){
        for (int i = 0; i <= 6; i++){
            System.out.println(vacationDays.get(i));
        }
    }
}
