package com.company.Entorns2122.Refactoitzacions.introduceNullObject;

public class Warrior {

    private Weapon weapon;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
    }

    public int attack() {

        return weapon.getDamage();
    }

}
