package dev.j3fftw.enderpanda;

import org.bukkit.Bukkit;
import org.bukkit.World;

import javax.annotation.Nonnull;

public final class Utils {

    private Utils() {}

    public static boolean isEnd(@Nonnull final World world) {
        return world.getUID().equals(Bukkit.getWorlds().get(!Bukkit.getAllowNether() ? 1 : 2).getUID());
    }

}
