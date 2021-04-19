package ml.zdoctor;

import ml.zdoctor.commands.AbilityCommand;
import ml.zdoctor.gui.CustomInventory;
import ml.zdoctor.listeners.InvEvents;
import org.bukkit.plugin.java.JavaPlugin;

public class DemonSlayer extends JavaPlugin {

    public static DemonSlayer plugin;

    @Override
    public void onEnable() {
        plugin = this;

        plugin.saveDefaultConfig();

        getCommand("ability").setExecutor(new AbilityCommand());

        getServer().getPluginManager().registerEvents(new InvEvents(), this);
        getServer().getPluginManager().registerEvents(new CustomInventory(), this);
    }
    @Override
    public void onDisable() {
        saveConfig();
    }
}
