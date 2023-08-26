package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface ClaimImplement {
	
	boolean hasClaimLocation(Location location);
	
	boolean isOwnerClaimLocation(Player player, Location location);

	boolean isMemberClaimLocation(Player player, Location location);
	
	Optional<UUID> getClaimOwner(Location location);

	Location[] getClaimCornersLocation(Player player, Location location);

	boolean canDestroyClaimLocation(Player player, Location location);
	
	Optional<String> getClaimName(Location location);
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();

}
