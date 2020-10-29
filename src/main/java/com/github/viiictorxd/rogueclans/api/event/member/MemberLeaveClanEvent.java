package com.github.viiictorxd.rogueclans.api.event.member;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.member.Member;

public class MemberLeaveClanEvent extends MemberEvent {

    private Clan oldClan;

    public MemberLeaveClanEvent(Member member, Clan oldClan) {
        super(member);
        this.oldClan = oldClan;
    }

    public Clan getOldClan() {
        return oldClan;
    }
}
