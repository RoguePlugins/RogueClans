package me.viiictorxd.rogueclans.api.event;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;

public interface EventCallable {

    default void callEvent() {
        Bukkit.getPluginManager().callEvent((Event) this);
    }
}
