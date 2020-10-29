package com.github.viiictorxd.rogueclans.manager.base;

import com.github.viiictorxd.rogueclans.manager.Manager;
import com.github.viiictorxd.rogueclans.entity.member.Member;
import org.bukkit.entity.Player;

import java.util.Optional;
import java.util.UUID;

public class MemberManager extends Manager<UUID, Member> {

    public Optional<Member> getByName(String displayName) {
        return found(m -> m.getDisplayName().equalsIgnoreCase(displayName));
    }

    public boolean canDamage(Player player, Player entity) {
        Member member = get(player.getUniqueId());
        Member target = get(entity.getUniqueId());

        return member.hasClan()
                && target.hasClan()
                && target.getClan().equals(member.getClan());
    }

    public void kill(Player killer, Player victim) {
        Member member = get(killer.getUniqueId());
        member.getCombat().increaseKill();

        Member target = get(victim.getUniqueId());
        target.getCombat().increaseDeath();
    }
}
