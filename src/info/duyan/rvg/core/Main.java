package info.duyan.rvg.core;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private static Plugin plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
	}
	
	@Override
	public void onDisable() {
		plugin = null;
	}
	
	
	// Plugin getter
	public static Plugin getPlugin() {
		return plugin;
	}
}
