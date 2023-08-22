package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanBankChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final String clanTag;
	private final String balance;
	private final String message;

    public ClanBankChangeEvent(UUID clanID, String clanTag, String balance, String message) {

    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.balance = balance;
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

	public String getBalance() {
		return balance;
	}

	public String getMessage() {
		return message;
	}



}
