package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanWarStartEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanSender;
	private final UUID clanReceiver;
	private final String arenaName;
	private final String kitName;
	private final int maxPlayers;

    public ClanWarStartEvent(UUID clanSender, UUID clanReceiver, String arenaName, String kitName, int maxPlayers) {

    	this.clanSender = clanSender;
    	this.clanReceiver = clanReceiver;
    	this.arenaName = arenaName;
    	this.kitName = kitName;
    	this.maxPlayers = maxPlayers;

    }
    
	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
	
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

	public UUID getClanSender() {
		return clanSender;
	}

	public UUID getClanReceiver() {
		return clanReceiver;
	}

	public String getArenaName() {
		return arenaName;
	}

	public String getKitName() {
		return kitName;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}



}
