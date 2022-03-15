package com.company.Entorns2122.Refactoitzacions.splitTemporaryVariable;

public class Invoice {
    public float totalPrice (float price, float vat, float discount) {

        float apliedVat;
        apliedVat = (vat * price) / 100;
        System.out.println("Applied vat: " + apliedVat);

        float totalWithVat;
        totalWithVat = price + apliedVat;
        System.out.println("Total with vat: " + totalWithVat);

        return totalWithVat - discount;
    }
}
