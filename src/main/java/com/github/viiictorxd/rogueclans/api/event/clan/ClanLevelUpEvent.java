package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.clan.Level;

public class ClanLevelUpEvent extends ClanEvent {

    private Level newLevel;

    public ClanLevelUpEvent(Clan clan, Level newLevel) {
        super(clan);
        this.newLevel = newLevel;
    }

    public Level getNewLevel() {
        return newLevel;
    }
}
