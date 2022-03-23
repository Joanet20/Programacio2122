package com.company.Entorns2122.Refactoitzacions.consolidateConditional;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Invoice {

    private Customer customer;
    private int year;

    public Invoice(Customer customer, int year) {
        this.customer = customer;
        this.year = year;
    }

    public boolean isValid (float subtotal){
        return customer.getAge() < 18 || new GregorianCalendar().get(Calendar.YEAR) > year || subtotal < 0.5f;
    }

    public float calculateTotal(float subtotal, float vat) {
        if (isValid(subtotal))
            return 0;

        return subtotal * vat;
    }

}
