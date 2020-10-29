package com.github.viiictorxd.rogueclans.api.event.member;

import com.github.viiictorxd.rogueclans.entity.member.Maker;
import com.github.viiictorxd.rogueclans.entity.member.Member;

public class MemberStartMakerClanEvent extends MemberEvent {

    private Maker maker;

    public MemberStartMakerClanEvent(Member member, Maker maker) {
        super(member);
        this.maker = maker;
    }

    public Maker getMaker() {
        return maker;
    }
}
