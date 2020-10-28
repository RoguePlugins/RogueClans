package com.github.viiictorxd.rogueclans.entity.clan;

import com.github.viiictorxd.rogueclans.entity.member.Member;

public class Invite {

    private Clan clan;
    private Member from;
    private long date;

    public Invite(Member from) {
        this.clan = null;
        this.from = from;
        this.date = System.currentTimeMillis();
    }

    public Clan getClan() {
        return clan;
    }

    public Member getFrom() {
        return from;
    }

    public long getDate() {
        return date;
    }
}
