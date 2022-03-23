package com.company.Entorns2122.Refactoitzacions.rename;

public class Conversor {

    private static final float PESETAS_A_EUROS = 166.386f;

    public float conv (float c) {
        float x = c * PESETAS_A_EUROS;
        return x;
    }
}
