package com.github.viiictorxd.rogueclans;

import com.github.viiictorxd.rogueclans.listener.MemberListener;
import com.github.viiictorxd.rogueclans.manager.base.ClanManager;
import com.github.viiictorxd.rogueclans.manager.base.MemberManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class RogueClans extends JavaPlugin {

    private RogueMessages rogueMessages;

    public ClanManager clanManager;
    public MemberManager memberManager;

    @Override
    public void onEnable() {
        super.onEnable();

        clanManager = new ClanManager();
        memberManager = new MemberManager();

        Bukkit.getPluginManager().registerEvents(new MemberListener(this), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static RogueClans getInstance() {
        return getPlugin(RogueClans.class);
    }
}
