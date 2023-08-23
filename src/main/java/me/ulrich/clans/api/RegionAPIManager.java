package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.RegionAPI;
import me.ulrich.clans.interfaces.RegionImplement;

public class RegionAPIManager implements RegionAPI {

	public RegionAPIManager(Clans clans) {}

	@Override
	public HashMap<String, RegionImplement> getImplementedRegions() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, RegionImplement region) {
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
	public List<String> getImplementationPlugins() {
		return null;
	}

	@Override
	public Optional<RegionImplement> getRegionImplemented(String pluginName) {
		return Optional.empty();
	}



	

}
