package info.duyan.rvg.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class JoinListener implements Listener {
	
	// Triggers on player login
	@EventHandler
	public void onLogin(PlayerLoginEvent event) {
		Bukkit.getServer().broadcastMessage("RNGcum");
	}
}
