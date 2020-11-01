package com.github.viiictorxd.rogueclans.command.argument;

import com.github.viiictorxd.rogueclans.RogueClans;
import com.github.viiictorxd.rogueclans.RogueConstants;
import com.github.viiictorxd.rogueclans.RogueMessages;
import com.github.viiictorxd.rogueclans.api.event.clan.ClanCreateEvent;
import com.github.viiictorxd.rogueclans.api.event.member.MemberJoinClanEvent;
import com.github.viiictorxd.rogueclans.api.event.member.MemberJoinRoleEvent;
import com.github.viiictorxd.rogueclans.entity.clan.Base;
import com.github.viiictorxd.rogueclans.entity.clan.Clan;
import com.github.viiictorxd.rogueclans.entity.clan.Counter;
import com.github.viiictorxd.rogueclans.entity.clan.Level;
import com.github.viiictorxd.rogueclans.entity.member.Member;
import com.github.viiictorxd.rogueclans.manager.base.ClanManager;
import com.github.viiictorxd.rogueclans.manager.base.MemberManager;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import me.saiintbrisson.minecraft.command.annotation.Command;
import me.saiintbrisson.minecraft.command.command.Context;
import me.saiintbrisson.minecraft.command.target.CommandTarget;
import org.bukkit.entity.Player;

import java.util.Optional;

public class ClanArgumentCreate {

    private final RogueMessages rogueMessages;
    private final RogueConstants rogueConstants;

    private final ClanManager clanManager;
    private final MemberManager memberManager;

    public ClanArgumentCreate(RogueClans rogueClans) {
        this.rogueMessages = null;
        this.rogueConstants = null;

        this.clanManager = null;
        this.memberManager = null;
    }

    @Command(
            name = "clan.create",
            aliases = { "criar" },

            permission = "rogueclans.command.create",

            target = CommandTarget.PLAYER
    )
    public void onArgument(Context<Player> context) {
        Member member = memberManager.get(context.getSender().getUniqueId());
        if (member.hasClan()) {
            context.sendMessage(rogueMessages.getMessage("member_has_clan"));
            return;
        }

        if (context.getArgs().length < 3) {
            context.sendMessage(rogueMessages.getMessage("clan_command_create_usage"));
            return;
        }

        String tag = context.getArg(0);
        String colorTag = tag;

        if (tag.length() < rogueConstants.getMinTagLength()) {
            context.sendMessage(rogueMessages.getMessage("clan_tag_length_too_small", rogueConstants.getMinTagLength()));
            return;
        }

        if (tag.length() > rogueConstants.getMaxTagLength()) {
            context.sendMessage(rogueMessages.getMessage("clan_tag_length_too_big", rogueConstants.getMaxTagLength()));
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 1; i < context.getArgs().length; i++) {
            nameBuilder.append(context.getArg(i))
                    .append(" ");
        }

        String name = nameBuilder.toString().trim();
        if (name.length() < rogueConstants.getMinNameLength()) {
            context.sendMessage(rogueMessages.getMessage("clan_name_length_too_small", rogueConstants.getMinNameLength()));
            return;
        }

        if (name.length() > rogueConstants.getMaxNameLength()) {
            context.sendMessage(rogueMessages.getMessage("clan_name_length_too_big", rogueConstants.getMaxNameLength()));
            return;
        }

        Optional<Clan> optionalClan = clanManager.found(c -> c.getTag().equalsIgnoreCase(tag));
        if (optionalClan.isPresent()) {
            context.sendMessage(rogueMessages.getMessage("clan_that_tag_already_exists"));
            return;
        }

        optionalClan = clanManager.found(c -> c.getName().equalsIgnoreCase(name));
        if (optionalClan.isPresent()) {
            context.sendMessage(rogueMessages.getMessage("clan_that_name_alredy_exists"));
            return;
        }

        Clan clan = new Clan.Builder()
                .setTag(tag)
                .setColoredTag(colorTag)
                .setName(name)
                .setRoles(rogueConstants.getDefaultRoles())
                .setMembers(Sets.newHashSet(member))
                .setNotifies(Sets.newHashSet())
                .setRelations(Maps.newHashMap())
                .setInvites(Maps.newHashMap())
                .setBase(null)
                .setLeague(null /* get first league */)
                .setLevel(new Level())
                .setCounter(new Counter())
                .setInventory(null)
                .setFounded(System.currentTimeMillis())
                .asClan();

        new ClanCreateEvent(clan)
                .callEvent();

        member.setClan(clan);

        new MemberJoinClanEvent(member, clan)
                .callEvent();

        new MemberJoinRoleEvent(member, null, clan.getMainRole())
                .callEvent();

        context.sendMessage(rogueMessages.getMessage("clan_created", clan.getTag(), clan.getName()));
    }
}
