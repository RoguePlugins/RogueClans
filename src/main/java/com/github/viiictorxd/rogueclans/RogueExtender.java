package com.github.viiictorxd.rogueclans;

import com.github.viiictorxd.rogueclans.manager.base.ClanManager;
import com.github.viiictorxd.rogueclans.manager.base.MemberManager;

public class RogueExtender {

    public final RogueClans rogueClans;

    public final ClanManager clanManager;
    public final MemberManager memberManager;

    public RogueExtender() {
        rogueClans = RogueClans.getInstance();

        clanManager = rogueClans.clanManager;
        memberManager = rogueClans.memberManager;
    }
}
