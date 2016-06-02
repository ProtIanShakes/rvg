package info.duyan.rvg.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.bukkit.entity.Player;

public class PlayerManager {
	// Variable Initialization
	static HashMap<Player, RvGPlayer> players = new HashMap<Player, RvGPlayer>();
	
	
	// Adds Player to Hash
	public static void addPlayer(Player pl, RvGPlayer rPlayer) {
		players.put(pl, rPlayer);
	}
	
	// Removes Player from Hash
	public void removePlayer(Player pl) {
		players.remove(pl);
	}
	
	// Gets RvGPlayer based on Player key
	public static RvGPlayer getRvGPlayer(Player pl) {
		return players.get(pl);
	}
	
	
	//Decides what team to put a player on (does not take balancing/player level into account, this will be implemented in a later version)
	//This function is VERY temporary, it's very inefficient and will be completely re-written before release
	public static String decideTeam() {
		
		int green = 0;
		int red = 0;
		ArrayList<Player> players = getPlayers();
		for(int i = 0; i < players.size(); i++) {
			if(getRvGPlayer(players.get(i)).getTeam().equalsIgnoreCase("green")) {
				green++;
			}
			else {
				red++;
			}
		}
		
		if(green > red) {
			return "red";
		}
		else if(red > green) {
			return "green";
		}
		else {
			Random rnd = new Random();
			if(rnd.nextBoolean()) {
				return "green";
			}
			else {
				return "red";
			}
		}
	}
	
	//Gets ArrayList of Players
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
