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
import me.ulrich.clans.data.ClanEnum.AllyInviteReturn;
import me.ulrich.clans.data.ClanEnum.ClanActions;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.ClanEnum.RivalAllyCount;
import me.ulrich.clans.data.ClanEnum.RivalRemoveReturn;
import me.ulrich.clans.data.HomesData;
import me.ulrich.clans.data.ModerationData;

public interface ClanAPI {

	void reloadClanData(UUID uuid);
	
	void loadAllClanData();

	void updateClanData(ClanData clan);
	
	boolean tagExists(String tag);

	boolean isRival(UUID player1, UUID player2);

	boolean isAlly(UUID player1, UUID player2);

	boolean promotePlayer(UUID clanUUID, UUID promoted, Optional<ModerationData> next);

	boolean demotePlayer(UUID clanUUID, UUID demoted, Optional<ModerationData> prev);

	boolean kickPlayer(UUID clanUUID, UUID kicked);

	boolean changeLeader(UUID clanUUID, UUID newleader);

	boolean leaveClan(UUID player);
	
	boolean leaveClan(Player player);

	boolean modDesc(ClanData clanData, String newDescription, Player sender);

	boolean modTag(ClanData clanData, String newTag, Player sender);

	boolean toggleGlobalFF(CommandSender player);

	boolean toggleGlobalFF(Player player);

	boolean toggleFF(ClanData clanData);

	boolean isLeader(UUID player);

	boolean deleteHome(UUID clanUUID, String homeName);

	boolean setHome(UUID player, Location location, String name);

	boolean hasHome(UUID player, String homeName);

	Location getHomeLocation(UUID player, String homeName);

	HomesData getHomeData(UUID player, String homeName);

	boolean deleteClan(UUID clanUUID);

	boolean deletePlayerClan(UUID player);

	ClanData createNewClan(Player player, String tag, String desc);

	boolean clanExists(UUID clanUUID);

	ClanData getClan(UUID clanUUID);

	HashMap<UUID, Float> getTopClans(PlaceholderTop checktype);

	boolean resetClanKDR(ClanData clanKDR, CommandSender sender);

	boolean addExtraChest(UUID clanUUID, int amount, CommandSender sender);

	boolean addSlot(String tag, int amount, CommandSender sender);

	boolean removeSlot(String tag, int amount, CommandSender sender);

	boolean setSlot(String tag, int amount, CommandSender sender);

	boolean addPoint(UUID clanid, int amount, CommandSender sender);

	boolean addPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);
	
	boolean removePoint(UUID clanid, int amount, CommandSender sender);
	
	boolean removePoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);

	boolean setPoint(UUID clanid, int amount, CommandSender sender);
	
	boolean setPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);

	int getPointsNextLevel(ClanData clanData);

	void checkClanLevelUp(ClanData clanData, CommandSender player);

	int slotsCount(ClanData clanData);

	int allyRivalCount(ClanData clanData, RivalAllyCount type);

	boolean hasClanModerationOnline(UUID clanUUID);

	String parseText(UUID player, String text);

	boolean hasAddonEnabled(String addonName);

	HashMap<UUID, ClanData> getClanData();

	List<Player> getChatspy();

	boolean isGlobalFF();
	
	RivalRemoveReturn rivalRemoveSend(UUID clanUUID1, UUID clanUUID2, boolean mult);

	void clanChatSendOffline(UUID sender, String message);

	void clanMessageSend(UUID id, String text);

	UUID getClanByTag(String tag);

	void check_actions(ClanActions action, UUID clanid);

	List<ClanData> getRivalries(UUID clanUUID);

	List<ClanData> getAlliances(UUID clanUUID);

	AllyInviteReturn allySend(UUID clanUUID1, UUID clanUUID2, boolean mult);

	boolean deleteBanner(UUID clanid, Player player);

	boolean setBanner(UUID clanid, Player player, ItemStack itemstack);

	double getClanKDR(UUID clanUUID);

	boolean addSlot(UUID clanUUID, int amount, CommandSender sender);

	boolean removeSlot(UUID clanUUID, int amount, CommandSender sender);

	boolean setSlot(UUID clanUUID, int amount, CommandSender sender);

	

	

	

	


}