package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Material;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.RewardsData;
import me.ulrich.clans.interfaces.RewardsAPI;

public class RewardsAPIManager implements RewardsAPI {

	private final Clans plugin;

	public RewardsAPIManager(Clans clans) {
		this.plugin = clans;
	}

	@Override
	public boolean hasClanRewards(UUID clanUUID) {
		return false;
	}

	@Override
	public List<RewardsData> getClanRewards(UUID clanUUID) {
		return null;
	}

	@Override
	public boolean hasClanCollectedSurprise(UUID clanUUID, int level) {
		return false;
	}

	@Override
	public boolean hasPlayerRewards(UUID playerUUID) {
		return false;
	}

	@Override
	public List<RewardsData> getPlayerRewards(UUID playerUUID) {
		return null;
	}

	@Override
	public boolean playerCollectReward(UUID playerUUID, UUID rewardUUID) {
		return false;
	}

	@Override
	public boolean addClanReward(UUID clanUUID, UUID senderUUID, Optional<String> description, Optional<Material> icon,
			List<String> rewards, Optional<String> complement) {
		return false;
	}

	@Override
	public HashMap<UUID, RewardsData> getRewardsData() {
		return null;
	}

}
