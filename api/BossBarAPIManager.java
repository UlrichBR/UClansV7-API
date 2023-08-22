package me.ulrich.clans.api;

import java.util.List;
import java.util.UUID;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.interfaces.BossBarAPI;
import net.kyori.adventure.bossbar.BossBar;

public class BossBarAPIManager implements BossBarAPI {


	public BossBarAPIManager(Clans clans) {}
	
	@Override
	public void customBossBar(Player player, BossBar.Color barcolor, BossBar.Overlay barstyle, List<BossBar.Flag> flags, String message, int seconds, boolean animated, List<String> data) {}

	
	@Override
	public void removeAllBar(UUID uuid) {}
}
