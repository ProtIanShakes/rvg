package info.duyan.rvg.core;

import org.bukkit.entity.Player;

public class RvGPlayer //Class for each player, can be accessed through PlayerManager
{
	Player player;
	String team;
	public RvGPlayer(Player p) {
		player = p;
		team = PlayerManager.decideTeam();
	}
	
	public String getTeam() {
		return team;
	}
}
