package com.github.viiictorxd.rogueclans.entity.clan;

import lombok.AllArgsConstructor;

public class Level {

    private int level;
    private int experience;

    public Level() {
        this(1, 0);
    }

    public Level(int level, int experience) {
        this.level = level;
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }
}
