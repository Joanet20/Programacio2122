package com.company.D67234GC20_labs.labs.les09;

public class Sequence {
    public static void displaySequence(){
        int num1 = 0;
        int num2 = 1;
        int cont = 0;

        while (cont <= 30){
            int sum = num1 + num2;
            cont = sum;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
