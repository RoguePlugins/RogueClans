package me.viiictorxd.rogueclans.api.event.role;

import me.viiictorxd.rogueclans.clan.member.role.Role;

public class RoleDeleteEvent extends RoleEvent {

    public RoleDeleteEvent(Role role) {
        super(role);
    }
}
