package me.ulrich.clans.interfaces;

import java.util.List;

import org.bukkit.entity.Player;

import me.ulrich.clans.api.SyncAPIManager.DebugType;
import me.ulrich.clans.data.ClanEnum.RedisType;

public interface SyncAPI {

	boolean syncEnabled();

	void newSync(RedisType type, String string);

	void serverConnector(Player player, String server);

	List<String> getProxyedPlayers();

	void setProxyedPlayers(List<String> proxyedPlayers);

	void debugMessage(DebugType type, String message);


}
