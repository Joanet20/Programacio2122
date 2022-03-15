package com.company.Entorns2122.Refactoitzacions.replacetempwithquery;

public class Student {

    private String name;
    private boolean hasGoodAttitude;

    public Student(String name, boolean hasGoodAttitude) {
        this.name = name;
        this.hasGoodAttitude = hasGoodAttitude;
    }

    public float calculateAverage(float homework, float exam) {


        if (hasGoodAttitude) {
            return calculateMark(homework, exam) + 1;
        } else {
            return calculateMark(homework, exam);
        }
    }


    public float calculateMark(float homework, float exam){
        float mark = (homework + exam) / 2;
        return mark;
    }
}
