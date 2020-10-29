package com.github.viiictorxd.rogueclans.connection;

import java.util.HashMap;
import java.util.Map;

public class DatabaseParemeters {

    private final Map<String, String> parameters;

    public DatabaseParemeters() {
        this.parameters = new HashMap<>();
    }

    public DatabaseParemeters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public String get(String key) {
        return parameters.get(key);
    }

    public Builder builder() {
        return new Builder(parameters);
    }

    public static class Builder {

        private final Map<String, String> parameters;

        public Builder(Map<String, String> parameters) {
            this.parameters = parameters;
        }

        public Builder setHost(String host) {
            parameters.put("host", host);
            return this;
        }

        public Builder setDatabase(String database) {
            parameters.put("database", database);
            return this;
        }

        public Builder setPassword(String password) {
            parameters.put("password", password);
            return this;
        }

        public Builder setUsername(String username) {
            parameters.put("username", username);
            return this;
        }

        public DatabaseParemeters asClass() {
            return new DatabaseParemeters(parameters);
        }
    }
}
