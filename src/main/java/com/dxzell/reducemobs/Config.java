package com.dxzell.reducemobs;

public class Config {

    private static ReduceMobs main;

    public Config(ReduceMobs main)
    {
     this.main = main;
     main.getConfig().options().copyDefaults();
     main.saveDefaultConfig();
    }

    //BLAZE
    public static int getBlaze()
    {
     return main.getConfig().getInt("BLAZE");
    }
    public static void setBlaze(boolean higherLower)
    {
        if(higherLower)
        {
        if(getBlaze() < 100)
        {
            main.getConfig().set("BLAZE", getBlaze() + 1);
            main.saveConfig();
        }else{
            main.getConfig().set("BLAZE", 0);
            main.saveConfig();
        }
        }else{
        if(getBlaze() > 0)
        {
          main.getConfig().set("BLAZE", getBlaze() - 1);
          main.saveConfig();
        }else{
            main.getConfig().set("BLAZE", 100);
            main.saveConfig();
        }
        }
    }

    //CREEPER
    public static int getCreeper()
    {
        return main.getConfig().getInt("CREEPER");
    }
    public static void setCreeper(boolean higherLower)
    {
        if(higherLower)
        {
            if(getCreeper() < 100)
            {
                main.getConfig().set("CREEPER", getCreeper() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("CREEPER", 0);
                main.saveConfig();
            }
        }else{
            if(getCreeper() > 0)
            {
                main.getConfig().set("CREEPER", getCreeper() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("CREEPER", 100);
                main.saveConfig();
            }
        }
    }

    //GHAST
    public static int getGhast()
    {
        return main.getConfig().getInt("GHAST");
    }
    public static void setGhast(boolean higherLower)
    {
        if(higherLower)
        {
            if(getGhast() < 100)
            {
                main.getConfig().set("GHAST", getGhast() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("GHAST", 0);
                main.saveConfig();
            }
        }else{
            if(getGhast() > 0)
            {
                main.getConfig().set("GHAST", getGhast() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("GHAST", 100);
                main.saveConfig();
            }
        }
    }

    //MAGMA CUBE
    public static int getMagmaCube()
    {
        return main.getConfig().getInt("MAGMA CUBE");
    }
    public static void setMagmaCube(boolean higherLower)
    {
        if(higherLower)
        {
            if(getMagmaCube() < 100)
            {
                main.getConfig().set("MAGMA CUBE", getMagmaCube() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("MAGMA CUBE", 0);
                main.saveConfig();
            }
        }else{
            if(getMagmaCube() > 0)
            {
                main.getConfig().set("MAGMA CUBE", getMagmaCube() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("MAGMA CUBE", 100);
                main.saveConfig();
            }
        }
    }

    //SILVERFISH
    public static int getSilverfish()
    {
        return main.getConfig().getInt("SILVERFISH");
    }
    public static void setSilverfish(boolean higherLower)
    {
        if(higherLower)
        {
            if(getSilverfish() < 100)
            {
                main.getConfig().set("SILVERFISH", getSilverfish() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SILVERFISH", 0);
                main.saveConfig();
            }
        }else{
            if(getSilverfish() > 0)
            {
                main.getConfig().set("SILVERFISH", getSilverfish() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SILVERFISH", 100);
                main.saveConfig();
            }
        }
    }

    //SKELETON
    public static int getSkeleton()
    {
        return main.getConfig().getInt("SKELETON");
    }
    public static void setSkeleton(boolean higherLower)
    {
        if(higherLower)
        {
            if(getSkeleton() < 100)
            {
                main.getConfig().set("SKELETON", getSkeleton() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SKELETON", 0);
                main.saveConfig();
            }
        }else{
            if(getSkeleton() > 0)
            {
                main.getConfig().set("SKELETON", getSkeleton() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SKELETON", 100);
                main.saveConfig();
            }
        }
    }

    //SLIME
    public static int getSlime()
    {
        return main.getConfig().getInt("SLIME");
    }
    public static void setSlime(boolean higherLower)
    {
        if(higherLower)
        {
            if(getSlime() < 100)
            {
                main.getConfig().set("SLIME", getSlime() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SLIME", 0);
                main.saveConfig();
            }
        }else{
            if(getSlime() > 0)
            {
                main.getConfig().set("SLIME", getSlime() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SLIME", 100);
                main.saveConfig();
            }
        }
    }

    //
    public static int getZombie()
    {
        return main.getConfig().getInt("ZOMBIE");
    }
    public static void setZombie(boolean higherLower)
    {
        if(higherLower)
        {
            if(getZombie() < 100)
            {
                main.getConfig().set("ZOMBIE", getZombie() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ZOMBIE", 0);
                main.saveConfig();
            }
        }else{
            if(getZombie() > 0)
            {
                main.getConfig().set("ZOMBIE", getZombie() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ZOMBIE", 100);
                main.saveConfig();
            }
        }
    }

    //ZOMBIE VILLAGER
    public static int getZombieVillager()
    {
        return main.getConfig().getInt("ZOMBIE VILLAGER");
    }
    public static void setZombieVillager(boolean higherLower)
    {
        if(higherLower)
        {
            if(getZombieVillager() < 100)
            {
                main.getConfig().set("ZOMBIE VILLAGER", getZombieVillager() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ZOMBIE VILLAGER", 0);
                main.saveConfig();
            }
        }else{
            if(getZombieVillager() > 0)
            {
                main.getConfig().set("ZOMBIE VILLAGER", getZombieVillager() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ZOMBIE VILLAGER", 100);
                main.saveConfig();
            }
        }
    }

    //DROWNED
    public static int getDrowned()
    {
        return main.getConfig().getInt("DROWNED");
    }
    public static void setDrowned(boolean higherLower)
    {
        if(higherLower)
        {
            if(getDrowned() < 100)
            {
                main.getConfig().set("DROWNED", getDrowned() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("DROWNED", 0);
                main.saveConfig();
            }
        }else{
            if(getDrowned() > 0)
            {
                main.getConfig().set("DROWNED", getDrowned() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("DROWNED", 100);
                main.saveConfig();
            }
        }
    }

    //WITHER SKELETON
    public static int getWitherSkeleton()
    {
        return main.getConfig().getInt("WITHER SKELETON");
    }
    public static void setWitherSkeleton(boolean higherLower)
    {
        if(higherLower)
        {
            if(getWitherSkeleton() < 100)
            {
                main.getConfig().set("WITHER SKELETON", getWitherSkeleton() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("WITHER SKELETON", 0);
                main.saveConfig();
            }
        }else{
            if(getWitherSkeleton() > 0)
            {
                main.getConfig().set("WITHER SKELETON", getWitherSkeleton() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("WITHER SKELETON", 100);
                main.saveConfig();
            }
        }
    }

    //WITCH
    public static int getWitch()
    {
        return main.getConfig().getInt("WITCH");
    }
    public static void setWitch(boolean higherLower)
    {
        if(higherLower)
        {
            if(getWitch() < 100)
            {
                main.getConfig().set("WITCH", getWitch() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("WITCH", 0);
                main.saveConfig();
            }
        }else{
            if(getWitch() > 0)
            {
                main.getConfig().set("WITCH", getWitch() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("WITCH", 100);
                main.saveConfig();
            }
        }
    }

    //VINDICATOR
    public static int getVindicator()
    {
        return main.getConfig().getInt("VINDICATOR");
    }
    public static void setVindicator(boolean higherLower)
    {
        if(higherLower)
        {
            if(getVindicator() < 100)
            {
                main.getConfig().set("VINDICATOR", getVindicator() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("VINDICATOR", 0);
                main.saveConfig();
            }
        }else{
            if(getVindicator() > 0)
            {
                main.getConfig().set("VINDICATOR", getVindicator() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("VINDICATOR", 100);
                main.saveConfig();
            }
        }
    }

    //EVOKER
    public static int getEvoker()
    {
        return main.getConfig().getInt("EVOKER");
    }
    public static void setEvoker(boolean higherLower)
    {
        if(higherLower)
        {
            if(getEvoker() < 100)
            {
                main.getConfig().set("EVOKER", getEvoker() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("EVOKER", 0);
                main.saveConfig();
            }
        }else{
            if(getEvoker() > 0)
            {
                main.getConfig().set("EVOKER", getEvoker() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("EVOKER", 100);
                main.saveConfig();
            }
        }
    }

    //PILLAGER
    public static int getPillager()
    {
        return main.getConfig().getInt("PILLAGER");
    }
    public static void setPillager(boolean higherLower)
    {
        if(higherLower)
        {
            if(getPillager() < 100)
            {
                main.getConfig().set("PILLAGER", getPillager() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PILLAGER", 0);
                main.saveConfig();
            }
        }else{
            if(getPillager() > 0)
            {
                main.getConfig().set("PILLAGER", getPillager() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PILLAGER", 100);
                main.saveConfig();
            }
        }
    }

    //RAVAGER
    public static int getRavager()
    {
        return main.getConfig().getInt("RAVAGER");
    }
    public static void setRavager(boolean higherLower)
    {
        if(higherLower)
        {
            if(getRavager() < 100)
            {
                main.getConfig().set("RAVAGER", getRavager() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("RAVAGER", 0);
                main.saveConfig();
            }
        }else{
            if(getRavager() > 0)
            {
                main.getConfig().set("RAVAGER", getRavager() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("RAVAGER", 100);
                main.saveConfig();
            }
        }
    }

    //VEX
    public static int getVex()
    {
        return main.getConfig().getInt("VEX");
    }
    public static void setVex(boolean higherLower)
    {
        if(higherLower)
        {
            if(getVex() < 100)
            {
                main.getConfig().set("VEX", getVex() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("VEX", 0);
                main.saveConfig();
            }
        }else{
            if(getVex() > 0)
            {
                main.getConfig().set("VEX", getVex() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("VEX", 100);
                main.saveConfig();
            }
        }
    }

    //EVOCATION FANG
    public static int getEvocationFang()
    {
        return main.getConfig().getInt("EVOCATION FANG");
    }
    public static void setEvocationFang(boolean higherLower)
    {
        if(higherLower)
        {
            if(getEvocationFang() < 100)
            {
                main.getConfig().set("EVOCATION FANG", getEvocationFang() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("EVOCATION FANG", 0);
                main.saveConfig();
            }
        }else{
            if(getEvocationFang() > 0)
            {
                main.getConfig().set("EVOCATION FANG", getEvocationFang() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("EVOCATION FANG", 100);
                main.saveConfig();
            }
        }
    }

    //PIGLIN BRUTE
    public static int getPiglinBrute()
    {
        return main.getConfig().getInt("PIGLIN BRUTE");
    }
    public static void setPiglinBrute(boolean higherLower)
    {
        if(higherLower)
        {
            if(getPiglinBrute() < 100)
            {
                main.getConfig().set("PIGLIN BRUTE", getPiglinBrute() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PIGLIN BRUTE", 0);
                main.saveConfig();
            }
        }else{
            if(getPiglinBrute() > 0)
            {
                main.getConfig().set("PIGLIN BRUTE", getPiglinBrute() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PIGLIN BRUTE", 100);
                main.saveConfig();
            }
        }
    }

    //HOGLIN
    public static int getHoglin()
    {
        return main.getConfig().getInt("HOGLIN");
    }
    public static void setHoglin(boolean higherLower)
    {
        if(higherLower)
        {
            if(getHoglin() < 100)
            {
                main.getConfig().set("HOGLIN", getHoglin() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("HOGLIN", 0);
                main.saveConfig();
            }
        }else{
            if(getHoglin() > 0)
            {
                main.getConfig().set("HOGLIN", getHoglin() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("HOGLIN", 100);
                main.saveConfig();
            }
        }
    }

    //ZOGLIN
    public static int getZoglin()
    {
        return main.getConfig().getInt("ZOGLIN");
    }
    public static void setZoglin(boolean higherLower)
    {
        if(higherLower)
        {
            if(getZoglin() < 100)
            {
                main.getConfig().set("ZOGLIN", getZoglin() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ZOGLIN", 0);
                main.saveConfig();
            }
        }else{
            if(getZoglin() > 0)
            {
                main.getConfig().set("ZOGLIN", getZoglin() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ZOGLIN", 100);
                main.saveConfig();
            }
        }
    }

    //ENDERMITE
    public static int getEndermite()
    {
        return main.getConfig().getInt("ENDERMITE");
    }
    public static void setEndermite(boolean higherLower)
    {
        if(higherLower)
        {
            if(getEndermite() < 100)
            {
                main.getConfig().set("ENDERMITE", getEndermite() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ENDERMITE", 0);
                main.saveConfig();
            }
        }else{
            if(getEndermite() > 0)
            {
                main.getConfig().set("ENDERMITE", getEndermite() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ENDERMITE", 100);
                main.saveConfig();
            }
        }
    }

    //GUARDIAN
    public static int getGuardian()
    {
        return main.getConfig().getInt("GUARDIAN");
    }
    public static void setGuardian(boolean higherLower)
    {
        if(higherLower)
        {
            if(getGuardian() < 100)
            {
                main.getConfig().set("GUARDIAN", getGuardian() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("GUARDIAN", 0);
                main.saveConfig();
            }
        }else{
            if(getGuardian() > 0)
            {
                main.getConfig().set("GUARDIAN", getGuardian() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("GUARDIAN", 100);
                main.saveConfig();
            }
        }
    }

    //SHULKER
    public static int getShulker()
    {
        return main.getConfig().getInt("SHULKER");
    }
    public static void setShulker(boolean higherLower)
    {
        if(higherLower)
        {
            if(getShulker() < 100)
            {
                main.getConfig().set("SHULKER", getShulker() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SHULKER", 0);
                main.saveConfig();
            }
        }else{
            if(getShulker() > 0)
            {
                main.getConfig().set("SHULKER", getShulker() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SHULKER", 100);
                main.saveConfig();
            }
        }
    }

    //HUSK
    public static int getHusk()
    {
        return main.getConfig().getInt("HUSK");
    }
    public static void setHusk(boolean higherLower)
    {
        if(higherLower)
        {
            if(getHusk() < 100)
            {
                main.getConfig().set("HUSK", getHusk() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("HUSK", 0);
                main.saveConfig();
            }
        }else{
            if(getHusk() > 0)
            {
                main.getConfig().set("HUSK", getHusk() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("HUSK", 100);
                main.saveConfig();
            }
        }
    }

    //STRAY
    public static int getStray()
    {
        return main.getConfig().getInt("STRAY");
    }
    public static void setStray(boolean higherLower)
    {
        if(higherLower)
        {
            if(getStray() < 100)
            {
                main.getConfig().set("STRAY", getStray() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("STRAY", 0);
                main.saveConfig();
            }
        }else{
            if(getStray() > 0)
            {
                main.getConfig().set("STRAY", getStray() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("STRAY", 100);
                main.saveConfig();
            }
        }
    }


    //ENDERMAN
    public static int getEnderman()
    {
        return main.getConfig().getInt("ENDERMAN");
    }
    public static void setEnderman(boolean higherLower)
    {
        if(higherLower)
        {
            if(getEnderman() < 100)
            {
                main.getConfig().set("ENDERMAN", getEnderman() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ENDERMAN", 0);
                main.saveConfig();
            }
        }else{
            if(getEnderman() > 0)
            {
                main.getConfig().set("ENDERMAN", getEnderman() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ENDERMAN", 100);
                main.saveConfig();
            }
        }
    }

    //PIGLIN
    public static int getPiglin()
    {
        return main.getConfig().getInt("PIGLIN");
    }
    public static void setPiglin(boolean higherLower)
    {
        if(higherLower)
        {
            if(getPiglin() < 100)
            {
                main.getConfig().set("PIGLIN", getPiglin() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PIGLIN", 0);
                main.saveConfig();
            }
        }else{
            if(getPiglin() > 0)
            {
                main.getConfig().set("PIGLIN", getPiglin() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PIGLIN", 100);
                main.saveConfig();
            }
        }
    }

    //SPIDER
    public static int getSpider()
    {
        return main.getConfig().getInt("SPIDER");
    }
    public static void setSpider(boolean higherLower)
    {
        if(higherLower)
        {
            if(getSpider() < 100)
            {
                main.getConfig().set("SPIDER", getSpider() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SPIDER", 0);
                main.saveConfig();
            }
        }else{
            if(getSpider() > 0)
            {
                main.getConfig().set("SPIDER", getSpider() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SPIDER", 100);
                main.saveConfig();
            }
        }
    }

    //CAVE SPIDER
    public static int getCaveSpider()
    {
        return main.getConfig().getInt("CAVE SPIDER");
    }
    public static void setCaveSpider(boolean higherLower)
    {
        if(higherLower)
        {
            if(getCaveSpider() < 100)
            {
                main.getConfig().set("CAVE SPIDER", getCaveSpider() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("CAVE SPIDER", 0);
                main.saveConfig();
            }
        }else{
            if(getCaveSpider() > 0)
            {
                main.getConfig().set("CAVE SPIDER", getCaveSpider() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("CAVE SPIDER", 100);
                main.saveConfig();
            }
        }
    }

    //ZOMBIFIED PIGLIN
    public static int getZombifiedPiglin()
    {
        return main.getConfig().getInt("ZOMBIFIED PIGLIN");
    }
    public static void setZombifiedPiglin(boolean higherLower)
    {
        if(higherLower)
        {
            if(getZombifiedPiglin() < 100)
            {
                main.getConfig().set("ZOMBIFIED PIGLIN", getZombifiedPiglin() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ZOMBIFIED PIGLIN", 0);
                main.saveConfig();
            }
        }else{
            if(getZombifiedPiglin() > 0)
            {
                main.getConfig().set("ZOMBIFIED PIGLIN", getZombifiedPiglin() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("ZOMBIFIED PIGLIN", 100);
                main.saveConfig();
            }
        }
    }

    //BEE
    public static int getBee()
    {
        return main.getConfig().getInt("BEE");
    }
    public static void setBee(boolean higherLower)
    {
        if(higherLower)
        {
            if(getBee() < 100)
            {
                main.getConfig().set("BEE", getBee() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("BEE", 0);
                main.saveConfig();
            }
        }else{
            if(getBee() > 0)
            {
                main.getConfig().set("BEE", getBee() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("BEE", 100);
                main.saveConfig();
            }
        }
    }

    //WOLF
    public static int getWolf()
    {
        return main.getConfig().getInt("WOLF");
    }
    public static void setWolf(boolean higherLower)
    {
        if(higherLower)
        {
            if(getWolf() < 100)
            {
                main.getConfig().set("WOLF", getWolf() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("WOLF", 0);
                main.saveConfig();
            }
        }else{
            if(getWolf() > 0)
            {
                main.getConfig().set("WOLF", getWolf() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("WOLF", 100);
                main.saveConfig();
            }
        }
    }

    //LLAMA
    public static int getLlama()
    {
        return main.getConfig().getInt("LLAMA");
    }
    public static void setLlama(boolean higherLower)
    {
        if(higherLower)
        {
            if(getLlama() < 100)
            {
                main.getConfig().set("LLAMA", getLlama() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("LLAMA", 0);
                main.saveConfig();
            }
        }else{
            if(getLlama() > 0)
            {
                main.getConfig().set("LLAMA", getLlama() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("LLAMA", 100);
                main.saveConfig();
            }
        }
    }

    //TRADER LLAMA
    public static int getTraderLlama()
    {
        return main.getConfig().getInt("TRADER LLAMA");
    }
    public static void setTraderLlama(boolean higherLower)
    {
        if(higherLower)
        {
            if(getTraderLlama() < 100)
            {
                main.getConfig().set("TRADER LLAMA", getTraderLlama() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("TRADER LLAMA", 0);
                main.saveConfig();
            }
        }else{
            if(getTraderLlama() > 0)
            {
                main.getConfig().set("TRADER LLAMA", getTraderLlama() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("TRADER LLAMA", 100);
                main.saveConfig();
            }
        }
    }

    //CHICKEN
    public static int getChicken()
    {
        return main.getConfig().getInt("CHICKEN");
    }
    public static void setChicken(boolean higherLower)
    {
        if(higherLower)
        {
            if(getChicken() < 100)
            {
                main.getConfig().set("CHICKEN", getChicken() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("CHICKEN", 0);
                main.saveConfig();
            }
        }else{
            if(getChicken() > 0)
            {
                main.getConfig().set("CHICKEN", getChicken() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("CHICKEN", 100);
                main.saveConfig();
            }
        }
    }

    //COW
    public static int getCow()
    {
        return main.getConfig().getInt("COW");
    }
    public static void setCow(boolean higherLower)
    {
        if(higherLower)
        {
            if(getCow() < 100)
            {
                main.getConfig().set("COW", getCow() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("COW", 0);
                main.saveConfig();
            }
        }else{
            if(getCow() > 0)
            {
                main.getConfig().set("COW", getCow() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("COW", 100);
                main.saveConfig();
            }
        }
    }

    //MOOSHROOM
    public static int getMooshroom()
    {
        return main.getConfig().getInt("MOOSHROOM");
    }
    public static void setMooshroom(boolean higherLower)
    {
        if(higherLower)
        {
            if(getMooshroom() < 100)
            {
                main.getConfig().set("MOOSHROOM", getMooshroom() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("MOOSHROOM", 0);
                main.saveConfig();
            }
        }else{
            if(getMooshroom() > 0)
            {
                main.getConfig().set("MOOSHROOM", getMooshroom() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("MOOSHROOM", 100);
                main.saveConfig();
            }
        }
    }

    //PIG
    public static int getPig()
    {
        return main.getConfig().getInt("PIG");
    }
    public static void setPig(boolean higherLower)
    {
        if(higherLower)
        {
            if(getPig() < 100)
            {
                main.getConfig().set("PIG", getPig() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PIG", 0);
                main.saveConfig();
            }
        }else{
            if(getPig() > 0)
            {
                main.getConfig().set("PIG", getPig() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PIG", 100);
                main.saveConfig();
            }
        }
    }

    //SHEEP
    public static int getSheep()
    {
        return main.getConfig().getInt("SHEEP");
    }
    public static void setSheep(boolean higherLower)
    {
        if(higherLower)
        {
            if(getSheep() < 100)
            {
                main.getConfig().set("SHEEP", getSheep() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SHEEP", 0);
                main.saveConfig();
            }
        }else{
            if(getSheep() > 0)
            {
                main.getConfig().set("SHEEP", getSheep() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SHEEP", 100);
                main.saveConfig();
            }
        }
    }

    //SQUID
    public static int getSquid()
    {
        return main.getConfig().getInt("SQUID");
    }
    public static void setSquid(boolean higherLower)
    {
        if(higherLower)
        {
            if(getSquid() < 100)
            {
                main.getConfig().set("SQUID", getSquid() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SQUID", 0);
                main.saveConfig();
            }
        }else{
            if(getSquid() > 0)
            {
                main.getConfig().set("SQUID", getSquid() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SQUID", 100);
                main.saveConfig();
            }
        }
    }

    //VILLAGER
    public static int getVillager()
    {
        return main.getConfig().getInt("VILLAGER");
    }
    public static void setVillager(boolean higherLower)
    {
        if(higherLower)
        {
            if(getVillager() < 100)
            {
                main.getConfig().set("VILLAGER", getVillager() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("VILLAGER", 0);
                main.saveConfig();
            }
        }else{
            if(getVillager() > 0)
            {
                main.getConfig().set("VILLAGER", getVillager() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("VILLAGER", 100);
                main.saveConfig();
            }
        }
    }

    //WANDERING TRADER
    public static int getWanderinTrader()
    {
        return main.getConfig().getInt("WANDERING TRADER");
    }
    public static void setWanderinTrader(boolean higherLower)
    {
        if(higherLower)
        {
            if(getWanderinTrader() < 100)
            {
                main.getConfig().set("WANDERING TRADER", getWanderinTrader() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("WANDERING TRADER", 0);
                main.saveConfig();
            }
        }else{
            if(getWanderinTrader() > 0)
            {
                main.getConfig().set("WANDERING TRADER", getWanderinTrader() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("WANDERING TRADER", 100);
                main.saveConfig();
            }
        }
    }

    //BAT
    public static int getBat()
    {
        return main.getConfig().getInt("BAT");
    }
    public static void setBat(boolean higherLower)
    {
        if(higherLower)
        {
            if(getBat() < 100)
            {
                main.getConfig().set("BAT", getBat() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("BAT", 0);
                main.saveConfig();
            }
        }else{
            if(getBat() > 0)
            {
                main.getConfig().set("BAT", getBat() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("BAT", 100);
                main.saveConfig();
            }
        }
    }

    //HORSE
    public static int getHorse()
    {
        return main.getConfig().getInt("HORSE");
    }
    public static void setHorse(boolean higherLower)
    {
        if(higherLower)
        {
            if(getHorse() < 100)
            {
                main.getConfig().set("HORSE", getHorse() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("HORSE", 0);
                main.saveConfig();
            }
        }else{
            if(getHorse() > 0)
            {
                main.getConfig().set("HORSE", getHorse() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("HORSE", 100);
                main.saveConfig();
            }
        }
    }

    //STRIDER
    public static int getStrider()
    {
        return main.getConfig().getInt("STRIDER");
    }
    public static void setStrider(boolean higherLower)
    {
        if(higherLower)
        {
            if(getStrider() < 100)
            {
                main.getConfig().set("STRIDER", getStrider() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("STRIDER", 0);
                main.saveConfig();
            }
        }else{
            if(getStrider() > 0)
            {
                main.getConfig().set("STRIDER", getStrider() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("STRIDER", 100);
                main.saveConfig();
            }
        }
    }

    //FOX
    public static int getFox()
    {
        return main.getConfig().getInt("FOX");
    }
    public static void setFox(boolean higherLower)
    {
        if(higherLower)
        {
            if(getFox() < 100)
            {
                main.getConfig().set("FOX", getFox() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("FOX", 0);
                main.saveConfig();
            }
        }else{
            if(getFox() > 0)
            {
                main.getConfig().set("FOX", getFox() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("FOX", 100);
                main.saveConfig();
            }
        }
    }

    //RABBIT
    public static int getRabbit()
    {
        return main.getConfig().getInt("RABBIT");
    }
    public static void setRabbit(boolean higherLower)
    {
        if(higherLower)
        {
            if(getRabbit() < 100)
            {
                main.getConfig().set("RABBIT", getRabbit() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("RABBIT", 0);
                main.saveConfig();
            }
        }else{
            if(getRabbit() > 0)
            {
                main.getConfig().set("RABBIT", getRabbit() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("RABBIT", 100);
                main.saveConfig();
            }
        }
    }

    //PARROT
    public static int getParrot()
    {
        return main.getConfig().getInt("PARROT");
    }
    public static void setParrot(boolean higherLower)
    {
        if(higherLower)
        {
            if(getParrot() < 100)
            {
                main.getConfig().set("PARROT", getParrot() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PARROT", 0);
                main.saveConfig();
            }
        }else{
            if(getParrot() > 0)
            {
                main.getConfig().set("PARROT", getParrot() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PARROT", 100);
                main.saveConfig();
            }
        }
    }

    //COD
    public static int getCod()
    {
        return main.getConfig().getInt("COD");
    }
    public static void setCod(boolean higherLower)
    {
        if(higherLower)
        {
            if(getCod() < 100)
            {
                main.getConfig().set("COD", getCod() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("COD", 0);
                main.saveConfig();
            }
        }else{
            if(getCod() > 0)
            {
                main.getConfig().set("COD", getCod() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("COD", 100);
                main.saveConfig();
            }
        }
    }

    //SALMON
    public static int getSalmon()
    {
        return main.getConfig().getInt("SALMON");
    }
    public static void setSalmon(boolean higherLower)
    {
        if(higherLower)
        {
            if(getSalmon() < 100)
            {
                main.getConfig().set("SALMON", getSalmon() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SALMON", 0);
                main.saveConfig();
            }
        }else{
            if(getSalmon() > 0)
            {
                main.getConfig().set("SALMON", getSalmon() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("SALMON", 100);
                main.saveConfig();
            }
        }
    }

    //PUFFERFISH
    public static int getPufferfish()
    {
        return main.getConfig().getInt("PUFFERFISH");
    }
    public static void setPufferfish(boolean higherLower)
    {
        if(higherLower)
        {
            if(getPufferfish() < 100)
            {
                main.getConfig().set("PUFFERFISH", getPufferfish() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PUFFERFISH", 0);
                main.saveConfig();
            }
        }else{
            if(getPufferfish() > 0)
            {
                main.getConfig().set("PUFFERFISH", getPufferfish() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("PUFFERFISH", 100);
                main.saveConfig();
            }
        }
    }

    //TROPICAL FISH
    public static int getTropicalFish()
    {
        return main.getConfig().getInt("TROPICAL FISH");
    }
    public static void setTropcialFish(boolean higherLower)
    {
        if(higherLower)
        {
            if(getTropicalFish() < 100)
            {
                main.getConfig().set("TROPICAL FISH", getTropicalFish() + 1);
                main.saveConfig();
            }else{
                main.getConfig().set("TROPICAL FISH", 0);
                main.saveConfig();
            }
        }else{
            if(getTropicalFish() > 0)
            {
                main.getConfig().set("TROPICAL FISH", getTropicalFish() - 1);
                main.saveConfig();
            }else{
                main.getConfig().set("TROPICAL FISH", 100);
                main.saveConfig();
            }
        }
    }





}
