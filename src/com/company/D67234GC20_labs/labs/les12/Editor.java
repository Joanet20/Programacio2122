package com.company.D67234GC20_labs.labs.les12;

public class Editor extends Skills{
    private boolean prefersPaperEditing;

    public void setPrefersPaperEditing (boolean ppe){
        prefersPaperEditing = ppe;
    }

    public boolean isPrefersPaperEditing() {
        return prefersPaperEditing;
    }

    public void print(){
        super.print();

        if (isPrefersPaperEditing() == true){
            System.out.println("Use paper");
        } else {
            System.out.println("Don't use paper");
        }
    }
}
