package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;

public class ClanDisbandEvent extends ClanEvent {

    public ClanDisbandEvent(Clan clan) {
        super(clan);
    }
}
