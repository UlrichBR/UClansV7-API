package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

import org.bukkit.Location;

public interface ClaimAPI {

	HashMap<String, ClaimImplement> getImplementedClaim();

	boolean addImplementation(String pluginName, ClaimImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPlugins();

	List<Entry<String, ClaimImplement>> findClaimedLocationImplement(Location location);

	Optional<ClaimImplement> getClaimImplemented(String pluginName);

}
