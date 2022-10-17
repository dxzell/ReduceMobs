package com.dxzell.reducemobs;

import com.dxzell.reducemobs.ReduceInventory.HostileInventory.HostileInventory;
import com.dxzell.reducemobs.ReduceInventory.HostileInventory.HostileListener;
import com.dxzell.reducemobs.ReduceInventory.MobSpawnListener;
import com.dxzell.reducemobs.ReduceInventory.NeutralInventory.NeutralInventory;
import com.dxzell.reducemobs.ReduceInventory.NeutralInventory.NeutralListener;
import com.dxzell.reducemobs.ReduceInventory.PassiveInventory.PassiveInventory;
import com.dxzell.reducemobs.ReduceInventory.PassiveInventory.PassiveListener;
import com.dxzell.reducemobs.ReduceInventory.ReduceCommand;
import com.dxzell.reducemobs.ReduceInventory.ReduceInventory;
import com.dxzell.reducemobs.ReduceInventory.ReduceListener;
import com.dxzell.reducemobs.SelectionInventory.SelectionInventory;
import com.dxzell.reducemobs.SelectionInventory.SelectionListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class ReduceMobs extends JavaPlugin {

    private Config config = new Config(this);

    private SelectionInventory selectionInv = new SelectionInventory(this);
    private HostileInventory hostileInv = new HostileInventory(this);
    private NeutralInventory neutralInv = new NeutralInventory(this);
    private PassiveInventory passiveInv = new PassiveInventory(this);

    private ReduceInventory reduceInv = new ReduceInventory(this);

    private HashMap<Player, String> usage = new HashMap<Player, String>();


    @Override
    public void onEnable() {

        Bukkit.getPluginManager().registerEvents(new SelectionListener(this), this);
        Bukkit.getPluginManager().registerEvents(new HostileListener(hostileInv), this);
        Bukkit.getPluginManager().registerEvents(new ReduceListener(this), this);
        Bukkit.getPluginManager().registerEvents(new NeutralListener(this), this);
        Bukkit.getPluginManager().registerEvents(new PassiveListener(this), this);
        Bukkit.getPluginManager().registerEvents(new MobSpawnListener(), this);
        getCommand("reduce").setExecutor(new ReduceCommand(this));

        System.out.println("ReduceMobs by dxzell");

    }

    public ItemStack buildItemStack(Material mat, String displayName, String lore, boolean enchantment)
    {
        ItemStack stack = new ItemStack(mat);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(displayName);

        //Splitting the lore

        String[] splitLore = lore.split("°");
        List<String> loreList = new ArrayList<>();
        for(String split : splitLore)
        {
            loreList.add(split);
        }
        meta.setLore(loreList);

        //End

        if(enchantment) meta.addEnchant(Enchantment.KNOCKBACK, 0, false);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        stack.setItemMeta(meta);

        return stack;

    }

    public void putUsage(Player player, String usage)
    {
        this.usage.put(player, usage);
    }

    public HashMap<Player, String> getUsage()
    {
        return usage;
    }

    public HostileInventory getHostileInv() {
        return hostileInv;
    }
    public NeutralInventory getNeutralInv(){
        return neutralInv;
    }
    public PassiveInventory getPassiveInv(){
        return passiveInv;
    }

    public SelectionInventory getSelectionInv()
    {
        return selectionInv;
    }

    public ReduceInventory getReduceInv()
    {
        return reduceInv;
    }
}
