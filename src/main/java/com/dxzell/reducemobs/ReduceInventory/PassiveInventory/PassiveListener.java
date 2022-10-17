package com.dxzell.reducemobs.ReduceInventory.PassiveInventory;

import com.dxzell.reducemobs.ReduceInventory.ReduceInventory;
import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PassiveListener implements Listener {

    private ReduceMobs main;

    public PassiveListener(ReduceMobs main)
    {
        this.main = main;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals(ChatColor.WHITE + "Adjust Passive Mobs " + ChatColor.BLACK + ">>")) {
            Player player = (Player) e.getWhoClicked();
            e.setCancelled(true);
            if (e.getCurrentItem() == null || !e.getCurrentItem().hasItemMeta() || !e.getCurrentItem().getItemMeta().hasDisplayName()) {
                return;
            }
            if(e.getCurrentItem().getType().equals(Material.ENDERMAN_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.PIGLIN_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.SPIDER_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.CAVE_SPIDER_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.BEE_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.WOLF_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.LLAMA_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.TRADER_LLAMA_SPAWN_EGG))
            {
                ReduceInventory.setReduceInv(e.getCurrentItem(), e.getCurrentItem().getItemMeta().getDisplayName(), player);
            }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Return"))
            {
                main.getSelectionInv().openSelectionInv(player);
            }
        }
    }
}
