package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.ScoreboardAPI;
import me.ulrich.clans.interfaces.ScoreboardImplement;
import net.megavex.scoreboardlibrary.api.sidebar.Sidebar;

public class ScoreboardAPIManager implements ScoreboardAPI {

	
	public ScoreboardAPIManager(Clans clans) {}
	
	@Override
	public boolean showScoreboard(Player player, String title, List<String> lines) {
		return false;
	}
	
	@Override
	public void hideScoreboard(Player player) {
		
	}
	
	@Override
	public HashMap<UUID, Sidebar> getBoards() {
		return null;
	}

	@Override
	public Optional<ScoreboardImplement> getPreferentialOrFirstImplement() {
		return Optional.empty();
	}


	@Override
	public HashMap<String, ScoreboardImplement> getImplementedScoreboard() {
		return null;
	}


	@Override
	public boolean addImplementation(String pluginName, ScoreboardImplement region) {
		return false;
	}


	@Override
	public boolean hasPluginImplemented(String pluginName) {
		return false;
	}


	@Override
	public boolean removeImplementation(String pluginName) {
		return false;
	}


	@Override
	public List<String> getImplementationPluginsName() {
		return null;
	}


	@Override
	public Optional<ScoreboardImplement> getScoreboardImplemented(String pluginName) {
		return Optional.empty();
	}


	@Override
	public HashMap<String, ScoreboardImplement> getImplementationPluginsData() {
		return null;
	}






}
