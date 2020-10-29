package com.github.viiictorxd.rogueclans.api.event.role;

import com.github.viiictorxd.rogueclans.entity.member.role.Permission;
import com.github.viiictorxd.rogueclans.entity.member.role.Role;

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
        REMOVED;
    }
}
