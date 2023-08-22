package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanLeaderChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final String clanTag;
	private final UUID oldLeader;
	private final UUID newLeader;
	private String message;
	
    public ClanLeaderChangeEvent(UUID clanID, String clanTag, UUID oldLeader, UUID newLeader, String message) {

    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.oldLeader = oldLeader;
    	this.newLeader = newLeader;
    	this.setMessage(message);

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

	public UUID getOldLeader() {
		return oldLeader;
	}

	public UUID getNewLeader() {
		return newLeader;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
