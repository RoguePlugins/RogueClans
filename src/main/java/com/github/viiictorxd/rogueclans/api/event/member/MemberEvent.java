package com.github.viiictorxd.rogueclans.api.event.member;

import com.github.viiictorxd.rogueclans.api.event.EventBase;
import com.github.viiictorxd.rogueclans.entity.member.Member;

public class MemberEvent extends EventBase {

    private final Member member;

    public MemberEvent(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return member;
    }
}
