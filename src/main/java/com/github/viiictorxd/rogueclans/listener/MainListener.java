package com.github.viiictorxd.rogueclans.listener;

import com.github.viiictorxd.rogueclans.RogueClans;
import com.github.viiictorxd.rogueclans.entity.member.Member;
import com.github.viiictorxd.rogueclans.manager.base.MemberManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Optional;

public class MainListener implements Listener {

    private final MemberManager memberManager;

    public MainListener(RogueClans rogueClans) {
        this.memberManager = rogueClans.memberManager;
    }

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        Optional<Member> optionalMember = memberManager.found(
                m -> m.getUniqueId().equals(player.getUniqueId())
        );

        if (optionalMember.isPresent())
            return;

        memberManager.put(player.getUniqueId(), new Member(
                player.getUniqueId(), player.getName()
        ));
    }
}
