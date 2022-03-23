package com.company.ExercicisCurs2021.Excepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicisExcepcions {

    public static void numeroDividitPerZero(){
        int a = 5;
        int b = 0;

        int c;

        try {
            c = a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void entradaNumeroPerTeclat(){
        int numero;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escriu un numero");
            numero = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("No has escrit un número");
        }
    }
}
