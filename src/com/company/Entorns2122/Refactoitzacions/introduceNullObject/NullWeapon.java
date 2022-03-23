package com.company.Entorns2122.Refactoitzacions.introduceNullObject;

public class NullWeapon extends Weapon{

    public NullWeapon (int damage){
        super(damage);
    }

    @Override
    public int getDamage(){
        return 0;
    }
}
