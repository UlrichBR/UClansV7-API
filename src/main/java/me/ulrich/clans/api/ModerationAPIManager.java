package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ModerationData;
import me.ulrich.clans.interfaces.ModAPI;

public class ModerationAPIManager implements ModAPI {


	public ModerationAPIManager(Clans clans) {}

	@Override
	public Optional<ModerationData> getLeaderRole() {
		return Optional.empty();
	}

	@Override
	public Optional<ModerationData> getFirstRoleId() {
		return Optional.empty();
	}

	@Override
	public HashMap<String, HashMap<String, Boolean>> getClanModeration(UUID clanUUID) {
		return null;
	}

	@Override
	public boolean playerHasPermission(UUID playerUUID, String key) {
		return false;
	}

	@Override
	public Optional<ModerationData> getPlayerRole(UUID playerUUID) {
		return Optional.empty();
	}

	@Override
	public Optional<ModerationData> getPlayerNextRole(UUID playerUUID) {
		return Optional.empty();
	}

	@Override
	public Optional<ModerationData> getPlayerPreviousRole(UUID playerUUID) {
		return Optional.empty();
	}

	@Override
	public HashMap<String, ModerationData> getDefaultModerationData() {
		return null;
	}

	@Override
	public HashMap<UUID, HashMap<String, HashMap<String, Boolean>>> getModerationData() {
		return null;
	}
	
	@Override
	public HashMap<String, HashMap<String, Boolean>> syncClanModeration(UUID clanUUID) {
		return null;
	}

}
