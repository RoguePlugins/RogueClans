package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;

public class ClanCreateEvent extends ClanEvent {

    public ClanCreateEvent(Clan clan) {
        super(clan);
    }
}
