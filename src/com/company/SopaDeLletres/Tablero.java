package com.company.SopaDeLletres;

public class Tablero {
    public static void imprimirTablero(){
        int separaLinea = 0;
        int eixY = 1;

        for (int i = 0; i < 11; i++){
            System.out.print("[" + i + "]");
        }
        System.out.println("");

        for (int i = 0; i < 100; i++){
            if (separaLinea == 0){
                System.out.print("[" + eixY + "]");
                eixY++;
            }
            int numAleatori = (int) (Math.random()*25);
            System.out.print("[" + Casella.getLletres()[numAleatori] + "]");
            separaLinea++;
            if (separaLinea == 10){
                System.out.println("");
                separaLinea = 0;
            }
        }
    }
}
