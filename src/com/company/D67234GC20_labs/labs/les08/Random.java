package com.company.D67234GC20_labs.labs.les08;

public class Random {
    public static void compareNumbers(){
        int randomNumber = (int) (Math.random()*10);
        int number = 9;

        if (randomNumber > number){
            System.out.println(randomNumber + " El numero aleatori es més gran que l'especificat.");
        } else if (randomNumber < number){
            System.out.println(randomNumber + "El numero aleatori es més petit que l'especificat.");
        }else if (randomNumber == number){
            System.out.println(randomNumber + " Els dos numeros son iguals");
        }
    }
}
