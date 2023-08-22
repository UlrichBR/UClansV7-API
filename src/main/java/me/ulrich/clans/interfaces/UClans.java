package me.ulrich.clans.interfaces;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.api.AddonAPIManager;
import me.ulrich.clans.api.BossBarAPIManager;
import me.ulrich.clans.api.ClaimAPIManager;
import me.ulrich.clans.api.ClanAPIManager;
import me.ulrich.clans.api.CommandAPIManager;
import me.ulrich.clans.api.DiscordAPIManager;
import me.ulrich.clans.api.HologramAPIManager;
import me.ulrich.clans.api.HooksAPIManager;
import me.ulrich.clans.api.LevelAPIManager;
import me.ulrich.clans.api.LibAPIManager;
import me.ulrich.clans.api.LoggerAPIManager;
import me.ulrich.clans.api.ModerationAPIManager;
import me.ulrich.clans.api.MoneyAPIManager;
import me.ulrich.clans.api.PlayerAPIManager;
import me.ulrich.clans.api.RegionAPIManager;
import me.ulrich.clans.api.SyncAPIManager;

public interface UClans {

	JavaPlugin getPlugin();

	ClanAPIManager getClanAPI();

	PlayerAPIManager getPlayerAPI();
	
	MoneyAPIManager getMoneyAPI();
	
	HooksAPIManager getHooksAPI();
	
	BossBarAPIManager getBossBarAPI();
	
	AddonAPIManager getAddonAPI();
	
	LibAPIManager getLibAPI();
	
	LevelAPIManager getLevelAPI();
	
	ModerationAPIManager getModAPI();
	
	CommandAPIManager getCommandAPI();
	
	LoggerAPIManager getLoggerAPI();
	
	DiscordAPIManager getDiscordAPI();
	
	SyncAPIManager getSyncAPI();
	
	ClaimAPIManager getClaimAPI();
	
	RegionAPIManager getRegionAPI();

	HologramAPIManager getHologramAPI();
	
	void loadAddons();
	void startTasks();
	void registerEvents();

	void loadExtensions();

	
	

}
