package com.github.viiictorxd.rogueclans.api.event.role;

import com.github.viiictorxd.rogueclans.api.event.EventBase;
import com.github.viiictorxd.rogueclans.entity.member.role.Role;

public class RoleEvent extends EventBase {

    private final Role role;

    public RoleEvent(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }
}
