package fr.delmath.utils;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlayerManager {
	
	public static ArrayList<PlayerData> dataList = new ArrayList<>();
	
	public static float getPlayerVolume(float distance) {
		if(distance < 0)
			return (0);
		float volume = (distance - 3) / (60 - 3) * (0 - 100) + 100;
		if(volume < 0)
			return(0);
		return volume;
	}
	
	public static void UpdatePlayerVolume() {
		int x = 0;
		for(PlayerData data : dataList) {
			float distance = GetPlayerDistance.getPlayerDistance(data.player_1, data.player_2);
			dataList.set(x, new PlayerData(data.player_1, data.player_2, distance, getPlayerVolume(distance)));
			x++;
		}
	}
	
	public static void addPlayer(Player player) {
		if (Bukkit.getOnlinePlayers().size() < 2)
			return;
		for(Player pls : Bukkit.getOnlinePlayers())
		{
			if(pls != player) {
				float distance = GetPlayerDistance.getPlayerDistance(player, pls);
				dataList.add(new PlayerData(player, pls, distance, getPlayerVolume(distance)));
			}
		}
		return;
	}
	
	public static void removePlayer(Player player) {
		if(dataList.size() < 1)
			return;
		if(Bukkit.getOnlinePlayers().size() < 2)
			dataList.clear();
		for(PlayerData plsd : dataList) {
			if(plsd.getPlayer_1() == player || plsd.getPlayer_2() == player)
				dataList.remove(plsd);
		}
		return;
	}
}
