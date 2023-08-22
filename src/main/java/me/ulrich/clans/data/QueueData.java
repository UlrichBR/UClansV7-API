package me.ulrich.clans.data;

import java.util.UUID;

import me.ulrich.clans.data.ClanEnum.QueueSync;

public class QueueData {

	private QueueSync type;
	private UUID uuid;

	public QueueData(QueueSync type, UUID uuid) {
		this.setType(type);
		this.setUuid(uuid);
	}

	public QueueSync getType() {
		return type;
	}

	public void setType(QueueSync type) {
		this.type = type;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}
