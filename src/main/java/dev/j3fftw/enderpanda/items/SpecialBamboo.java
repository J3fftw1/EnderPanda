package dev.j3fftw.enderpanda.items;

import dev.j3fftw.enderpanda.Items;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SimpleSlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemUseHandler;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SpecialBamboo extends SimpleSlimefunItem<ItemUseHandler> {

    private static final ItemStack bamboo = new ItemStack(Material.BAMBOO);
    private static final ItemStack epearl = new ItemStack(Material.ENDER_PEARL);

    public SpecialBamboo() {
        super(Items.ENDER_PANDA_CATEGORY, Items.SPECIAL_BAMBOO, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            bamboo, bamboo, bamboo,
            bamboo, epearl, bamboo,
            bamboo, bamboo, bamboo
        });
    }


    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }
}


