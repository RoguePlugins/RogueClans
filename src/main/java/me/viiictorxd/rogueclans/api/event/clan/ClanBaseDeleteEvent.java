package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;
import org.bukkit.Location;

public class ClanBaseDeleteEvent extends ClanEvent {

    private final Location oldLocation;

    public ClanBaseDeleteEvent(Clan clan, Location oldLocation) {
        super(clan);
        this.oldLocation = oldLocation;
    }

    public Location getOldLocation() {
        return oldLocation;
    }
}
