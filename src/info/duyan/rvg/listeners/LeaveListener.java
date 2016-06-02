package info.duyan.rvg.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import info.duyan.rvg.core.PlayerManager;

public class LeaveListener implements Listener {
	
	//Called whenever a player leaves the server (disconnect, kick, crash, etc.)
	@EventHandler
	public void onLeave(PlayerQuitEvent event) { 
		Player player = event.getPlayer();
		PlayerManager.removePlayer(player);
	}
}
