package com.github.viiictorxd.rogueclans.repository.base.clan;

import com.github.viiictorxd.rogueclans.connection.Database;
import com.github.viiictorxd.rogueclans.connection.DatabaseException;
import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.manager.base.ClanManager;
import com.google.common.collect.Maps;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class ClanRepository implements ClanRepositorySQL {

    private ClanManager clanManager;
    private Database database;

    public ClanRepository(ClanManager clanManager, Database database) {
        this.clanManager = clanManager;
        this.database = database;
    }

    @Override
    public Map<String, Clan> getAll() {
        return Maps.newHashMap();
    }

    @Override
    public void create(Clan entity) {

    }

    @Override
    public void delete(Clan entity) {

    }

    @Override
    public void update(Clan entity) {

    }

    @Override
    public void makeTables() {
        try(Statement statement = database.getConnection().createStatement()) {
            statement.execute(TABLE_CREATE);
        } catch (SQLException
                | DatabaseException ex) {
            ex.printStackTrace();
        }
    }
}
