package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(20,45," Tok");

        Medic medic = new Medic(30, 55, "Health");

        Warrior warrior = new Warrior(50 , 34 , "Stan");

        Hero[] heroes = new Hero[]{magic , medic , warrior };
        for (int i = 0; i < heroes.length ; i++) {
            heroes[i].applySuperAbility("");
        }
    }
}
