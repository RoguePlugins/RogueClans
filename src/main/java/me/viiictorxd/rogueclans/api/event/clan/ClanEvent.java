package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.api.event.EventBase;
import me.viiictorxd.rogueclans.clan.Clan;

public class ClanEvent extends EventBase {

    private final Clan clan;

    public ClanEvent(Clan clan) {
        this.clan = clan;
    }

    public Clan getClan() {
        return clan;
    }
}
