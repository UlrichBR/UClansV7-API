package me.ulrich.clans.interfaces;

import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanEnum.TranslatableKey;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public interface LibAPI {

	

	void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut);

	void sendActionBar(Player p, String message);

	String getPluginTag();
	
	BukkitAudiences getAdventure();

	boolean isUseGUI();

	String translate(TranslatableKey trans, String object, String... args);

	String translateOutReference(String key, String object, String... args);
	
}
