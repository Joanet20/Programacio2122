package com.company.EnfonsaFlota;

import java.util.Scanner;

public class Jugador{

    private int vides;
    private Vaixell[] vaixells;

    public Jugador(Vaixell[] vaixells) {
        this.vides = 5;
        this.vaixells = vaixells;
    }

    public int getVides(){
        return vides;
    }

    public void setVides(int vides){
        this.vides = vides;
    }

    public Vaixell[] getVaixells() {
        return vaixells;
    }

    //Crea un tablero pel jugador

    public int[][] crearTableroJugador(Tablero tableroJugador){
        int[][] tableJugador = new int[tableroJugador.getMaximX()][tableroJugador.getMaximY()];

        for (int i = 0; i < tableroJugador.getMaximX(); i++){
            for (int j = 0; j < tableroJugador.getMaximY(); j++){
                tableJugador[i][j] = 0;
            }
        }
        return tableJugador;
    }


    //El jugador pot colocar els seus vaixells

    public int[][] colocarBarcosJugador(Vaixell[] vaixells, Tablero tableroJugador) throws Exception{

        int[][] barcosJugador = crearTableroJugador(tableroJugador);
        int[][] referencia = crearTableroReferenciaJugador(tableroJugador);
        int posX;
        int posY;
        int horizontalVertical;

            for (int i = 0; i < vaixells.length; i++){

                Scanner scanner = new Scanner(System.in);

                System.out.println("Posició X per " + vaixells[i].getNom());
                posX = scanner.nextInt();

                System.out.println("Posició Y per " + vaixells[i].getNom());
                posY = scanner.nextInt();

                System.out.println("Vols que vagi en horizontal o vertical? 0-Horizontal 1-Vertical");
                horizontalVertical = scanner.nextInt();








                if (barcosJugador[posY][posX] == 0
                        && comprobarPosicionsColindants(barcosJugador, posX, posY, vaixells, i)
                        && surtDelTablero(posY, posX, horizontalVertical, tableroJugador, i)
                        && estaOcupada(barcosJugador, posX, posY, i)
                        && alineamentCorrecte(horizontalVertical, i)){


                    for (int j = 0; j < vaixells[i].getMida(); j++){
                        if (horizontalVertical == 0){
                            barcosJugador[posY][posX + j] = vaixells[i].getId();
                            vaixells[i].getPosicionsOcupades()[posY][posX + j] = 1;

                        } else if (horizontalVertical == 1){
                            barcosJugador[posY + j][posX] = vaixells[i].getId();
                            vaixells[i].getPosicionsOcupades()[posY + j][posX] = 1;
                        }
                    }
                } else {
                    i--;
                }

                printTableroJugador(barcosJugador);
            }



        return barcosJugador;
    }


    //Comproba si surt del tablero

    public boolean surtDelTablero (int posY, int posX, int horizontalVertical, Tablero tableroJugador, int i){
        if (posX > tableroJugador.getMaximX() - vaixells[i].getMida() && horizontalVertical == 0){
            System.out.println("No es pot colocar");
            i--;
            return false;

        } else if (posY > tableroJugador.getMaximY() - vaixells[i].getMida() && horizontalVertical == 1){
            System.out.println("No es pot colocar");
            i--;
            return false;
        }

        return true;
    }

    //Comprova si està ocupada

    public boolean estaOcupada(int[][] barcosJugador, int posX, int posY, int i){
        if (barcosJugador[posY][posX] != 0){
            System.out.println("Ja esta ocupada");
            i--;
            return false;
        }
        return true;
    }

    //Comprobar l'alineament

    public boolean alineamentCorrecte (int horizontalVertical, int i){
        if (horizontalVertical < 0 || horizontalVertical > 1){
            System.out.println("El número asignat per el tipus d'alineament no és correcte.");
            i--;
            return false;
        }
        return true;
    }


    //Comprobar si hi ha barcos devora

    public boolean comprobarPosicionsColindants(int[][] barcosJugador, int posX, int posY, Vaixell[] vaixells, int indicador){

        boolean potColocar = true;


                if (posX != 0){
                    if (barcosJugador[posY][posX - 1] != 0){
                        System.out.println("Hi ha un barco a l'esquerra");
                        potColocar = false;
                    }
                }

                if (posX + (vaixells[indicador].getMida() - 1) <= 14){
                    if (barcosJugador[posY][posX + (vaixells[indicador].getMida())] != 0){
                        System.out.println("Hi ha un barco a la dreta");
                        potColocar = false;
                    }
                }



                for (int m = 0; m < vaixells[indicador].getMida(); m++){

                    if (posY != 0){
                        if (barcosJugador[posY - 1][posX + m] != 0){
                            System.out.println("Hi ha un barco adalt");
                            m = vaixells[indicador].getMida() - 1;
                            potColocar = false;
                        }
                    }

                    if (posY <= 14 && (posX + m) <= 14){
                        if (barcosJugador[posY + 1][posX + m] != 0){
                            System.out.println("Hi ha un barco abaix");
                            m = vaixells[indicador].getMida() - 1;
                            potColocar = false;
                        }

                    }

                }

                return potColocar;
    }


    //Dispara

    public void dispararRival(int[][] barcosRival, int[][] tableroReferencia, Vaixell[] vaixells, Jugador jugador){

        int posX;
        int posY;
        int barco = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Posició X a la que vols disparar");
        posX = scanner.nextInt();

        System.out.println("Posició Y a la que vols disparar");
        posY = scanner.nextInt();

        if (tableroReferencia[posY][posX] == 0 && barcosRival[posY][posX] != 0){
            tableroReferencia[posY][posX] = 2;
            barco = barcosRival[posY][posX] - 1;



            vaixells[barco].setVidesVaixell(vaixells[barco].getVidesVaixell()-1);
            System.out.println("Tocat");

        } else if (tableroReferencia[posY][posX] == 0 && barcosRival[posY][posX] == 0){
            tableroReferencia[posY][posX] = 1;
            //vaixells[barco].setPosicionsOcupades(tableroReferencia);

            System.out.println("Aigo!!");

        } else if (tableroReferencia[posY][posX] != 0){
            System.out.println("Ja has disparat a aquesta posició!! Perds el torn!!");
        }

        if (vaixells[barco].getVidesVaixell() == 0){

            for (int i = 0; i < jugador.getVaixells()[barco].getPosicionsOcupades().length; i++){
                for (int j = 0; j < jugador.getVaixells()[barco].getPosicionsOcupades()[0].length; j++){

                    if (tableroReferencia[i][j] == 2 && jugador.vaixells[barco].getPosicionsOcupades()[i][j] == 1){
                        tableroReferencia[i][j] = 3;
                    }
                    //vaixells[barco].setPosicionsOcupades(tableroReferencia);
                }
            }

            System.out.println(" i enfonsat!!");
        }
    }


    //Imprimeix el tablero del jugador

    public void printTableroJugador(int[][] barcosJugador){

        System.out.println("Tablero del Jugador");

        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 15; j++){
                if (barcosJugador[i][j] != ' '){
                    System.out.print("[" + barcosJugador[i][j] + "]");
                }


                if (j == 15 - 1){
                    System.out.println("");
                }
            }
        }
    }

    public int[][] crearTableroReferenciaJugador(Tablero tablero){

        int [][] tableroReferencia = new int[tablero.getMaximY()][tablero.getMaximX()];

        for (int i = 0; i < tableroReferencia.length; i++){
            for (int j = 0; j < tableroReferencia[0].length; j++){
                tableroReferencia[i][j] = 0;
            }
        }

        return tableroReferencia;
    }

    public void printTableraReferenciaRival(int[][] tableroReferencia){

        System.out.println("                                                            Tablero del Rival (0-Sense tirar, 1-Aigua, 2-Tocat, 3-Enfonsat)");

        for (int i = 0; i < 15; i++){
            System.out.print("                                                            ");
            for (int j = 0; j < 15; j++){
                if (tableroReferencia[i][j] != ' '){
                    System.out.print("[" + tableroReferencia[i][j] + "]");
                }


                if (j == 15 - 1){
                    System.out.println("");
                }
            }
        }
    }

}
