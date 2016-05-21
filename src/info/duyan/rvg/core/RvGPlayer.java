package info.duyan.rvg.core;

import org.bukkit.entity.Player;

public class RvGPlayer  {
	// Variable Initialization
	private Player pl;
	private String team;
	
	// Constructor
	public RvGPlayer(Player player, String teamName) {
		pl = player;
		team = teamName;
	}
	
	
	// Setters and Getters
	public void setTeam(String teamName) {
		team = teamName;
	}
	
	public String getTeam() {
		return team;
	}
	
	public Player getPlayer() {
		return pl;
	}
}
