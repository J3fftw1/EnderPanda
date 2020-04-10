package dev.j3fftw.enderpanda;

import dev.j3fftw.enderpanda.armor.PandaBoots;
import dev.j3fftw.enderpanda.armor.PandaChestplate;
import dev.j3fftw.enderpanda.armor.PandaHelmet;
import dev.j3fftw.enderpanda.armor.PandaLeggings;
import dev.j3fftw.enderpanda.armor.ShulkerHelmet;
import dev.j3fftw.enderpanda.items.PandaFragment;
import dev.j3fftw.enderpanda.items.SpecialBamboo;
import dev.j3fftw.enderpanda.machines.EnderGenerator;
import dev.j3fftw.enderpanda.machines.EnderReplacer;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class EnderPanda extends JavaPlugin implements SlimefunAddon {

    private static EnderPanda instance;

    public static EnderPanda getInstance() {
        return instance;
    }

    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new Events(), this);

        // Category
        Items.ENDER_PANDA_CATEGORY.register();

        // Items
        new PandaFragment().register(this);
        new SpecialBamboo().register(this);

        // Armor
        new PandaHelmet().register(this);
        new PandaChestplate().register(this);
        new PandaLeggings().register(this);
        new PandaBoots().register(this);
        new ShulkerHelmet().register(this);

        // Machine
        new EnderReplacer().register(this);
        new EnderGenerator().register(this);

        // Enchantments

        ItemMeta PandaHelmet = Items.PANDA_HELMET.getItemMeta();
        PandaHelmet.addEnchant(Enchantment.DURABILITY, 1, true);
        PandaHelmet.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        Items.PANDA_HELMET.setItemMeta(PandaHelmet);

        ItemMeta PandaChestplate = Items.PANDA_CHESTPLATE.getItemMeta();
        PandaChestplate.addEnchant(Enchantment.DURABILITY, 1, true);
        PandaChestplate.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        Items.PANDA_CHESTPLATE.setItemMeta(PandaChestplate);

        ItemMeta PandaLeggings = Items.PANDA_LEGGINGS.getItemMeta();
        PandaLeggings.addEnchant(Enchantment.DURABILITY, 1, true);
        PandaLeggings.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        Items.PANDA_LEGGINGS.setItemMeta(PandaLeggings);

        ItemMeta PandaBoots = Items.PANDA_BOOTS.getItemMeta();
        PandaBoots.addEnchant(Enchantment.DURABILITY, 1, true);
        PandaBoots.addEnchant(Enchantment.PROTECTION_FIRE, 5, true);
        PandaBoots.addEnchant(Enchantment.PROTECTION_FALL, 8, true);
        Items.PANDA_BOOTS.setItemMeta(PandaBoots);

        ItemMeta ShulkerHelmet = Items.SHULKER_HELMET.getItemMeta();
        ShulkerHelmet.addEnchant(Enchantment.OXYGEN, 1, true);
        ShulkerHelmet.addEnchant(Enchantment.DURABILITY, 3, true);
        ShulkerHelmet.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        Items.SHULKER_HELMET.setItemMeta(ShulkerHelmet);

    }


    public void onDisable() {
        instance = null;
    }

    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public String getBugTrackerURL() {
        return "https://github.com/j3fftw/EnderPanda";
    }
}
