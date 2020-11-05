package me.viiictorxd.rogueclans.api.event.member;

import me.viiictorxd.rogueclans.api.event.EventBase;
import me.viiictorxd.rogueclans.clan.member.Member;

public class MemberEvent extends EventBase {

    private final Member member;

    public MemberEvent(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return member;
    }
}
