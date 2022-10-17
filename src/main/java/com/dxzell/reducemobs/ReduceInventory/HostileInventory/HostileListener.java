package com.dxzell.reducemobs.ReduceInventory.HostileInventory;

import com.dxzell.reducemobs.ReduceInventory.ReduceInventory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class HostileListener implements Listener {

    private HostileInventory hostileInventory;

    public HostileListener(HostileInventory hostileInventory)
    {
        this.hostileInventory = hostileInventory;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals(ChatColor.RED + "Adjust Hostile Mobs " + ChatColor.DARK_RED + ">>")) {
            Player player = (Player) e.getWhoClicked();
            e.setCancelled(true);
            if (e.getCurrentItem() == null || !e.getCurrentItem().hasItemMeta() || !e.getCurrentItem().getItemMeta().hasDisplayName()) {
                return;
            }
            if(e.getCurrentItem().getType().equals(Material.BLAZE_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.CREEPER_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.GHAST_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.MAGMA_CUBE_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.SILVERFISH_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.SKELETON_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.SLIME_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.ZOMBIE_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.ZOMBIE_VILLAGER_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.DROWNED_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.WITHER_SKELETON_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.WITCH_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.VINDICATOR_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.EVOKER_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.PILLAGER_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.RAVAGER_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.VEX_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.PIGLIN_BRUTE_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.HOGLIN_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.ZOGLIN_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.ENDERMITE_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.GUARDIAN_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.SHULKER_SPAWN_EGG) || e.getCurrentItem().getType().equals(Material.HUSK_SPAWN_EGG) ||
                    e.getCurrentItem().getType().equals(Material.STRAY_SPAWN_EGG))
            {
                ReduceInventory.setReduceInv(e.getCurrentItem(), e.getCurrentItem().getItemMeta().getDisplayName(), player);
            }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "Return"))
            {
               hostileInventory.getMain().getSelectionInv().openSelectionInv(player);
            }

        }
    }
}
