package com.github.viiictorxd.rogueclans.api.event.member;

import com.github.viiictorxd.rogueclans.entity.member.Member;

public class MemberKillEvent extends MemberEvent {

    private Member target;

    public MemberKillEvent(Member member, Member target) {
        super(member);
        this.target = target;
    }

    public Member getTarget() {
        return target;
    }
}
