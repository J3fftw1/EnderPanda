package dev.j3fftw.enderpanda.items;

import dev.j3fftw.enderpanda.Items;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SimpleSlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemUseHandler;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class PandaFragment extends SimpleSlimefunItem<ItemUseHandler> {

    //todo make it show panda head
    public PandaFragment() {
        super(Items.ENDER_PANDA_CATEGORY, Items.PANDA_FRAGMENT, RecipeType.MOB_DROP, new ItemStack[] {
            null, null, null,
            null, new CustomItem(Material.PLAYER_HEAD, "&8Panda"), null,
            null, null, null
        });
    }


    @Override
    public ItemUseHandler getItemHandler() {
        return PlayerRightClickEvent::cancel;
    }
}
