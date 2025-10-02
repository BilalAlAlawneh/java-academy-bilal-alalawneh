package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        SuperSayin ss1 = new SuperSayin();
        ss1.name = "Goku";
        ss1.powerlevel = 1000;
        ss1.PowerUp();
        ss1.HealingDrink();

        SuperSayin ss2 = new SuperSayin();
        ss2.name = "Vegeta";
        ss2.powerlevel = 998;
        ss2.PowerUp();
        ss2.Attack(ss1);
        ss1.Stats();
        ss2.Attack(ss1);
        ss1.Stats();
        ss2.HealingDrink();
    }
}
