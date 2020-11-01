package com.github.viiictorxd.rogueclans.command.argument;

import com.github.viiictorxd.rogueclans.RogueClans;
import com.github.viiictorxd.rogueclans.RogueConstants;
import com.github.viiictorxd.rogueclans.RogueMessages;
import com.github.viiictorxd.rogueclans.entity.member.Member;
import com.github.viiictorxd.rogueclans.inventory.ClanConfirmInventory;
import com.github.viiictorxd.rogueclans.manager.base.ClanManager;
import com.github.viiictorxd.rogueclans.manager.base.MemberManager;
import me.saiintbrisson.minecraft.command.annotation.Command;
import me.saiintbrisson.minecraft.command.command.Context;
import me.saiintbrisson.minecraft.command.target.CommandTarget;
import org.bukkit.entity.Player;

public class ClanArgumentLeave {

    private final RogueMessages rogueMessages;
    private final RogueConstants rogueConstants;

    private final ClanManager clanManager;
    private final MemberManager memberManager;

    public ClanArgumentLeave(RogueClans rogueClans) {
        this.rogueMessages = null;
        this.rogueConstants = null;

        this.clanManager = null;
        this.memberManager = null;
    }

    @Command(
            name = "clan.leave",
            aliases = { "sair", "abandonar" },

            permission = "rogueclans.command.leave",

            target = CommandTarget.PLAYER
    )
    public void onArgument(Context<Player> context) {
        Member member = memberManager.get(context.getSender().getUniqueId());
        if (!member.hasClan()) {
            context.sendMessage(rogueMessages.getMessage("member_does_not_has_clan"));
            return;
        }

        if (member.getRole().isNagatoWhenSpeakingAboutAkatsuki()) {
            context.sendMessage(rogueMessages.getMessage("you_are_leader"));
            return;
        }

        new ClanConfirmInventory()
                .open(context.getSender());
    }
}
