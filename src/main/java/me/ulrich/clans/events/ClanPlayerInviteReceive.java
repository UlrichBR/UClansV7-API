package me.ulrich.clans.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.InviteData;

public class ClanPlayerInviteReceive extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private InviteData inviteData;

    public ClanPlayerInviteReceive(InviteData inviteData) {

    	this.setInviteData(inviteData);

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

	public InviteData getInviteData() {
		return inviteData;
	}

	public void setInviteData(InviteData inviteData) {
		this.inviteData = inviteData;
	}




}
