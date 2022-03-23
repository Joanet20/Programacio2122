package com.company.ReptesProgramacio.LleiHontPOO;

public class TestLleiHontPOO {

    public static void main(String[] args){

        Partit partit1 = new Partit("PP", 500, 0, true);
        Partit partit2 = new Partit("PSOE", 300, 0, true);
        Partit partit3 = new Partit("PODEMOS", 40, 0, true);
        Partit partit4 = new Partit("CIUDADANOS", 20, 0, true);

        Partit partits[] = {partit1, partit2, partit3, partit4};

        LleiHont.esParticipant(partits);
        LleiHont.printTaula(partits);
        LleiHont.printEscons(partits);
    }
}
