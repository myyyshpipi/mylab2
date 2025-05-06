package org.example.View;

class Character {
    private String name;
    private String race;
    private int level;
    private int strength;
    private int agility;

    public Character(String name, String race, int level, int strength, int agility) {
        this.name = name;
        this.race = race;
        this.level = level;
        this.strength = strength;
        this.agility = agility;
    }

    public int getLevel() {
        return level;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return name;
    }
}
