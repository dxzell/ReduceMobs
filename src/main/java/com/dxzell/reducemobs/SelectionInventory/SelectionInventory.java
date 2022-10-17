package com.dxzell.reducemobs.SelectionInventory;

import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SelectionInventory {

    private ReduceMobs main;

    private Inventory selectionInv = Bukkit.createInventory(null, 9, ChatColor.WHITE + "Pick Mob Type " + ChatColor.BLACK + ">>");

    public SelectionInventory(ReduceMobs main)
    {
        this.main = main;
        setSelectionInv();
    }

    public void setSelectionInv()
    {
        for(int i = 0; i < 9; i++)
        {
            selectionInv.setItem(i, main.buildItemStack(Material.GRAY_STAINED_GLASS_PANE, " ", " ", false));
        }
        selectionInv.setItem(3, main.buildItemStack(Material.REDSTONE, ChatColor.DARK_RED + "Hostile Mobs", ChatColor.GRAY + "These mobs will attack you°" + ChatColor.GRAY + "when they see you.°°" + ChatColor.YELLOW + "[Click to pick]", true));
        selectionInv.setItem(4, main.buildItemStack(Material.IRON_INGOT, ChatColor.WHITE + "Passive Mobs", ChatColor.GRAY + "These mobs will not harm you.°" + ChatColor.GRAY + "Players benefit from them.°°" + ChatColor.YELLOW + "[Click to pick]", true));
        selectionInv.setItem(5, main.buildItemStack(Material.DIAMOND, ChatColor.AQUA + "Neutral Mobs", ChatColor.GRAY + "These mobs will only attack you°" + ChatColor.GRAY + "after getting provoked.°°" + ChatColor.YELLOW + "[Click to pick]", true));
    }
    public void openSelectionInv(Player player)
    {
        player.openInventory(selectionInv);
    }

    public Inventory getInv()
    {
        return selectionInv;
    }


}
