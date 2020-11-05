package me.viiictorxd.rogueclans.api.event.member;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.member.Member;

public class MemberKickEvent extends MemberEvent {

    private final Clan clan;

    public MemberKickEvent(Member member, Clan clan) {
        super(member);
        this.clan = clan;
    }

    public Clan getClan() {
        return clan;
    }
}
