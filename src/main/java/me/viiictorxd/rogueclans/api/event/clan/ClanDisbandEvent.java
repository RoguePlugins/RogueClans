package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;

public class ClanDisbandEvent extends ClanEvent {

    public ClanDisbandEvent(Clan clan) {
        super(clan);
    }
}
