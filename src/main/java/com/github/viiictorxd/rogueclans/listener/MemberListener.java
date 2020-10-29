package com.github.viiictorxd.rogueclans.listener;

import com.github.viiictorxd.rogueclans.RogueExtender;
import com.github.viiictorxd.rogueclans.entity.member.Member;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class MemberListener extends RogueExtender implements Listener {

    @EventHandler
    private void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if (event.getEntity().getType() != EntityType.PLAYER
                || event.getDamager().getType() != EntityType.PLAYER)
            return;


        event.setCancelled(!memberManager.canDamage(
                (Player) event.getDamager(),
                (Player) event.getEntity()
        ));
    }

    @EventHandler
    private void onEntityDeath(PlayerDeathEvent event) {
        if (event.getEntity().getKiller() != null) {
            Member member = memberManager.get(event.getEntity().getUniqueId());

            memberManager.kill(
                    event.getEntity().getKiller(),
                    event.getEntity()
            );
        }
    }
}