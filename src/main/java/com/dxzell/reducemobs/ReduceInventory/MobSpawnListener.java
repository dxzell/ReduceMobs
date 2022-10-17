package com.dxzell.reducemobs.ReduceInventory;

import com.dxzell.reducemobs.Config;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

public class MobSpawnListener implements Listener {


    @EventHandler
    public void onSpawn(EntitySpawnEvent e)
    {
        switch(e.getEntityType())
        {
            case BLAZE:
                if(!spawn(Config.getBlaze()))
                {
                   e.setCancelled(true);
                }
                break;
            case CREEPER:
                if(!spawn(Config.getCreeper()))
                {
                    e.setCancelled(true);
                }
                break;
            case GHAST:
                if(!spawn(Config.getGhast()))
                {
                    e.setCancelled(true);
                }
                break;
            case MAGMA_CUBE:
                if(!spawn(Config.getMagmaCube()))
                {
                    e.setCancelled(true);
                }
                break;
            case SILVERFISH:
                if(!spawn(Config.getSilverfish()))
                {
                    e.setCancelled(true);
                }
                break;
            case SKELETON:
                if(!spawn(Config.getSkeleton()))
                {
                    e.setCancelled(true);
                }
                break;
            case SLIME:
                if(!spawn(Config.getSlime()))
                {
                    e.setCancelled(true);
                }
                break;
            case ZOMBIE:
                if(!spawn(Config.getZombie()))
                {
                    e.setCancelled(true);
                }
                break;
            case ZOMBIE_VILLAGER:
                if(!spawn(Config.getZombieVillager()))
                {
                    e.setCancelled(true);
                }
                break;
            case DROWNED:
                if(!spawn(Config.getDrowned()))
                {
                    e.setCancelled(true);
                }
                break;
            case WITHER_SKELETON:
                if(!spawn(Config.getWitherSkeleton()))
                {
                    e.setCancelled(true);
                }
                break;
            case WITCH:
                if(!spawn(Config.getWitch()))
                {
                    e.setCancelled(true);
                }
                break;
            case VINDICATOR:
                if(!spawn(Config.getVindicator()))
                {
                    e.setCancelled(true);
                }
                break;
            case EVOKER:
                if(!spawn(Config.getEvoker()))
                {
                    e.setCancelled(true);
                }
                break;
            case PILLAGER:
                if(!spawn(Config.getPillager()))
                {
                    e.setCancelled(true);
                }
                break;
            case RAVAGER:
                if(!spawn(Config.getRavager()))
                {
                    e.setCancelled(true);
                }
                break;
            case VEX:
                if(!spawn(Config.getVex()))
                {
                    e.setCancelled(true);
                }
                break;
            case PIGLIN_BRUTE:
                if(!spawn(Config.getPiglinBrute()))
                {
                    e.setCancelled(true);
                }
                break;
            case HOGLIN:
                if(!spawn(Config.getHoglin()))
                {
                    e.setCancelled(true);
                }
                break;
            case ZOGLIN:
                if(!spawn(Config.getZoglin()))
                {
                    e.setCancelled(true);
                }
                break;
            case ENDERMITE:
                if(!spawn(Config.getEndermite()))
                {
                    e.setCancelled(true);
                }
                break;
            case GUARDIAN:
                if(!spawn(Config.getGuardian()))
                {
                    e.setCancelled(true);
                }
                break;
            case SHULKER:
                if(!spawn(Config.getShulker()))
                {
                    e.setCancelled(true);
                }
                break;
            case HUSK:
                if(!spawn(Config.getHusk()))
                {
                    e.setCancelled(true);
                }
                break;
            case STRAY:
                if(!spawn(Config.getStray()))
                {
                    e.setCancelled(true);
                }
                break;
            case ENDERMAN:
                if(!spawn(Config.getEnderman()))
                {
                    e.setCancelled(true);
                }
                break;
            case PIGLIN:
                if(!spawn(Config.getPiglin()))
                {
                    e.setCancelled(true);
                }
                break;
            case SPIDER:
                if(!spawn(Config.getSpider()))
                {
                    e.setCancelled(true);
                }
                break;
            case CAVE_SPIDER:
                if(!spawn(Config.getCaveSpider()))
                {
                    e.setCancelled(true);
                }
                break;
            case ZOMBIFIED_PIGLIN:
                if(!spawn(Config.getZombifiedPiglin()))
                {
                    e.setCancelled(true);
                }
                break;
            case BEE:
                if(!spawn(Config.getBee()))
                {
                    e.setCancelled(true);
                }
                break;
            case WOLF:
                if(!spawn(Config.getWolf()))
                {
                    e.setCancelled(true);
                }
                break;
            case LLAMA:
                if(!spawn(Config.getLlama()))
                {
                    e.setCancelled(true);
                }
                break;
            case TRADER_LLAMA:
                if(!spawn(Config.getTraderLlama()))
                {
                    e.setCancelled(true);
                }
                break;
            case CHICKEN:
                if(!spawn(Config.getChicken()))
                {
                    e.setCancelled(true);
                }
                break;
            case COW:
                if(!spawn(Config.getCow()))
                {
                    e.setCancelled(true);
                }
                break;
            case MUSHROOM_COW:
                if(!spawn(Config.getMooshroom()))
                {
                    e.setCancelled(true);
                }
                break;
            case PIG:
                if(!spawn(Config.getPig()))
                {
                    e.setCancelled(true);
                }
                break;
            case SHEEP:
                if(!spawn(Config.getSheep()))
                {
                    e.setCancelled(true);
                }
                break;
            case SQUID:
                if(!spawn(Config.getSquid()))
                {
                    e.setCancelled(true);
                }
                break;
            case VILLAGER:
                if(!spawn(Config.getVillager()))
                {
                    e.setCancelled(true);
                }
                break;
            case WANDERING_TRADER:
                if(!spawn(Config.getWanderinTrader()))
                {
                    e.setCancelled(true);
                }
                break;
            case BAT:
                if(!spawn(Config.getBat()))
                {
                    e.setCancelled(true);
                }
                break;
            case HORSE:
                if(!spawn(Config.getHorse()))
                {
                    e.setCancelled(true);
                }
                break;
            case STRIDER:
                if(!spawn(Config.getStrider()))
                {
                    e.setCancelled(true);
                }
                break;
            case FOX:
                if(!spawn(Config.getFox()))
                {
                    e.setCancelled(true);
                }
                break;
            case RABBIT :
                if(!spawn(Config.getRabbit()))
                {
                    e.setCancelled(true);
                }
                break;
            case PARROT:
                if(!spawn(Config.getParrot()))
                {
                    e.setCancelled(true);
                }
                break;
            case COD:
                if(!spawn(Config.getCod()))
                {
                    e.setCancelled(true);
                }
                break;
            case SALMON:
                if(!spawn(Config.getSalmon()))
                {
                    e.setCancelled(true);
                }
                break;
            case PUFFERFISH:
                if(!spawn(Config.getPufferfish()))
                {
                    e.setCancelled(true);
                }
                break;
            case TROPICAL_FISH:
                if(!spawn(Config.getTropicalFish()))
                {
                    e.setCancelled(true);
                }
                break;

        }


    }

    public boolean spawn(int percentage)
    {
        int random = (int) (Math.random() * 101);
        if(random != 0 && random <= percentage)
        {
            return true;
        }else{
            return false;
        }
    }
}
