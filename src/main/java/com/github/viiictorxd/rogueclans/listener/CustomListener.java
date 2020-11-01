package com.github.viiictorxd.rogueclans.listener;

import com.github.viiictorxd.rogueclans.RogueClans;
import com.github.viiictorxd.rogueclans.api.event.clan.ClanCreateEvent;
import com.github.viiictorxd.rogueclans.api.event.clan.ClanDisbandEvent;
import com.github.viiictorxd.rogueclans.manager.base.ClanManager;
import com.github.viiictorxd.rogueclans.manager.base.MemberManager;
import com.github.viiictorxd.rogueclans.repository.base.clan.ClanRepository;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CustomListener implements Listener {

    private final MemberManager memberManager;

    private final ClanManager clanManager;
    private final ClanRepository clanRepository;

    public CustomListener(RogueClans rogueClans) {
        this.memberManager = rogueClans.memberManager;

        this.clanManager = rogueClans.clanManager;
        this.clanRepository = rogueClans.clanRepository;
    }

    @EventHandler
    private void onClanCreate(ClanCreateEvent event) {
        clanManager.getValues().put(event.getClan().getTag(), event.getClan());
    }

    @EventHandler
    private void onClanDisband(ClanDisbandEvent event) {

    }
}
