package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.relation.Relation;

public class ClanRelationChangeEvent extends ClanEvent {

    private final Clan target;
    private final Relation newRelation;

    public ClanRelationChangeEvent(Clan clan, Clan target, Relation newRelation) {
        super(clan);
        this.target = target;
        this.newRelation = newRelation;
    }

    public Clan getTarget() {
        return target;
    }

    public Relation getNewRelation() {
        return newRelation;
    }
}
