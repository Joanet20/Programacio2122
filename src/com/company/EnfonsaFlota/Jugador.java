package com.company;

import java.util.Scanner;

public class Jugador{

    private int vides;

    public Jugador() {
        this.vides = 5;
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
        int posX;
        int posY;
        int horizontalVertical;

        try {
            for (int i = 0; i < vaixells.length; i++){

                Scanner scanner = new Scanner(System.in);

                System.out.println("Posició X per " + vaixells[i].getNom());
                posX = scanner.nextInt();

                System.out.println("Posició Y per " + vaixells[i].getNom());
                posY = scanner.nextInt();

                System.out.println("Vols que vagi en horizontal o vertical? 0-Horizontal 1-Vertical");
                horizontalVertical = scanner.nextInt();

                if (posX > tableroJugador.getMaximX() - vaixells[i].getMida() && horizontalVertical == 0){
                    System.out.println("No es pot colocar");
                    i--;

                } else if (posY > tableroJugador.getMaximY() - vaixells[i].getMida() && horizontalVertical == 1){
                    System.out.println("No es pot colocar");
                    i--;

                } else if (barcosJugador[posY][posX] != 0){
                    System.out.println("Ja esta ocupada");
                    i--;

                } else if (horizontalVertical < 0 || horizontalVertical > 1){
                    System.out.println("El número asignat per el tipus d'alineament no és correcte.");
                    i--;

                } else if (barcosJugador[posY][posX] == 0){
                    for (int j = 0; j < vaixells[i].getMida(); j++){
                        if (horizontalVertical == 0){
                            barcosJugador[posY][posX + j] = i+1;
                        } else if (horizontalVertical == 1){
                            barcosJugador[posY + j][posX] = i+1;
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Alguna coordenada introduida no existeix.");
            System.exit(0);
        }


        return barcosJugador;
    }

    //Dispara

    public void dispararRival(int[][] barcosMaquina, boolean[][] ocupaMaquina, Tablero tableroMaquina, Vaixell[] vaixells){

        int posX;
        int posY;
        int barco = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Posició X a la que vols disparar");
        posX = scanner.nextInt();

        System.out.println("Posició Y a la que vols disparar");
        posY = scanner.nextInt();

        if (ocupaMaquina[posY][posX]){
            barco = barcosMaquina[posY][posX];

            vaixells[barco].setVidesVaixell(vaixells[barco].getVidesVaixell()-1);
            System.out.println("Tocat");
        } else {
            barco = barcosMaquina[posY][posX];

            System.out.println("Aigo!!");
        }

        if (vaixells[barco].getVidesVaixell() == 0){
            System.out.print(" i enfonsat!!");
        }
    }


    //Imprimeix el tablero del jugador

    public void printTableroJugador(int[][] barcosJugador){

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
}
