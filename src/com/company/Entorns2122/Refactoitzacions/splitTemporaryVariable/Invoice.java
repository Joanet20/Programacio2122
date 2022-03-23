package com.company.Entorns2122.Refactoitzacions.splitTemporaryVariable;

public class Invoice {
    public float totalPrice (float price, float vat, float discount) {

        float appliedVat = (vat * price) / 100;
        System.out.println("Applied vat: " + appliedVat);


        float totalWithVat = price + appliedVat;
        System.out.println("Total with vat: " + totalWithVat);

        return totalWithVat - discount;
    }
}
