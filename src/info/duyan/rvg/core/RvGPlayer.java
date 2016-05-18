package info.duyan.rvg.core;

import org.bukkit.entity.Player;

public class RvGPlayer {
	Player p;
	String team;
	RvGPlayer(Player player, String teamName) {
		p = player;
		team = teamName;
	}
}
