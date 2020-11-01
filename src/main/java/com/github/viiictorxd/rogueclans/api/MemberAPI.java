package com.github.viiictorxd.rogueclans.api;

import com.github.viiictorxd.rogueclans.RogueClans;
import com.github.viiictorxd.rogueclans.entity.member.Member;

import java.util.UUID;

public class MemberAPI implements API {

    private final static RogueClans PLUGIN = RogueClans.getInstance();
    private final Member member;

    public MemberAPI(UUID uniqueId) {
        this.member = PLUGIN.memberManager.get(uniqueId);
    }

    public Member getMember() {
        return member;
    }

    @Override
    public boolean isValid() {
        return member != null;
    }
}
