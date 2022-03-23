package com.company.RepasExcepcions;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class RepasExceptions {


    //Punt 3 - Reforç excepcions

    public static void ArithmeticException (){
        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b);
            System.out.println("After the calculation\n");
        } catch (ArithmeticException e){
            System.out.println("I caught the exception!!");
        }

    }

    //Punt 5 - Reforç excepcions
    public static void nullPointerException (){
        String s = null;

        try {
            int length = s.length();
        } catch (NullPointerException e){
            System.out.println("Exception: " + e);
        }
    }


    //Punt 7 - Reforç excepcions
    public static void arithmeticOverflow (){
        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MAX_VALUE - 1000;


        try {
            int x3 = Math.addExact(x1, x2);
        } catch (ArithmeticException e){
            System.out.println("I caught the overflow exception!!");
        }
    }

    //Punt 9 - Reforç excepcions
    public static void arrayIndexOutOfBound (){
        int arrayIndex = 14;
        int[] iArray = new int[5];

        try {
            iArray[arrayIndex] = 1500;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("I caught the exception!!");
        }
        //Ja ha intentat accedir a s'Array
        System.out.println("After the array index access attempt");
    }

    //Punt 11 - Reforç excepcions
    public static void printExceptionInfo (){
        int arrayIndex = 14;
        int[] iArray = new int[5];

        try {
            iArray[arrayIndex] = 1500;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()); //Missatge de error
            System.out.println(e.getCause()); //Causa del error
            e.printStackTrace(); //Imprimeix s'error
        }
        //Ja ha intentat accedir a s'Array
        System.out.println("After the array index access attempt");
    }

    //Punt 12 - Reforç excepcions
    public static void attemptPosition2 (){
        int arrayIndex = 2;
        int[] iArray = new int[5];

        if (arrayIndex == 2){
            throw new ArrayIndexOutOfBoundsException("Has intentat accedir a sa posició 2!!");
        }

        try {
            iArray[arrayIndex] = 1500;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("I caught the exception!!");
        }
        //Ja ha intentat accedir a s'Array
        System.out.println("After the array index access attempt");
    }


    //Punt 13 - Reforç excepcions
    public static void userDefinedException (){

        float a = 24;
        float b = 4;

        try {
            if (a%2 == 0){
                throw new DivideBy2Exception(a + " es divisible per 2!!");
            }
        } catch (DivideBy2Exception e){
            System.out.println(e.getMessage());
        }
    }

    //Punt 20 - Reforç excepcions
    public static void addFinallyBlock (){
        int arrayIndex = 10;
        int[] iArray = new int[5];
        Date date = new Date();

        try{
            iArray[arrayIndex] = 1500;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("I caught the exception!");
        } finally {
            //Imprimeix data i hora actual
            System.out.println(LocalDateTime.now());
        }
    }

    //Punt 24 - Reforç excepcions
    public static void rethrowExceptions (){
        try{
            int a = 10, b = 0;
            int result;
            try{
                result = a / b;
            }
            catch (ArithmeticException e) {
                System.out.print("Divide by zero situation has occurred. ");
                System.out.println("Rethrowing this exception.");
                throw(e);
            }
        } // end of outer try block
        catch (ArithmeticException e) {
            System.out.println("Outer try block...exception caught.");
        }
    }

    //Punt 25 - Reforç excepcions
    public static void excepcioGeneralOuterTry (){
        try{
            int a = 10, b = 0;
            int result;
            try{
                result = a / b;
            }
            catch (Exception e) {
                System.out.print("Divide by zero situation has occurred. ");
                System.out.println("Rethrowing this exception.");
                throw(e);
            }
        } // end of outer try block
        catch (ArithmeticException e) {
            System.out.println("Outer try block...exception caught.");
        }
    }

    //Punt 28 - Reforç excepcions
    public static void punt28 (){

        //Punt 1
        LocalDateTime dateTime = LocalDateTime.now();

        //Punt 2
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            LocalDateTime dateTimeAfter = LocalDateTime.now();
            //Diferencia entre sa primera data i sa segona en milisegons.
            System.out.println("Diferencia: " + dateTime.until(dateTimeAfter, ChronoUnit.MILLIS));
        }
    }
}
