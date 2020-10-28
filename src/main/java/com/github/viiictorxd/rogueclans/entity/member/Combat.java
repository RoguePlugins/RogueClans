package com.github.viiictorxd.rogueclans.entity.member;

public class Combat {

    private int kills;
    private int deaths;

    public Combat() {
        this(0, 0);
    }

    public Combat(int kills, int deaths) {
        this.kills = kills;
        this.deaths = deaths;
    }

    public int getKills() {
        return kills;
    }

    public void increaseKill() {
        this.kills++;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void increaseDeath() {
        this.deaths++;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }
}
