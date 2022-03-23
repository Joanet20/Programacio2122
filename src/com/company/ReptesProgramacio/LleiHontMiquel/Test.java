package com.company.ReptesProgramacio.LleiHontMiquel;

public class Test {
    public static void main(String[] args) {
        // write your code here


        String[] nomsPartits = { "Partit A", "Partit B", "Partit C", "Partit D", "Partit E"  };
        int[] votsAconseguits =  {120000, 100000, 40000, 5000, 2500 } ;
        int [] resultats;

        LleiHondtFuncionalEsquelet.initCalculHondt( 8, nomsPartits, votsAconseguits, 3);

    }
}
