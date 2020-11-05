package me.viiictorxd.rogueclans.storage.defaults;

import me.viiictorxd.rogueclans.storage.Storage;
import me.viiictorxd.rogueclans.storage.StorageIdentifier;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteStorage implements Storage {

    private final StorageIdentifier identifier;
    private final File folder;
    private Connection connection;

    public SqliteStorage(File folder) {
        this.identifier = StorageIdentifier.SQL;
        this.folder = folder;
    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public void connect() {
        try {
            if (connection != null && !connection.isClosed())
                return;

            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + folder + "/RogueClans.db");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void disconnect() {
        try {
            if (connection == null || connection.isClosed())
                return;

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
