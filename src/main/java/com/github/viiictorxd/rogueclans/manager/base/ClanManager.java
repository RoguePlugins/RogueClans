package com.github.viiictorxd.rogueclans.manager.base;

import com.github.viiictorxd.rogueclans.api.event.clan.ClanDisbandEvent;
import com.github.viiictorxd.rogueclans.entity.member.Member;
import com.github.viiictorxd.rogueclans.manager.Manager;
import com.github.viiictorxd.rogueclans.entity.clan.Clan;

import java.util.Optional;

public class ClanManager extends Manager<String, Clan> {

    public Optional<Clan> getByName(String name) {
        return found(c -> c.getName().equalsIgnoreCase(name));
    }

    public void disband(Clan clan) {
        for (Member member : clan.getMembers()) {
            member.setClan(null);
            member.setRole(null);
        }

        new ClanDisbandEvent(clan)
                .callEvent();

        getValues().remove(clan.getTag());
    }
}
