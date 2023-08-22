package me.ulrich.clans.api;

import java.util.HashMap;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.Addon;
import me.ulrich.clans.interfaces.AddonAPI;

public class AddonAPIManager implements AddonAPI {


	public AddonAPIManager(Clans clans) {}
	
	@Override
	public HashMap<Addon, Boolean> getAddonEnabledList(){
		return null;
	}
	
	@Override
	public Addon getAddon(String AddonName){
		return null;
	}


	public Clans getPlugin() {
		return null;
	}

	@Override
	public String getDefaultBanner() {
		return null;
	}

	@Override
	public void setDefaultBanner(String defaultBanner) {}




}
