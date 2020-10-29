package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.api.event.EventBase;
import com.github.viiictorxd.rogueclans.entity.clan.Clan;

public class ClanEvent extends EventBase {

    private final Clan clan;

    public ClanEvent(Clan clan) {
        this.clan = clan;
    }

    public Clan getClan() {
        return clan;
    }
}
