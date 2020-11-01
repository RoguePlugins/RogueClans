package com.github.viiictorxd.rogueclans;

import com.github.viiictorxd.rogueclans.entity.member.role.Role;

import java.util.Set;

public class RogueConstants {

    private int minTagLength,
            maxTagLength;

    private int minNameLength,
            maxNameLength;

    private Set<Role> defaultRoles;

    public int getMinTagLength() {
        return minTagLength;
    }

    public int getMaxTagLength() {
        return maxTagLength;
    }

    public int getMinNameLength() {
        return minNameLength;
    }

    public int getMaxNameLength() {
        return maxNameLength;
    }

    public Set<Role> getDefaultRoles() {
        return defaultRoles;
    }
}
