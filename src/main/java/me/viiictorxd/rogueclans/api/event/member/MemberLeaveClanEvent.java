package me.viiictorxd.rogueclans.api.event.member;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.member.Member;

public class MemberLeaveClanEvent extends MemberEvent {

    private final Clan oldClan;

    public MemberLeaveClanEvent(Member member, Clan oldClan) {
        super(member);
        this.oldClan = oldClan;
    }

    public Clan getOldClan() {
        return oldClan;
    }
}
