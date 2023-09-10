package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanEnum.ClanActions;

public class ClanPlayerRoleChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private final UUID player;
	private final UUID clanID;
	private final ClanActions action;

    public ClanPlayerRoleChangeEvent(UUID player, UUID clanID, ClanActions action) {
    	this.player = player;
    	this.clanID = clanID;
    	this.action = action;

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


	public ClanActions getAction() {
		return action;
	}





}
