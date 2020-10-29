package com.github.viiictorxd.rogueclans.api.event.role;

import com.github.viiictorxd.rogueclans.entity.member.role.Role;

public class RoleDeleteEvent extends RoleEvent {

    public RoleDeleteEvent(Role role) {
        super(role);
    }
}
