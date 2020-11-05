package me.viiictorxd.rogueclans.storage.defaults;

import me.viiictorxd.rogueclans.storage.Storage;
import me.viiictorxd.rogueclans.storage.StorageIdentifier;
import me.viiictorxd.rogueclans.storage.option.StorageOptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlStorage implements Storage {

    private final StorageOptions options;
    private final StorageIdentifier identifier;
    private Connection connection;

    public MysqlStorage(StorageOptions options) {
        this.options = options;
        this.identifier = StorageIdentifier.MYSQL;
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

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"
                            + options.getHost()
                            + "/"
                            + options.getDatabase()
                            + "?useUnicode=true" +
                            "&useJDBCCompliantTimezoneShift=true" +
                            "&useLegacyDatetimeCode=false" +
                            "&serverTimezone=UTC",
                    options.getUsername(),
                    options.getPassword());
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
