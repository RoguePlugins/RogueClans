package me.viiictorxd.rogueclans.api.event.clan;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.member.invite.Invite;

public class ClanInviteAMemberEvent extends ClanEvent {

    private final Invite invite;

    public ClanInviteAMemberEvent(Clan clan, Invite invite) {
        super(clan);
        this.invite = invite;
    }

    public Invite getInvite() {
        return invite;
    }
}
