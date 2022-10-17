package com.dxzell.reducemobs.ReduceInventory.NeutralInventory;

import com.dxzell.reducemobs.ReduceInventory.ReduceInventory;
import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class NeutralListener implements Listener {

    private ReduceMobs main;

    public NeutralListener(ReduceMobs main)
    {
        this.main = main;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals(ChatColor.AQUA + "Adjust Neutral Mobs " + ChatColor.BLUE + ">>")) {
            e.setCancelled(true);
            Player player = (Player) e.getWhoClicked();
            if (e.getCurrentItem() == null || !e.getCurrentItem().hasItemMeta() || !e.getCurrentItem().getItemMeta().hasDisplayName()) {
                return;
            }
            if(e.getCurrentItem().getType().equals(Material.CHICKEN_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.COW_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.MOOSHROOM_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.PIG_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.SHEEP_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.SQUID_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.VILLAGER_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.WANDERING_TRADER_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.BAT_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.HORSE_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.STRIDER_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.FOX_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.RABBIT_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.PARROT_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.COD_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.SALMON_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.PUFFERFISH_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.TROPICAL_FISH_SPAWN_EGG))
            {
                ReduceInventory.setReduceInv(e.getCurrentItem(), e.getCurrentItem().getItemMeta().getDisplayName(), player);
            }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Return"))
            {
                main.getSelectionInv().openSelectionInv(player);
            }
        }
    }
}
