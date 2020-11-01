package com.github.viiictorxd.rogueclans.entity.member;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.member.role.Role;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Member {

    private final UUID uniqueId;
    private final String displayName;
    private long lastSeen;

    private Clan clan;
    private Role role;

    private final Combat combat;
    private Maker maker;

    public Member(UUID uniqueId, String displayName) {
        this(uniqueId, displayName, System.currentTimeMillis(), null, null, new Combat(), new Maker());
    }

    public Member(
            UUID uniqueId,
            String displayName,
            long lastSeen,
            Clan clan,
            Role role,
            Combat combat,
            Maker maker) {
        this.uniqueId = uniqueId;
        this.displayName = displayName;
        this.lastSeen = lastSeen;
        this.clan = clan;
        this.role = role;
        this.combat = combat;
        this.maker = maker;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public long getLastSeen() {
        return lastSeen;
    }

    public void updateLastSeen() {
        this.lastSeen = System.currentTimeMillis();
    }

    public Clan getClan() {
        return clan;
    }

    public boolean hasClan() {
        return clan != null;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Role getRole() {
        return role;
    }

    public boolean hasRole() {
        return role != null;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Combat getCombat() {
        return combat;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public Player getPlayer() {
        return Bukkit.getPlayer(uniqueId);
    }

    public boolean isOnline() {
        return getPlayer() != null
                && getPlayer().isOnline();
    }

    public void sendMessage(String message) {
        if (isOnline())
            getPlayer().sendMessage(message);
    }

    public boolean isLeader() {
        return role != null
                && role.getPriority() == 1;
    }
}
