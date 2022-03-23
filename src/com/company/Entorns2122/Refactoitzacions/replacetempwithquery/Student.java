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
            return mark(homework, exam) + 1;
        } else {
            return mark(homework, exam);
        }
    }

    public float mark (float homework, float exam){
        return (homework + exam) / 2;
    }
}
