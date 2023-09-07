package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.Optional;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.github.Anon8281.universalScheduler.scheduling.schedulers.TaskScheduler;
import com.github.Anon8281.universalScheduler.scheduling.tasks.MyScheduledTask;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanEnum.TranslatableKey;
import me.ulrich.clans.interfaces.LibAPI;
import net.kyori.adventure.platform.bukkit.BukkitAudiences;

public class LibAPIManager implements LibAPI {


	public LibAPIManager(Clans clans) {}
	
	@Override
	public BukkitAudiences getAdventure() {
		return null;
	}
	
	@Override
	public boolean isUseGUI() {
		return false;
	}
	
	@Override
	public String getPluginTag() {
		return null;
	}
	
	@Override
	public void sendTitle(Player p, String msg, int fadeIn, int stay, int fadeOut) {}
	
	@Override
	public void sendSubTitle(Player p, String msg, int fadeIn, int stay, int fadeOut) {}
	
	@Override
	public void sendTitleSubTitle(Player p, String msg, String msg2, int fadeIn, int stay, int fadeOut) {}
	
	@Override
	public void sendActionBar(Player p, String message) {}
	
	public Clans getPlugin() {
		return null;
	}

	@Override
	public String translate(TranslatableKey trans, String object, String... args) {
		return null;
	}
	
	@Override
	@Deprecated
	public String translateOutReference(String key, String object, String... args) {
		return null;
	}

	@Override
	public boolean isTaskInitialized() {
		
		return false;
	}

	@Override
	public boolean hasBossbarTask(UUID playerUUID) {
		
		return false;
	}

	@Override
	public Optional<MyScheduledTask> getBossbarTask(UUID playerUUID) {
		
		return Optional.empty();
	}

	@Override
	public boolean stopBossbarTask(UUID playerUUID) {
		
		return false;
	}

	@Override
	public Optional<MyScheduledTask> createBossbarTask(UUID playerUUID, MyScheduledTask task) {
		
		return Optional.empty();
	}

	@Override
	public boolean hasLibTask(UUID playerUUID) {
		
		return false;
	}

	@Override
	public Optional<MyScheduledTask> getLibTask(UUID playerUUID) {
		
		return Optional.empty();
	}

	@Override
	public boolean stopLibTask(UUID playerUUID) {
		
		return false;
	}

	@Override
	public Optional<MyScheduledTask> createLibTask(UUID playerUUID, MyScheduledTask task) {
		
		return Optional.empty();
	}

	@Override
	public boolean isFolia() {
		
		return false;
	}

	@Override
	public TaskScheduler getScheduler() {
		
		return null;
	}

	@Override
	public HashMap<UUID, MyScheduledTask> getBossbarTasks() {
		
		return null;
	}

	@Override
	public HashMap<UUID, MyScheduledTask> getLibTasks() {
		
		return null;
	}

}
