package me.ulrich.clans.data;

import java.util.UUID;

public class AllyInvite {

	private UUID clanSender;
	private UUID clanReceiver;
	private Long expires;

	public AllyInvite(UUID clanSender, UUID clanReceiver, Long expires) {
		this.setClanSender(clanSender);
		this.setClanReceiver(clanReceiver);
		this.setExpires(expires);
	}

	public UUID getClanSender() {
		return clanSender;
	}

	public void setClanSender(UUID clanSender) {
		this.clanSender = clanSender;
	}

	public UUID getClanReceiver() {
		return clanReceiver;
	}

	public void setClanReceiver(UUID clanReceiver) {
		this.clanReceiver = clanReceiver;
	}

	public Long getExpires() {
		return expires;
	}

	public void setExpires(Long expires) {
		this.expires = expires;
	}
}
