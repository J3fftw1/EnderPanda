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
        "Panda Helmet"
    );

    public static final SlimefunItemStack PANDA_CHESTPLATE = new SlimefunItemStack(
        "PANDA_CHESTPLATE",
        Material.DIAMOND_CHESTPLATE,
        "Panda Chestplate"
    );

    public static final SlimefunItemStack PANDA_LEGGINGS = new SlimefunItemStack(
        "PANDA_LEGGINGS",
        Material.DIAMOND_LEGGINGS,
        "Panda Leggings"
    );

    public static final SlimefunItemStack PANDA_BOOTS = new SlimefunItemStack(
        "PANDA_BOOTS",
        Material.DIAMOND_BOOTS,
        "Panda Boots"
    );

    public static final SlimefunItemStack SHULKER_HELMET = new SlimefunItemStack(
        "SHULKER_HELMET",
        Material.IRON_HELMET,
        "Shulker Helmet"
    );

    public static final SlimefunItemStack ENDER_REPLACER = new SlimefunItemStack(
        "ENDER_REPLACER",
        Material.BEACON,
        "Ender Replacer"
    );

    public static final SlimefunItemStack SPECIAL_BAMBOO = new SlimefunItemStack(
        "SPECIAL_BAMBOO",
        Material.BAMBOO,
        "Special Bamboo"
    );

    private Items() {}
}
