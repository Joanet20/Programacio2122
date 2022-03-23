package com.company.EnfonsaFlota;

public class Main {

    public static void main(String[] args) throws Exception {

        Vaixell p = new Vaixell(1,false, 5, "Portavions");
        Vaixell b = new Vaixell(2,false, 4, "Buque");
        Vaixell c = new Vaixell(3,false, 3, "Creuer");
        Vaixell s = new Vaixell(4,false, 2, "Submarí");
        Vaixell l = new Vaixell(5,false, 2, "Lanxa");

        Vaixell[] vaixellsJ1 = {p, b, c, s, l};
        Vaixell[] vaixellsJ2 = {p, b, c, s, l};

        Tablero tableroJugador1 = new Tablero();
        Tablero tableroJugador2 = new Tablero();

        Jugador jugador1 = new Jugador(vaixellsJ1);
        Jugador jugador2 = new Jugador(vaixellsJ2);


        EnfonsaLaFlota.inicia(jugador1, jugador2, tableroJugador1, tableroJugador2);
    }
}
