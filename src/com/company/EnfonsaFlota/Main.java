package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        Vaixell p = new Vaixell(false, 5, "Portavions");
        Vaixell b = new Vaixell(false, 4, "Buque");
        Vaixell c = new Vaixell(false, 3, "Creuer");
        Vaixell s = new Vaixell(false, 2, "Submarí");
        Vaixell l = new Vaixell(false, 2, "Lanxa");

        Vaixell[] vaixells = {p, b, c, s, l};

        Tablero tableroJugador = new Tablero(15, 15);
        Tablero tableroMaquina = new Tablero(15, 15);

        Jugador jugador = new Jugador();
        Maquina maquina = new Maquina();



        //jugador.printTableroJugador(jugador.colocarBarcosJugador(vaixells, tableroJugador));
        maquina.printTableroMaquina(maquina.colocarBarcosMaquina(vaixells, tableroMaquina));
    }
}
