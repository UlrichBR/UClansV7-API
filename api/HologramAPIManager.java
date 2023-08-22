package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

import me.ulrich.clans.interfaces.HologramAPI;
import me.ulrich.clans.interfaces.HologramImplement;

public class HologramAPIManager implements HologramAPI {

	@Override
	public HashMap<String, HologramImplement> getHologramAPI() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, HologramImplement region) {
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
	public List<Entry<String, HologramImplement>> findHologramByImplement(String pluginName) {
		return null;
	}

	@Override
	public Optional<HologramImplement> getHologramImplemented(String pluginName) {
		return Optional.empty();
	}

}
