package com.ezyro.emanhmc.crateopener;

import org.bukkit.plugin.java.JavaPlugin;
import plus.crates.CratesPlus;

public class Main extends JavaPlugin {
    public void onEnable() {
        CratesPlus.getOpenHandler().registerOpener(new EmanhOpener(this, "emanhopener"));
    }
    public void onDisable() {
        getLogger().warning("Emanh CrateOpener is disabled! Using now default opener!");
    }
}
