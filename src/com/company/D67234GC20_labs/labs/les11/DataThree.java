package com.company.D67234GC20_labs.labs.les11;

public class DataThree {
    private static int day;
    private static int month;
    private static int year;

    public DataThree(int day, int month, int year) {
        DataThree.day = day;
        DataThree.month = month;
        DataThree.year = year;
    }

    public static int getDay() {
        return day;
    }

    public static void setDay(int day) {
        DataThree.day = day;
    }

    public static int getMonth() {
        return month;
    }

    public static void setMonth(int month) {
        DataThree.month = month;
    }

    public static int getYear() {
        return year;
    }

    public static void setYear(int year) {
        DataThree.year = year;
    }

    public static void setDate(int dia, int mes, int any){
        day = dia;
        month = mes;
        year = any;

        if (any > 2021){
            System.out.println("Aquest any no es valid.");
        }else if (any <= 2021){
            if (mes > 12){
                System.out.println("El mes no es valid.");
            } else if (mes <= 12 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if (dia > 31){
                    System.out.println("El dia no es valid.");
                } else if (dia <= 31){
                    System.out.println("La data es correcta, i es: " + dia + "/" + mes + "/" + any);
                }
            } else if (mes <= 12 && mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if (dia > 30){
                    System.out.println("El dia no es valid.");
                } else if (dia <= 30){
                    System.out.println("La data es correcta, i es: " + dia + "/" + mes + "/" + any);
                }
            } else if (mes <= 12 && mes == 2){
                if (dia > 28){
                    System.out.println("El dia no es valid.");
                } else if (dia <= 28){
                    System.out.println("La data es correcta, i es: " + dia + "/" + mes + "/" + any);
                }
            }
        }
    }
}
