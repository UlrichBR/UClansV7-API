package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanExtraChestEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final int total;
	private final CommandSender sender;

    public ClanExtraChestEvent(UUID clanID, int total, CommandSender sender) {

    	this.clanID = clanID;
    	this.total = total;
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

	public int getTotal() {
		return total;
	}

	public CommandSender getSender() {
		return sender;
	}




}
