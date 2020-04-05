package dev.j3fftw.enderpanda;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {

    // Category
    public static final Category ENDER_PANDA_CATEGORY = new Category(
        new NamespacedKey(EnderPanda.getInstance(), "enderpanda"),
        new CustomItem(Material.PLAYER_HEAD, "&8*lEnderPanda")
    );

    public static final SlimefunItemStack PANDA_FRAGMENT = new SlimefunItemStack(
        "PANDA_FRAGMENT",
        Material.PRISMARINE_SHARD,
        "&5Panda Fragment",
        "&7A sad fragment from", "killing an EnderPanda",
        "Can be used in many ways"
    );

    public static final SlimefunItemStack PANDA_HELMET = new SlimefunItemStack(
        "PANDA_HELMET",
        Material.DIAMOND_HELMET,
        "Panda helmet"
    );

    private Items() {}
}
