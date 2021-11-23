package com.company;

import java.util.Scanner;

public class ExercicisCondicionals {
    public static void positiuNegatiu(){
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix un numero: ");
        num = scanner.nextInt();

        if (num > 0){
            System.out.println("Es positiu.");
        } else if (num < 0){
            System.out.println("Es negatiu.");
        }
    }
}
