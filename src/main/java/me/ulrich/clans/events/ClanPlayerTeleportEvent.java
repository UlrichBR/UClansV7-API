package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanPlayerTeleportEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

    private final UUID playerUUID;
	private final UUID clanID;
	private final String server;
	private final String locationEncoded;

    public ClanPlayerTeleportEvent(UUID playerUUID, UUID clanID, String server, String locationEncoded) {

    	this.playerUUID = playerUUID;
    	this.clanID = clanID;
    	this.server = server;
    	this.locationEncoded = locationEncoded;

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

	public UUID getPlayerUUID() {
		return playerUUID;
	}



	public String getServer() {
		return server;
	}



	public String getLocationEncoded() {
		return locationEncoded;
	}

}
