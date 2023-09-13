package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.EncodedLocationData;
import me.ulrich.clans.data.ClanEnum.AllyInviteReturn;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.ClanEnum.RivalRemoveReturn;
import me.ulrich.clans.data.ClanEnum.SettingsFlagsAccept;
import me.ulrich.clans.data.ClanEnum.SettingsType;
import me.ulrich.clans.data.HomesData;
import me.ulrich.clans.data.ModerationData;

public interface ClanAPI {

	void saveClanData(ClanData clan, boolean asynchronously);
	
	void deleteClanData(UUID clanUUID, boolean asynchronously);
	
	void reloadClanData(UUID clanUUID, boolean asynchronously);
	
	void loadAllClanData(boolean asynchronously);
	
	 HashMap<UUID, ClanData> getClanData();
	
	Optional<UUID> getClanByTag(String tag);
	
	Optional<ClanData> getClanDataByTag(String tag);
	
	boolean tagExists(String tag);
	
	boolean clanExists(UUID clanUUID);
	
	Optional<ClanData> getClan(UUID clanUUID);
	
	boolean verifyClan(UUID clanUUID);
	
	boolean allyAdd(UUID clanUUID1, UUID clanUUID2);
	
	boolean allyRemove(UUID clanUUID1, UUID clanUUID2);

	AllyInviteReturn allySend(UUID senderid, UUID receiverid, boolean mult);

	boolean rivalAdd(UUID clanUUID1, UUID clanUUID2);
	
	boolean rivalRemove(UUID clanUUID1, UUID clanUUID2);
	
	RivalRemoveReturn rivalRemoveSend(UUID senderid, UUID receiverid, boolean mult);
	
	boolean isClanAlly(UUID clan1UUID, UUID clan2UUID);
	
	boolean isClanRival(UUID clan1UUID, UUID clan2UUID);
	
	void clanMessageSend(UUID id, String text);
	
	void clanChatSend(Player sender, String message, boolean offsync);
	
	void clanChatSend(UUID sender, String message, boolean offsync);
	
	boolean promotePlayer(UUID id, UUID promoted, Optional<ModerationData> mod);
	
	boolean demotePlayer(UUID id, UUID demoted, Optional<ModerationData> mod);
	
	boolean banPlayer(UUID clanUUID, UUID playerUUID, UUID sender);
	
	boolean unbanPlayer(UUID clanUUID, UUID playerUUID);
	
	boolean kickPlayer(UUID clanUUID, UUID playerUUID, UUID sender);
	
	boolean changeLeader(UUID clanUUID, Player player);
	
	boolean changeLeader(UUID clanUUID, UUID playerUUID);
	
	boolean modTag(ClanData clan, String tag, Player sender);
	
	boolean modDesc(ClanData clan, String desc, Player sender);
	
	boolean changeSetting(ClanData clan, SettingsType type, SettingsFlagsAccept value);
	
	boolean toggleFF(ClanData clan);
	
	boolean deleteBanner(UUID clanUUID, Player player);

	boolean setBanner(UUID clanUUID, Player player, ItemStack itemstack);
		
	boolean hasHome(UUID playerUUID, String home);
	
	boolean setHome(UUID player, Location location, String name);
	
	boolean deleteHome(UUID playerUUID, String name);
	
	Optional<Location> getHomeLocation(UUID player, String home);
	
	Optional<EncodedLocationData> getEncodedHomeLocation(UUID player, String home);
	
	Optional<HomesData> getHomeData(UUID player, String home);
	
	boolean deleteClan(UUID uuid);
	
	boolean deletePlayerClan(UUID player);
	
	Optional<ClanData> createNewClan(Player player, String tag, String desc, long date);
	
	void teleportDelay(Player player, Optional<EncodedLocationData> encodedLocation, boolean checkcooldown);
		
	List<ClanData> getAllClansData();
	
	List<String> getAllClansTags();
	
	List<UUID> getAllClansUUID();
	
	List<ClanData> getTopClansData(PlaceholderTop top);
	
	HashMap<UUID, Float> getTopClans(PlaceholderTop top);
	
	void sort(List<ClanData> clans, PlaceholderTop top);
	
	double getClanKDR(UUID clanUUID);
	
	boolean resetClanKDR(ClanData clan);
	
	boolean resetClanKDR(UUID clanUUID);
	
	boolean addExtraChest(UUID clanUUID, int amount, CommandSender sender);
	
	boolean addSlot(String tag, int amount, CommandSender sender);
	
	boolean addSlot(UUID clanUUID, int amount, CommandSender sender);
	
	boolean removeSlot(String tag, int amount, CommandSender sender);
	
	boolean removeSlot(UUID clanUUID, int amount, CommandSender sender);
	
	boolean setSlot(String tag, int amount, CommandSender sender);
	
	boolean setSlot(UUID clanUUID, int amount, CommandSender sender);
	
	boolean canMemberJoin(UUID clanUUID);
	
	boolean hasClanModerationOnline(UUID clanUUID);
	
	String parseText(UUID player, String text);
	
	List<ClanData> getRivalries(UUID clanUUID);
	
	List<ClanData> getAlliances(UUID clanUUID);
	
	boolean tryChangeModtag(Player player, String tag);
	
	boolean tryChangeDesc(Player player, String desc);
	
	boolean tryCreateHome(Player player,String name);
	
	boolean tryCreateClan(Player player, String tag);
	
	boolean hasAddonEnabled(String name);
	
	boolean hasExtensionEnabled(String name);

	boolean toggleGlobalFF(CommandSender player);
	
	boolean isGlobalFF();


	

	


}
