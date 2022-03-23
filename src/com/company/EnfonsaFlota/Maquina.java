package com.company.EnfonsaFlota;

public class Maquina{

    private int vides;

    public Maquina() {
        this.vides = 5;
    }

    public int getVides(){
        return vides;
    }

    public void setVides(int vides){
        this.vides = vides;
    }


    //Crea un tablero per la maquina

    public int[][] crearTableroMaquina(Tablero tableroMaquina){
        int[][] tableMaquina = new int[tableroMaquina.getMaximX()][tableroMaquina.getMaximY()];

        for (int i = 0; i < tableroMaquina.getMaximX(); i++){
            for (int j = 0; j < tableroMaquina.getMaximY(); j++){
                tableMaquina[i][j] = 0;
            }
        }
        return tableMaquina;
    }

    //El jugador pot colocar els seus vaixells

    public int[][] colocarBarcosMaquina(Vaixell[] vaixells, Tablero tableroMaquina){

        int [][] barcosMaquina = crearTableroMaquina(tableroMaquina);

        for (int i = 0; i < vaixells.length; i++){

            int randomX = (int) (Math.random()*(tableroMaquina.getMaximX()));
            int randomY = (int) (Math.random()*(tableroMaquina.getMaximY()));
            int horizontalVertical = (int) (Math.random()*2);

            if (randomX > tableroMaquina.getMaximX() - vaixells[i].getMida() && horizontalVertical == 0){
                i--;
            } else if (randomY > tableroMaquina.getMaximY() - vaixells[i].getMida() && horizontalVertical == 1){
                i--;
            } else if (barcosMaquina[randomY][randomX] != 0){
                i--;
            } else if (barcosMaquina[randomY][randomX] == 0){
                for (int j = 0; j < vaixells[i].getMida(); j++){
                    if (horizontalVertical == 0){
                        barcosMaquina[randomY][randomX + j] = i+1;
                    } else if (horizontalVertical == 1){
                        barcosMaquina[randomY + j][randomX] = i+1;
                    }
                }
            }
        }
        return barcosMaquina;
    }

    public void printTableroMaquina(int[][] barcosMaquina){

        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 15; j++){
                if (barcosMaquina[i][j] != ' '){
                    System.out.print("[" + barcosMaquina[i][j] + "]");
                }


                if (j == 15 - 1){
                    System.out.println("");
                }
            }
        }
    }


    public int[][] crearTableroReferenciaMaquina(Tablero tablero){

        int [][] tableroReferencia = new int[tablero.getMaximY()][tablero.getMaximX()];

        for (int i = 0; i < tableroReferencia.length; i++){
            for (int j = 0; j < tableroReferencia[0].length; j++){
                tableroReferencia[i][j] = 0;
            }
        }

        return tableroReferencia;
    }

}
