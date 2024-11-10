package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Material;

import me.ulrich.clans.data.RewardsData;

public interface RewardsAPI {

	boolean hasClanRewards(UUID clanUUID);
	List<RewardsData> getClanRewards(UUID clanUUID);
	boolean hasClanCollectedSurprise(UUID clanUUID, int level);
	boolean hasPlayerRewards(UUID playerUUID);
	List<RewardsData> getPlayerRewards(UUID playerUUID);
	boolean playerCollectReward(UUID playerUUID, UUID rewardUUID);
	boolean addClanReward(UUID clanUUID, UUID senderUUID, Optional<String> description, Optional<Material> icon, List<String> rewards, Optional<String> complement);
	HashMap<UUID, RewardsData> getRewardsData();


}
