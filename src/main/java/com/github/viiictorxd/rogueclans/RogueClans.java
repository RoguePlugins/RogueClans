package com.github.viiictorxd.rogueclans;

import com.github.viiictorxd.rogueclans.command.CommandClan;
import com.github.viiictorxd.rogueclans.command.argument.ClanArgumentCreate;
import com.github.viiictorxd.rogueclans.command.argument.ClanArgumentDisband;
import com.github.viiictorxd.rogueclans.command.argument.ClanArgumentLeave;
import com.github.viiictorxd.rogueclans.listener.MainListener;
import com.github.viiictorxd.rogueclans.listener.MemberListener;
import com.github.viiictorxd.rogueclans.manager.base.ClanManager;
import com.github.viiictorxd.rogueclans.manager.base.MemberManager;
import me.saiintbrisson.bukkit.command.BukkitFrame;
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

        BukkitFrame bukkitFrame = new BukkitFrame(this);
        bukkitFrame.registerCommands(
                new CommandClan(),
                    new ClanArgumentCreate(this),
                    new ClanArgumentDisband(this),
                    new ClanArgumentLeave(this)
        );

        Bukkit.getPluginManager().registerEvents(new MemberListener(this), this);
        Bukkit.getPluginManager().registerEvents(new MainListener(this), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static RogueClans getInstance() {
        return getPlugin(RogueClans.class);
    }
}
