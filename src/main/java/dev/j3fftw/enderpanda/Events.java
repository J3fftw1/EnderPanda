package dev.j3fftw.enderpanda;

import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class Events implements Listener {

    public void onPandaDeath(final EntityDeathEvent e) {
        if (e.getEntityType() == EntityType.PANDA && Utils.isEnd(e.getEntity().getWorld())){
            e.getDrops().add(Items.PANDA_FRAGMENT);
        }
    }

}
