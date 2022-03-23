package com.company.Entorns2122.Refactoitzacions.consolidateDuplicateConditional;

public class Invoice {

    private Customer customer;
    private float price;
    private int qty;

    public Invoice (Customer customer, float price, int qty) {
        this.customer = customer;
        this.price = price;
        this.qty = qty;
    }

    public float calculateTotal (float vat, float discount) {
        float subtotal = 0;
        if (customer.isVip()) {
            subtotal = (price * qty) - discount * (1 + (vat/100));
        } else {
            subtotal = (price * qty) * (1 + (vat/100));
        }
        return subtotal;
    }

}
