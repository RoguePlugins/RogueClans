package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;
import org.bukkit.Location;

public class ClanBaseSetEvent extends ClanEvent {

    private final Location location;

    public ClanBaseSetEvent(Clan clan, Location location) {
        super(clan);
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
