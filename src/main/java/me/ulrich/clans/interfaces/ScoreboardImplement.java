package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;

public interface ScoreboardImplement {

	boolean hidePluginScoreboard(Player player);

	boolean showPluginScoreboard(Player player);

	Optional<String> getPluginVersion();

	Optional<String> getPluginName();

	
}
