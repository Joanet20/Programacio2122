package com.company.ReptesProgramacio;

public class ExamenArray {

    public static void exercici1(){
        int [] enters = {4, 6, 8, 10};
        int total = 0;
        int mitja;

        for (int i = 0; i < enters.length; i++){
            total =+ enters[i];
        }

        mitja = total / enters.length;

        System.out.println("La mitja es " + mitja);
    }
}
