package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class ClanBannerChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

	private final UUID clanID;
	private final String clanTag;
	private final ItemStack banner;
	private final String message;

    public ClanBannerChangeEvent(UUID clanID, String clanTag, ItemStack banner, String message) {

    	this.clanID = clanID;
    	this.clanTag = clanTag;
    	this.banner = banner;
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

	public ItemStack getBanner() {
		return banner;
	}

	public String getMessage() {
		return message;
	}


}
