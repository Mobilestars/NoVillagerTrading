package de.scholle.noVillagerTrading;

import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class VillagerTradeBlocker implements Listener {

    private final NoVillagerTrading plugin;

    public VillagerTradeBlocker(NoVillagerTrading plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerInteractWithVillager(PlayerInteractEntityEvent event) {
        if (!(event.getRightClicked() instanceof Villager)) return;

        if (!plugin.getConfig().getBoolean("villagerTradingEnabled", false)) {
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.sendMessage("§cTrading with villagers is disabled!");
        }
    }
}
