package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.MapAPI;
import me.ulrich.clans.interfaces.MapImplement;

public class MapAPIManager implements MapAPI {

	public MapAPIManager(Clans clans) {
	}

	@Override
	public Optional<MapImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, MapImplement> getImplementedMap() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, MapImplement region) {
		return false;
	}

	@Override
	public boolean hasPluginImplemented(String pluginName) {
		return false;
	}

	@Override
	public boolean removeImplementation(String pluginName) {
		return false;
	}

	@Override
	public List<String> getImplementationPluginsName() {
		return null;
	}

	@Override
	public Optional<MapImplement> getMapImplemented(String pluginName) {
		return Optional.empty();
	}

	@Override
	public HashMap<String, MapImplement> getImplementationPluginsData() {
		return null;
	}



}
