package info.duyan.rvg.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import info.duyan.rvg.listeners.JoinListener;

public class Main extends JavaPlugin {
	private static Plugin plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		this.loadMethods();
	}
	
	@Override
	public void onDisable() {
		plugin = null;
	}
	
	
	// Loads event and command listeners
	public void loadMethods() {
		Bukkit.getServer().getPluginManager().registerEvents(new JoinListener(), this);
	}
	
	
	// Plugin getter
	public static Plugin getPlugin() {
		return plugin;
	}
}
