package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.PlayerData;

public interface PlayerAPI {

	UUID getClanID(UUID uuid);

	boolean isSameClan(UUID player1, UUID player2);

	boolean canPVP(UUID player1, UUID player2);

	boolean hasPlayerData(UUID uuid);

	boolean hasPlayerData(Player player);

	PlayerData getPlayerData(UUID playerUUID);

	PlayerData getPlayerData(String player);

	boolean isLockedChat(Player player);

	boolean toggleChat(Player player);

	boolean isInClan(UUID clanUUID, UUID playerUUID);

	void updatePlayerSkinCache(UUID playerUUID);

	void updatePlayerSkinCache(Player player);

	boolean hasClan(UUID playerUUID);

	ClanData getPlayerClan(UUID playerUUID);

	boolean resetPlayerKdr(UUID playerUUID);

	void loadPlayerData(UUID playerUUID);

	void savePlayerData(PlayerData player);

	void loadAllPlayerData();

	double getPlayerKDR(UUID playerUUID);
	
	HashMap<UUID, PlayerData> getPlayerData();


	


	


	

}
