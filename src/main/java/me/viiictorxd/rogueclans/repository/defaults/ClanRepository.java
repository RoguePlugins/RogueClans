package me.viiictorxd.rogueclans.repository.defaults;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.repository.Repository;

import java.util.HashMap;
import java.util.Map;

public class ClanRepository implements Repository<String, Clan> {

    @Override
    public Map<String, Clan> getAll() {
        return new HashMap<>();
    }
}
