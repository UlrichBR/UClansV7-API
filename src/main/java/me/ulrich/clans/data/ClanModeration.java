package me.ulrich.clans.data;

import java.util.HashMap;
import java.util.UUID;

public class ClanModeration {

	private UUID clanUUID;
	private HashMap<String, ClanModeration_permissions> permissions;

	public ClanModeration(UUID clanUUID, HashMap<String, ClanModeration_permissions> permissions) {
		this.setClanUUID(clanUUID);
		this.setPermissions(permissions);
	}

	public UUID getClanUUID() {
		return clanUUID;
	}

	public void setClanUUID(UUID clanUUID) {
		this.clanUUID = clanUUID;
	}

	public HashMap<String, ClanModeration_permissions> getPermissions() {
		return permissions;
	}

	public void setPermissions(HashMap<String, ClanModeration_permissions> permissions) {
		this.permissions = permissions;
	}
}
