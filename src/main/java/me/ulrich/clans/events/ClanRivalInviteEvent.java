package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanRivalInviteEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanInvite;
	private final UUID clanReceive;
	private final boolean proxied;
	private final String message;

    public ClanRivalInviteEvent(UUID clanInvite, UUID clanReceive, boolean proxied, String message) {

    	this.clanInvite = clanInvite;
    	this.clanReceive = clanReceive;
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

	public UUID getClanInvite() {
		return clanInvite;
	}

	public UUID getClanReceive() {
		return clanReceive;
	}

	public boolean isProxied() {
		return proxied;
	}

	public String getMessage() {
		return message;
	}




}
