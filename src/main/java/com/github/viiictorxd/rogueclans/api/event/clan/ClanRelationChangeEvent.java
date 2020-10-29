package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.clan.Relation;

public class ClanRelationChangeEvent extends ClanEvent {

    private Clan target;
    private Relation newRelation;

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
