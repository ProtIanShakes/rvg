package info.duyan.rvg.core;

import org.bukkit.entity.Player;

public class RvGPlayer //Class for each player, can be accessed through PlayerManager
{
	//Variable Initialization
	Player player;
	String team;
	String pClass = "none";
	
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
	
	//Returns selected class
	public String getpClass() {
		return pClass;
	}
	
	//Sets player's class
	public void setpClass(String playerclass) {
		pClass = playerclass;
	}
}
