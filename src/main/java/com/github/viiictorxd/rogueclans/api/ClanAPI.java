package com.github.viiictorxd.rogueclans.api;

import com.github.viiictorxd.rogueclans.RogueClans;
import com.github.viiictorxd.rogueclans.entity.clan.Clan;

public class ClanAPI implements API {

    private final static RogueClans PLUGIN = RogueClans.getInstance();
    private final Clan clan;

    public ClanAPI(String input) {
        this.clan = PLUGIN.clanManager.found(c -> {
            return c.getTag().equalsIgnoreCase(input) || c.getName().equalsIgnoreCase(input);
        }).orElse(null);
    }

    public Clan getClan() {
        return clan;
    }

    @Override
    public boolean isValid() {
        return clan != null;
    }
}
