package com.company.Entorns2122.Refactoitzacions.parameterObject;

import java.util.Enumeration;
import java.util.Hashtable;

public class Order {

    private Hashtable<String, Float> items = new Hashtable<String, Float>();

    public void addItem(OrderItem orderItem) {
        items.put(orderItem.getProductID() + ": " + orderItem.getDescription(), (orderItem.getQuantity() * orderItem.getPrice()) - (orderItem.getQuantity() * orderItem.getPrice() * orderItem.getDiscount()));
    }

    public float calculateTotal() {
        float total = 0;
        Enumeration<String> keys = items.keys();

        while (keys.hasMoreElements()) {
            total = total + items.get(keys.nextElement());
        }
        return total;
    }
}
