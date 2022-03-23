package com.company.ReptesProgramacio.LleiHontMiquel;

public class LleiHondtFuncionalEsquelet {

    private static int esconsPerAssignar = 8;
    private static int numPartits = 5;
    private static int[] votsPartits = {120000, 100000, 40000, 5000, 2500};
    private static String[] nomsPartits = {"Partit A", "Partit B", "Partit C", "Partit D", "Partit E"};

    private static float percentatgeMinim  = 0.03F;

    private static float[][] quoficientsHondt = new float[numPartits][esconsPerAssignar];

    private static boolean[] teVotsMinims = new boolean[numPartits];

    private static int[] esconsAssignats = new int[numPartits];

    public static int[] initCalculHondt(
            int escons,
            String[] partits,
            int[] votsAconseguits,
            int percentatgeEliminacionPartits
    ){

        determinarPartitsAmbVotsMinims();
        construirTaulaHondt();
        imprimirTaulaQuoficients();
        calculHondt();
        imprimirResultats();

        return esconsAssignats;

    }

    private static  void imprimirResultats(){

        for (int i = 0; i < esconsAssignats.length; i++){

            System.out.println("Escons del partit " + nomsPartits[i] + ": " + esconsAssignats[i]);
        }
    }

    private static void imprimirTaulaQuoficients(){

        for (int i = 0; i < numPartits; i++){
            System.out.print(nomsPartits[i] + ": ");
            for (int j = 0; j < esconsPerAssignar; j++){

                if (teVotsMinims[i]){
                    System.out.print(quoficientsHondt[i][j]);
                } else {
                    if (j == i){
                        System.out.print("No pot participar");
                    }
                }

            }
            System.out.println("");
        }
    }

    private static void calculHondt(){


        float [] maxims = new float[numPartits];

        for (int i = 0; i < esconsPerAssignar; i++){
            for (int j = 0; j < numPartits; j++){
                maxims[j] = quoficientsHondt[j][i];
            }
            int auxPos = 0;
            for (int j = 0; j < maxims.length; j++){
                if (maxims[j] > maxims[maxims.length - j - 1]){
                    auxPos = j;
                }
                esconsAssignats[auxPos]++;
            }

        }

    }

    private static void determinarPartitsAmbVotsMinims(){

        for (int i = 0; i < teVotsMinims.length; i++){
            if (votsPartits[i] < (votsTotals() * percentatgeMinim)){
                teVotsMinims[i] = false;
            } else {
                teVotsMinims[i] = true;
            }
        }
    }

    private static int votsTotals(){
        int total = 0 ;

        for (int i = 0; i < votsPartits.length; i++){
            total += votsPartits[i];
        }

        return total;
    }

    private static void construirTaulaHondt(){

        for (int i = 0; i < numPartits; i++){
            for (int j = 0; j < esconsPerAssignar; j++){
                quoficientsHondt[i][j] = votsPartits[i] / (j+1);
            }
        }
    }

}
