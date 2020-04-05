package dev.j3fftw.enderpanda;

import dev.j3fftw.enderpanda.armor.PandaHelmet;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityTargetEvent;

public class Events implements Listener {

    @EventHandler
    public void onPandaDeath(final EntityDeathEvent e) {
        if (e.getEntityType() == EntityType.PANDA && Utils.isEnd(e.getEntity().getWorld())) {
            e.getDrops().add(Items.PANDA_FRAGMENT);
        }
    }

    @EventHandler
    public void onEndermanLook(final EntityTargetEvent e) {
        if (e.getEntityType() == EntityType.ENDERMAN
            && e.getTarget() instanceof Player
            && SlimefunItem.getByItem(((Player) e.getTarget()).getInventory().getHelmet()) instanceof PandaHelmet
        ) {
            e.setCancelled(true);
        }
    }

}
