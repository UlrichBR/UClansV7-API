package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface RegionAPI {

	HashMap<String, RegionImplement> getImplementedRegions();

	boolean addImplementation(String pluginName, RegionImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPlugins();

	Optional<RegionImplement> getRegionImplemented(String pluginName);
}
