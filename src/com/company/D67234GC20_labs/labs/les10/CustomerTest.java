package com.company.D67234GC20_labs.labs.les10;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class CustomerTest {
   
  public static void main (String args[]) {

    Customer customer1 = new Customer();
    Customer customer2 = new Customer();

    customer1.setCustomerInfo("Joan");
    customer2.setCustomerInfo("Joan", "Vallbona");

    customer1.displayInfo();
    customer2.displayInfo();
  } 
}
