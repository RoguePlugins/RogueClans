package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;

public class ClanExperienceGainEvent extends ClanEvent {

    private int gainedExperience;
    private final int totalExperience;

    public ClanExperienceGainEvent(Clan clan, int gainedExperience) {
        super(clan);
        this.gainedExperience = gainedExperience;
        this.totalExperience = clan.getLevel().getExperience();
    }

    public int getGainedExperience() {
        return gainedExperience;
    }

    public void setGainedExperience(int gainedExperience) {
        this.gainedExperience = gainedExperience;
    }

    public int getTotalExperience() {
        return totalExperience;
    }
}
