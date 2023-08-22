package me.ulrich.clans.interfaces;

import java.util.HashMap;

import me.ulrich.clans.data.Addon;

public interface AddonAPI {

	HashMap<Addon, Boolean> getAddonEnabledList();

	Addon getAddon(String AddonName);

	String getDefaultBanner();

	void setDefaultBanner(String defaultBanner);

}
