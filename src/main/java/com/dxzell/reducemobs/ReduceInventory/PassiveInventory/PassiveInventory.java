package com.dxzell.reducemobs.ReduceInventory.PassiveInventory;

import com.dxzell.reducemobs.Config;
import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PassiveInventory {
    private ReduceMobs main;

    private Inventory neutralInv = Bukkit.createInventory(null, 36, ChatColor.WHITE + "Adjust Passive Mobs " + ChatColor.BLACK + ">>");

    public PassiveInventory(ReduceMobs main)
    {
        this.main = main;
        setPassiveInv();
    }

    public void setPassiveInv()
    {
        for(int i = 0; i < 36; i++)
        {
            neutralInv.setItem(i, main.buildItemStack(Material.GRAY_STAINED_GLASS_PANE, " ", " ", false));
        }
        neutralInv.setItem(10, main.buildItemStack(Material.ENDERMAN_SPAWN_EGG, ChatColor.DARK_PURPLE + "Enderman", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getEnderman() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(11, main.buildItemStack(Material.PIGLIN_SPAWN_EGG, ChatColor.RED + "Piglin", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getPiglin() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(12, main.buildItemStack(Material.SPIDER_SPAWN_EGG, ChatColor.BLACK + "Spider", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getSpider() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(13, main.buildItemStack(Material.CAVE_SPIDER_SPAWN_EGG, ChatColor.DARK_PURPLE + "Cave " + ChatColor.BLACK + "Spider", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getCaveSpider() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(14, main.buildItemStack(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG, ChatColor.GREEN + "Zombified Piglin", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getZombifiedPiglin() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(15, main.buildItemStack(Material.BEE_SPAWN_EGG, ChatColor.YELLOW + "Bee", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getBee() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(16, main.buildItemStack(Material.WOLF_SPAWN_EGG, ChatColor.GRAY + "Wolf", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getWolf() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(19, main.buildItemStack(Material.LLAMA_SPAWN_EGG, ChatColor.GOLD + "LLama", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getLlama() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(20, main.buildItemStack(Material.TRADER_LLAMA_SPAWN_EGG, ChatColor.RED + "Trader " + ChatColor.GOLD + "Llama", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getTraderLlama() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));

        neutralInv.setItem(35, main.buildItemStack(Material.EMERALD_BLOCK, ChatColor.GREEN + "Return", " ", true));

    }


    public void openPassiveInv(Player player)
    {
        setPassiveInv();
     player.openInventory(neutralInv);
    }

    public Inventory getInv()
    {
        return neutralInv;
    }
}
