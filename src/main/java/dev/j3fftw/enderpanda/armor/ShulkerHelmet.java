package dev.j3fftw.enderpanda.armor;

import dev.j3fftw.enderpanda.Items;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class ShulkerHelmet extends SlimefunArmorPiece {

    public ShulkerHelmet() {
        super(Items.ENDER_PANDA_CATEGORY, Items.SHULKER_HELMET, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.SHULKER_SHELL), new ItemStack(Material.SHULKER_SHELL), new ItemStack(Material.SHULKER_SHELL),
            Material.SHULKER_SHELL, null, Material.SHULKER_SHELL,
            null, null, null
        }, new PotionEffect[0]
        );
    }

}
