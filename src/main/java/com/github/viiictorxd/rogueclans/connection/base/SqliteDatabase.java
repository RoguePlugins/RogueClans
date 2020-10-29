package com.github.viiictorxd.rogueclans.connection.base;

import com.github.viiictorxd.rogueclans.connection.Database;
import com.github.viiictorxd.rogueclans.connection.DatabaseConnection;
import com.github.viiictorxd.rogueclans.connection.DatabaseException;
import com.github.viiictorxd.rogueclans.connection.DatabaseType;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class SqliteDatabase implements Database, DatabaseConnection<Connection> {

    private final DatabaseType type;
    private final File folder;
    private Connection connection;

    public SqliteDatabase(File folder) {
        this.type = DatabaseType.SQLITE;
        this.folder = folder;
    }

    @Override
    public Connection getConnection() throws DatabaseException {
        return connection;
    }

    public DatabaseType getType() {
        return type;
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
