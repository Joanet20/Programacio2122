package com.company.Entorns2122.Refactoitzacions.removeParameterAssignment;

public class Student {
    public float evaluateTerm(float homeworkMark, float examMark, float attitude) {

        int finalMark = 0;

        if (examMark < 5) {
            finalMark = 1;
        }

        if (homeworkMark < 4) {
            finalMark += 1;
        }
        return (finalMark / 2) + attitude;
    }
}
