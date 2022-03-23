package com.company.ReptesProgramacio.LleiDHont;

import java.util.Scanner;

public class LlleiHont {

    public static int[] introduirVots(int partits, int participants){
        int [] numVots = new int[partits];

        int limit = 0;

        for (int i = 0; i < numVots.length; i++){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Vots del partit " + i);
            numVots[i] = scanner.nextInt();

            if (numVots[i] > participants - limit - i){
                i--;
                limit -= numVots[i];
            }

            limit += numVots[i];

            System.out.println("Vots actuals " + limit);

            if (limit == 400){
                i = numVots.length;
            }
        }

        return numVots;
    }

    public static boolean[] esParticipant(int partits, int participants, int percentatge, int numVots[]){

        //int numVots[] = introduirVots(partits, participants);

        boolean participa[] = new boolean[partits];

        for (int i = 0; i < numVots.length; i++){
            if (numVots[i] > participants * percentatge / 100){
                participa[i] = true;

            } else {
                participa[i] = false;
            }
        }
        return participa;
    }

    public static void eleccions(int percentatge, int participants, int partits, int representants){

        int [][] vots = new int[partits][representants];

        int numVots[] = introduirVots(partits, participants);


        /*for (int i = 0; i < numVots.length; i++){
            int aux;
            for (int j = i+1; j < numVots.length; j++){
                if (numVots[i] < numVots[j]){
                    aux = numVots[i];
                    numVots[i] = numVots[j];
                    numVots[j] = aux;
                }
            }
        }*/



        for (int i = 0; i < partits; i++){

            int divisor = 1;

            for (int j = 0; j < representants; j++){
                vots[i][j] = numVots[i] / divisor;

                divisor++;

            }
        }

        //Repartir vots

        boolean[] participa = esParticipant(partits, participants, percentatge, numVots);
        System .out.println("Columnes = Partits, Files = Escanys");

        for (int i = 0; i < partits; i++){

            int bot = 0;
            for (int j = 0; j < representants; j++){

                if (participa[i] == false){
                    if (j == 0){
                        System.out.print("Partit " + (i) + ": ");
                    }

                    if (j == i) {
                        System.out.println("No pot participar");
                    }

                } else {
                    if (j == 0){
                        System.out.print("Partit " + (i) + ": ");
                    }


                    System.out.print(vots[i][j] + " ");
                    bot++;
                }


                if (bot > partits){
                    System.out.println("");
                }
            }
        }

        calcularEscons(partits, representants, vots);
    }

    public static void calcularEscons(int partits, int escanys, int vots[][]){
        int [] escons = new int[partits];
        int [] posicioPartit = new int[partits * escanys];
        int [] totalVots = new int[partits * escanys];
        int juntar = 0;

        for (int i = 0; i < partits; i++){
            for (int j = 0; j < escanys; j++){
                totalVots[juntar] = vots[i][j];
                posicioPartit[juntar] = i;
                juntar++;
            }
        }

        //Ordena escons de major a menor

        for (int i = 0; i < totalVots.length; i++){
            int aux;
            int aux2;
            for (int j = i+1; j < totalVots.length; j++){
                if (totalVots[i] < totalVots[j]){
                    aux = totalVots[j];
                    aux2 = posicioPartit[j];
                    totalVots[j] = totalVots[i];
                    posicioPartit[j] = posicioPartit[i];
                    totalVots[i] = aux;
                    posicioPartit[i] = aux2;
                }
                if (totalVots[i] == totalVots[j]){
                    if (posicioPartit[i] < posicioPartit[j]){
                        aux = totalVots[j];
                        aux2 = posicioPartit[j];
                        totalVots[j] = totalVots[i];
                        posicioPartit[j] = posicioPartit[i];
                        totalVots[i] = aux;
                        posicioPartit[i] = aux2;
                    }
                }
            }
        }

        //Assigna escons
        for (int i = 0; i < partits; i++){
            for (int j = 0; j < escanys; j++){
                if (posicioPartit[j] == i){
                    escons[i]++;
                }
            }
        }

        for (int i = 0; i < escons.length; i++){
            System.out.println("Escons partit " + (i) + ": " + escons[i]);
        }
    }

}
