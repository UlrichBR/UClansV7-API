package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.Optional;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public interface RegionImplement {
	
	boolean hasRegion(String regionName, Location location);
	
	boolean isPVPAllowed(Player player, Location location);
	
	boolean isExitAllowed(Player player, Location location);
	
	boolean isInRegion(Player player, String regionName);
	
	List<String> getPlayerRegion(Player player);
	
	boolean hasBuildPermission(Player player, Block block);
	
	List<String> getLocationRegion(Location loc);
	
	List<String> getWorldRegionList(World world);
	
	Optional<String> getPluginVersion();

}
