package me.viiictorxd.rogueclans.api.event.member;

import me.viiictorxd.rogueclans.clan.member.Member;

public class MemberKillEvent extends MemberEvent {

    private final Member target;

    public MemberKillEvent(Member member, Member target) {
        super(member);
        this.target = target;
    }

    public Member getTarget() {
        return target;
    }
}
