package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanPlayerInvitedEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private final UUID player;
	private final UUID clanID;
	private final String clanTag;
	private final long expires;
	private final boolean proxied;
	private final String message;

    public ClanPlayerInvitedEvent(UUID player, UUID clanID, String clanTag, long expires, boolean proxied, String message) {
    	this.player = player;
    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.expires = expires;
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



	public UUID getClanID() {
		return clanID;
	}

	public UUID getPlayer() {
		return player;
	}

	public String getClanTag() {
		return clanTag;
	}

	public boolean isProxied() {
		return proxied;
	}

	public long getExpires() {
		return expires;
	}

	public String getMessage() {
		return message;
	}


}
