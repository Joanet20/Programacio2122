package com.company.ReptesProgramacio.LleiHontPOO;

public class LleiHont {


    private static final int percent = 3;
    private static final int representants = 6;

    public static int totalVots(Partit[] partits){

        int totalVots = 0;

        for (int i = 0; i < partits.length; i++){
            totalVots += partits[i].getVots();
        }

        return totalVots;
    }

    public static void esParticipant(Partit[] partits){

        for (int i = 0; i < partits.length; i++){
            if (partits[i].getVots() < (totalVots(partits)*percent) / 100){
                partits[i].setParticipa(false);
            }
        }
    }

    public static int[][] repartirVots(Partit[] partits){

        int votsRepartits[][] = new int[partits.length][representants];

        for (int i = 0; i < partits.length; i++){
            for (int j = 0; j < representants; j++){
                votsRepartits[i][j] = partits[i].getVots() / (j+1);
            }
        }
        return votsRepartits;
    }

    public static int[] assignarEscons(Partit[] partits){

        int votsPerPartit [] = new int[partits.length * representants];

        int identificador [] = new int[partits.length * representants];

        int [] escons = new int[partits.length];

        int juntar = 0;

        for (int i = 0; i < partits.length; i++){
            for (int j = 0; j < representants; j++){
                votsPerPartit[juntar] = repartirVots(partits)[i][j];
                identificador[juntar] = i;
                juntar++;
            }
        }


        for (int i = 0; i < votsPerPartit.length; i++){

            int aux;
            int aux2;

            for (int j = i+1; j < votsPerPartit.length; j++){
                if (votsPerPartit[i] < votsPerPartit[j]){
                    aux = votsPerPartit[i];
                    aux2 = identificador[i];

                    votsPerPartit[i] = votsPerPartit[j];
                    identificador[i] = identificador[j];

                    votsPerPartit[j] = aux;
                    identificador[j] = aux2;
                }
            }
        }


            for (int j = 0; j < representants; j++){
                escons[identificador[j]]++;

            }

        return escons;
    }

    public static void printTaula(Partit[] partits){
        for (int i = 0; i < partits.length; i++){
            int bot = -1;
            for (int j = 0; j < representants; j++){
                System.out.print(repartirVots(partits)[i][j] + " ");
                bot++;
                if (bot > partits.length){
                    System.out.println("");
                    bot = 0;
                }
            }
        }
    }

    public static void printEscons(Partit[] partits){
        for (int i = 0; i < assignarEscons(partits).length; i++){

            if (partits[i].isParticipa()){
                System.out.println("El partit " + partits[i].getNom() + " té " + assignarEscons(partits)[i] + " escons.");
            }else {
                System.out.println("El partit " + partits[i].getNom() + " no pot participar");
            }

        }
    }
}
