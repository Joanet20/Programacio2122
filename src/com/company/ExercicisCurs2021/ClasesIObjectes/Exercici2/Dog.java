package com.company.ExercicisCurs2021.ClasesIObjectes.Exercici2;

import java.util.Scanner;

public class Dog {
    static String nom;
    static int edat;
    static String raca;
    static int numVacunes;
    static boolean pedegri;

    public Dog(String nom, int edat, String raca, int numVacunes, boolean pedegri) {
        this.nom = nom;
        this.edat = edat;
        this.raca = raca;
        this.numVacunes = numVacunes;
        this.pedegri = pedegri;
    }

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        Dog.nom = nom;
    }

    public static int getEdat() {
        return edat;
    }

    public static void setEdat(int edat) {
        Dog.edat = edat;
    }

    public static String getRaca() {
        return raca;
    }

    public static void setRaca(String raca) {
        Dog.raca = raca;
    }

    public static int getNumVacunes() {
        return numVacunes;
    }

    public static void setNumVacunes(int numVacunes) {
        Dog.numVacunes = numVacunes;
    }

    public static boolean isPedegri() {
        return pedegri;
    }

    public static void setPedegri(boolean pedegri) {
        Dog.pedegri = pedegri;
    }

    public static void display(){
        System.out.println(getNom());
        System.out.println(getEdat());
        System.out.println(getRaca());
        System.out.println(getNumVacunes());
        System.out.println(isPedegri());
    }

    public static void novaVacuna(){
        int numVacunes;

        System.out.println("Cuantes vacunes li vols posar: ");
        Scanner vacs = new Scanner(System.in);
        numVacunes = vacs.nextInt();

        setNumVacunes(getNumVacunes()+numVacunes);
    }
}
