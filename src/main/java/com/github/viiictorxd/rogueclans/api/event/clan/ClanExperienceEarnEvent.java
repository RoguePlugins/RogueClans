package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;

public class ClanExperienceEarnEvent extends ClanEvent {

    private int gainedExperience;
    private int totalExperience;

    public ClanExperienceEarnEvent(Clan clan, int gainedExperience) {
        super(clan);
        this.gainedExperience = gainedExperience;
        this.totalExperience = clan.getLevel().getExperience();
    }

    public int getGainedExperience() {
        return gainedExperience;
    }

    public int getTotalExperience() {
        return totalExperience;
    }
}
