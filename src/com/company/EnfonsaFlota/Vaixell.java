package com.company;

import java.util.Scanner;

public class Vaixell {

    private boolean isEnfonsat;
    private int mida;
    private String nom;
    private boolean[][] posicionsOcupades;
    int videsVaixell = mida;


    public Vaixell(boolean isEnfonsat, int mida, String nom) {
        this.isEnfonsat = isEnfonsat;
        this.mida = mida;
        this.nom = nom;
    }

    public int getMida(){
        return mida;
    }

    public String getNom() {
        return nom;
    }

    public boolean[][] getPosicionsOcupades(){
        return posicionsOcupades;
    }

    public void setPosicionsOcupades(boolean[][] posicionsOcupades){
        this.posicionsOcupades = posicionsOcupades;
    }

    public int getVidesVaixell(){
        return videsVaixell;
    }

    public void setVidesVaixell(int videsVaixell){
        this.videsVaixell = videsVaixell;
    }


    /*Retorna un Array en el que el progrma
    mirarà si una posició està ocupada
    o no a l'hora de disparar*/

    public boolean[][] posOcupadesJugador(Tablero tableroJugador, Vaixell[] vaixells, int[][] barcosJugador){

        boolean[][] ocupaJugador = new boolean[tableroJugador.getMaximY()][tableroJugador.getMaximX()];

        for (int i = 0; i < vaixells.length; i++){

            for (int j = 0; j < tableroJugador.getMaximX(); j++){
                for (int k = 0; k < tableroJugador.getMaximY(); k++){
                    if (barcosJugador[j][k] != 0){
                        vaixells[i].getPosicionsOcupades()[j][k] = true;
                    } else {
                        vaixells[i].getPosicionsOcupades()[j][k] = false;
                    }
                }
            }
        }

        return ocupaJugador;
    }

    public boolean[][] posOcupadesMaquina(Tablero tableroMaquina, Vaixell[] vaixells, int[][] barcosJugador){

        boolean[][] ocupaMaquina = new boolean[tableroMaquina.getMaximY()][tableroMaquina.getMaximX()];

        for (int i = 0; i < vaixells.length; i++){

            for (int j = 0; j < tableroMaquina.getMaximX(); j++){
                for (int k = 0; k < tableroMaquina.getMaximY(); k++){
                    if (barcosJugador[j][k] != 0){
                        vaixells[i].getPosicionsOcupades()[j][k] = true;
                    } else {
                        vaixells[i].getPosicionsOcupades()[j][k] = false;
                    }
                }
            }
        }

        return ocupaMaquina;
    }

}
