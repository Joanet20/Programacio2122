package com.company.D67234GC20_labs.labs.les12;


public class Employee implements Printable{
    private int idCount = 0;
    private String name;
    private int ID;
    private String jobTitle;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void calculateEmployeeID(){
        idCount++;
        setID(idCount);
    }

    public void print(){
        System.out.println("Nom: " + getName());
        System.out.println("ID: " + getID());
        System.out.println("Nivell: " + getLevel());
        System.out.println("LLoc de feina: " + getJobTitle());
    }


}
