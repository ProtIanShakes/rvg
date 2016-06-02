package info.duyan.rvg.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import info.duyan.rvg.core.PlayerManager;
import info.duyan.rvg.core.RvGPlayer;

public class JoinListener implements Listener {
	
	// Triggers on player login
	@EventHandler
	public void onLogin(PlayerLoginEvent e) {
		Player pl = e.getPlayer();
		
		RvGPlayer rPlayer = new RvGPlayer(pl);
		PlayerManager.addPlayer(pl, rPlayer);
	}
}
