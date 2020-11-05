package me.viiictorxd.rogueclans.clan.member;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.member.invite.Invite;
import me.viiictorxd.rogueclans.clan.member.role.Role;
import me.viiictorxd.rogueclans.clan.member.statistic.Statistic;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Member {

    private final UUID uniqueId;
    private final String displayName;
    private long lastSeen;

    private Clan clan;
    private Role role;

    private final Set<Invite> invites;

    private final Statistic statistic;

    public Member(UUID uniqueId, String displayName) {
        this(uniqueId, displayName, System.currentTimeMillis(), null, null, new Statistic());
    }

    public Member(UUID uniqueId, String displayName, long lastSeen, Clan clan, Role role, Statistic statistic) {
        this.uniqueId = uniqueId;
        this.displayName = displayName;
        this.lastSeen = lastSeen;
        this.clan = clan;
        this.role = role;
        this.invites = new HashSet<>();
        this.statistic = statistic;
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

    public void setLastSeen(long lastSeen) {
        this.lastSeen = lastSeen;
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

    public Set<Invite> getInvites() {
        return invites;
    }

    public boolean hasInvites() {
        return !invites.isEmpty();
    }

    public Statistic getStatistic() {
        return statistic;
    }
}
