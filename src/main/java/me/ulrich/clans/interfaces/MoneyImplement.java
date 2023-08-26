package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;

public interface MoneyImplement {
	

	
	boolean hasMoney(Player player, int amount);

	boolean addMoney(Player player, int amount);

	boolean withdrawMoney(Player player, int amount);

	int getMoney(Player player);
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();


}
