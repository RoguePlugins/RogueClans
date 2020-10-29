package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;

public class ClanLeagueEvent extends ClanEvent {

    private Clan enemy;
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
}
