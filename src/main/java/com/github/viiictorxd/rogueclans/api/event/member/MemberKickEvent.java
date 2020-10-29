package com.github.viiictorxd.rogueclans.api.event.member;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.member.Member;

public class MemberKickEvent extends MemberEvent {

    private Clan clan;

    public MemberKickEvent(Member member, Clan clan) {
        super(member);
        this.clan = clan;
    }

    public Clan getClan() {
        return clan;
    }
}
