package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanMessageEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID uuid;
	private final String message;
	private final boolean toBroadcast;
	private final boolean toClan;
	private final boolean toPlayer;

    public ClanMessageEvent(String message, boolean toBroadcast, boolean toClan, boolean toPlayer, UUID uuid) {

    	this.uuid = uuid;
    	this.message = message;
    	this.toBroadcast = toBroadcast;
    	this.toClan = toClan;
    	this.toPlayer = toPlayer;

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

	public String getMessage() {
		return message;
	}


	public boolean isToBroadcast() {
		return toBroadcast;
	}

	public boolean isToClan() {
		return toClan;
	}

	public boolean isToPlayer() {
		return toPlayer;
	}


	public UUID getUuid() {
		return uuid;
	}


}
