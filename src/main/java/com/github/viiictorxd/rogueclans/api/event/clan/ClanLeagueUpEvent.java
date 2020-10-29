package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.clan.League;

public class ClanLeagueUpEvent extends ClanEvent {

    private League oldLeague;
    private League newLeague;

    public ClanLeagueUpEvent(Clan clan, League oldLeague, League newLeague) {
        super(clan);
        this.oldLeague = oldLeague;
        this.newLeague = newLeague;
    }

    public League getOldLeague() {
        return oldLeague;
    }

    public League getNewLeague() {
        return newLeague;
    }
}
