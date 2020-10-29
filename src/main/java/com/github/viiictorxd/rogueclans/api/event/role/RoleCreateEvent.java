package com.github.viiictorxd.rogueclans.api.event.role;

import com.github.viiictorxd.rogueclans.entity.member.role.Role;

public class RoleCreateEvent extends RoleEvent {

    public RoleCreateEvent(Role role) {
        super(role);
    }
}
