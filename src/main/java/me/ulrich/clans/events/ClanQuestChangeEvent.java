package me.ulrich.clans.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanQuestInfoData;

public class ClanQuestChangeEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
	private ClanQuestInfoData guestData;
	private ClanData clanData;
	private Player changer;
    
    public ClanQuestChangeEvent(ClanQuestInfoData questData, ClanData clanData, Player changer) {
    	this.setQuestData(questData);
    	this.setClanData(clanData);
    	this.setChanger(changer);
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

	public ClanQuestInfoData getQuestData() {
		return guestData;
	}

	public void setQuestData(ClanQuestInfoData guestData) {
		this.guestData = guestData;
	}

	public ClanData getClanData() {
		return clanData;
	}

	public void setClanData(ClanData clanData) {
		this.clanData = clanData;
	}

	public Player getChanger() {
		return changer;
	}

	public void setChanger(Player changer) {
		this.changer = changer;
	}
}
