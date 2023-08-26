package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.MoneyAPI;
import me.ulrich.clans.interfaces.MoneyImplement;

public class MoneyAPIManager implements MoneyAPI {

	public MoneyAPIManager(Clans plugin) {
		
	}
	
	@Override
	public Optional<MoneyImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, MoneyImplement> getImplementedMoney() {
		return null;
	}

	@Override
	public boolean addImplementation(String pluginName, MoneyImplement region) {
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
	public Optional<MoneyImplement> getMoneyImplemented(String pluginName) {
		return Optional.empty();
	}

	@Override
	public List<String> getImplementationPluginsNames() {
		return null;
	}

	@Override
	public HashMap<String, MoneyImplement> getImplementationPluginsData() {
		return null;
	}
	

	
}
