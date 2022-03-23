package com.company.EnfonsaFlota;

public class EnfonsaLaFlota {

    private boolean jugar;

    public EnfonsaLaFlota(boolean jugar){
        this.jugar = jugar;
    }


    public static void inicia (Jugador jugador1, Jugador jugador2, Tablero tabJ1, Tablero tabJ2) throws Exception{

        int torn = (int) (Math.random()*2);

        System.out.println("Les posicions van de 0 a 14");

        int [][] barcosJ1 = jugador1.colocarBarcosJugador(jugador1.getVaixells(), tabJ1);
        int [][] barcosJ2 = jugador2.colocarBarcosJugador(jugador2.getVaixells(), tabJ2);

        int [][] tabReferenciaJ1 = jugador1.crearTableroReferenciaJugador(tabJ2);
        int [][] tabReferenciaJ2 = jugador2.crearTableroReferenciaJugador(tabJ1);



        while (jugador1.getVides() > 0 && jugador2.getVides() > 0){

            if (torn == 0){
                jugador1.printTableroJugador(barcosJ1);
                jugador1.printTableraReferenciaRival(tabReferenciaJ1);
                jugador1.dispararRival(barcosJ2, tabReferenciaJ1, jugador2.getVaixells(), jugador2);
                torn = 1;
            }

            if (torn == 1){
                jugador2.printTableroJugador(barcosJ2);
                jugador2.printTableraReferenciaRival(tabReferenciaJ2);
                jugador2.dispararRival(barcosJ1, tabReferenciaJ2, jugador1.getVaixells(), jugador1);
                torn = 0;
            }
        }
    }

    public boolean isJugar(){
        return jugar;
    }

    public void setJugar(boolean jugar){
        this.jugar = jugar;
    }
}
