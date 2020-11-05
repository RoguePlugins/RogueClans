package me.viiictorxd.rogueclans.api.event.role;

import me.viiictorxd.rogueclans.api.event.EventBase;
import me.viiictorxd.rogueclans.clan.member.role.Role;

public class RoleEvent extends EventBase {

    private final Role role;

    public RoleEvent(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }
}
