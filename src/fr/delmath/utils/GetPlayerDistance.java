package fr.delmath.utils;

import org.bukkit.entity.Player;

public class GetPlayerDistance {

	public static float getPlayerDistance(Player player, Player target) {
		if(player.getWorld() == target.getWorld()) {
			return (float) (Math.sqrt(Math.pow((player.getLocation().getBlockX() - target.getLocation().getBlockX()), 2d) 
					+ Math.pow((player.getLocation().getBlockY() - target.getLocation().getBlockY()), 2d) 
					+ Math.pow((player.getLocation().getBlockZ() - target.getLocation().getBlockZ()), 2d)));
		}
		return(-1);
	}
	
}
