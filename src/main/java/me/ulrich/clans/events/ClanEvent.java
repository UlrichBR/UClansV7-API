package me.ulrich.clans.events;

import java.util.List;
import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanUUID;
	private final List<UUID> livePlayers;
	private String eventData;

    public ClanEvent(UUID clanUUID, String eventData, List<UUID> livePlayers) {

    	this.clanUUID = clanUUID;
    	this.eventData = eventData;
    	this.livePlayers = livePlayers;

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


	public List<UUID> getLivePlayers() {
		return livePlayers;
	}

	public UUID getClanUUID() {
		return clanUUID;
	}

	public String getEventData() {
		return eventData;
	}




}
