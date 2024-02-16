package me.ulrich.clans.interfaces;

import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.api.SyncAPIManager.DebugType;
import me.ulrich.clans.data.OnlineData;
import me.ulrich.clans.data.ClanEnum.RedisType;

public interface SyncAPI {

	boolean syncEnabled();

	void newSync(RedisType type, String string);

	void serverConnector(Player player, String server);

	void debugMessage(DebugType type, String message);

	void clearOnlineData();
	
	Optional<OnlineData> getOnlineData(UUID playerUUID);
	
	Optional<OnlineData> getOnlineData(String playerNickname);
	
	boolean addOnlineData(UUID playerUUID, String nickname, String server);
	
	boolean removeOnlineData(UUID playerUUID);
	
	void solveProxiedPlayers(String jsonArray);

}
