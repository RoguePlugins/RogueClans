package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.level.Level;

public class ClanLevelUpEvent extends ClanEvent {

    private final Level newLevel;

    public ClanLevelUpEvent(Clan clan, Level newLevel) {
        super(clan);
        this.newLevel = newLevel;
    }

    public Level getNewLevel() {
        return newLevel;
    }
}
