package com.company.Entorns2122.Refactoitzacions.parameterObject;

public class OrderItem {

    Integer productID;
    String description;
    Integer quantity;
    Float price;
    Float discount;

    public OrderItem(Integer productID, String description, Integer quantity, Float price, Float discount){
        this.productID = productID;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public Integer getProductID(){
        return productID;
    }

    public void setProductID(Integer productID){
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }
}
