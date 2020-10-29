package com.github.viiictorxd.rogueclans.api.event.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.clan.Invite;

public class ClanInviteAMemberEvent extends ClanEvent {

    private Invite invite;

    public ClanInviteAMemberEvent(Clan clan, Invite invite) {
        super(clan);
        this.invite = invite;
    }

    public Invite getInvite() {
        return invite;
    }
}
