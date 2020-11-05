package me.viiictorxd.rogueclans.clan;

import me.viiictorxd.rogueclans.clan.announce.Announce;
import me.viiictorxd.rogueclans.clan.counter.Counter;
import me.viiictorxd.rogueclans.clan.level.Level;
import me.viiictorxd.rogueclans.clan.level.league.League;
import me.viiictorxd.rogueclans.clan.member.Member;
import me.viiictorxd.rogueclans.clan.member.invite.Invite;
import me.viiictorxd.rogueclans.clan.member.role.Role;
import me.viiictorxd.rogueclans.clan.relation.Relation;
import org.bukkit.Location;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Clan {

    private final String tag;
    private final String name;

    private char color;

    private final Set<Member> members;
    private final Set<Announce> announces;
    private final Set<Role> roles;

    private final Map<String, Relation> relations;
    private final Map<Member, Invite> invites;

    private final League league;
    private final Level level;
    private final Counter counter;

    private Inventory inventory;
    private Location base;

    private final long foundation;

    public Clan(String tag, String name) {
        this(
                tag, name, '7',
                new HashSet<>(), new HashSet<>(), new HashSet<>(),
                new HashMap<>(), new HashMap<>(),
                null, new Level(), new Counter(),
                null, null,
                System.currentTimeMillis());
    }

    public Clan(String tag,
                String name,
                char color,
                Set<Member> members,
                Set<Announce> announces,
                Set<Role> roles,
                Map<String, Relation> relations,
                Map<Member, Invite> invites,
                League league,
                Level level,
                Counter counter,
                Inventory inventory,
                Location base,
                long foundation) {
        this.tag = tag;
        this.name = name;
        this.color = color;
        this.members = members;
        this.announces = announces;
        this.roles = roles;
        this.relations = relations;
        this.invites = invites;
        this.league = league;
        this.level = level;
        this.counter = counter;
        this.inventory = inventory;
        this.base = base;
        this.foundation = foundation;
    }

    public String getTag() {
        return tag;
    }

    public String getName() {
        return name;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public Set<Announce> getAnnounces() {
        return announces;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public Map<String, Relation> getRelations() {
        return relations;
    }

    public Map<Member, Invite> getInvites() {
        return invites;
    }

    public League getLeague() {
        return league;
    }

    public Level getLevel() {
        return level;
    }

    public Counter getCounter() {
        return counter;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Location getBase() {
        return base;
    }

    public void setBase(Location base) {
        this.base = base;
    }

    public long getFoundation() {
        return foundation;
    }
}
