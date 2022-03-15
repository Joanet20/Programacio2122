package com.company.Entorns2122.Refactoitzacions.replaceNestedConditionalsGuardClauses;

public class Passenger {

    private boolean isUnemployed;
    private boolean isAChild;

    public Passenger(boolean isUnemployed, boolean isAChild) {
        this.isUnemployed = isUnemployed;
        this.isAChild = isAChild;
    }

    public boolean isUnemployed() {
        return isUnemployed;
    }

    public boolean isAChild() {
        return isAChild;
    }

}
