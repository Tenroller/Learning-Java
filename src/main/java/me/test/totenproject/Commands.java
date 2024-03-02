package me.test.totenproject;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender.hasPermission("totenproject.command")) {
            if (cmd.getName().equalsIgnoreCase("toten")) {
                if (args.length == 0) {
                    sender.sendMessage("You need to specify a name for the toten!");
                    return false;
                } else {
                    String name = args[0];
                    Player player = (Player) sender;
                    Toten toten = new Toten(name, 100, player.getLocation());
                    toten.spawn();
                    sender.sendMessage("Toten " + name + " has been created!");
                    return true;
                }
            }
        } else
        {
            sender.sendMessage("You don't have permission to use this command!");
            return false;
        }

        return false;
    }


}
