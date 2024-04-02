package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.github.Anon8281.universalScheduler.scheduling.schedulers.TaskScheduler;
import com.github.Anon8281.universalScheduler.scheduling.tasks.MyScheduledTask;

import me.ulrich.clans.data.ClanEnum.TranslatableKey;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public interface LibAPI {

	void resetTitle(Player p);
	
	void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut);

	void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut);

	void sendActionBar(Player p, String message);

	String getPluginTag();
	
	BukkitAudiences getAdventure();

	boolean isUseGUI();

	String translate(TranslatableKey trans, String object, String... args);

	String translateOutReference(String key, String object, String... args);
	
	boolean isTaskInitialized();
	
	boolean hasBossbarTask(UUID playerUUID);
	
	Optional<MyScheduledTask> getBossbarTask(UUID playerUUID);
	
	boolean stopBossbarTask(UUID playerUUID);
	
	Optional<MyScheduledTask> createBossbarTask(UUID playerUUID, MyScheduledTask task);
	
	boolean hasLibTask(UUID playerUUID);
	
	Optional<MyScheduledTask> getLibTask(UUID playerUUID);
	
	boolean stopLibTask(UUID playerUUID);
	
	Optional<MyScheduledTask> createLibTask(UUID playerUUID, MyScheduledTask task);
	
	boolean isFolia();
	
	TaskScheduler getScheduler();
	
	HashMap<UUID, MyScheduledTask> getBossbarTasks();
	
	HashMap<UUID, MyScheduledTask> getLibTasks();

	
	
}
