package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface MapAPI {

	Optional<MapImplement> getPreferentialOrFirstImplement();

	HashMap<String, MapImplement> getImplementedMap();

	boolean addImplementation(String pluginName, MapImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPluginsName();
	
	Optional<MapImplement> getMapImplemented(String pluginName);

	HashMap<String, MapImplement> getImplementationPluginsData();

}
