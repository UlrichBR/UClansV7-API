package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanLeaderChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final UUID oldLeader;
	private final UUID newLeader;
	
    public ClanLeaderChangeEvent(UUID clanID, UUID oldLeader, UUID newLeader) {

    	this.clanID = clanID;
    	this.oldLeader = oldLeader;
    	this.newLeader = newLeader;

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


	public UUID getOldLeader() {
		return oldLeader;
	}

	public UUID getNewLeader() {
		return newLeader;
	}



}
