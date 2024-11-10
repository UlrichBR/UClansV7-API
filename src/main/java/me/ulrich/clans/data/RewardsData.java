package me.ulrich.clans.data;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.Material;

public class RewardsData {

	private UUID id;
	private UUID clanUUID;
	private UUID sender;
	private Optional<String> description;
	private List<String> rewards;
	private List<UUID> collectedBy;
	private long date;
	private Optional<Material> icon;
	private Optional<String> complement;

	public RewardsData(UUID id, UUID clanUUID, UUID sender, Optional<String> description, List<String> rewards, List<UUID> collectedBy, Optional<Material> icon, long date, Optional<String> complement) {
		this.setId(id);
		this.setClanUUID(clanUUID);
		this.setSender(sender);
		this.setDescription(description);
		this.setRewards(rewards);
		this.setCollectedBy(collectedBy);
		this.setIcon(icon);
		this.setDate(date);
		this.setComplement(complement);
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getClanUUID() {
		return clanUUID;
	}

	public void setClanUUID(UUID clanUUID) {
		this.clanUUID = clanUUID;
	}

	public UUID getSender() {
		return sender;
	}

	public void setSender(UUID sender) {
		this.sender = sender;
	}



	public List<String> getRewards() {
		return rewards;
	}

	public void setRewards(List<String> rewards) {
		this.rewards = rewards;
	}

	public List<UUID> getCollectedBy() {
		return collectedBy;
	}

	public void setCollectedBy(List<UUID> collectedBy) {
		this.collectedBy = collectedBy;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public Optional<String> getDescription() {
		return description;
	}

	public void setDescription(Optional<String> description) {
		this.description = description;
	}

	public Optional<Material> getIcon() {
		return icon;
	}

	public void setIcon(Optional<Material> icon) {
		this.icon = icon;
	}

	public Optional<String> getComplement() {
		return complement;
	}

	public void setComplement(Optional<String> complement) {
		this.complement = complement;
	}
}
