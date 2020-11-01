package com.github.viiictorxd.rogueclans.entity.clan;

import com.github.viiictorxd.rogueclans.entity.member.Member;
import com.github.viiictorxd.rogueclans.entity.member.role.Role;
import org.bukkit.inventory.Inventory;

import java.util.*;
import java.util.stream.Collectors;

public class Clan {

    private String tag;
    private String coloredTag;
    private String name;

    private Set<Role> roles;
    private Set<Member> members;
    private Set<Notify> notifies;

    private Map<String, Relation> relations;
    private Map<Member, Invite> invites;

    private Base base;
    private League league;
    private Level level;
    private Counter counter;

    private Inventory inventory;

    private long founded;

    public Clan(
            String tag,
            String coloredTag,
            String name,
            Set<Role> roles,
            Set<Member> members,
            Set<Notify> notifies,
            Map<String, Relation> relations,
            Map<Member, Invite> invites,
            Base base,
            League league,
            Level level,
            Counter counter,
            Inventory inventory,
            long founded) {
        this.tag = tag;
        this.coloredTag = coloredTag;
        this.name = name;
        this.roles = roles;
        this.members = members;
        this.notifies = notifies;
        this.relations = relations;
        this.invites = invites;
        this.base = base;
        this.league = league;
        this.level = level;
        this.counter = counter;
        this.inventory = inventory;
        this.founded = founded;
    }

    public String getTag() {
        return tag;
    }

    public String getColoredTag() {
        return coloredTag;
    }

    public String getName() {
        return name;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public Optional<Role> findRole(String key) {
        return roles.stream()
                .filter(r -> r.getKey().equalsIgnoreCase(key))
                .findFirst();
    }

    public Role getMainRole() {
        return roles.stream()
                .filter(role -> {
                    return role.getPriority() == 1;
                })
                .findFirst().orElse(null);
    }

    public Set<Member> getMembers() {
        return members;
    }

    public Optional<Member> findMember(UUID uniqueId) {
        return members.stream()
                .filter(m -> m.getUniqueId().equals(uniqueId))
                .findFirst();
    }

    public Set<Notify> getNotifies() {
        return notifies;
    }

    public List<Notify> getLatestNotifies() {
        return notifies.stream()
                .sorted(Comparator.comparingLong(Notify::getDate).reversed())
                .collect(Collectors.toList());
    }

    public Map<String, Relation> getRelations() {
        return relations;
    }

    public boolean hasRelation(String tag) {
        return relations.containsKey(tag);
    }

    public Relation getRelation(String tag) {
        return relations.get(tag);
    }

    public Map<Member, Invite> getInvites() {
        return invites;
    }

    public boolean hasPendingInvites() {
        return invites.size() > 0;
    }

    public boolean isRequester(Member member) {
        return invites.containsKey(member);
    }

    public Invite getInvite(Member member) {
        return invites.get(member);
    }

    public Base getBase() {
        return base;
    }

    public boolean hasBase() {
        return base != null;
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

    public long getFounded() {
        return founded;
    }

    public static class Builder {

        private String tag;
        private String coloredTag;
        private String name;

        private Set<Role> roles;
        private Set<Member> members;
        private Set<Notify> notifies;

        private Map<String, Relation> relations;
        private Map<Member, Invite> invites;

        private Base base;
        private League league;
        private Level level;
        private Counter counter;

        private Inventory inventory;

        private long founded;

        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        public Builder setColoredTag(String coloredTag) {
            this.coloredTag = coloredTag;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRoles(Set<Role> roles) {
            this.roles = roles;
            return this;
        }

        public Builder setMembers(Set<Member> members) {
            this.members = members;
            return this;
        }

        public Builder setNotifies(Set<Notify> notifies) {
            this.notifies = notifies;
            return this;
        }

        public Builder setRelations(Map<String, Relation> relations) {
            this.relations = relations;
            return this;
        }

        public Builder setInvites(Map<Member, Invite> invites) {
            this.invites = invites;
            return this;
        }

        public Builder setBase(Base base) {
            this.base = base;
            return this;
        }

        public Builder setLeague(League league) {
            this.league = league;
            return this;
        }

        public Builder setLevel(Level level) {
            this.level = level;
            return this;
        }

        public Builder setCounter(Counter counter) {
            this.counter = counter;
            return this;
        }

        public Builder setInventory(Inventory inventory) {
            this.inventory = inventory;
            return this;
        }

        public Builder setFounded(long founded) {
            this.founded = founded;
            return this;
        }

        public Clan asClan() {
            return new Clan(
                    tag,
                    coloredTag,
                    name,
                    roles,
                    members,
                    notifies,
                    relations,
                    invites,
                    base,
                    league,
                    level,
                    counter,
                    inventory,
                    founded
            );
        }
    }
}
