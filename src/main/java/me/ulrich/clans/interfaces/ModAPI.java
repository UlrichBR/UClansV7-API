package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import me.ulrich.clans.data.ModerationData;

public interface ModAPI {

	Optional<ModerationData> getLeaderRole();
	
	Optional<ModerationData> getFirstRoleId();
	
	HashMap<String, HashMap<String, Boolean>> getClanModeration(UUID clanUUID);
	
	boolean playerHasPermission(UUID playerUUID, String key);
	
	Optional<ModerationData> getPlayerRole(UUID playerUUID);
	
	Optional<ModerationData> getPlayerNextRole(UUID playerUUID);
	
	Optional<ModerationData> getPlayerPreviousRole(UUID playerUUID);
	
	HashMap<String, ModerationData> getDefaultModerationData();
	
	HashMap<UUID, HashMap<String, HashMap<String, Boolean>>> getModerationData();

	HashMap<String, HashMap<String, Boolean>> syncClanModeration(UUID clanUUID);
	
}
