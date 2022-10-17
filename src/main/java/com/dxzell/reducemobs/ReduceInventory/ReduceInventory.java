package com.dxzell.reducemobs.ReduceInventory;

import com.dxzell.reducemobs.Config;
import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ReduceInventory {

    private static Inventory reduceInv;

    private static ReduceMobs main;

    public ReduceInventory(ReduceMobs main)
    {
        this.main = main;
    }

    public static void setReduceInv(ItemStack stack, String title, Player player)
    {
        reduceInv = Bukkit.createInventory(null, 9, ChatColor.WHITE + "Adjust " + ChatColor.WHITE + title + ChatColor.BLACK + " >>");
        for(int i = 0; i < 9; i++)
        {
            reduceInv.setItem(i, main.buildItemStack(Material.GRAY_STAINED_GLASS_PANE, " " , " ", false));
        }
        reduceInv.setItem(4, main.buildItemStack(stack.getType(), stack.getItemMeta().getDisplayName(), ChatColor.GRAY + "Current: " + ChatColor.GOLD +
                (stack.getType().equals(Material.BLAZE_SPAWN_EGG) ? Config.getBlaze() : (stack.getType().equals(Material.CREEPER_SPAWN_EGG) ? Config.getCreeper() :
                        (stack.getType().equals(Material.GHAST_SPAWN_EGG) ? Config.getGhast() : (stack.getType().equals(Material.MAGMA_CUBE_SPAWN_EGG) ? Config.getMagmaCube() : (stack.getType().equals(Material.SILVERFISH_SPAWN_EGG) ? Config.getSilverfish() :
                                (stack.getType().equals(Material.SKELETON_SPAWN_EGG) ? Config.getSkeleton() : (stack.getType().equals(Material.SLIME_SPAWN_EGG) ? Config.getSlime() : (stack.getType().equals(Material.ZOMBIE_SPAWN_EGG) ? Config.getZombie() :
                                        (stack.getType().equals(Material.ZOMBIE_VILLAGER_SPAWN_EGG) ? Config.getZombieVillager() : (stack.getType().equals(Material.DROWNED_SPAWN_EGG) ? Config.getDrowned() : (stack.getType().equals(Material.WITHER_SKELETON_SPAWN_EGG) ? Config.getWitherSkeleton() :
                                                (stack.getType().equals(Material.WITCH_SPAWN_EGG) ? Config.getWitch() : (stack.getType().equals(Material.VINDICATOR_SPAWN_EGG) ? Config.getVindicator() : (stack.getType().equals(Material.EVOKER_SPAWN_EGG) ? Config.getEvoker() :
                                                        (stack.getType().equals(Material.PILLAGER_SPAWN_EGG) ? Config.getPillager() : (stack.getType().equals(Material.RAVAGER_SPAWN_EGG) ? Config.getRavager() : (stack.getType().equals(Material.VEX_SPAWN_EGG) ? Config.getVex() :
                                                                (stack.getType().equals(Material.PIGLIN_BRUTE_SPAWN_EGG) ? Config.getPiglinBrute() : (stack.getType().equals(Material.HOGLIN_SPAWN_EGG) ? Config.getHoglin() : (stack.getType().equals(Material.ZOGLIN_SPAWN_EGG) ? Config.getZoglin() :
                                                                        (stack.getType().equals(Material.ENDERMITE_SPAWN_EGG) ? Config.getEndermite() : (stack.getType().equals(Material.GUARDIAN_SPAWN_EGG) ? Config.getGuardian() : (stack.getType().equals(Material.SHULKER_SPAWN_EGG) ? Config.getShulker() :
                                                                                (stack.getType().equals(Material.HUSK_SPAWN_EGG) ? Config.getHusk() : (stack.getType().equals(Material.STRAY_SPAWN_EGG) ? Config.getStray() : (stack.getType().equals(Material.ENDERMAN_SPAWN_EGG) ? Config.getEnderman() :
                                                                                        (stack.getType().equals(Material.PIGLIN_SPAWN_EGG) ? Config.getPiglin() : (stack.getType().equals(Material.SPIDER_SPAWN_EGG) ? Config.getSpider() : (stack.getType().equals(Material.CAVE_SPIDER_SPAWN_EGG) ? Config.getCaveSpider() :
                                                                                                (stack.getType().equals(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG) ? Config.getZombifiedPiglin() : (stack.getType().equals(Material.BEE_SPAWN_EGG) ? Config.getBee() : (stack.getType().equals(Material.WOLF_SPAWN_EGG) ? Config.getWolf() :
                                                                                                        (stack.getType().equals(Material.LLAMA_SPAWN_EGG) ? Config.getLlama() : (stack.getType().equals(Material.TRADER_LLAMA_SPAWN_EGG) ? Config.getTraderLlama() : (stack.getType().equals(Material.CHICKEN_SPAWN_EGG) ? Config.getChicken() :
                                                                                                                (stack.getType().equals(Material.COW_SPAWN_EGG) ? Config.getCow() : (stack.getType().equals(Material.MOOSHROOM_SPAWN_EGG) ? Config.getMooshroom() : (stack.getType().equals(Material.PIG_SPAWN_EGG) ? Config.getPig() :
                                                                                                                        (stack.getType().equals(Material.SHEEP_SPAWN_EGG) ? Config.getSheep() : (stack.getType().equals(Material.SQUID_SPAWN_EGG) ? Config.getSquid() : (stack.getType().equals(Material.VILLAGER_SPAWN_EGG) ? Config.getVillager() :
                                                                                                                                (stack.getType().equals(Material.WANDERING_TRADER_SPAWN_EGG) ? Config.getWanderinTrader() : (stack.getType().equals(Material.BAT_SPAWN_EGG) ? Config.getBat() : (stack.getType().equals(Material.HORSE_SPAWN_EGG) ? Config.getHorse() :
                                                                                                                                        (stack.getType().equals(Material.STRIDER_SPAWN_EGG) ? Config.getStrider() : (stack.getType().equals(Material.FOX_SPAWN_EGG) ? Config.getFox() : (stack.getType().equals(Material.RABBIT_SPAWN_EGG) ? Config.getRabbit() :
                                                                                                                                                (stack.getType().equals(Material.PARROT_SPAWN_EGG) ? Config.getParrot() : (stack.getType().equals(Material.COD_SPAWN_EGG) ? Config.getCod() : (stack.getType().equals(Material.SALMON_SPAWN_EGG) ? Config.getSalmon() :
                                                                                                                                                        (stack.getType().equals(Material.PUFFERFISH_SPAWN_EGG) ? Config.getPufferfish() : (stack.getType().equals(Material.TROPICAL_FISH_SPAWN_EGG) ? Config.getTropicalFish() : null)))))))))))))))))))))))))))))))))))))))))))))))))))) + ChatColor.GRAY + "%" + "°°" + ChatColor.YELLOW + "[Click to return]", true));
        reduceInv.setItem(2, main.buildItemStack(Material.REDSTONE_TORCH, ChatColor.RED + "-", ChatColor.GRAY + "Reduce the spawnrate by 1%.°" + ChatColor.GRAY + "Current: " + ChatColor.GOLD +
                (stack.getType().equals(Material.BLAZE_SPAWN_EGG) ? Config.getBlaze() : (stack.getType().equals(Material.CREEPER_SPAWN_EGG) ? Config.getCreeper() :
                        (stack.getType().equals(Material.GHAST_SPAWN_EGG) ? Config.getGhast() : (stack.getType().equals(Material.MAGMA_CUBE_SPAWN_EGG) ? Config.getMagmaCube() : (stack.getType().equals(Material.SILVERFISH_SPAWN_EGG) ? Config.getSilverfish() :
                                (stack.getType().equals(Material.SKELETON_SPAWN_EGG) ? Config.getSkeleton() : (stack.getType().equals(Material.SLIME_SPAWN_EGG) ? Config.getSlime() : (stack.getType().equals(Material.ZOMBIE_SPAWN_EGG) ? Config.getZombie() :
                                        (stack.getType().equals(Material.ZOMBIE_VILLAGER_SPAWN_EGG) ? Config.getZombieVillager() : (stack.getType().equals(Material.DROWNED_SPAWN_EGG) ? Config.getDrowned() : (stack.getType().equals(Material.WITHER_SKELETON_SPAWN_EGG) ? Config.getWitherSkeleton() :
                                                (stack.getType().equals(Material.WITCH_SPAWN_EGG) ? Config.getWitch() : (stack.getType().equals(Material.VINDICATOR_SPAWN_EGG) ? Config.getVindicator() : (stack.getType().equals(Material.EVOKER_SPAWN_EGG) ? Config.getEvoker() :
                                                        (stack.getType().equals(Material.PILLAGER_SPAWN_EGG) ? Config.getPillager() : (stack.getType().equals(Material.RAVAGER_SPAWN_EGG) ? Config.getRavager() : (stack.getType().equals(Material.VEX_SPAWN_EGG) ? Config.getVex() :
                                                                (stack.getType().equals(Material.PIGLIN_BRUTE_SPAWN_EGG) ? Config.getPiglinBrute() : (stack.getType().equals(Material.HOGLIN_SPAWN_EGG) ? Config.getHoglin() : (stack.getType().equals(Material.ZOGLIN_SPAWN_EGG) ? Config.getZoglin() :
                                                                        (stack.getType().equals(Material.ENDERMITE_SPAWN_EGG) ? Config.getEndermite() : (stack.getType().equals(Material.GUARDIAN_SPAWN_EGG) ? Config.getGuardian() : (stack.getType().equals(Material.SHULKER_SPAWN_EGG) ? Config.getShulker() :
                                                                                (stack.getType().equals(Material.HUSK_SPAWN_EGG) ? Config.getHusk() : (stack.getType().equals(Material.STRAY_SPAWN_EGG) ? Config.getStray() : (stack.getType().equals(Material.ENDERMAN_SPAWN_EGG) ? Config.getEnderman() :
                                                                                        (stack.getType().equals(Material.PIGLIN_SPAWN_EGG) ? Config.getPiglin() : (stack.getType().equals(Material.SPIDER_SPAWN_EGG) ? Config.getSpider() : (stack.getType().equals(Material.CAVE_SPIDER_SPAWN_EGG) ? Config.getCaveSpider() :
                                                                                                (stack.getType().equals(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG) ? Config.getZombifiedPiglin() : (stack.getType().equals(Material.BEE_SPAWN_EGG) ? Config.getBee() : (stack.getType().equals(Material.WOLF_SPAWN_EGG) ? Config.getWolf() :
                                                                                                        (stack.getType().equals(Material.LLAMA_SPAWN_EGG) ? Config.getLlama() : (stack.getType().equals(Material.TRADER_LLAMA_SPAWN_EGG) ? Config.getTraderLlama() : (stack.getType().equals(Material.CHICKEN_SPAWN_EGG) ? Config.getChicken() :
                                                                                                                (stack.getType().equals(Material.COW_SPAWN_EGG) ? Config.getCow() : (stack.getType().equals(Material.MOOSHROOM_SPAWN_EGG) ? Config.getMooshroom() : (stack.getType().equals(Material.PIG_SPAWN_EGG) ? Config.getPig() :
                                                                                                                        (stack.getType().equals(Material.SHEEP_SPAWN_EGG) ? Config.getSheep() : (stack.getType().equals(Material.SQUID_SPAWN_EGG) ? Config.getSquid() : (stack.getType().equals(Material.VILLAGER_SPAWN_EGG) ? Config.getVillager() :
                                                                                                                                (stack.getType().equals(Material.WANDERING_TRADER_SPAWN_EGG) ? Config.getWanderinTrader() : (stack.getType().equals(Material.BAT_SPAWN_EGG) ? Config.getBat() : (stack.getType().equals(Material.HORSE_SPAWN_EGG) ? Config.getHorse() :
                                                                                                                                        (stack.getType().equals(Material.STRIDER_SPAWN_EGG) ? Config.getStrider() : (stack.getType().equals(Material.FOX_SPAWN_EGG) ? Config.getFox() : (stack.getType().equals(Material.RABBIT_SPAWN_EGG) ? Config.getRabbit() :
                                                                                                                                                (stack.getType().equals(Material.PARROT_SPAWN_EGG) ? Config.getParrot() : (stack.getType().equals(Material.COD_SPAWN_EGG) ? Config.getCod() : (stack.getType().equals(Material.SALMON_SPAWN_EGG) ? Config.getSalmon() :
                                                                                                                                                        (stack.getType().equals(Material.PUFFERFISH_SPAWN_EGG) ? Config.getPufferfish() : (stack.getType().equals(Material.TROPICAL_FISH_SPAWN_EGG) ? Config.getTropicalFish() : null)))))))))))))))))))))))))))))))))))))))))))))))))))) + ChatColor.GRAY + "%"  +"°°" + ChatColor.YELLOW + "[Click to reduce]", true));
        reduceInv.setItem(6, main.buildItemStack(Material.TORCH, ChatColor.GREEN + "+", ChatColor.GRAY + "Higher the spawnrate by 1%.°" + ChatColor.GRAY + "Current: " + ChatColor.GOLD +
                (stack.getType().equals(Material.BLAZE_SPAWN_EGG) ? Config.getBlaze() : (stack.getType().equals(Material.CREEPER_SPAWN_EGG) ? Config.getCreeper() :
                        (stack.getType().equals(Material.GHAST_SPAWN_EGG) ? Config.getGhast() : (stack.getType().equals(Material.MAGMA_CUBE_SPAWN_EGG) ? Config.getMagmaCube() : (stack.getType().equals(Material.SILVERFISH_SPAWN_EGG) ? Config.getSilverfish() :
                                (stack.getType().equals(Material.SKELETON_SPAWN_EGG) ? Config.getSkeleton() : (stack.getType().equals(Material.SLIME_SPAWN_EGG) ? Config.getSlime() : (stack.getType().equals(Material.ZOMBIE_SPAWN_EGG) ? Config.getZombie() :
                                        (stack.getType().equals(Material.ZOMBIE_VILLAGER_SPAWN_EGG) ? Config.getZombieVillager() : (stack.getType().equals(Material.DROWNED_SPAWN_EGG) ? Config.getDrowned() : (stack.getType().equals(Material.WITHER_SKELETON_SPAWN_EGG) ? Config.getWitherSkeleton() :
                                                (stack.getType().equals(Material.WITCH_SPAWN_EGG) ? Config.getWitch() : (stack.getType().equals(Material.VINDICATOR_SPAWN_EGG) ? Config.getVindicator() : (stack.getType().equals(Material.EVOKER_SPAWN_EGG) ? Config.getEvoker() :
                                                        (stack.getType().equals(Material.PILLAGER_SPAWN_EGG) ? Config.getPillager() : (stack.getType().equals(Material.RAVAGER_SPAWN_EGG) ? Config.getRavager() : (stack.getType().equals(Material.VEX_SPAWN_EGG) ? Config.getVex() :
                                                                (stack.getType().equals(Material.PIGLIN_BRUTE_SPAWN_EGG) ? Config.getPiglinBrute() : (stack.getType().equals(Material.HOGLIN_SPAWN_EGG) ? Config.getHoglin() : (stack.getType().equals(Material.ZOGLIN_SPAWN_EGG) ? Config.getZoglin() :
                                                                        (stack.getType().equals(Material.ENDERMITE_SPAWN_EGG) ? Config.getEndermite() : (stack.getType().equals(Material.GUARDIAN_SPAWN_EGG) ? Config.getGuardian() : (stack.getType().equals(Material.SHULKER_SPAWN_EGG) ? Config.getShulker() :
                                                                                (stack.getType().equals(Material.HUSK_SPAWN_EGG) ? Config.getHusk() : (stack.getType().equals(Material.STRAY_SPAWN_EGG) ? Config.getStray() : (stack.getType().equals(Material.ENDERMAN_SPAWN_EGG) ? Config.getEnderman() :
                                                                                        (stack.getType().equals(Material.PIGLIN_SPAWN_EGG) ? Config.getPiglin() : (stack.getType().equals(Material.SPIDER_SPAWN_EGG) ? Config.getSpider() : (stack.getType().equals(Material.CAVE_SPIDER_SPAWN_EGG) ? Config.getCaveSpider() :
                                                                                                (stack.getType().equals(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG) ? Config.getZombifiedPiglin() : (stack.getType().equals(Material.BEE_SPAWN_EGG) ? Config.getBee() : (stack.getType().equals(Material.WOLF_SPAWN_EGG) ? Config.getWolf() :
                                                                                                        (stack.getType().equals(Material.LLAMA_SPAWN_EGG) ? Config.getLlama() : (stack.getType().equals(Material.TRADER_LLAMA_SPAWN_EGG) ? Config.getTraderLlama() : (stack.getType().equals(Material.CHICKEN_SPAWN_EGG) ? Config.getChicken() :
                                                                                                                (stack.getType().equals(Material.COW_SPAWN_EGG) ? Config.getCow() : (stack.getType().equals(Material.MOOSHROOM_SPAWN_EGG) ? Config.getMooshroom() : (stack.getType().equals(Material.PIG_SPAWN_EGG) ? Config.getPig() :
                                                                                                                        (stack.getType().equals(Material.SHEEP_SPAWN_EGG) ? Config.getSheep() : (stack.getType().equals(Material.SQUID_SPAWN_EGG) ? Config.getSquid() : (stack.getType().equals(Material.VILLAGER_SPAWN_EGG) ? Config.getVillager() :
                                                                                                                                (stack.getType().equals(Material.WANDERING_TRADER_SPAWN_EGG) ? Config.getWanderinTrader() : (stack.getType().equals(Material.BAT_SPAWN_EGG) ? Config.getBat() : (stack.getType().equals(Material.HORSE_SPAWN_EGG) ? Config.getHorse() :
                                                                                                                                        (stack.getType().equals(Material.STRIDER_SPAWN_EGG) ? Config.getStrider() : (stack.getType().equals(Material.FOX_SPAWN_EGG) ? Config.getFox() : (stack.getType().equals(Material.RABBIT_SPAWN_EGG) ? Config.getRabbit() :
                                                                                                                                                (stack.getType().equals(Material.PARROT_SPAWN_EGG) ? Config.getParrot() : (stack.getType().equals(Material.COD_SPAWN_EGG) ? Config.getCod() : (stack.getType().equals(Material.SALMON_SPAWN_EGG) ? Config.getSalmon() :
                                                                                                                                                        (stack.getType().equals(Material.PUFFERFISH_SPAWN_EGG) ? Config.getPufferfish() : (stack.getType().equals(Material.TROPICAL_FISH_SPAWN_EGG) ? Config.getTropicalFish() : null))))))))))))))))))))))))))))))))))))))))))))))))))))  + ChatColor.GRAY + "%" +"°°" + ChatColor.YELLOW + "[Click to higher]", true));

        player.openInventory(reduceInv);


    }

    public void openReduceInv(Player player)
    {
        player.openInventory(reduceInv);
    }

    public Inventory getInv()
    {
        return reduceInv;
    }


}
