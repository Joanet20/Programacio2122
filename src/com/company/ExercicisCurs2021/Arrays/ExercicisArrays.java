package com.company.ExercicisCurs2021.Arrays;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicisArrays {
    public static void printArray(){
        int [] nums = {1, 5, 7, 4};

        /*System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);*/

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void exercici2(){
        int N = 3;
        int [] nums = new int[N];

        for (int i = 0; i < N; i++){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introdueix un numero: ");
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void exercici3(){
        int N = 3;
        int [] nums = new int[N];

        for (int i = 0; i < N; i++){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introdueix un numero: ");
            nums[N-1-i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void exercici4(){
        int N = 3;
        int total = 0;
        int [] nums = new int[N];

        for (int i = 0; i < N; i++){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introdueix un numero: ");
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++){

            total = total + nums[i];
        }

        System.out.println(total);
    }

    public static void exercici5(){

        char [] caracters = {'j', 'v', 'a'};
        String caractersConcat = "";

        for (int i = 0; i < caracters.length; i++){
            caractersConcat = caractersConcat + caracters[i];
        }
        System.out.println(caractersConcat);
    }

    public static void exercici6(){
        int [] enters = {24, 21, 12};
        String numsConcat = "";
        String num = "";

        for (int i = 0; i < enters.length; i++){
            numsConcat = numsConcat + String.valueOf(enters[i]);

        }

        System.out.println(numsConcat);

    }

    public static void exercici7(){
        int [] enters = {24, 21, 12};
        int total = 0;


        for (int i = 0; i < enters.length; i++){
            total = total + enters[i];
        }
        int mitjana = total / enters.length;
        System.out.println(mitjana);
    }

    public static void exercici8(){
        int [] a = {3, 4 ,1};
        int [] b = {2, 7, 5};
        int [] tot = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            tot[i * 2] = a[i];
            tot[i * 2 + 1] = b[i];
        }

        for (int i = 0; i < tot.length; i++){
            System.out.println(tot[i]);
        }
    }

    public static void exercici9(){
        int [] array = {2, 4, 6, 8};
        boolean ordre;

        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length - 1; j++){
                if (array[i] < array[j]){
                    ordre = true;
                } else if (array[i] > array[j]){
                    ordre = false;
                }
            }
        }

        if (ordre = true){
            System.out.println("Els números van en ordre ascendent");
        } else {
            System.out.println("Els números van en ordre descendent");
        }
    }


    public static void exercici10(){
        Scanner scanner = new Scanner(System.in);
        int n = 1;

        ArrayList<Integer> positius = new ArrayList<Integer>();
        ArrayList<Integer> negatius = new ArrayList<Integer>();

        for (int i = 0; n != 0; i++){

            System.out.println("Escriu un número");
            n = scanner.nextInt();

            if (n > 0){
                positius.add(n);
            } else if (n < 0){
                negatius.add(n);
            }
        }

        System.out.println("Els números positius són: ");

        for (int i = 0; i < positius.size(); i++){
            System.out.print(positius.get(i) + ", ");
        }
        System.out.println("");

        System.out.println("Els números negatius són: ");

        for (int i = 0; i < negatius.size(); i++){
            System.out.print(negatius.get(i) + ", ");
        }
    }

    public static void exercici11(){
        int n = 4;
        char [] caracters = new char[n];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++){
            System.out.println("Escriu un caràcter");
            caracters[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < n; i++){
            System.out.print(caracters[i] + ", ");
        }
    }

    /*public static void exercici12(){
        int n = 3;
        char [] array = new char[n];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++){
            System.out.println("Escriu una lletra o caràcter");

        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }*/
}
