package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;

public interface HologramAPI {

	HashMap<String, HologramImplement> getHologramAPI();

	boolean addImplementation(String pluginName, HologramImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPlugins();

	List<Entry<String, HologramImplement>> findHologramByImplement(String pluginName);

	Optional<HologramImplement> getHologramImplemented(String pluginName);
}
