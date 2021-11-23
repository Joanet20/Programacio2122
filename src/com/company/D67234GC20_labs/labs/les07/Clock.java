package com.company.D67234GC20_labs.labs.les07;

public class Clock {
    public static void displayPartOfDay(){
        int hour = 0;

        if (hour <= 12){
            System.out.println(hour + " AM");
        } else{
            System.out.println(hour + " PM");
        }
    }
}
