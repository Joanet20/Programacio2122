package com.company.EnfonsaFlota;

import java.util.Scanner;

public class Vaixell {

    private int id;
    private boolean isEnfonsat;
    private int mida;
    private String nom;
    private int[][] posicionsOcupades = new int[15][15];
    int videsVaixell;


    public Vaixell(int id, boolean isEnfonsat, int mida, String nom) {
        this.id = id;
        this.isEnfonsat = isEnfonsat;
        this.mida = mida;
        this.nom = nom;
        this.videsVaixell = mida;
    }

    public int getMida(){
        return mida;
    }

    public String getNom() {
        return nom;
    }

    public int[][] getPosicionsOcupades(){
        return posicionsOcupades;
    }

    public void setPosicionsOcupades(int[][] posicionsOcupades){
        this.posicionsOcupades = posicionsOcupades;
    }

    public int getVidesVaixell(){
        return videsVaixell;
    }

    public void setVidesVaixell(int videsVaixell){
        this.videsVaixell = videsVaixell;
    }

    public int getId(){
        return id;
    }



    /*Retorna un Array en el que el progrma
    mirarà si una posició està ocupada
    o no a l'hora de disparar*/

    /*public boolean[][] posOcupadesJugador(Tablero tableroJugador, Vaixell[] vaixells, int[][] barcosJugador){

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
    }*/

}
