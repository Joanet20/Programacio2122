package com.company.D67234GC20_labs.labs.les10;

public class NewShirts {
    public static void displayNewShirts(){
        Shirt shirt = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();
        Shirt shirt4 = new Shirt();

        shirt.price = 10.50;
        shirt2.price = 14.70;
        shirt3.price = 24;
        shirt4.price = 40.10;

        System.out.println(shirt.price + shirt2.price + shirt3.price + shirt4.price);
    }

}
