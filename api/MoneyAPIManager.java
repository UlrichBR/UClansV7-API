package me.ulrich.clans.api;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.MoneyAPI;

public class MoneyAPIManager implements MoneyAPI {
	
	public MoneyAPIManager(Clans plugin) {}

	@Override
	public boolean hasMoney(Player player, int amount) {
		return false;
	}

	@Override
	public boolean addMoney(Player player, int amount) {
		return false;
	}

	@Override
	public boolean withdrawMoney(Player player, int amount) {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}
	
}