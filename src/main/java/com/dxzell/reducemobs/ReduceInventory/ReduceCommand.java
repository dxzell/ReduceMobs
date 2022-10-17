package com.dxzell.reducemobs.ReduceInventory;

import com.dxzell.reducemobs.ReduceMobs;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReduceCommand implements CommandExecutor {


    private ReduceMobs main;

    public ReduceCommand(ReduceMobs main)
    {
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(sender instanceof Player)
        {
            Player player = (Player) sender;
           if(cmd.getName().equals("reduce"))
           {
               if(player.hasPermission("reduce.admin"))
               {
                   if(main.getPassiveInv().getInv().getViewers().isEmpty() && main.getNeutralInv().getInv().getViewers().isEmpty() &&
                        main.getHostileInv().getInv().getViewers().isEmpty() && main.getSelectionInv().getInv().getViewers().isEmpty() &&
                           (main.getReduceInv().getInv() == null || main.getReduceInv().getInv().getViewers().isEmpty())) {
                       main.getSelectionInv().openSelectionInv(player);
                   }else{
                       player.sendMessage(ChatColor.RED + "Someone is adjusting the mob spawn rates right now. Please wait for him to finish.");
                   }
               }else{
                   player.sendMessage(ChatColor.RED + "Missing permission!");
               }
           }
        }

        return false;
    }
}
