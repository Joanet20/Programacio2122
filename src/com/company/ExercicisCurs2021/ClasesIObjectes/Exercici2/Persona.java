package com.company.ExercicisCurs2021.ClasesIObjectes.Exercici2;

public class Persona {

    static String nom;
    static int edat;
    static String dni;
    static String sexe;
    static String telefon;

    public Persona(String nom, int edat, String dni, String sexe, String telefon) {
        this.nom = nom;
        this.edat = edat;
        this.dni = dni;
        this.sexe = sexe;
        this.telefon = telefon;
    }

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        Persona.nom = nom;
    }

    public static int getEdat() {
        return edat;
    }

    public static void setEdat(int edat) {
        Persona.edat = edat;
    }

    public static String getDni() {
        return dni;
    }

    public static void setDni(String dni) {
        Persona.dni = dni;
    }

    public static String getSexe() {
        return sexe;
    }

    public static void setSexe(String sexe) {
        Persona.sexe = sexe;
    }

    public static String getTelefon() {
        return telefon;
    }

    public static void setTelefon(String telefon) {
        Persona.telefon = telefon;
    }

    public static void display(){
        System.out.println(getNom());
        System.out.println(getEdat());
        System.out.println(getDni());
        System.out.println(getSexe());
        System.out.println(getTelefon());
    }


}
