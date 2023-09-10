package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanCreateEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private final UUID sender;
	private final UUID clanID;
	private final String tag;
	
    public ClanCreateEvent(UUID sender, UUID clanID, String tag) {
    	this.sender = sender;
    	this.clanID = clanID;
    	this.tag = tag;

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

	public UUID getSender() {
		return sender;
	}

	public String getTag() {
		return tag;
	}

	public UUID getClanID() {
		return clanID;
	}





}
