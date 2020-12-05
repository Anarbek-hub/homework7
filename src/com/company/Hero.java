package com.company;

public abstract class  Hero  implements HavingSuperAbility  {
    private int helath,damage;
    private String typeAbility;

    public Hero(int helath, int damage, String typeAbility) {
        this.helath = helath;
        this.damage = damage;
        this.typeAbility = typeAbility;
    }

    @Override
    public void applySuperAbility(String superAbilityType) {

    }

    public int getHelath() {
        return helath;
    }

    public void setHelath(int helath) {
        this.helath = helath;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeAbility() {
        return typeAbility;
    }

    public void setTypeAbility(String typeAbility) {
        this.typeAbility = typeAbility;
    }
}

