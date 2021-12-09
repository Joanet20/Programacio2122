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
                numMinim = enters[i];
            }
        }
        return indexMinim;
    }

    public static int exercici4(){
        int [] enters = {20, 4, 69, 19, 24};
        int numMaxim = enters[0];

        for (int i = 1; i < enters.length; i++){
            if (numMaxim < enters[i]){
                numMaxim = enters[i];
            }
        }
        return numMaxim;
    }

    public static int exercici5(){
        int [] enters = {3, 43, 4, 9, 1};
        int numMaxim = enters[0];
        int indexMaxim = 0;

        for (int i = 1; i < enters.length; i++){
            if (numMaxim < enters[i]){
                indexMaxim = i;
                numMaxim = enters[i];
            }
        }
        return indexMaxim;
    }


    public static boolean exercici6(){

        boolean ordre;
        int [] enters ={1, 2, 3, 4};
        if (enters[1] > enters[2]){
            ordre = false;
        } else {
            ordre = true;
        }
        return ordre;
    }

    public static boolean exercici7(){

        boolean ordre;
        int [] enters ={1, 2, 3, 4};
        int [] impars = new int[(enters.length / 2) + 1];
        int [] parells = new int[(enters.length / 2) + 1];
        int cont = 0;

        for (int i = 0; i < enters.length; i++){
            if (i%2!=0){
                impars[cont] = enters[i];
                cont++;
            }
        }

        if (impars[0] > impars[1]){
            ordre = false;
        } else {
            ordre = true;
        }
        System.out.println(ordre);
        return ordre;
    }

    public static int [] exercici8(){
        int [] enters = {2, 4, 7, 9, 7};
        int [] reves = new int[enters.length];

        for (int i = 0; i < enters.length; i++){
            reves[i] = enters[enters.length - i -1];
        }
        return reves;
    }

    /*public static int exercici9(){

        int num = 9;

        int [] enters = {2, 4, 7, 9, 7};


    }*/

    public static int exercici10(){
        int [] enters = {24, 4, 5, 9, 7};
        int [] diferencies = new int[enters.length];
        int valorProper = enters[0];
        int diferencia;
        int total = 0;
        int mitja;

        for (int i = 0; i < enters.length; i++){
            total += enters[i];
        }

        mitja = total / enters.length;

        for (int i = 0; i < diferencies.length; i++){
            if (enters[i] < mitja){
                diferencies[i] = mitja - enters[i];
            } else if (enters[i] > mitja){
                diferencies[i] = enters[i] - mitja;
            }
        }

        diferencia = diferencies[0];

        for (int i = 1; i < diferencies.length; i++){
            if (diferencia > diferencies[i]){
                diferencia = diferencies[i];
                valorProper = enters[i];
            }
        }
        
        return valorProper;
    }
}
