package me.viiictorxd.rogueclans.clan.announce;

public class Announce {

    private final String message;
    private final long launched;

    public Announce(String message, long launched) {
        this.message = message;
        this.launched = launched;
    }

    public String getMessage() {
        return message;
    }

    public long getLaunched() {
        return launched;
    }
}
