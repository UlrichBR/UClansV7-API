package me.ulrich.clans.data;

import java.util.UUID;

public class RivalRemove {

	private UUID clanSender;
	private UUID clanReceiver;
	private long expires;

	public RivalRemove(UUID clanSender, UUID clanReceiver, long expires) {
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

	public long getExpires() {
		return expires;
	}

	public void setExpires(long expires) {
		this.expires = expires;
	}
}
