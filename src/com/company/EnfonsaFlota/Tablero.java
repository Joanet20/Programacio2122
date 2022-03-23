package com.company.EnfonsaFlota;

import java.util.Scanner;

public class Tablero {

    private int maximX;
    private int maximY;

    public Tablero(){
        this.maximX = 15;
        this.maximY = 15;
    }

    public int getMaximX(){
        return maximX;
    }

    public int getMaximY(){
        return maximY;
    }

    public static void Jugar(){

    }

    /*private int maximX;
    private int maximY;


    public int getMaximX(){
        return maximX;
    }
    public int getMaximY(){return maximY;}

    Vaixell p = new Vaixell(false, 5, "Portavions");
    Vaixell b = new Vaixell(false, 4, "Buque");
    Vaixell c = new Vaixell(false, 3, "Creuer");
    Vaixell s = new Vaixell(false, 2, "Submarí");
    Vaixell l = new Vaixell(false, 2, "Lanxa");

    Vaixell[] vaixells = {p, b, c, s, l};

    public Vaixell[] getVaixells(){
        return vaixells;
    }

    Tablero[][] tableroJugador = new Tablero[15][15];

    public Tablero[][] getTablero(){
        return tableroJugador;
    }

    private int[] posX = new int[vaixells.length];
    private int[] posY = new int[vaixells.length];

    public char[][] colocarBarcos() throws Exception{

        int posicioX;
        int posicioY;
        int numAlineacio;

        for (int i = 0; i < vaixells.length; i++){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Eligeix una coordenada X per el " + vaixells[i].getNom());
            posicioX = scanner.nextInt();
            posX[i] = posicioX;

            System.out.println("Elegeix una coordenada Y per el " + vaixells[i].getNom());
            posicioY = scanner.nextInt();
            posY[i] = posicioY;

            System.out.println("Alineació horizontal o vertical (0-Horizontal) (1-Vertical)");
            numAlineacio = scanner.nextInt();

            if (numAlineacio == 0){
                for (int j = 0; j < vaixells[i].getMida(); i++)
                crearTableroJugador(tableroJugador.getMaximX(), tableroJugador.getMaximY())[posicioX + i][posicioY] = vaixells[i].getNom().charAt(0);
            } else if (numAlineacio == 1){
                for (int j = 0; j < vaixells[i].getMida(); i++)
                    crearTableroJugador(tableroJugador.getMaximX(), tableroJugador.getMaximY())[posicioX][posicioY + i] = vaixells[i].getNom().charAt(0);
            } else {
                crearTableroJugador(tableroJugador.getMaximX(), tableroJugador.getMaximY())[posicioX + i][posicioY] = vaixells[i].getNom().charAt(0);
            }


            if (posicioX > (maximX - vaixells[i].getMida())){
                throw new ArrayIndexOutOfBoundsException("No pots");
            }

            if (posicioY > (maximY - vaixells[i].getMida())){
                throw new ArrayIndexOutOfBoundsException("No pots");
            }
        }

        return crearTableroJugador(tableroJugador.getMaximX(), tableroJugador.getMaximY());
    }

    public static char[][] crearTableroJugador(int maximX, int maximY){

        char[][] tablero = new char[maximX][maximY];

        return tablero;
    }


    public static void printTableroJugador(char[][] tablero, int maximX, int maximY){

        for (int i = 0; i < maximX; i++){
            for (int j = 0; j < maximY; j++){
                if (tablero[i][j] != ' '){
                    System.out.print("[" + tablero[i][j] + "]");
                }

                System.out.print("[-]");

                if (j == maximY - 1){
                    System.out.println("");
                }
            }
        }
    }*/
}
