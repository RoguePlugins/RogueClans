package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;

public class ClanExperienceGainEvent extends ClanEvent {

    private int gainedExperience;

    public ClanExperienceGainEvent(Clan clan, int gainedExperience) {
        super(clan);
        this.gainedExperience = gainedExperience;
    }

    public int getGainedExperience() {
        return gainedExperience;
    }
}
