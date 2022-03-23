package com.company.Entorns2122.Refactoitzacions.substituteAlgorithm;

public class Order {

    public float applyVAT (int vatType) {
        float[] result = {1.04f, 1.18f, 1.21f};

        if (result[vatType] >= 0 && result[vatType] < result.length){
            return result[vatType];
        }

        return -1;
    }

}
