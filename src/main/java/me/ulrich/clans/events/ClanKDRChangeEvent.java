package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanKDRChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final String clanTag;
	private final double kdr;
	private final int kills;
	private final int deaths;
	private final String message;

    public ClanKDRChangeEvent(UUID clanID, String clanTag, double kdr, int kills, int deaths, String message) {

    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.kdr = kdr;
    	this.kills = kills;
    	this.deaths = deaths;
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

	public String getClanTag() {
		return clanTag;
	}


	public double getKdr() {
		return kdr;
	}

	public int getKills() {
		return kills;
	}


	public int getDeaths() {
		return deaths;
	}



	public String getMessage() {
		return message;
	}

}
