package me.viiictorxd.rogueclans.clan.member.role;

import org.bukkit.ChatColor;

import java.util.Set;

public class Role {

    private final String key;
    private final String name;
    private String prefix;

    private int priority;
    private ChatColor color;

    private final Set<Permission> permissions;

    public Role(String key, String name, String prefix, int priority, ChatColor color, Set<Permission> permissions) {
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

    public void removePermission(Permission permission) {
        permissions.remove(permission);
    }

    public boolean hasPermission(Permission permission) {
        return permissions.contains(permission);
    }
}
