package dev.j3fftw.enderpanda;

import dev.j3fftw.enderpanda.items.PandaFragment;
import dev.j3fftw.enderpanda.items.PandaHelmet;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.plugin.java.JavaPlugin;

public class EnderPanda extends JavaPlugin implements SlimefunAddon {

    private static EnderPanda instance;

    public static EnderPanda getInstance() {
        return instance;
    }

    public void onEnable() {
        instance = this;

        // Category
        Items.ENDER_PANDA_CATEGORY.register();

        // Items
        new PandaFragment().register(this);
        new PandaHelmet().register(this);

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
