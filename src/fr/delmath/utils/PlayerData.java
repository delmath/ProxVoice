package fr.delmath.utils;

import org.bukkit.entity.Player;

public class PlayerData {

	public Player player_1;
	public Player player_2;
	public Float distance;
	public Float volume;
	
	public PlayerData(Player player_1, Player player_2, Float distance, Float volume) {
		super();
		this.player_1 = player_1;
		this.player_2 = player_2;
		this.distance = distance;
		this.volume = volume;
	}
	
	public Player getPlayer_1() {
		return player_1;
	}
	public void setPlayer_1(Player player_1) {
		this.player_1 = player_1;
	}
	public Player getPlayer_2() {
		return player_2;
	}
	public void setPlayer_2(Player player_2) {
		this.player_2 = player_2;
	}
	public Float getDistance() {
		return distance;
	}
	public void setDistance(Float distance) {
		this.distance = distance;
	}
	public Float getVolume() {
		return volume;
	}
	public void setVolume(Float volume) {
		this.volume = volume;
	}
}
