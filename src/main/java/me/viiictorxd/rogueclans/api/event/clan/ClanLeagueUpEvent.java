package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.level.league.League;

public class ClanLeagueUpEvent extends ClanEvent {

    private final League oldLeague;
    private final League newLeague;

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
