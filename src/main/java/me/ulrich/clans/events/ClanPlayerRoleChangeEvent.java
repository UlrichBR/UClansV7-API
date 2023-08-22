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
	private final String clanTag;
	private final ClanActions action;
	private final String message;

    public ClanPlayerRoleChangeEvent(UUID player, UUID clanID, String clanTag, ClanActions action, String message) {
    	this.player = player;
    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.action = action;
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

	public UUID getPlayer() {
		return player;
	}

	public String getClanTag() {
		return clanTag;
	}

	public ClanActions getAction() {
		return action;
	}

	public String getMessage() {
		return message;
	}





}
