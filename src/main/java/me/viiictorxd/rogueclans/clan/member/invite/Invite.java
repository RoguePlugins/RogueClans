package me.viiictorxd.rogueclans.clan.member.invite;

import me.viiictorxd.rogueclans.clan.Clan;
import me.viiictorxd.rogueclans.clan.member.Member;

public class Invite {

    private final Clan clan;
    private final Member from;
    private final long launched;

    public Invite(Member from) {
        this.clan = null;
        this.from = from;
        this.launched = System.currentTimeMillis();
    }

    public Clan getClan() {
        return clan;
    }

    public Member getFrom() {
        return from;
    }

    public long getLaunched() {
        return launched;
    }
}
