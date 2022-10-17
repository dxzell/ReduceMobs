package com.dxzell.reducemobs.ReduceInventory.HostileInventory;

import com.dxzell.reducemobs.Config;
import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class HostileInventory {
    private ReduceMobs main;

    private Inventory hostileInv = Bukkit.createInventory(null, 54, ChatColor.RED + "Adjust Hostile Mobs " + ChatColor.DARK_RED + ">>");
    public HostileInventory(ReduceMobs main)
    {
        this.main = main;
        setHostileInv();
    }

    public void setHostileInv()
    {
        for(int i = 0; i < 54; i++)
        {
            hostileInv.setItem(i, main.buildItemStack(Material.GRAY_STAINED_GLASS_PANE, " ", " ", false));
        }
        hostileInv.setItem(10, main.buildItemStack(Material.BLAZE_SPAWN_EGG, ChatColor.GOLD + "Blaze", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getBlaze() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(11, main.buildItemStack(Material.CREEPER_SPAWN_EGG, ChatColor.GREEN + "Creeper", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getCreeper() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(12, main.buildItemStack(Material.GHAST_SPAWN_EGG, ChatColor.WHITE + "Ghast", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getGhast() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(13, main.buildItemStack(Material.MAGMA_CUBE_SPAWN_EGG, ChatColor.GOLD + "Magma " + ChatColor.YELLOW + "Cube", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getMagmaCube() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(14, main.buildItemStack(Material.STRAY_SPAWN_EGG, ChatColor.BLUE + "Stray", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getStray() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(15, main.buildItemStack(Material.SILVERFISH_SPAWN_EGG, ChatColor.GRAY + "Silverfish", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getSilverfish() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(16, main.buildItemStack(Material.SLIME_SPAWN_EGG, ChatColor.GREEN + "Slime", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getSlime() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(19, main.buildItemStack(Material.SKELETON_SPAWN_EGG, ChatColor.GRAY + "Skeleton", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getSkeleton() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(20, main.buildItemStack(Material.ZOMBIE_VILLAGER_SPAWN_EGG, ChatColor.GREEN + "Zombie " + ChatColor.DARK_GREEN + "Villager", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getZombieVillager() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(21, main.buildItemStack(Material.ZOMBIE_SPAWN_EGG, ChatColor.GREEN + "Zombie", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getZombie() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(22, main.buildItemStack(Material.DROWNED_SPAWN_EGG, ChatColor.BLUE + "Drowned", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getDrowned() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(23, main.buildItemStack(Material.WITHER_SKELETON_SPAWN_EGG, ChatColor.BLACK + "Wither " + ChatColor.GRAY + "Skeleton", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getWitherSkeleton() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(24, main.buildItemStack(Material.WITCH_SPAWN_EGG, ChatColor.DARK_GREEN + "Witch", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getWitch() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(25, main.buildItemStack(Material.VINDICATOR_SPAWN_EGG, ChatColor.WHITE + "Vindicator", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getVindicator() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(28, main.buildItemStack(Material.EVOKER_SPAWN_EGG, ChatColor.GRAY + "Evoker", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getEvoker() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(29, main.buildItemStack(Material.PILLAGER_SPAWN_EGG, ChatColor.RED + "Pillager", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getPillager() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(30, main.buildItemStack(Material.RAVAGER_SPAWN_EGG, ChatColor.DARK_AQUA + "Ravager", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getRavager() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(31, main.buildItemStack(Material.VEX_SPAWN_EGG, ChatColor.AQUA + "Vex", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getVex() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(32, main.buildItemStack(Material.PIGLIN_BRUTE_SPAWN_EGG, ChatColor.GOLD + "Piglin " + ChatColor.YELLOW + "Brute", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getPiglinBrute() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(33, main.buildItemStack(Material.HOGLIN_SPAWN_EGG, ChatColor.RED + "Hoglin", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getHoglin() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(34, main.buildItemStack(Material.ZOGLIN_SPAWN_EGG, ChatColor.GREEN + "Zoglin", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getZoglin() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(38, main.buildItemStack(Material.ENDERMITE_SPAWN_EGG, ChatColor.LIGHT_PURPLE + "Endermite", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getEndermite() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(39, main.buildItemStack(Material.GUARDIAN_SPAWN_EGG, ChatColor.GOLD + "Guardian", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getGuardian() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(40, main.buildItemStack(Material.SHULKER_SPAWN_EGG, ChatColor.DARK_PURPLE + "Shulker", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getShulker() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));
        hostileInv.setItem(41, main.buildItemStack(Material.HUSK_SPAWN_EGG, ChatColor.YELLOW + "Husk", ChatColor.GRAY + "Current spawnrate: " + ChatColor.GOLD + Config.getHusk() + ChatColor.GRAY + "%°°" + ChatColor.YELLOW + "[Click to adjust]", true));

        hostileInv.setItem(53, main.buildItemStack(Material.EMERALD_BLOCK, ChatColor.GREEN + "Return", " ", true));


    }

    public void openHostileInv(Player player)
    {
        setHostileInv();
       player.openInventory(hostileInv);
    }

    public Inventory getInv()
    {
        return hostileInv;
    }

    public ReduceMobs getMain()
    {
        return main;
    }
}
