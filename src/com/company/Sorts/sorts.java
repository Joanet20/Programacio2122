package com.company.Sorts;

public class sorts {
    /*public static void bubblesort(){
        int [] array = {5, 1, 12, -5, 16};
        int N = array.length;
        int temp = 0;

        for (int i = 0; i < N; i++){
            for (int j = 1; j < (N-i); j++){
                //En cas de el primer numero sigi major que el segon
                if (array[j-1] > array[j]){
                    //temp agafa el valor del primer numero
                    temp = array[j-1];
                    //el primer numero obte el valor del segon
                    array[j-1] = array[j];
                    //el sogon numero agafa el valor de temp que es el valor del primer numero
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }*/

    /*public static void selectionsort(){
        int [] array = {5, 1, 12, -5, 16, 2, 12, 14};
        int N = array.length;

        for (int i = 0; i < N-1; i++){
            int indexGuardat = 0;
            for (int j = i + 1; j < N; j++){
                if (array[j] < array[i]){
                    indexGuardat = j;
                    int numPetit = array[indexGuardat];
                    array[indexGuardat] = array[i];
                    array [i] = numPetit;
                }
            }

        }

        for (int k = 0; k < N; k++){
            System.out.println(array[k]);
        }
    }*/

    /*public static void insertionSort(){
        int [] array = {5, 2, 4, 6, 1, 3};
        int N = array.length;

        for (int i = 1; i < N; i++){
            int num = array[i];
            int numAnt = i - 1;

            while (numAnt >= 0 && num < array[numAnt]){
                array[numAnt + 1] = array[numAnt];
                numAnt = numAnt - 1;
            }

            array[numAnt + 1] = num;
        }

        for (int i = 0; i < N; i++){
            System.out.println(array[i]);
        }
    }*/

    public static void bubbleSort(){
        int [] array = {5, 1, 12, -5, 16};
        int N = array.length;
        int temp = 0;

        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++){
                if (array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++){
            System.out.println(array[i]);
        }
    }
}
