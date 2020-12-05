package com.company;

public class Medic extends Hero {

    public Medic(int health, int damage, String typeAbility){

        super(health , damage , typeAbility);


    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Medic ability:" + getTypeAbility());
    }
}
