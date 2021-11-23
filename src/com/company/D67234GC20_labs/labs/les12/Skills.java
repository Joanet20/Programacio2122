package com.company.D67234GC20_labs.labs.les12;

import java.util.ArrayList;

public class Skills extends Employee{
    ArrayList skillList = new ArrayList();

    public void setSkill(String skills){
        skillList.add(skills);
    }

    public void print() {
        super.print();

        for (int i = 0; i < skillList.size(); i++){
            System.out.println("Destreses: " + skillList.get(i));
        }
    }
}
