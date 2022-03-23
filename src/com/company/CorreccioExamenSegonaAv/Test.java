package com.company.CorreccioExamenSegonaAv;

public class Test {

    public static void main (String[] args){

        Punt punt1 = new Punt(2,3);
        Punt punt2 = new Punt(3,4);
        Punt punt3 = new Punt(4,5);
        Punt punt4 = new Punt(5,6);

        Punt[] punts = {punt1, punt2, punt3, punt4};

        Poligon poligon = new Poligon(punts);

        //poligon.calculaPerimetre(poligon);

        MultiplicacioMartiusBidimensionals.multiplica();
    }
}
