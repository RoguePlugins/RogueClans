package me.viiictorxd.rogueclans.api.event.role;

import me.viiictorxd.rogueclans.clan.member.role.Role;

public class RoleCreateEvent extends RoleEvent {

    public RoleCreateEvent(Role role) {
        super(role);
    }
}
