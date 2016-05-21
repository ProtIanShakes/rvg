package info.duyan.rvg.core;

import java.util.HashMap;
import org.bukkit.entity.Player;

public class PlayerManager {
	// Variable Initialization
	HashMap<Player, RvGPlayer> players = new HashMap<Player, RvGPlayer>();
	
	
	// Adds Player to Hash
	public void addPlayer(Player pl, RvGPlayer RvGpl) {
		players.put(pl, RvGpl);
	}
	
	// Removes Player from Hash
	public void removePlayer(Player pl) {
		players.remove(pl);
	}

}
