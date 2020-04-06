package dev.j3fftw.enderpanda.armor;

import dev.j3fftw.enderpanda.Items;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class PandaLeggings extends SlimefunArmorPiece {

    public PandaLeggings() {
        super(Items.ENDER_PANDA_CATEGORY, Items.PANDA_LEGGINGS, RecipeType.ANCIENT_ALTAR, new ItemStack[] {
                Items.PANDA_FRAGMENT, Items.PANDA_FRAGMENT, Items.PANDA_FRAGMENT,
                Items.PANDA_FRAGMENT, null, Items.PANDA_FRAGMENT,
                Items.PANDA_FRAGMENT, null, Items.PANDA_FRAGMENT
            }, new PotionEffect[0]
        );
    }
}
