package com.github.viiictorxd.rogueclans.connection.base;

import com.github.viiictorxd.rogueclans.connection.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDatabase implements Database, DatabaseConnection<Connection> {

    private final DatabaseParemeters databaseParemeters;
    private final DatabaseType type;
    private Connection connection;

    public MysqlDatabase(DatabaseParemeters databaseParemeters) {
        this.databaseParemeters = databaseParemeters;
        this.type = DatabaseType.MYSQL;
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

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"
                            + databaseParemeters.get("host")
                            + "/"
                            + databaseParemeters.get("database")
                            + "?useUnicode=true" +
                            "&useJDBCCompliantTimezoneShift=true" +
                            "&useLegacyDatetimeCode=false" +
                            "&serverTimezone=UTC",
                    databaseParemeters.get("username"),
                    databaseParemeters.get("password"));
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
