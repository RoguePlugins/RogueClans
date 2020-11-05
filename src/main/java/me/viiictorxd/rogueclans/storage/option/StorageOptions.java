package me.viiictorxd.rogueclans.storage.option;

public class StorageOptions {

    private String host;
    private String database;
    private String username;
    private String password;

    public StorageOptions host(String host) {
        this.host = host;
        return this;
    }

    public String getHost() {
        return host;
    }

    public StorageOptions database(String database) {
        this.database = database;
        return this;
    }

    public String getDatabase() {
        return database;
    }

    public StorageOptions username(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public StorageOptions password(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }
}
