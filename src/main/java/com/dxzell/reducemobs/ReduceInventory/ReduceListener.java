package com.dxzell.reducemobs.ReduceInventory;

import com.dxzell.reducemobs.Config;
import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.HashMap;

public class ReduceListener implements Listener {

    private HashMap<Player, String> usage = new HashMap<>();

    private ReduceMobs main;

    public ReduceListener(ReduceMobs main)
    {
        this.main = main;
    }

    @EventHandler
    public void onClick(InventoryClickEvent e)
    {
        if(e.getView().getTitle().contains(ChatColor.WHITE + "Adjust " ) && e.getView().getTitle().contains(ChatColor.BLACK + " >>"))
        {
         if(e.getCurrentItem() == null || !e.getCurrentItem().hasItemMeta() || !e.getCurrentItem().getItemMeta().hasDisplayName())
         {
             return;
         }
            e.setCancelled(true);
         if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.RED + "-"))
         {
            switch(e.getView().getItem(4).getType())
            {
                case BLAZE_SPAWN_EGG:
                    Config.setBlaze(false);

                    break;
                case CREEPER_SPAWN_EGG:
                    Config.setCreeper(false);

                    break;
                case GHAST_SPAWN_EGG:
                    Config.setGhast(false);

                    break;
                case MAGMA_CUBE_SPAWN_EGG:
                    Config.setMagmaCube(false);

                    break;
                case SILVERFISH_SPAWN_EGG:
                    Config.setSilverfish(false);

                    break;
                case SKELETON_SPAWN_EGG:
                    Config.setSkeleton(false);

                    break;
                case SLIME_SPAWN_EGG:
                    Config.setSlime(false);

                    break;
                case ZOMBIE_SPAWN_EGG:
                    Config.setZombie(false);

                    break;
                case ZOMBIE_VILLAGER_SPAWN_EGG:
                    Config.setZombieVillager(false);

                    break;
                case DROWNED_SPAWN_EGG:
                    Config.setDrowned(false);

                    break;
                case WITHER_SKELETON_SPAWN_EGG:
                    Config.setWitherSkeleton(false);

                    break;
                case WITCH_SPAWN_EGG:
                    Config.setWitch(false);

                    break;
                case VINDICATOR_SPAWN_EGG:
                    Config.setVindicator(false);

                    break;
                case EVOKER_SPAWN_EGG:
                    Config.setEvoker(false);

                    break;
                case PILLAGER_SPAWN_EGG:
                    Config.setPillager(false);

                    break;
                case RAVAGER_SPAWN_EGG:
                    Config.setRavager(false);

                    break;
                case VEX_SPAWN_EGG:
                    Config.setVex(false);

                    break;
                case PIGLIN_BRUTE_SPAWN_EGG:
                    Config.setPiglinBrute(false);
                    break;
                    case HOGLIN_SPAWN_EGG:
                    Config.setHoglin(false);
                    break;
                case ZOGLIN_SPAWN_EGG:
                    Config.setZoglin(false);
                    break;
                case ENDERMITE_SPAWN_EGG:
                    Config.setEndermite(false);
                    break;
                case GUARDIAN_SPAWN_EGG:
                    Config.setGuardian(false);
                    break;
                case SHULKER_SPAWN_EGG:
                    Config.setShulker(false);
                    break;
                case HUSK_SPAWN_EGG:
                    Config.setHusk(false);
                    break;
                case STRAY_SPAWN_EGG:
                    Config.setStray(false);
                    break;
                case ENDERMAN_SPAWN_EGG:
                    Config.setEnderman(false);
                    break;
                case PIGLIN_SPAWN_EGG:
                    Config.setPiglin(false);
                    break;
                case SPIDER_SPAWN_EGG:
                    Config.setSpider(false);
                    break;
                case CAVE_SPIDER_SPAWN_EGG:
                    Config.setCaveSpider(false);
                    break;
                case ZOMBIFIED_PIGLIN_SPAWN_EGG:
                    Config.setZombifiedPiglin(false);
                    break;
                case BEE_SPAWN_EGG:
                    Config.setBee(false);
                    break;
                case WOLF_SPAWN_EGG:
                    Config.setWolf(false);
                    break;
                case LLAMA_SPAWN_EGG:
                    Config.setLlama(false);
                    break;
                case TRADER_LLAMA_SPAWN_EGG:
                    Config.setTraderLlama(false);
                    break;
                case CHICKEN_SPAWN_EGG:
                    Config.setChicken(false);
                    break;
                case COW_SPAWN_EGG:
                    Config.setCow(false);
                    break;
                case MOOSHROOM_SPAWN_EGG:
                    Config.setMooshroom(false);
                    break;
                case PIG_SPAWN_EGG:
                    Config.setPig(false);
                    break;
                case SHEEP_SPAWN_EGG:
                    Config.setSheep(false);
                    break;
                case SQUID_SPAWN_EGG:
                    Config.setSquid(false);
                    break;
                case VILLAGER_SPAWN_EGG:
                    Config.setVillager(false);
                    break;
                case WANDERING_TRADER_SPAWN_EGG:
                    Config.setWanderinTrader(false);
                    break;
                case BAT_SPAWN_EGG:
                    Config.setBat(false);
                    break;
                case HORSE_SPAWN_EGG:
                    Config.setHorse(false);
                    break;
                case STRIDER_SPAWN_EGG:
                    Config.setStrider(false);
                    break;
                case FOX_SPAWN_EGG:
                    Config.setFox(false);
                    break;
                case RABBIT_SPAWN_EGG:
                    Config.setRabbit(false);
                    break;
                case PARROT_SPAWN_EGG:
                    Config.setParrot(false);
                    break;
                case COD_SPAWN_EGG:
                    Config.setCod(false);
                    break;
                case SALMON_SPAWN_EGG:
                    Config.setSalmon(false);
                    break;
                case PUFFERFISH_SPAWN_EGG:
                    Config.setPufferfish(false);
                    break;
                case TROPICAL_FISH_SPAWN_EGG:
                    Config.setTropcialFish(false);
                    break;
                default:
                    break;
            }
             ReduceInventory.setReduceInv(e.getClickedInventory().getItem(4), e.getClickedInventory().getItem(4).getItemMeta().getDisplayName(),(Player) e.getWhoClicked());

         }else if(e.getCurrentItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "+"))
         {
             switch(e.getView().getItem(4).getType())
             {
                 case BLAZE_SPAWN_EGG:
                     Config.setBlaze(true);
                     break;
                 case CREEPER_SPAWN_EGG:
                     Config.setCreeper(true);
                     break;
                 case GHAST_SPAWN_EGG:
                     Config.setGhast(true);
                     break;
                 case MAGMA_CUBE_SPAWN_EGG:
                     Config.setMagmaCube(true);
                     break;
                 case SILVERFISH_SPAWN_EGG:
                     Config.setSilverfish(true);
                     break;
                 case SKELETON_SPAWN_EGG:
                     Config.setSkeleton(true);
                     break;
                 case SLIME_SPAWN_EGG:
                     Config.setSlime(true);
                     break;
                 case ZOMBIE_SPAWN_EGG:
                     Config.setZombie(true);
                     break;
                 case ZOMBIE_VILLAGER_SPAWN_EGG:
                     Config.setZombieVillager(true);
                     break;
                 case DROWNED_SPAWN_EGG:
                     Config.setDrowned(true);
                     break;
                 case WITHER_SKELETON_SPAWN_EGG:
                     Config.setWitherSkeleton(true);
                     break;
                 case WITCH_SPAWN_EGG:
                     Config.setWitch(true);
                     break;
                 case VINDICATOR_SPAWN_EGG:
                     Config.setVindicator(true);
                     break;
                 case EVOKER_SPAWN_EGG:
                     Config.setEvoker(true);
                     break;
                 case PILLAGER_SPAWN_EGG:
                     Config.setPillager(true);
                     break;
                 case RAVAGER_SPAWN_EGG:
                     Config.setRavager(true);
                     break;
                 case VEX_SPAWN_EGG:
                     Config.setVex(true);
                     break;
                 case PIGLIN_BRUTE_SPAWN_EGG:
                     Config.setPiglinBrute(true);
                     break;
                 case HOGLIN_SPAWN_EGG:
                     Config.setHoglin(true);
                     break;
                 case ZOGLIN_SPAWN_EGG:
                     Config.setZoglin(true);
                     break;
                 case ENDERMITE_SPAWN_EGG:
                     Config.setEndermite(true);
                     break;
                 case GUARDIAN_SPAWN_EGG:
                     Config.setGuardian(true);
                     break;
                 case SHULKER_SPAWN_EGG:
                     Config.setShulker(true);
                     break;
                 case HUSK_SPAWN_EGG:
                     Config.setHusk(true);
                     break;
                 case STRAY_SPAWN_EGG:
                     Config.setStray(true);
                     break;
                 case ENDERMAN_SPAWN_EGG:
                     Config.setEnderman(true);
                     break;
                 case PIGLIN_SPAWN_EGG:
                     Config.setPiglin(true);
                     break;
                 case SPIDER_SPAWN_EGG:
                     Config.setSpider(true);
                     break;
                 case CAVE_SPIDER_SPAWN_EGG:
                     Config.setCaveSpider(true);
                     break;
                 case ZOMBIFIED_PIGLIN_SPAWN_EGG:
                     Config.setZombifiedPiglin(true);
                     break;
                 case BEE_SPAWN_EGG:
                     Config.setBee(true);
                     break;
                 case WOLF_SPAWN_EGG:
                     Config.setWolf(true);
                     break;
                 case LLAMA_SPAWN_EGG:
                     Config.setLlama(true);
                     break;
                 case TRADER_LLAMA_SPAWN_EGG:
                     Config.setTraderLlama(true);
                     break;
                 case CHICKEN_SPAWN_EGG:
                     Config.setChicken(true);
                     break;
                 case COW_SPAWN_EGG:
                     Config.setCow(true);
                     break;
                 case MOOSHROOM_SPAWN_EGG:
                     Config.setMooshroom(true);
                     break;
                 case PIG_SPAWN_EGG:
                     Config.setPig(true);
                     break;
                 case SHEEP_SPAWN_EGG:
                     Config.setSheep(true);
                     break;
                 case SQUID_SPAWN_EGG:
                     Config.setSquid(true);
                     break;
                 case VILLAGER_SPAWN_EGG:
                     Config.setVillager(true);
                     break;
                 case WANDERING_TRADER_SPAWN_EGG:
                     Config.setWanderinTrader(true);
                     break;
                 case BAT_SPAWN_EGG:
                     Config.setBat(true);
                     break;
                 case HORSE_SPAWN_EGG:
                     Config.setHorse(true);
                     break;
                 case STRIDER_SPAWN_EGG:
                     Config.setStrider(true);
                     break;
                 case FOX_SPAWN_EGG:
                     Config.setFox(true);
                     break;
                 case RABBIT_SPAWN_EGG:
                     Config.setRabbit(true);
                     break;
                 case PARROT_SPAWN_EGG:
                     Config.setParrot(true);
                     break;
                 case COD_SPAWN_EGG:
                     Config.setCod(true);
                     break;
                 case SALMON_SPAWN_EGG:
                     Config.setSalmon(true);
                     break;
                 case PUFFERFISH_SPAWN_EGG:
                     Config.setPufferfish(true);
                     break;
                 case TROPICAL_FISH_SPAWN_EGG:
                     Config.setTropcialFish(true);
                     break;
                 default:
                     break;
             }
             ReduceInventory.setReduceInv(e.getClickedInventory().getItem(4), e.getClickedInventory().getItem(4).getItemMeta().getDisplayName(),(Player) e.getWhoClicked());
         }else if(e.getCurrentItem().equals(e.getClickedInventory().getItem(4)))
         {
          if(main.getUsage().get((Player) e.getWhoClicked()) != null)
          {
          if(main.getUsage().get((Player) e.getWhoClicked()).equals("hostile"))
          {
              main.getHostileInv().openHostileInv((Player) e.getWhoClicked());
          }else if(main.getUsage().get((Player) e.getWhoClicked()).equals("neutral"))
          {
              main.getNeutralInv().openNeutralInv((Player) e.getWhoClicked());
          }else if(main.getUsage().get((Player) e.getWhoClicked()).equals("passive"))
          {
              main.getPassiveInv().openPassiveInv(((Player) e.getWhoClicked()).getPlayer());
          }
          }
         }
        }
    }

}
