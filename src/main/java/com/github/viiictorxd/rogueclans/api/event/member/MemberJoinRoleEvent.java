package com.github.viiictorxd.rogueclans.api.event.member;

import com.github.viiictorxd.rogueclans.entity.member.Member;
import com.github.viiictorxd.rogueclans.entity.member.role.Role;

public class MemberJoinRoleEvent extends MemberEvent {

    private Role oldRole;
    private Role newRole;

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
