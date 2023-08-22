package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.command.CommandSender;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.PatentData;
import me.ulrich.clans.data.ClanEnum.ClanActions;
import me.ulrich.clans.data.ClanEnum.RivalAllyCount;

public interface LevelAPI {

	boolean patentExists(String patentID);
	
	Optional<PatentData> getPatent(String patentID);

	Optional<PatentData> getFirstPatent();
	
	Optional<PatentData> getLevelCurrentPatent(int level);
	
	Optional<PatentData> getClanCurrentPatent(UUID clanUUID);
	
	double calcXpForLevel(int level);
	
	int calculateFullTargetXp(int level);
	
	int getPointsNextLevel(ClanData clanData);

	void checkClanLevelUp(ClanData clanData, CommandSender player);
	
	void check_actions(ClanActions action, UUID clanid);
	
	int slotsCount(ClanData clan);
	
	int allyRivalCount(ClanData clan, RivalAllyCount type);
	
	boolean addPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);
	
	boolean removePoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);
	
	boolean setPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason);
	
	HashMap<String, PatentData> getPatentData();
	
}
