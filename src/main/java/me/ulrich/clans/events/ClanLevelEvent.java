package me.ulrich.clans.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ClanLevelEvent extends Event implements Cancellable {

	 private static final HandlerList handlers = new HandlerList();
	 private boolean cancelled;
	private UUID clanUUID;
	private CommandSender sender;
	private boolean changedPatent;
	    
	public ClanLevelEvent(UUID clanUUID, CommandSender sender2, boolean changedPatent) {
		this.setClanUUID(clanUUID);
		this.setSender(sender2);
		this.setChangedPatent(changedPatent);
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


	public CommandSender getSender() {
		return sender;
	}

	public void setSender(CommandSender sender2) {
		this.sender = sender2;
	}

	public boolean isChangedPatent() {
		return changedPatent;
	}

	public void setChangedPatent(boolean changedPatent) {
		this.changedPatent = changedPatent;
	}

	public UUID getClanUUID() {
		return clanUUID;
	}

	public void setClanUUID(UUID clanUUID) {
		this.clanUUID = clanUUID;
	}
}
