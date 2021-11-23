package com.company.D67234GC20_labs.labs.les08;

import java.util.Scanner;

public class NameList {

    public static String name8;
    public static String surname8;
    public static int age8;
    public static NameList nameList[] = new NameList[3];


    public NameList(String name8, String surname8, int age8) {
        NameList.name8 = name8;
        NameList.surname8 = surname8;
        NameList.age8 = age8;
    }

    public String getName8() {
        return name8;
    }

    public void setName8(String name8) {
        NameList.name8 = name8;
    }

    public String getSurname8() {
        return surname8;
    }

    public void setSurname8(String surname8) {
        NameList.surname8 = surname8;
    }

    public int getAge8() {
        return age8;
    }

    public void setAge8(int age8) {
        NameList.age8 = age8;
    }

    public static void populateAndDisplay(){

        nameList[0] = new NameList(" Paco ", " Algarrobo ", 18);
        nameList[1] = new NameList(" Jony ", " Walker ", 20);
        nameList[2] = new NameList(" Mathew ", " Esparec ", 19);

        for (int i = 0; i <= 2; i++){
            System.out.println(nameList[i].getName8() + nameList[i].getSurname8() + nameList[i].getAge8());
        }
    }

    public static void manipulateValues(){
        nameList[0] = new NameList(" Paco ", " Algarrobo ", 18);
        nameList[1] = new NameList(" Jony ", " Walker ", 20);
        nameList[2] = new NameList(" Mathew ", " Esparec ", 19);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 2; i++){
            if (i == 0){
                System.out.println("Escriu un nom: ");
                nameList[0].setName8(scanner.next());

                System.out.println("Escriu un llinatge: ");
                nameList[0].setSurname8(scanner.next());

                System.out.println("Escriu una edat: ");
                nameList[0].setAge8(scanner.nextInt());
            }

            if (i == 1){
                System.out.println("Escriu un nom: ");
                nameList[1].setName8(scanner.next());

                System.out.println("Escriu un llinatge: ");
                nameList[1].setSurname8(scanner.next());

                System.out.println("Escriu una edat: ");
                nameList[1].setAge8(scanner.nextInt());
            }

            if (i == 2){
                System.out.println("Escriu un nom: ");
                nameList[2].setName8(scanner.next());

                System.out.println("Escriu un llinatge: ");
                nameList[2].setSurname8(scanner.next());

                System.out.println("Escriu una edat: ");
                nameList[2].setAge8(scanner.nextInt());
            }
        }

    }

}
