package com.company.CorreccioExamenSegonaAv;

public class Poligon {

    private Punt[] punts;

    public Poligon (Punt[] punts){
        this.punts = punts;
    }

    public int calculaPerimetre (Poligon poligon){

        int perimetre = 0;

        for (int i = 0; i < punts.length; i++){

            for (int j = i+1; j < punts.length; j++){

                perimetre += poligon.getPunts()[i].calcularDistanciaAltrePunt(poligon.getPunts()[i], poligon.getPunts()[j]);
            }
        }

        //System.out.println(perimetre);
        return perimetre;
    }

    public Punt[] getPunts (){
        return punts;
    }
}
