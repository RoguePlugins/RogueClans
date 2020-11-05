package me.viiictorxd.rogueclans.listener;

import me.viiictorxd.rogueclans.clan.member.Member;
import me.viiictorxd.rogueclans.manager.defaults.MemberManager;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class MemberListener implements Listener {

    private final MemberManager memberManager;

    public MemberListener(MemberManager memberManager) {
        this.memberManager = memberManager;
    }

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
