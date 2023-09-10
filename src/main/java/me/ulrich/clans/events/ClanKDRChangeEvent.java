package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanKDRChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final double kdr;
	private final int kills;
	private final int deaths;

    public ClanKDRChangeEvent(UUID clanID, double kdr, int kills, int deaths) {

    	this.clanID = clanID;
    	this.kdr = kdr;
    	this.kills = kills;
    	this.deaths = deaths;

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


	public double getKdr() {
		return kdr;
	}

	public int getKills() {
		return kills;
	}


	public int getDeaths() {
		return deaths;
	}


}
