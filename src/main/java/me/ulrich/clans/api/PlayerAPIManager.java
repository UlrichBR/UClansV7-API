package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.PlayerData;
import me.ulrich.clans.interfaces.PlayerAPI;
import me.ulrich.clans.interfaces.RegionAPI;

public class PlayerAPIManager implements PlayerAPI {

	public HashMap<String, RegionAPI> getRegionAPI(){
		return null;
	}
	
	public PlayerAPIManager(Clans clans) {}
	
	@Override
	public HashMap<UUID, PlayerData> getPlayerData(){
		return null;
	}
	
	@Override
	public UUID getClanID(UUID playerUUID) {
		return null;
	}
	
	@Override 
	public boolean isSameClan(UUID player1, UUID player2) {
		return false;
	}
	
	@Override
	public boolean canPVP(UUID player1, UUID player2) {
		return false;
	}
	
	@Override
	public boolean hasPlayerData(UUID playerUUID) {
		return false;
	}
	
	@Override
	public boolean hasPlayerData(Player player) {
		return false;
	}
	
	@Override
	public PlayerData getPlayerData(UUID playerUUID) {
		return null;
	}
	
	@Override
	public PlayerData getPlayerData(String player) {
		return null;
	}
	
	@Override
	public boolean isLockedChat(Player player) {
		return false;
	}
	
	@Override
	public boolean toggleChat(Player player) {
		return false;
	}
	
	@Override
	public boolean isInClan(UUID clanUUID, UUID playerUUID) {
		return false;
	}
	
	@Override
	public void updatePlayerSkinCache(UUID playerUUID) {}
	
	@Override 
	public void updatePlayerSkinCache(Player player) {}
	
	@Override
	public boolean hasClan(UUID playerUUID) {
		return false;
	}
	
	@Override
	public ClanData getPlayerClan(UUID playerUUID) {
		return null;
	}
	
	@Override
	public boolean resetPlayerKdr(UUID playerUUID) {
		return false;
	}
	
	@Override
	public void loadPlayerData(UUID playerUUID) {}
	
	@Override
	public void loadAllPlayerData() {}
	
	@Override
	public void savePlayerData(PlayerData player) {}
	
	@Override
	public double getPlayerKDR(UUID playerUUID) {
		return 0;
	}
	
	
}
