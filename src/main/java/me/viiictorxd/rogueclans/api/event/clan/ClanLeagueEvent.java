package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;

public class ClanLeagueEvent extends ClanEvent {

    private final Clan enemy;
    private int gainedExperience;

    public ClanLeagueEvent(Clan clan, Clan enemy, int gainedExperience) {
        super(clan);
        this.enemy = enemy;
        this.gainedExperience = gainedExperience;
    }

    public Clan getEnemy() {
        return enemy;
    }

    public int getGainedExperience() {
        return gainedExperience;
    }

    public void setGainedExperience(int gainedExperience) {
        this.gainedExperience = gainedExperience;
    }
}
