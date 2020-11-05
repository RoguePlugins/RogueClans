package me.viiictorxd.rogueclans.clan.level.league;

public class League {

    private final String name;
    private final int position;
    private final char color;
    private final int level;
    private final int experience;

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
