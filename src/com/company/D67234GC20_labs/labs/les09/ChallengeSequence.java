package com.company.D67234GC20_labs.labs.les09;

public class ChallengeSequence {
    public static void displaySequence(){
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i <= 10; i++){
            int sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
