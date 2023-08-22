package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Material;

import me.ulrich.clans.data.ClanEnum.LoggerTime;
import me.ulrich.clans.data.LoggerData;

public interface LoggerAPI {

	List<LoggerData> getClanLogger(UUID clanUUID);

	List<LoggerData> getPluginLogger(UUID clanUUID, String plugin);

	boolean removeClanLogger(UUID clanUUID, UUID loggerUUID);

	boolean removeClanPluginLogger(UUID clanUUID, String plugin);

	boolean clearClanLogger(UUID clanUUID);

	boolean addClanLogger(UUID clanUUID, String text, String plugin);
	
	boolean addClanLogger(UUID clanUUID, String text, String plugin, Material material);

	HashMap<UUID, List<LoggerData>> getLoggerData();

	Optional<LoggerData> getPluginLogger(UUID clanUUID, UUID loggerUUID);

	List<LoggerData> getClanLoggerTimed(UUID clanUUID, LoggerTime time);


}
