package com.company.ReptesProgramacio.Examen151221;

public class AnalisiText {

    private static String provaExecucio = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec que intentava" +
            "trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un" +
            "aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat!";

    private static char [] delimitador = {' ', '-', ',', '.', '!', '?'};

    public static char[] StringToMatriuChars(String frase){

        char[] matriuChars = new char[frase.length()];

        frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++){
            matriuChars[i] = frase.charAt(i);
        }

        return matriuChars;
    }

    public static void imprimirMatriuChars(char[] matriuChars){

        for (int i = 0; i < matriuChars.length; i++){
            System.out.println(matriuChars[i]);
        }
    }

    public static void main(String[] args){

        //StringToMatriuChars(provaExecucio);

        imprimirMatriuChars(StringToMatriuChars(provaExecucio));
    }
}
