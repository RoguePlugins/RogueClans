package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.announce.Announce;

public class ClanNotifyEvent extends ClanEvent {

    private final Announce announce;

    public ClanNotifyEvent(Clan clan, Announce announce) {
        super(clan);
        this.announce = announce;
    }

    public Announce getAnnounce() {
        return announce;
    }
}
