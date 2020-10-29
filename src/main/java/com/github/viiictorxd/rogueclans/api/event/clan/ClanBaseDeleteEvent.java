package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import org.bukkit.Location;

public class ClanBaseDeleteEvent extends ClanEvent {

    private Location oldLocation;

    public ClanBaseDeleteEvent(Clan clan, Location oldLocation) {
        super(clan);
        this.oldLocation = oldLocation;
    }

    public Location getOldLocation() {
        return oldLocation;
    }
}
