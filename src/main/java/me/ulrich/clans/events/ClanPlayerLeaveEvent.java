package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanEnum.PlayerLeaveReaction;

public class ClanPlayerLeaveEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private final UUID player;
	private final UUID clanID;
	private final PlayerLeaveReaction reaction;
	private final UUID sender;

    public ClanPlayerLeaveEvent(UUID player, UUID clanID, PlayerLeaveReaction reaction, UUID sender) {
    	this.player = player;
    	this.clanID = clanID;
    	this.reaction = reaction;
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

	public UUID getPlayer() {
		return player;
	}


	public PlayerLeaveReaction getReaction() {
		return reaction;
	}

	public UUID getSender() {
		return sender;
	}




}
