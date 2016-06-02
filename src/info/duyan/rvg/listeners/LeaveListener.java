package info.duyan.rvg.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveListener implements Listener {
	
	//Called whenever a player leaves the server (disconnect, kick, crash, etc.)
	@EventHandler
	public void onLeave(PlayerQuitEvent event) { 
		
	}
}
