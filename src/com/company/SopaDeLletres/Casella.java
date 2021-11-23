package com.company.SopaDeLletres;

public class Casella {
    static char [] lletres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
     static String [] paraules = {"hola", "programació", "aprovar", "mallorca", "java"};

    public Casella(char[] lletres, String[] paraules) {
        this.lletres = lletres;
        this.paraules = paraules;
    }

    public static char[] getLletres() {
        return lletres;
    }

    public static void setLletres(char[] lletres) {
        Casella.lletres = lletres;
    }

    public static String[] getParaules() {
        return paraules;
    }

    public static void setParaules(String[] paraules) {
        Casella.paraules = paraules;
    }
}
