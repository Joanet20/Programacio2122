package com.company.Entorns2122.Refactoitzacions.descomposeConditional;

public class Invoice {

    private Customer customer;

    public Invoice (Customer customer) {
        this.customer = customer;
    }

    public float calculatePayment (float price, float discount, float vat) {
        float payment = 0;

        if (isValidAge()) {
            payment = price * discount * vat;
        } else {
            payment = price * vat;
        }
        return payment;
    }

    public boolean isValidAge(){

        if (customer.getAge() < 18 || customer.getAge() > 65){
            return true;
        }

        return false;
    }
}
