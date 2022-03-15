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

    public float calculateTotal(float subtotal, float vat) {
        if (isValidAge() || isValidDate() || subtotal < 0.5f)
            return 0;

        return subtotal * vat;
    }

    public boolean isValidAge(){
        if (customer.getAge() < 18)
            return true;

        return false;
    }

    public boolean isValidDate(){
        if (new GregorianCalendar().get(Calendar.YEAR) > year)
            return true;

        return false;
    }

}
