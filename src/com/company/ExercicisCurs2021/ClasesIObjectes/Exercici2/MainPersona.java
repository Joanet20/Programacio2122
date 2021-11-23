package com.company.ExercicisCurs2021.ClasesIObjectes.Exercici2;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        /*Persona.setNom("Joan");
        Persona.setEdat(20);
        Persona.setDni("49605947f");
        Persona.setSexe("Mascle");
        Persona.setTelefon("696609301");*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nom: ");
        Persona.setNom(scanner.next());

        System.out.println("Edat: ");
        Persona.setEdat(scanner.nextInt());

        System.out.println("DNI: ");
        Persona.setDni(scanner.next());

        System.out.println("Sexe: ");
        Persona.setSexe(scanner.next());

        System.out.println("Telefon: ");
        Persona.setTelefon(scanner.next());

        Persona.display();
    }
}
