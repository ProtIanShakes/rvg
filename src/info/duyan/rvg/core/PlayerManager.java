package info.duyan.rvg.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.bukkit.entity.Player;

public class PlayerManager {
	// Variable Initialization
	static HashMap<Player, String> players = new HashMap<Player, String>();
	
	
	// Adds Player to Hash
	public static void addPlayer(Player pl, String team) {
		players.put(pl, team);
	}
	
	// Removes Player from Hash
	public void removePlayer(Player pl) {
		players.remove(pl);
	}
	
	// Gets RvGPlayer based on Player key
	public void getTeam(Player pl) {
		players.get(pl);
	}
	
	public static String decideTeam() {
		
		if(getPlayers().size() == 0) {
			return "green";
		}
		else if(getPlayers().size() % 2 == 0) {
			return "green";
		}
		else {
			return "red";
		}
	}
	
	public static ArrayList<Player> getPlayers() {
		Set<Player> pSet = players.keySet();
		Iterator<Player> pIter = pSet.iterator();
		ArrayList<Player> output = new ArrayList<Player>();
		
		while(pIter.hasNext()) {
			output.add(pIter.next());
		}
		
		return output;
	}
}
