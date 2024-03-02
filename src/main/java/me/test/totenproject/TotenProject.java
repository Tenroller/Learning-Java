package me.test.totenproject;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;


public final class TotenProject extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getLogger().info("TotenProject has been enabled!");

        Bukkit.getPluginManager().registerEvents(new Events(), this);

        this.getCommand("toten").setExecutor(new Commands());


    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getLogger().info("TotenProject has been disabled!");
    }
}
