package me.test.totenproject;

import org.bukkit.plugin.java.JavaPlugin;


public final class TotenProject extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getLogger().info("TotenProject has been enabled!");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getLogger().info("TotenProject has been disabled!");
    }
}
