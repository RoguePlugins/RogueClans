package com.github.viiictorxd.rogueclans.repository.base.clan;

import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.repository.service.EntityService;

public interface ClanRepositorySQL extends EntityService<String, Clan> {

    String TABLE = "clans";

    String TABLE_CREATE = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
            "tag VARCHAR(255) NOT NULL, " +
            "coloredTag VARCHAR(255) NOT NULL, " +
            "name VARCHAR(255) NOT NULL, " +
            "base VARCHAR(255) NOT NULL, " +
            "level INTEGER, " +
            "experience INTEGER, " +
            "memberCount INTEGER, " +
            "gladiatorCount INTEGER, " +
            "pvpCount INTEGER, " +
            "founded LONG" +
            ")";

    String SELECT_CLANS = "SELECT * FROM " + TABLE;

    String INSERT_CLAN = "INSERT INTO " + TABLE + " (" +
            "tag, " +
            "coloredTag, " +
            "name, " +
            "base, " +
            "level, " +
            "experience, " +
            "memberCount, " +
            "gladiatorCount, " +
            "pvpCount, " +
            "founded" +
            ") VALUES (" +
            "?, " +
            "?, " +
            "?, " +
            "?, " +
            "?, " +
            "?, " +
            "?, " +
            "?, " +
            "?, " +
            "?" +
            ")";

    String DELETE_CLAN = "DELETE FROM " + TABLE + " WHERE tag = ?";

    String UPDATE_CLAN = "UPDATE " + TABLE + " SET " +
            "base = ?, " +
            "level = ?, " +
            "experience = ?, " +
            "memberCount = ?, " +
            "gladiatorCount = ?, " +
            "pvpCount = ? WHERE " +
            "tag = ?";
}
