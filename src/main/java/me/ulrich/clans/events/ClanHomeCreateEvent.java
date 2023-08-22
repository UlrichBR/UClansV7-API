package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanHomeCreateEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final String clanTag;
	private final String homeName;
	private final Location location;
	private final String message;
	private final UUID sender;

    public ClanHomeCreateEvent(UUID sender, UUID clanID, String clanTag, String homeName, Location location, String message) {

    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.homeName = homeName;
    	this.location = location;
    	this.message = message;
    	this.sender = sender;

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

	public String getHomeName() {
		return homeName;
	}

	public Location getLocation() {
		return location;
	}

	public String getMessage() {
		return message;
	}

	public UUID getSender() {
		return sender;
	}


}
