package me.ulrich.clans.api;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanEnum.RedisType;
import me.ulrich.clans.data.OnlineData;
import me.ulrich.clans.interfaces.SyncAPI;

public class SyncAPIManager implements SyncAPI {

	private final Clans plugin;

	public SyncAPIManager(Clans clans) {
		this.plugin = clans;
	}
	
	public enum DebugType {
		SENT, RECEIVED;
	}
	
	@Override
	public boolean syncEnabled() {
		return false;
	}

	@Override
	public void newSync(RedisType type, String string) {

	}
	
	@Override
	public void serverConnector(Player player, String server) {

	}
	
	
	@Override
	public void debugMessage(DebugType type, String message) {
		
	}
	
	public Clans getPlugin() {
		return plugin;
	}

	@Override
	public void clearOnlineData() {
		
	}

	@Override
	public Optional<OnlineData> getOnlineData(UUID playerUUID) {
		return Optional.empty();
	}

	@Override
	public Optional<OnlineData> getOnlineData(String playerNickname) {
		return Optional.empty();
	}

	@Override
	public boolean addOnlineData(UUID playerUUID, String nickname, String server) {
		return false;
	}

	@Override
	public boolean removeOnlineData(UUID playerUUID) {
		return false;
	}

	@Override
	public void solveProxiedPlayers(String jsonArray) {
		
	}

	@Override
	public String getServerName() {
		return null;
	}
}
