package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.command.CommandSender;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.ClanActions;
import me.ulrich.clans.data.ClanEnum.RivalAllyCount;
import me.ulrich.clans.data.PatentData;
import me.ulrich.clans.interfaces.LevelAPI;

public class LevelAPIManager implements LevelAPI {


	public LevelAPIManager(Clans clans) {}

	@Override
	public boolean patentExists(String patentID) {
		return false;
	}

	@Override
	public Optional<PatentData> getPatent(String patentID) {
		return Optional.empty();
	}

	@Override
	public Optional<PatentData> getFirstPatent() {
		return Optional.empty();
	}

	@Override
	public Optional<PatentData> getLevelCurrentPatent(int level) {
		return Optional.empty();
	}

	@Override
	public Optional<PatentData> getClanCurrentPatent(UUID clanUUID) {
		return Optional.empty();
	}

	@Override
	public double calcXpForLevel(int level) {
		return 0;
	}

	@Override
	public int calculateFullTargetXp(int level) {
		return 0;
	}

	@Override
	public int getPointsNextLevel(ClanData clanData) {
		return 0;
	}

	@Override
	public void checkClanLevelUp(ClanData clanData, CommandSender player) {}

	@Override
	public void check_actions(ClanActions action, UUID clanid) {}

	@Override
	public int slotsCount(ClanData clan) {
		return 0;
	}

	@Override
	public int allyRivalCount(ClanData clan, RivalAllyCount type) {
		return 0;
	}

	@Override
	public boolean addPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason) {
		return false;
	}

	@Override
	public boolean removePoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason) {
		return false;
	}

	@Override
	public boolean setPoint(UUID clanid, int amount, CommandSender sender, StringBuilder reason) {
		return false;
	}

	@Override
	public HashMap<String, PatentData> getPatentData() {
		return null;
	}

}
