package me.viiictorxd.rogueclans.api.event.member;

import me.viiictorxd.rogueclans.clan.member.Member;
import me.viiictorxd.rogueclans.clan.member.role.Role;

public class MemberJoinRoleEvent extends MemberEvent {

    private final Role oldRole;
    private final Role newRole;

    public MemberJoinRoleEvent(Member member, Role oldRole, Role newRole) {
        super(member);
        this.oldRole = oldRole;
        this.newRole = newRole;
    }

    public Role getOldRole() {
        return oldRole;
    }

    public Role getNewRole() {
        return newRole;
    }
}
