package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanVerifyChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final String clanTag;
	private final boolean status;

    public ClanVerifyChangeEvent(UUID clanID, String clanTag, boolean status) {

    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.status = status;

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


	public String getClanTag() {
		return clanTag;
	}

	public boolean isStatus() {
		return status;
	}



}
