package info.duyan.rvg.core;

import org.bukkit.entity.Player;

public class RvGPlayer //Class for each player, can be accessed through PlayerManager
{
	//Variable Initialization
	Player player;
	String team;
	
	//Le Constructor
	public RvGPlayer(Player p) {
		player = p;
		team = PlayerManager.decideTeam();
	}
	
	//Returns team (red or green)
	public String getTeam() {
		return team;
	}
	
	//Sets team (will be used in future for balancing teams, pretty much useless for now tho)
	public void setTeam(String t) {
		team = t;
	}
}
