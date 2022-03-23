package com.company.CorreccioExamenSegonaAv;

public class EndivinaNumero {

    public void cercaDicotomica (int[] numeros, int numeroCercat){

        boolean trobat = false;
        int meitat = numeros[numeros.length/2];
        int indexMeitat = numeros.length/2;
        int petit = 0;
        int direccio = 0;


        while (trobat == false){

            if (numeroCercat < meitat){
                direccio = 0;
            } else if (numeroCercat > meitat){
                direccio = 1;
            }


            if (direccio == 0){
                for (int i = 0; i < numeros.length/2; i++){

                    for (int j = petit; j < numeros[i+1]; j++){

                        if (j == numeroCercat){
                            trobat = true;
                        }

                        petit = numeros[i+1];
                    }


                }
            }

            if (direccio == 1){

                int gran = meitat;

                for (int i = indexMeitat; i < numeros.length; i++){

                    for (int j = gran; j < numeros[i+1]; j++){

                        if (j == numeroCercat){
                            trobat = true;
                        }

                        gran = numeros[i+1];
                    }
                }
            }

        }
    }
}
