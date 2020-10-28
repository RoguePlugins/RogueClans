package com.github.viiictorxd.rogueclans.manager.base;

import com.github.viiictorxd.rogueclans.manager.Manager;
import com.github.viiictorxd.rogueclans.entity.member.Member;

import java.util.Optional;
import java.util.UUID;

public class MemberManager extends Manager<UUID, Member> {

    public Optional<Member> getByName(String displayName) {
        return found(m -> m.getDisplayName().equalsIgnoreCase(displayName));
    }
}
