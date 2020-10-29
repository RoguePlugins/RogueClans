package com.github.viiictorxd.rogueclans.command;

import me.saiintbrisson.minecraft.command.annotation.Command;
import me.saiintbrisson.minecraft.command.command.Context;
import me.saiintbrisson.minecraft.command.target.CommandTarget;
import org.bukkit.entity.Player;

public class CommandClan {

    @Command(
            name = "clan",
            aliases = { "clã" },

            permission = "rogueclans.command.clan",

            target = CommandTarget.PLAYER
    )
    public void onCommand(Context<Player> context) {
        /*
          Open an inventory with Member/Clan contents
         */
    }
}
