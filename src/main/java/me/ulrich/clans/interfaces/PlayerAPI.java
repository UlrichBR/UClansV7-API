package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ModerationData;
import me.ulrich.clans.data.PlayerData;
import me.ulrich.clans.data.ClanEnum.PlayerSettingsType;
import me.ulrich.clans.data.ClanEnum.SettingsFlagsAccept;


public interface PlayerAPI {

	public void loadAllPlayerData(boolean asynchronously);

	void loadAllPlayerDataByClan(UUID clanUUID, boolean asynchronously);

	void loadPlayerData(UUID uuid, boolean asynchronously);

	void savePlayerData(PlayerData player, boolean asynchronously);

	HashMap<UUID, PlayerData> getPlayerData();

	void loadAllOnlineInfo();

	boolean hasClan(UUID uuid);

	Optional<UUID> getClanID(UUID uuid);

	boolean hasClan(String nickname);

	Optional<ClanData> getPlayerClan(UUID uuid);

	Optional<ClanData> getPlayerClan(String nickname);

	boolean hasPlayerData(UUID uuid);

	boolean hasPlayerData(String nickname);

	Optional<PlayerData>getPlayerData(UUID uuid);

	Optional<PlayerData> getPlayerData(String nickname);

	boolean hasPlayerData(Player player);

	boolean isSameClan(UUID playerUUID1, UUID playerUUID2);

	boolean canPVP(UUID playerUUID1, UUID playerUUID2);

	boolean canRegionPVP(Player attacker, Player victim);

	boolean isLockedChat(Player player);

	boolean isLockedChat(UUID playerUUID);

	boolean toggleChat(Player player);

	boolean toggleChat(UUID playerUUID);

	boolean isInClan(UUID clanUUID, UUID playerUUID);

	boolean isBanned(UUID clanUUID, UUID playerUUID);

	boolean openedJoin(Player player, UUID clanUUID);

	boolean openedJoin(UUID player, UUID clanUUID);

	double getPlayerKDR(UUID playerUUID);

	boolean resetPlayerKdr(UUID uuid);

	void updatePlayerKDR(Player attacker, Player victim);

	Optional<PlayerData> checkPlayerData(Player player);

	Optional<PlayerData> checkPlayerData(UUID player);

	boolean removePlayerData(UUID uuid);

	boolean addClanPlayer(PlayerData pData, UUID clanid, Optional<ModerationData> moderation);

	boolean removeClanPlayer(PlayerData pData, UUID clanid);

	boolean updatePlayerRole(PlayerData pData, Optional<ModerationData> moderation);

	boolean changeNickname(UUID uniqueId, String object);

	boolean tryChangeNickname(Player player, String newNickname);

	boolean changeSetting(UUID player, PlayerSettingsType type, SettingsFlagsAccept value);

	void tryDamageIndicator(Player attacker, Player victim, double damage);

	boolean isRival(UUID playerUUID1, UUID playerUUID2);

	boolean isAlly(UUID playerUUID1, UUID playerUUID2);

	boolean leaveClan(Player player);

	boolean leaveClan(UUID uuid);

	boolean toggleChatSpy(CommandSender sender);

	boolean isLeader(UUID uuid);

	boolean isLeader(UUID playerUUID, UUID clanUUID);

	void updatePlayerSkin(UUID player);

}
