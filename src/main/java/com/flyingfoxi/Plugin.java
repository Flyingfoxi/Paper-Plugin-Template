package com.flyingfoxi;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class Plugin extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        getLogger().info("Plugin has been enabled");
    }


    @Override
    public void onDisable() {
        getLogger().info("Plugin has ben disabled");
    }
}
