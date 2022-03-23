package com.company.CorreccioExamenSegonaAv;

public class MultiplicacioMartiusBidimensionals {

    public static void multiplica (){
        int [][] matriuA = new int[3][2];
        int [][] matriuB = new int[2][3];


        if (matriuA.length != matriuB[0].length || matriuA[0].length != matriuB.length){
            throw new IllegalArgumentException("Les matrius no son multiplicables");
        }


        int [] multiplicacions = new int[matriuA[0].length + matriuB.length];

        for (int i = 0; i < multiplicacions.length; i++){

            for (int j = 0; j < matriuA.length; j++){

                for (int k = 0; k < matriuA[0].length; k++){

                    multiplicacions[i] = matriuA[j][k] * matriuB[k][j];
                }
            }
        }

        for (int i = 0; i < multiplicacions.length; i++){
            System.out.println(multiplicacions[i]);
        }
    }
}
