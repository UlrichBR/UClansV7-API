package me.ulrich.clans.interfaces;

import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;

import net.kyori.adventure.bossbar.BossBar;

public interface BossBarAPI {

	void customBossBar(Player player, BossBar.Color barcolor, BossBar.Overlay barstyle, List<BossBar.Flag> flags, String message,
			int seconds, boolean animated, List<String> data);

	void removeAllBar(UUID uuid);

}
