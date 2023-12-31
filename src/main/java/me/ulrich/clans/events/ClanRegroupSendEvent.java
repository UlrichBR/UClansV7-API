package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanRegroupSendEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanUUID;
	private UUID senderUUID;
	
    public ClanRegroupSendEvent(UUID clanUUID, UUID senderUUID) {

    	this.clanUUID = clanUUID;
    	this.setSenderUUID(senderUUID);

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

	public UUID getClanUUID() {
		return clanUUID;
	}

	public UUID getSenderUUID() {
		return senderUUID;
	}

	public void setSenderUUID(UUID senderUUID) {
		this.senderUUID = senderUUID;
	}




}
