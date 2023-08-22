package me.ulrich.clans.data;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class RegroupInvite {

	private ClanData clan;
	private Long expires;
	private Player sender;
	private List<Player> deny;
	private List<Player> accepted;
	private Location location;

	public RegroupInvite(ClanData clan, Long expires, Player sender, List<Player> deny, List<Player> accepted, Location location) {
		this.setClan(clan);
		this.setExpires(expires);
		this.setSender(sender);
		this.setDeny(deny);
		this.setAccepted(accepted);
		this.setLocation(location);
	}

	public ClanData getClan() {
		return clan;
	}

	public void setClan(ClanData clan) {
		this.clan = clan;
	}

	public Long getExpires() {
		return expires;
	}

	public void setExpires(Long expires) {
		this.expires = expires;
	}

	public Player getSender() {
		return sender;
	}

	public void setSender(Player sender) {
		this.sender = sender;
	}

	public List<Player> getDeny() {
		return deny;
	}

	public void setDeny(List<Player> deny) {
		this.deny = deny;
	}

	public List<Player> getAccepted() {
		return accepted;
	}

	public void setAccepted(List<Player> accepted) {
		this.accepted = accepted;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
