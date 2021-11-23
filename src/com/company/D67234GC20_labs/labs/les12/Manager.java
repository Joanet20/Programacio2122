package com.company.D67234GC20_labs.labs.les12;

import java.util.ArrayList;

public class Manager extends Skills{

    ArrayList employees = new ArrayList();

    public void setEmployee (Employee employee){
        employees.add(employee.getName());
    }

    public void print() {
        super.print();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("Empleats: ");
            System.out.println(employees.get(i));
        }
    }

}
