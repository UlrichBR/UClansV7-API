package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Material;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanEnum.LoggerTime;
import me.ulrich.clans.data.LoggerData;
import me.ulrich.clans.interfaces.LoggerAPI;

public class LoggerAPIManager implements LoggerAPI {

	public LoggerAPIManager(Clans clans) {
		
	}
	
	@Override
	public List<LoggerData> getClanLogger(UUID clanUUID) {
		return null;
	}
	
	@Override
	public List<LoggerData> getPluginLogger(UUID clanUUID, String plugin) {
		return null;
	}
	
	@Override
	public boolean removeClanLogger(UUID clanUUID, UUID loggerUUID) {
		return false;
	}
	
	@Override
	public boolean removeClanPluginLogger(UUID clanUUID, String plugin) {
		return false;
	}
	
	@Override
	public boolean clearClanLogger(UUID clanUUID) {
		return false;
	}
	
	@Override
	public boolean addClanLogger(UUID clanUUID, String text, String plugin) {
		return false;
	}
	
	@Override
	public HashMap<UUID, List<LoggerData>> getLoggerData() {
		return null;
	}

	@Override
	public boolean addClanLogger(UUID clanUUID, String text, String plugin, Material material) {
		return false;
	}

	@Override
	public Optional<LoggerData> getPluginLogger(UUID clanUUID, UUID loggerUUID) {
		return Optional.empty();
	}

	@Override
	public List<LoggerData> getClanLoggerTimed(UUID clanUUID, LoggerTime time) {
		return null;
	}
}
