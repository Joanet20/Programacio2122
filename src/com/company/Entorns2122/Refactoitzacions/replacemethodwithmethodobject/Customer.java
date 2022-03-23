package com.company.Entorns2122.Refactoitzacions.replacemethodwithmethodobject;

public class Customer {

    private boolean isVip;
    private boolean isSpecial;
    private int type;

    public static final int NORMAL = 0;
    public static final int SPECIAL = 1;
    public static final int VIP = 2;

    public Customer(boolean isVip, boolean isSpecial, int type) {
        this.isVip = isVip;
        this.isSpecial = isSpecial;
        this.type = type;
    }

    public double calcAppliedVat (){

        switch (getType()) {
            case Customer.NORMAL:
                return 1.21f;
            case Customer.SPECIAL:
                return 1.15f;
            case Customer.VIP:
                return 1.04f;
            default:
                return 1.21f;
        }
    }

    public double calcFinalPrice (double price){

        if (price > 50 && isVip()) {
            return price * 0.5;
        } else if (price > 10 && isSpecial()) {
            return price * 0.1;
        } else {
            return price;
        }
    }

    public double applyDiscount(double price, double discount) {

        return calcFinalPrice(price) * calcAppliedVat() - discount;
    }

    public int getType() {
        return type;
    }

    public boolean isVip() {
        return isVip;
    }

    public boolean isSpecial() {
        return isSpecial;
    }
}
