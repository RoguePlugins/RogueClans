package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;

public class ClanCreateEvent extends ClanEvent {

    public ClanCreateEvent(Clan clan) {
        super(clan);
    }
}
