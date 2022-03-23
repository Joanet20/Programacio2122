package com.company.CorreccioExamenSegonaAv;

public class Punt {

    private int puntX;
    private int puntY;

    public Punt (int puntX, int puntY){
        this.puntX = puntX;
        this.puntY = puntY;
    }

    //Exercici 3

    public int calcularDistanciaAltrePunt (Punt puntA, Punt puntB){

        return (int) Math.sqrt(Math.pow((puntA.getPuntX() - puntB.getPuntX()), 2) + Math.pow((puntA.getPuntY() - puntB.getPuntY()), 2));

    }

    public Punt traslladarCoordenades (int numPosicionsCorregudes, Punt puntA, Punt puntB){

        Punt nouPunt = new Punt(puntA.getPuntX() - numPosicionsCorregudes, puntA.getPuntY() - numPosicionsCorregudes);
        //Punt nouPuntB = new Punt(puntB.getPuntX() + numPosicionsCorregudes, puntB.getPuntY() + numPosicionsCorregudes);

        return nouPunt;
    }




    public int getPuntX (){
        return puntX;
    }

    public int getPuntY (){
        return puntY;
    }

    public void setPuntX (int puntX){
        this.puntX = puntX;
    }

    public void setPuntY (int puntY){
        this.puntY = puntY;
    }
}
