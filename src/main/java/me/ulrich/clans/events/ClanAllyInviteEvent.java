package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanAllyInviteEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clan1;
	private final UUID clan2;
	private final boolean proxied;
	private final String message;
	
    public ClanAllyInviteEvent(UUID clan1, UUID clan2, boolean proxied, String message) {

    	this.clan1 = clan1;
    	this.clan2 = clan2;
    	this.proxied = proxied;
    	this.message = message;

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


	public UUID getClan1() {
		return clan1;
	}

	public UUID getClan2() {
		return clan2;
	}

	public boolean isProxied() {
		return proxied;
	}

	public String getMessage() {
		return message;
	}



}

