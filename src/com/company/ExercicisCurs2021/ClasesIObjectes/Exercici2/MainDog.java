package com.company.ExercicisCurs2021.ClasesIObjectes.Exercici2;

import java.util.Scanner;

public class MainDog {
    public static void main(String[] args) {


        Scanner ca = new Scanner(System.in);




            System.out.println("Nom: ");
            Dog.setNom(ca.next());

            System.out.println("Edat: ");
            Dog.setEdat(ca.nextInt());

            System.out.println("Raça: ");
            Dog.setRaca(ca.next());

            System.out.println("Num vacunes: ");
            Dog.setNumVacunes(ca.nextInt());

            System.out.println("Es pedegri SI/NO: ");
            String ped;
            ped = ca.next();

            if (ped == "SI"){
                Dog.setPedegri(true);
            } else if (ped == "NO"){
                Dog.setPedegri(false);
            }

        Dog.novaVacuna();

        Dog.display();
    }
}
