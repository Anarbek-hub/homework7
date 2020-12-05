package com.company;

public class Magic extends Hero{
    public Magic(int helath, int damage, String typeAbility) {
        super(helath, damage, typeAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Magic ability:" + getTypeAbility());
    }
}
