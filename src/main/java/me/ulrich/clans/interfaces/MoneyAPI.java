package me.ulrich.clans.interfaces;

import org.bukkit.entity.Player;

public interface MoneyAPI {
	
	boolean hasMoney(Player player, int amount);

	boolean addMoney(Player player, int amount);

	boolean withdrawMoney(Player player, int amount);

	boolean isEnabled();



	


}