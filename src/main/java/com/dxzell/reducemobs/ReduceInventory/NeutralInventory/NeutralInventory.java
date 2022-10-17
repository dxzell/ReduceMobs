package com.dxzell.reducemobs.ReduceInventory.NeutralInventory;

import com.dxzell.reducemobs.Config;
import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class NeutralInventory {
    private ReduceMobs main;

    private Inventory neutralInv = Bukkit.createInventory(null, 45, ChatColor.AQUA + "Adjust Neutral Mobs " + ChatColor.BLUE + ">>");
    public NeutralInventory(ReduceMobs main)
    {
        this.main = main;
        setNeutralInv();
    }

    public void setNeutralInv()
    {
        for(int i = 0; i < 45; i++)
        {
            neutralInv.setItem(i, main.buildItemStack(Material.GRAY_STAINED_GLASS_PANE, " ", " ", false));
        }
        neutralInv.setItem(10, main.buildItemStack(Material.CHICKEN_SPAWN_EGG, ChatColor.WHITE + "Chicken", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getChicken() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(11, main.buildItemStack(Material.COW_SPAWN_EGG, ChatColor.GOLD + "Cow", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getCow() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(12, main.buildItemStack(Material.MOOSHROOM_SPAWN_EGG, ChatColor.DARK_PURPLE + "Mooshroom", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getMooshroom() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(13, main.buildItemStack(Material.PIG_SPAWN_EGG, ChatColor.LIGHT_PURPLE + "Pig", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getPig() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(14, main.buildItemStack(Material.SHEEP_SPAWN_EGG, ChatColor.WHITE + "Sheep", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getSheep() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(15, main.buildItemStack(Material.SQUID_SPAWN_EGG, ChatColor.BLUE + "Squid", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getSquid() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(16, main.buildItemStack(Material.VILLAGER_SPAWN_EGG, ChatColor.GOLD + "Villager", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getVillager() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(19, main.buildItemStack(Material.WANDERING_TRADER_SPAWN_EGG, ChatColor.RED + "Wandering Trader", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getWanderinTrader() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(20, main.buildItemStack(Material.BAT_SPAWN_EGG, ChatColor.DARK_PURPLE + "Bat", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getBat() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(21, main.buildItemStack(Material.HORSE_SPAWN_EGG, ChatColor.GOLD + "Horse", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getHorse() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(22, main.buildItemStack(Material.STRIDER_SPAWN_EGG, ChatColor.RED + "Strider", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getStrider() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(23, main.buildItemStack(Material.FOX_SPAWN_EGG, ChatColor.GOLD + "Fox", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getFox() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(24, main.buildItemStack(Material.PARROT_SPAWN_EGG, ChatColor.GREEN + "Parrot", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getParrot() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(25, main.buildItemStack(Material.RABBIT_SPAWN_EGG, ChatColor.GOLD + "Rabbit", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getRabbit() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(28, main.buildItemStack(Material.COD_SPAWN_EGG, ChatColor.GRAY + "Cod", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getCod() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(29, main.buildItemStack(Material.SALMON_SPAWN_EGG, ChatColor.RED + "Salmon", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getSalmon() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(30, main.buildItemStack(Material.PUFFERFISH_SPAWN_EGG, ChatColor.YELLOW + "Pufferfish", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getPufferfish() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        neutralInv.setItem(31, main.buildItemStack(Material.TROPICAL_FISH_SPAWN_EGG, ChatColor.GREEN + "Tropical Fish", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getTropicalFish() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));

        neutralInv.setItem(44, main.buildItemStack(Material.EMERALD_BLOCK, ChatColor.GREEN + "Return", " ", true));

    }

    public void openNeutralInv(Player player)
    {
        setNeutralInv();
        player.openInventory(neutralInv);
    }

    public Inventory getInv()
    {
        return neutralInv;
    }
}
