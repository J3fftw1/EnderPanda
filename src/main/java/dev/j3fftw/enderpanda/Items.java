package dev.j3fftw.enderpanda;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {

    // Category
    public static final Category ENDER_PANDA_CATEGORY = new Category(
        new NamespacedKey(EnderPanda.getInstance(), "enderpanda"),
        new CustomItem(SkullItem.fromHash(
            "d188c980aacfa94cf33088512b1b9517ba826b154d4cafc262aff6977be8a"), "&8Panda")
    );

    public static final SlimefunItemStack PANDA_FRAGMENT = new SlimefunItemStack(
        "PANDA_FRAGMENT",
        Material.PRISMARINE_SHARD,
        "&5Panda Fragment",
        "",
        "&8A sad fragment from",
        "&8killing a Panda in the end",
        "&8Can be used in many ways"
    );

    public static final SlimefunItemStack PANDA_HELMET = new SlimefunItemStack(
        "PANDA_HELMET",
        Material.DIAMOND_HELMET,
        "&5Panda Helmet",
        "",
        "&8Ability to look at Endermen"
    );

    public static final SlimefunItemStack PANDA_CHESTPLATE = new SlimefunItemStack(
        "PANDA_CHESTPLATE",
        Material.DIAMOND_CHESTPLATE,
        "&5Panda Chestplate"
    );

    public static final SlimefunItemStack PANDA_LEGGINGS = new SlimefunItemStack(
        "PANDA_LEGGINGS",
        Material.DIAMOND_LEGGINGS,
        "&5Panda Leggings"
    );

    public static final SlimefunItemStack PANDA_BOOTS = new SlimefunItemStack(
        "PANDA_BOOTS",
        Material.DIAMOND_BOOTS,
        "&5Panda Boots"
    );

    public static final SlimefunItemStack SHULKER_HELMET = new SlimefunItemStack(
        "SHULKER_HELMET",
        Material.IRON_HELMET,
        "&5Shulker Helmet",
        "",
        "&8Immune for Shulker bullets"
    );

    public static final SlimefunItemStack ENDER_REPLACER = new SlimefunItemStack(
        "ENDER_REPLACER",
        new CustomItem(SkullItem.fromHash("e5e8cc99bb42dda2aafbff457756776b28c8e34ee245cc553d2694e6b04b72"),
            "Ender Replacer"),
        "&5Ender Replacer",
        "",
        "&8Replaces Endermen",
        "&8To Pandas"
    );

    public static final SlimefunItemStack SPECIAL_BAMBOO = new SlimefunItemStack(
        "SPECIAL_BAMBOO",
        Material.BAMBOO,
        "&5Special Bamboo",
        "",
        "&8Needed to",
        "&8Replace Endermen"
    );

    public static final SlimefunItemStack ENDER_GENERATOR = new SlimefunItemStack(
        "ENDER_GENERATOR",
        new CustomItem(SkullItem.fromHash("38be8abd66d09a58ce12d377544d726d25cad7e979e8c2481866be94d3b32f"),
            "Ender Gen"),
        "&5Ender Generator",
        "",
        "&8Generates power",
        "&8from enderpearls"
    );

    private Items() {}
}
