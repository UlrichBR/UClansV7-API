package me.ulrich.clans.data;

import java.util.List;
import java.util.UUID;

public class ClanRivalAlly {

	private List<UUID> rival;
	private List<UUID> ally;

	public ClanRivalAlly(List<UUID> rival, List<UUID> ally) {
		this.setRival(rival);
		this.setAlly(ally);
	}

	public List<UUID> getRival() {
		return rival;
	}

	public void setRival(List<UUID> rival) {
		this.rival = rival;
	}

	public List<UUID> getAlly() {
		return ally;
	}

	public void setAlly(List<UUID> ally) {
		this.ally = ally;
	}
}
