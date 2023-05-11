package fr.delmath.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import fr.delmath.utils.PlayerManager;

public class playerListener implements Listener {

	@EventHandler
	public void PlayerJoinEvent(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		PlayerManager.addPlayer(player);
	}
	
	@EventHandler
	public void PlayerQuitEvent(PlayerQuitEvent e) {
		Player player = e.getPlayer();
		PlayerManager.removePlayer(player);
	}
	
	@EventHandler
	public void PlayerMoveEvent(PlayerMoveEvent e) {
		PlayerManager.UpdatePlayerVolume();
	}
}
