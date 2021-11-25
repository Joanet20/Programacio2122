package com.company.ReptesProgramacio;

public class ExamenArray {

    public static int exercici1(){
        int [] enters = {4, 6, 8, 10};
        int total = 0;
        int mitja;

        for (int i = 0; i < enters.length; i++){
            total =+ enters[i];
        }

        mitja = total / enters.length;

        return mitja;
    }

    public static int exercici2(){
        int [] enters = {6, 4, 2, 10};
        int nummesPetit = enters[0];

        for (int i = 1; i < enters.length; i++){
            if (nummesPetit > enters[i]){
                nummesPetit = enters[i];
            }
        }

        return nummesPetit;
    }

    public static int exercici3(){
        int [] enters = {5, 24, 3, 9};
        int indexMinim = 0;
        int numMinim = enters[0];

        for (int i = 1; i < enters.length; i++){
            if (numMinim > enters[i]){
                indexMinim = i;
            }
        }
        return indexMinim;
    }
}
