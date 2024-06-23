package me.ulrich.clans.interfaces;

import java.util.Optional;

import org.bukkit.entity.Player;

public interface MoneyImplement {
	
	@Deprecated
	boolean hasMoney(Player player, int amount);
	@Deprecated
	boolean addMoney(Player player, int amount);
	@Deprecated
	boolean withdrawMoney(Player player, int amount);
	@Deprecated
	int getMoney(Player player);
	
	boolean hasMoney(Player player, double amount);

	boolean addMoney(Player player, double amount);

	boolean withdrawMoney(Player player, double amount);

	double getMoney(Player player, boolean inDouble);
	
	boolean isInternal();
	
	Optional<String> getPluginVersion();
	
	Optional<String> getPluginName();


}
