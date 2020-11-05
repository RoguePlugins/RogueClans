package me.viiictorxd.rogueclans.api.event.role;

import me.viiictorxd.rogueclans.clan.member.role.Role;
import me.viiictorxd.rogueclans.clan.member.role.Permission;

public class RolePermissionChangedEvent extends RoleEvent {

    private Permission permission;
    private Action action;

    public RolePermissionChangedEvent(Role role, Permission permission, Action action) {
        super(role);
        this.permission = permission;
        this.action = action;
    }

    public Permission getPermission() {
        return permission;
    }

    public Action getAction() {
        return action;
    }

    public enum Action {

        ADDED,
        REMOVED
    }
}
