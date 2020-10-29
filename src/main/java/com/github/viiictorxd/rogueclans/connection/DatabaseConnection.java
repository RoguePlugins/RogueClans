package com.github.viiictorxd.rogueclans.connection;

public interface DatabaseConnection<C> extends DatabaseConnector{

    C getConnection() throws DatabaseException;
}
