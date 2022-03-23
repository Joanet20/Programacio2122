package com.company.ExercicisCurs2122.Excepcions;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Excepcions {

    public static void Arithmetic() {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
            System.out.println("After the calculation\n");
        } catch (ArithmeticException e) {
            System.out.println("I caught the exception");
        }
    }

    public static void NullPointer() {
        try {
            String s = null;
            int length = s.length();
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void Overflow() {


        try {
            int x1 = Integer.MAX_VALUE;
            int x2 = Integer.MAX_VALUE - 1000;
            int x3 = Math.addExact(x1, x2);
        } catch (ArithmeticException e) {
            System.out.println("I caught the\n" +
                    "overflow exception!");
        }
    }

    public static void ArrayIndexOutOfBound() {
        int arrayIndex = 2;
        int[] iArray = new int[5];


        if (arrayIndex == 2) {
            throw new ArrayIndexOutOfBoundsException("Has intentat accedir a sa posició 2");
        }

        try {
            iArray[arrayIndex] = 1500;
            System.out.println("After the array index access attempt");
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("I caught the " + e);
            System.out.println(e.getMessage());
            //System.out.println(e.getCause());
            //e.printStackTrace();
        }
    }

    public static void testMyException() {
        float a = 24;
        float b = 12;

        float c;

        try {
            if (b % 2 == 0) {
                throw new DivideBy2Exception("Es divisible per 2");
            }
            c = a / b;
            System.out.println(c);

        } catch (DivideBy2Exception e) {
            System.out.println("");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void finallyBlock() {
        int arrayIndex = 10;
        int[] iArray = new int[5];

        try {
            iArray[arrayIndex] = 1500;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I caught the exception!");
        } finally {
            System.out.println(LocalDateTime.now());
        }
    }

    //Exercici 25

    public static void parentException() {
        try {
            int a = 10, b = 0;
            int result;
            try {
                result = a / b;
            } catch (ArithmeticException e) {
                System.out.print("Divide by zero situation has occurred. ");
                System.out.println("Rethrowing this exception.");
                throw (e);
            }
        }catch (Exception e) {
            System.out.println("Outer try block...exception caught.");
        }
    }

    //Exercici 26

    public static void rethrowException() {
        try {
            int a = 10, b = 0;
            int result;
            try {
                result = a / b;
            } catch (ArithmeticException e) {
                System.out.print("Divide by zero situation has occurred. ");
                System.out.println("Rethrowing this exception.");
                throw (e);
            }
        }catch (Exception e) {
            System.out.println("Outer try block...exception caught.");
            throw (e);
        }
    }

    //Exercici 28 (Per entendre)

    public static void differenceDate(){

        LocalDateTime dateTimeA = LocalDateTime.now();

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){

        }
        LocalDateTime dateTimeB = LocalDateTime.now();
        System.out.println(dateTimeA.until(dateTimeB, ChronoUnit.MILLIS));

    }
}
