package com.github.viiictorxd.rogueclans.inventory;

import me.saiintbrisson.minecraft.View;
import me.saiintbrisson.minecraft.utils.ItemBuilder;
import org.bukkit.Material;

public class ClanConfirmInventory extends View {

    public ClanConfirmInventory() {
        super(6, "Deseja abandonar o clã?");

        slot(2, 3).withItem(new ItemBuilder()
                .material(Material.WOOL)
                .durability(14)
                .name("§aConfirmar")
                .build()
        ).cancelOnClick();

        slot(2, 6).withItem(new ItemBuilder()
                .material(Material.WOOL)
                .durability(4)
                .name("§cRejeitar")
                .build()
        ).cancelOnClick();
    }
}
