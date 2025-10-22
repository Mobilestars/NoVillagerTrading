package de.scholle.noVillagerTrading;

import org.bukkit.plugin.java.JavaPlugin;

public class NoVillagerTrading extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new VillagerTradeBlocker(this), this);
        getLogger().info("NoVillagerTrading has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("NoVillagerTrading has been disabled!");
    }
}
