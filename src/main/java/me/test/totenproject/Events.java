package me.test.totenproject;

import org.bukkit.entity.Animals;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Events implements Listener {

    @EventHandler
    public void onPlayerAttack(EntityDamageByEntityEvent event) {

        if(event.getDamager() instanceof Player) {

            Player damager = (Player) event.getDamager();

            System.out.println(damager.getName() + " attacked " + event.getEntity().getName());
        }

    }



}
