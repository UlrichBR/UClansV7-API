package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.AllyInviteReturn;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.ClanEnum.RivalRemoveReturn;
import me.ulrich.clans.data.ClanEnum.SettingsFlagsAccept;
import me.ulrich.clans.data.ClanEnum.SettingsType;
import me.ulrich.clans.data.EncodedLocationData;
import me.ulrich.clans.data.HomesData;
import me.ulrich.clans.data.ModerationData;
import me.ulrich.clans.interfaces.ClanAPI;

public class ClanAPIManager implements ClanAPI {
	

	public ClanAPIManager(Clans plugin) {}

	@Override
	public void saveClanData(ClanData clan, boolean asynchronously) {

		
	}

	@Override
	public void deleteClanData(UUID clanUUID, boolean asynchronously) {

		
	}

	@Override
	public void reloadClanData(UUID clanUUID, boolean asynchronously) {

		
	}

	@Override
	public void loadAllClanData(boolean asynchronously) {

		
	}

	@Override
	public HashMap<UUID, ClanData> getClanData() {

		return null;
	}

	@Override
	public Optional<UUID> getClanByTag(String tag) {

		return Optional.empty();
	}

	@Override
	public Optional<ClanData> getClanDataByTag(String tag) {

		return Optional.empty();
	}

	@Override
	public boolean tagExists(String tag) {

		return false;
	}

	@Override
	public boolean clanExists(UUID clanUUID) {

		return false;
	}

	@Override
	public Optional<ClanData> getClan(UUID clanUUID) {

		return Optional.empty();
	}

	@Override
	public boolean verifyClan(UUID clanUUID) {

		return false;
	}

	@Override
	public boolean allyAdd(UUID clanUUID1, UUID clanUUID2) {

		return false;
	}

	@Override
	public boolean allyRemove(UUID clanUUID1, UUID clanUUID2) {

		return false;
	}

	@Override
	public AllyInviteReturn allySend(UUID senderid, UUID receiverid, boolean mult) {

		return null;
	}

	@Override
	public boolean rivalAdd(UUID clanUUID1, UUID clanUUID2) {

		return false;
	}

	@Override
	public boolean rivalRemove(UUID clanUUID1, UUID clanUUID2) {

		return false;
	}

	@Override
	public RivalRemoveReturn rivalRemoveSend(UUID senderid, UUID receiverid, boolean mult) {

		return null;
	}

	@Override
	public boolean isClanAlly(UUID clan1uuid, UUID clan2uuid) {

		return false;
	}

	@Override
	public boolean isClanRival(UUID clan1uuid, UUID clan2uuid) {

		return false;
	}

	@Override
	public void clanMessageSend(UUID id, String text) {

		
	}

	@Override
	public void clanChatSend(Player sender, String message, boolean offsync) {

		
	}

	@Override
	public void clanChatSend(UUID sender, String message, boolean offsync) {

		
	}

	@Override
	public boolean promotePlayer(UUID id, UUID promoted, Optional<ModerationData> mod) {

		return false;
	}

	@Override
	public boolean demotePlayer(UUID id, UUID demoted, Optional<ModerationData> mod) {

		return false;
	}

	@Override
	public boolean banPlayer(UUID clanUUID, UUID playerUUID, UUID sender) {

		return false;
	}

	@Override
	public boolean unbanPlayer(UUID clanUUID, UUID playerUUID) {

		return false;
	}

	@Override
	public boolean kickPlayer(UUID clanUUID, UUID playerUUID, UUID sender) {

		return false;
	}

	@Override
	public boolean changeLeader(UUID clanUUID, Player player) {

		return false;
	}

	@Override
	public boolean changeLeader(UUID clanUUID, UUID playerUUID) {

		return false;
	}

	@Override
	public boolean modTag(ClanData clan, String tag, Player sender) {

		return false;
	}

	@Override
	public boolean modDesc(ClanData clan, String desc, Player sender) {

		return false;
	}

	@Override
	public boolean changeSetting(ClanData clan, SettingsType type, SettingsFlagsAccept value) {

		return false;
	}

	@Override
	public boolean toggleFF(ClanData clan) {

		return false;
	}

	@Override
	public boolean deleteBanner(UUID clanUUID, Player player) {

		return false;
	}

	@Override
	public boolean setBanner(UUID clanUUID, Player player, ItemStack itemstack) {

		return false;
	}

	@Override
	public boolean hasHome(UUID playerUUID, String home) {

		return false;
	}

	@Override
	public boolean setHome(UUID player, Location location, String name) {

		return false;
	}

	@Override
	public boolean deleteHome(UUID playerUUID, String name) {

		return false;
	}

	@Override
	public Optional<Location> getHomeLocation(UUID player, String home) {

		return Optional.empty();
	}

	@Override
	public Optional<EncodedLocationData> getEncodedHomeLocation(UUID player, String home) {

		return Optional.empty();
	}

	@Override
	public Optional<HomesData> getHomeData(UUID player, String home) {

		return Optional.empty();
	}

	@Override
	public boolean deleteClan(UUID uuid) {

		return false;
	}

	@Override
	public boolean deletePlayerClan(UUID player) {

		return false;
	}

	@Override
	public Optional<ClanData> createNewClan(Player player, String tag, String desc, long date) {

		return Optional.empty();
	}

	@Override
	public void teleportDelay(Player player, Optional<EncodedLocationData> encodedLocation, boolean checkcooldown) {

		
	}

	@Override
	public List<ClanData> getAllClansData() {

		return null;
	}

	@Override
	public List<String> getAllClansTags() {

		return null;
	}

	@Override
	public List<UUID> getAllClansUUID() {

		return null;
	}

	@Override
	public List<ClanData> getTopClansData(PlaceholderTop top) {

		return null;
	}

	@Override
	public HashMap<UUID, Float> getTopClans(PlaceholderTop top) {

		return null;
	}

	@Override
	public void sort(List<ClanData> clans, PlaceholderTop top) {

		
	}

	@Override
	public double getClanKDR(UUID clanUUID) {

		return 0;
	}

	@Override
	public boolean resetClanKDR(ClanData clan) {

		return false;
	}

	@Override
	public boolean resetClanKDR(UUID clanUUID) {

		return false;
	}

	@Override
	public boolean addExtraChest(UUID clanUUID, int amount, CommandSender sender) {

		return false;
	}

	@Override
	public boolean addSlot(String tag, int amount, CommandSender sender) {

		return false;
	}

	@Override
	public boolean addSlot(UUID clanUUID, int amount, CommandSender sender) {

		return false;
	}

	@Override
	public boolean removeSlot(String tag, int amount, CommandSender sender) {

		return false;
	}

	@Override
	public boolean removeSlot(UUID clanUUID, int amount, CommandSender sender) {

		return false;
	}

	@Override
	public boolean setSlot(String tag, int amount, CommandSender sender) {

		return false;
	}

	@Override
	public boolean setSlot(UUID clanUUID, int amount, CommandSender sender) {

		return false;
	}

	@Override
	public boolean canMemberJoin(UUID clanUUID) {

		return false;
	}

	@Override
	public boolean hasClanModerationOnline(UUID clanUUID) {

		return false;
	}

	@Override
	public String parseText(UUID player, String text) {

		return null;
	}

	@Override
	public List<ClanData> getRivalries(UUID clanUUID) {

		return null;
	}

	@Override
	public List<ClanData> getAlliances(UUID clanUUID) {

		return null;
	}

	@Override
	public boolean tryChangeModtag(Player player, String tag) {

		return false;
	}

	@Override
	public boolean tryChangeDesc(Player player, String desc) {

		return false;
	}

	@Override
	public boolean tryCreateHome(Player player, String name) {

		return false;
	}

	@Override
	public boolean tryCreateClan(Player player, String tag) {

		return false;
	}

	@Override
	public boolean hasAddonEnabled(String name) {

		return false;
	}

	@Override
	public boolean hasExtensionEnabled(String name) {

		return false;
	}

	@Override
	public boolean toggleGlobalFF(CommandSender player) {

		return false;
	}

	@Override
	public boolean isGlobalFF() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
