package me.viiictorxd.rogueclans.clan.level;

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

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void earnExp() {

    }
}
