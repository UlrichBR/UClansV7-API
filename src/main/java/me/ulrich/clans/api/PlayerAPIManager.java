package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.PlayerSettingsType;
import me.ulrich.clans.data.ClanEnum.SettingsFlagsAccept;
import me.ulrich.clans.data.ModerationData;
import me.ulrich.clans.data.PlayerData;
import me.ulrich.clans.interfaces.PlayerAPI;

public class PlayerAPIManager implements PlayerAPI {

	public PlayerAPIManager(Clans plugin) {}

	
	@Override
	public void loadAllPlayerData(boolean asynchronously) {

		
	}

	@Override
	public void loadAllPlayerDataByClan(UUID clanUUID, boolean asynchronously) {

		
	}

	@Override
	public void loadPlayerData(UUID uuid, boolean asynchronously) {

		
	}

	@Override
	public void savePlayerData(PlayerData player, boolean asynchronously) {

		
	}

	@Override
	public HashMap<UUID, PlayerData> getPlayerData() {

		return null;
	}

	@Override
	public void loadAllOnlineInfo() {

		
	}

	@Override
	public boolean hasClan(UUID uuid) {

		return false;
	}

	@Override
	public Optional<UUID> getClanID(UUID uuid) {

		return Optional.empty();
	}

	@Override
	public boolean hasClan(String nickname) {

		return false;
	}

	@Override
	public Optional<ClanData> getPlayerClan(UUID uuid) {

		return Optional.empty();
	}

	@Override
	public Optional<ClanData> getPlayerClan(String nickname) {

		return Optional.empty();
	}

	@Override
	public boolean hasPlayerData(UUID uuid) {

		return false;
	}

	@Override
	public boolean hasPlayerData(String nickname) {

		return false;
	}

	@Override
	public Optional<PlayerData> getPlayerData(UUID uuid) {

		return Optional.empty();
	}

	@Override
	public Optional<PlayerData> getPlayerData(String nickname) {

		return Optional.empty();
	}

	@Override
	public boolean hasPlayerData(Player player) {

		return false;
	}

	@Override
	public boolean isSameClan(UUID playerUUID1, UUID playerUUID2) {

		return false;
	}

	@Override
	public boolean canPVP(UUID playerUUID1, UUID playerUUID2) {

		return false;
	}

	@Override
	public boolean canRegionPVP(Player attacker, Player victim) {

		return false;
	}

	@Override
	public boolean isLockedChat(Player player) {

		return false;
	}

	@Override
	public boolean isLockedChat(UUID playerUUID) {

		return false;
	}

	@Override
	public boolean toggleChat(Player player) {

		return false;
	}

	@Override
	public boolean toggleChat(UUID playerUUID) {

		return false;
	}

	@Override
	public boolean isInClan(UUID clanUUID, UUID playerUUID) {

		return false;
	}

	@Override
	public boolean isBanned(UUID clanUUID, UUID playerUUID) {

		return false;
	}

	@Override
	public boolean openedJoin(Player player, UUID clanUUID) {

		return false;
	}

	@Override
	public boolean openedJoin(UUID player, UUID clanUUID) {

		return false;
	}

	@Override
	public double getPlayerKDR(UUID playerUUID) {

		return 0;
	}

	@Override
	public boolean resetPlayerKdr(UUID uuid) {

		return false;
	}

	@Override
	public void updatePlayerKDR(Player attacker, Player victim) {

		
	}

	@Override
	public Optional<PlayerData> checkPlayerData(Player player) {

		return Optional.empty();
	}

	@Override
	public Optional<PlayerData> checkPlayerData(UUID player) {

		return Optional.empty();
	}

	@Override
	public boolean removePlayerData(UUID uuid) {

		return false;
	}

	@Override
	public boolean addClanPlayer(PlayerData pData, UUID clanid, Optional<ModerationData> moderation) {

		return false;
	}

	@Override
	public boolean removeClanPlayer(PlayerData pData, UUID clanid) {

		return false;
	}

	@Override
	public boolean updatePlayerRole(PlayerData pData, Optional<ModerationData> moderation) {

		return false;
	}

	@Override
	public boolean changeNickname(UUID uniqueId, String object) {

		return false;
	}

	@Override
	public boolean tryChangeNickname(Player player, String newNickname) {

		return false;
	}

	@Override
	public boolean changeSetting(UUID player, PlayerSettingsType type, SettingsFlagsAccept value) {

		return false;
	}

	@Override
	public void tryDamageIndicator(Player attacker, Player victim, double damage) {

		
	}

	@Override
	public boolean isRival(UUID playerUUID1, UUID playerUUID2) {

		return false;
	}

	@Override
	public boolean isAlly(UUID playerUUID1, UUID playerUUID2) {

		return false;
	}

	@Override
	public boolean leaveClan(Player player) {

		return false;
	}

	@Override
	public boolean leaveClan(UUID uuid) {

		return false;
	}

	@Override
	public boolean toggleChatSpy(CommandSender sender) {

		return false;
	}

	@Override
	public boolean isLeader(UUID uuid) {

		return false;
	}

	@Override
	public boolean isLeader(UUID playerUUID, UUID clanUUID) {

		return false;
	}

	@Override
	public void updatePlayerSkin(UUID player) {

		
	}

	
}
