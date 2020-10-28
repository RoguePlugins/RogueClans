package com.github.viiictorxd.rogueclans.entity.clan;

public class League {

    private String name;
    private int position;
    private char color;
    private int level;
    private int experience;

    public League(String name, int position, char color, int level, int experience) {
        this.name = name;
        this.position = position;
        this.color = color;
        this.level = level;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public char getColor() {
        return color;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }
}
