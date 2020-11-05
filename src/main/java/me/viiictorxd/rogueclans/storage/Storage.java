package me.viiictorxd.rogueclans.storage;

import java.sql.Connection;

public interface Storage extends StorageConnector {

    Connection getConnection();
}
