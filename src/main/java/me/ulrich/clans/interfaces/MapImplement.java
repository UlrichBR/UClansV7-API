package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;

import me.ulrich.clans.data.MapData;

public interface MapImplement {
	
	boolean removeMap(String markId);
	
	boolean createMap(String markId, Player sender, MapData data);

	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();

}
