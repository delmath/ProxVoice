package fr.delmath;

import org.bukkit.plugin.java.JavaPlugin;

import fr.delmath.listener.playerListener;

public class Main extends JavaPlugin {

	public static Main instance;
	
	@Override
	public void onEnable() {
		instance = this;
		
		// event register
		getServer().getPluginManager().registerEvents(new playerListener(), instance);
	}
	
	@Override
	public void onDisable() {
		
	}

	public static Main getInstance() {
		return instance;
	}
}
