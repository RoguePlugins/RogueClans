package me.viiictorxd.rogueclans.clan.member.statistic;

public class Statistic {

    private int kills;
    private int deaths;
    private double damage;

    public Statistic() {
        this(0, 0, 0);
    }

    public Statistic(int kills, int deaths, double damage) {
        this.kills = kills;
        this.deaths = deaths;
        this.damage = damage;
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

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public void increaseDeath() {
        this.deaths++;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
