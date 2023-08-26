package me.ulrich.clans;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.api.AddonAPIManager;
import me.ulrich.clans.api.BossBarAPIManager;
import me.ulrich.clans.api.ClaimAPIManager;
import me.ulrich.clans.api.ClanAPIManager;
import me.ulrich.clans.api.CommandAPIManager;
import me.ulrich.clans.api.DiscordAPIManager;
import me.ulrich.clans.api.HologramAPIManager;
import me.ulrich.clans.api.HooksAPIManager;
import me.ulrich.clans.api.LevelAPIManager;
import me.ulrich.clans.api.LibAPIManager;
import me.ulrich.clans.api.LoggerAPIManager;
import me.ulrich.clans.api.ModerationAPIManager;
import me.ulrich.clans.api.MoneyAPIManager;
import me.ulrich.clans.api.PlayerAPIManager;
import me.ulrich.clans.api.RegionAPIManager;
import me.ulrich.clans.api.SyncAPIManager;
import me.ulrich.clans.data.Addon;
import me.ulrich.clans.data.Extension;
import me.ulrich.clans.interfaces.UClans;

public final class Clans extends JavaPlugin implements UClans{

	//addon usage
	private HashMap<Addon, Boolean> addonEnabledList = new HashMap<Addon, Boolean>();
	private HashMap<Extension, Boolean> extensionEnabledList = new HashMap<Extension, Boolean>();

	private final ClanAPIManager ClanAPI;
	private final PlayerAPIManager PlayerAPI;
	private final MoneyAPIManager MoneyAPI;
	private final HooksAPIManager HooksAPI;
	private final BossBarAPIManager BossBarAPI;
	private final LibAPIManager libAPI;
	private final AddonAPIManager AddonAPI;
	private final ModerationAPIManager modAPI;
	private final LevelAPIManager levelAPI;
	private final CommandAPIManager commandAPI;
	private final LoggerAPIManager loggerAPI;
	private final DiscordAPIManager discordAPI;
	private final SyncAPIManager syncAPI;
	private final RegionAPIManager regionAPI;
	private final ClaimAPIManager claimAPI;
	private final HologramAPIManager hologramAPI;

	public Clans() {
		this.ClanAPI = new ClanAPIManager(this);
		this.PlayerAPI = new PlayerAPIManager(this);
		this.MoneyAPI = new MoneyAPIManager(this);
		this.HooksAPI = new HooksAPIManager(this);
		this.BossBarAPI = new BossBarAPIManager(this);
		this.AddonAPI = new AddonAPIManager(this);
		this.libAPI = new LibAPIManager(this);
		this.modAPI = new ModerationAPIManager(this);
		this.levelAPI = new LevelAPIManager(this);
		this.commandAPI = new CommandAPIManager(this);
		this.loggerAPI = new LoggerAPIManager(this);
		this.discordAPI = new DiscordAPIManager(this);
		this.syncAPI = new SyncAPIManager(this);
		this.regionAPI = new RegionAPIManager(this);
		this.claimAPI = new ClaimAPIManager(this);
		this.hologramAPI = new HologramAPIManager(this);


	}
	
	@Override
	public JavaPlugin getPlugin() {
		return null;
	}

	@Override
	public ClanAPIManager getClanAPI() {
		return null;
	}

	@Override
	public PlayerAPIManager getPlayerAPI() {
		return null;
	}

	@Override
	public LibAPIManager getLibAPI() {
		return null;
	}
	
	@Override
	public MoneyAPIManager getMoneyAPI() {
		return null;
	}

	@Override
	public HooksAPIManager getHooksAPI() {
		return null;
	}

	@Override
	public BossBarAPIManager getBossBarAPI() {
		return null;
	}
	
	@Override
	public AddonAPIManager getAddonAPI() {
		return null;
	}
	
	public HashMap<Addon, Boolean> getAddonEnabledList() {
		return null;
	}

	public HashMap<Extension, Boolean> getExtensionEnabledList() {
		return null;
	}

	@Override
	public void loadAddons() {}

	@Override
	public void startTasks() {}

	@Override
	public void registerEvents() {}

	@Override
	public LevelAPIManager getLevelAPI() {
		return null;
	}

	@Override
	public ModerationAPIManager getModAPI() {
		return null;
	}

	public boolean isUseGUI() {
		return false;
	}

	public CommandAPIManager getCommandAPI() {
		return null;
	}
	
	public LoggerAPIManager getLoggerAPI() {
		return null;
	}
	public DiscordAPIManager getDiscordAPI() {
		return null;
	}

	public SyncAPIManager getSyncAPI() {
		return null;
	}
	public RegionAPIManager getRegionAPI() {
		return null;
	}
	
	public ClaimAPIManager getClaimAPI() {
		return null;
	}

	@Override
	public HologramAPIManager getHologramAPI() {
		return null;
	}

	@Override
	public void loadExtensions() {		
	}
}
