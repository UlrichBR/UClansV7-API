package me.ulrich.clans.data;

import java.util.UUID;

public class OnlineData {

	private UUID playerUUID;
	private String playerName;
	private String server;

	public OnlineData(UUID playerUUID, String playerName, String server) {
		this.setPlayerUUID(playerUUID);
		this.setPlayerName(playerName);
		this.setServer(server);
	}

	public UUID getPlayerUUID() {
		return playerUUID;
	}

	public void setPlayerUUID(UUID playerUUID) {
		this.playerUUID = playerUUID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}
}
