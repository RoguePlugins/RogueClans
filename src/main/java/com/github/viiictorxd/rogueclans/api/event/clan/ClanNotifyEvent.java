package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.clan.Notify;

public class ClanNotifyEvent extends ClanEvent {

    private Notify notify;

    public ClanNotifyEvent(Clan clan, Notify notify) {
        super(clan);
        this.notify = notify;
    }

    public Notify getNotify() {
        return notify;
    }
}
