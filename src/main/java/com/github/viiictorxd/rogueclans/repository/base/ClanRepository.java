package com.github.viiictorxd.rogueclans.repository.base;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.repository.Repository;
import com.google.common.collect.Maps;

import java.util.Map;

public class ClanRepository implements Repository<String, Clan> {

    @Override
    public Map<String, Clan> getAll() {
        return Maps.newHashMap();
    }
}
