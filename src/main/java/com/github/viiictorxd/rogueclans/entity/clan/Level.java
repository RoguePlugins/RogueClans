package com.github.viiictorxd.rogueclans.entity.clan;

public class Level {

    private int position;
    private int experience;

    public Level(int position, int experience) {
        this.position = position;
        this.experience = experience;
    }

    public int getPosition() {
        return position;
    }

    public int getExperience() {
        return experience;
    }
}
