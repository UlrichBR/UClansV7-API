package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

import net.megavex.scoreboardlibrary.api.sidebar.Sidebar;

public interface ScoreboardAPI {

	Optional<ScoreboardImplement> getPreferentialOrFirstImplement();

	HashMap<String, ScoreboardImplement> getImplementedScoreboard();

	boolean addImplementation(String pluginName, ScoreboardImplement region);

	boolean hasPluginImplemented(String pluginName);

	boolean removeImplementation(String pluginName);

	List<String> getImplementationPluginsName();
	
	Optional<ScoreboardImplement> getScoreboardImplemented(String pluginName);

	HashMap<String, ScoreboardImplement> getImplementationPluginsData();
	
	boolean showScoreboard(Player player, String title, List<String> lines);

	void hideScoreboard(Player player);
	
	HashMap<UUID, Sidebar> getBoards();
	
}
