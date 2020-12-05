package com.company;

public class Warrior extends Hero {
    public Warrior(int helath, int damage, String typeAbility) {
        super(helath, damage, typeAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Warrior ability:" + getTypeAbility());
    }
}
