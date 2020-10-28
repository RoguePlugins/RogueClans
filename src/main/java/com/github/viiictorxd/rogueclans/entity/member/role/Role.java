package com.github.viiictorxd.rogueclans.entity.member.role;

import org.bukkit.ChatColor;

import java.util.Set;

public class Role {

    private String key;
    private String name;
    private String prefix;

    private int priority;
    private ChatColor color;

    private Set<Permission> permissions;

    public Role(
            String key,
            String name,
            String prefix,
            int priority,
            ChatColor color,
            Set<Permission> permissions) {
        this.key = key;
        this.name = name;
        this.prefix = prefix;
        this.priority = priority;
        this.color = color;
        this.permissions = permissions;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ChatColor getColor() {
        return color;
    }

    public void setColor(ChatColor color) {
        this.color = color;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }
}
