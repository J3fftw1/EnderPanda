package dev.j3fftw.enderpanda.armor;

import dev.j3fftw.enderpanda.Items;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class ShulkerHelmet extends SlimefunArmorPiece {

    private static final ItemStack shulker = new ItemStack(Material.SHULKER_SHELL);

    public ShulkerHelmet() {
        super(Items.ENDER_PANDA_CATEGORY, Items.SHULKER_HELMET, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                shulker, shulker, shulker,
                shulker, null, shulker,
                null, null, null
            }, new PotionEffect[0]
        );
        final ItemStack is = Items.SHULKER_HELMET;
        is.addEnchantment(Enchantment.OXYGEN, 1);
        is.addEnchantment(Enchantment.DURABILITY, 3);
        is.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
    }

}
