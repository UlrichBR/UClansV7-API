package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanEnum.SettingsFlagsAccept;
import me.ulrich.clans.data.ClanEnum.SettingsType;

public class ClanSettingsChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final String clanTag;
	private final SettingsType type;
	private final SettingsFlagsAccept value;
	private final String message;

    public ClanSettingsChangeEvent(UUID clanID, String clanTag, SettingsType type, SettingsFlagsAccept value, String message) {

    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.type = type;
    	this.value = value;
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

	public SettingsType getType() {
		return type;
	}



	public SettingsFlagsAccept getValue() {
		return value;
	}



	public String getMessage() {
		return message;
	}


}
