package com.github.viiictorxd.rogueclans.entity.clan;

public class Notify {

    private String message;
    private long date;

    public Notify(String message, long date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public long getDate() {
        return date;
    }
}
