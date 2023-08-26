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
	public Optional<RegionImplement> getRegionImplemented(String pluginName) {
		return Optional.empty();
	}

	@Override
	public Optional<RegionImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public List<String> getImplementationPluginsNames() {
		return null;
	}

	@Override
	public HashMap<String, RegionImplement> getImplementationPluginsData() {
		return null;
	}



	

}
