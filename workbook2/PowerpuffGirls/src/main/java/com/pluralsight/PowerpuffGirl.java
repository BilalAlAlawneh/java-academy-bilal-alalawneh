package com.pluralsight;
public class PowerpuffGirl {
    // 🧬 Instance Variables
    private String name;
    private int health;
    private String outfitColor;
    private int attackDamage;
    private int power;

    // 🛠️ Constructor
    public PowerpuffGirl(String name, String outfitColor) {
        this.name = name;
        this.outfitColor = outfitColor;
        this.power = 100;         // Default power
        this.health = 100;        // Default health
        this.attackDamage = 100;  // Default attack
    }

    // 🔍 Getters
    public String getName() {
        return name;
    }

    public String getOutfitColor() {
        return outfitColor;
    }

    public int getHealth() {
        return health;
    }

    public int getPower() {
        return power;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    // 🩹 Healing Logic
    public void heal(int healthToAdd) {
        System.out.println(name + " is drinking a potion... 🍵");

        if (healthToAdd <= 0) {
            System.out.println("You can't heal with negative juice! 🧃");
            return;
        }

        int newHealth = this.health + healthToAdd;

        if (newHealth > 100) {
            this.health = 100;
            System.out.println("Fully recovered to max health! 💯");
        } else {
            this.health = newHealth;
            System.out.println("Recovered " + healthToAdd + " health. Current health: " + this.health);
        }
    }

    // ✅ Setters with validation
    public void setHealth(int newHealth) {
        if (newHealth >= 0 && newHealth <= 100) {
            this.health = newHealth;
        } else {
            System.out.println("Whoa there! Health must be between 0 and 100.");
        }
    }

    public void setAttackDamage(int damage) {
        if (damage >= 0) {
            this.attackDamage = damage;
        }
    }

    public void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        }
    }
}
