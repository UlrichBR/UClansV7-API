package me.ulrich.clans.data;

import java.util.UUID;

public class InviteData {

	private UUID id;
	private UUID player;
	private UUID clanID;
	private UUID inviter;
	private long date;

	public InviteData(UUID id, UUID player, UUID clanID, UUID inviter, long date) {
		this.setId(id);
		this.setPlayer(player);
		this.setClanID(clanID);
		this.setInviter(inviter);
		this.setDate(date);
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getPlayer() {
		return player;
	}

	public void setPlayer(UUID player) {
		this.player = player;
	}

	public UUID getClanID() {
		return clanID;
	}

	public void setClanID(UUID clanID) {
		this.clanID = clanID;
	}

	public UUID getInviter() {
		return inviter;
	}

	public void setInviter(UUID inviter) {
		this.inviter = inviter;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}
}

