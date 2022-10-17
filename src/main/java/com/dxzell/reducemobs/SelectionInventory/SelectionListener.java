package com.dxzell.reducemobs.SelectionInventory;

import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class SelectionListener implements Listener {

    private ReduceMobs main;

    public SelectionListener(ReduceMobs main)
    {
        this.main = main;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e)
    {
        if(e.getView().getTitle().equals(ChatColor.WHITE + "Pick Mob Type " + ChatColor.BLACK + ">>"))
        {
            Player player = (Player) e.getWhoClicked();
            e.setCancelled(true);
            if(e.getCurrentItem() == null || !e.getCurrentItem().hasItemMeta() || !e.getCurrentItem().getItemMeta().hasDisplayName())
            {
                return;
            }

            if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "Hostile Mobs"))
            {
                main.getHostileInv().openHostileInv(player);
                main.putUsage(player, "hostile");
            }else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Passive Mobs"))
            {
                main.getPassiveInv().openPassiveInv(player);
                main.putUsage(player, "passive");
            }else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Neutral Mobs"))
            {
                main.getNeutralInv().openNeutralInv(player);
                main.putUsage(player, "neutral");
            }

        }
    }

}
