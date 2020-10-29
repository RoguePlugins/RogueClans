package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import org.bukkit.Location;

public class ClanBaseSetEvent extends ClanEvent {

    private Location location;

    public ClanBaseSetEvent(Clan clan, Location location) {
        super(clan);
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
