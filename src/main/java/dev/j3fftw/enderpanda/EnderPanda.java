package dev.j3fftw.enderpanda;

import dev.j3fftw.enderpanda.armor.PandaBoots;
import dev.j3fftw.enderpanda.armor.PandaChestplate;
import dev.j3fftw.enderpanda.armor.PandaHelmet;
import dev.j3fftw.enderpanda.armor.PandaLeggings;
import dev.j3fftw.enderpanda.armor.ShulkerHelmet;
import dev.j3fftw.enderpanda.items.PandaFragment;
import dev.j3fftw.enderpanda.machines.EnderReplacer;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.event.Listener;
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

        // Armor
        new PandaHelmet().register(this);
        new PandaChestplate().register(this);
        new PandaLeggings().register(this);
        new PandaBoots().register(this);
        new ShulkerHelmet().register(this);

        // Machine
        new EnderReplacer().register(this);

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
