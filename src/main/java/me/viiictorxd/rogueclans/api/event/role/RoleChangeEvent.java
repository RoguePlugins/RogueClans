package me.viiictorxd.rogueclans.api.event.role;

import me.viiictorxd.rogueclans.clan.member.role.Role;

public class RoleChangeEvent extends RoleEvent {

    private Object oldValue;
    private Object newValue;

    public RoleChangeEvent(Role role, Object oldValue, Object newValue) {
        super(role);
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public Object getNewValue() {
        return newValue;
    }

    public boolean anyChange() {
        return !oldValue.equals(newValue);
    }
}
