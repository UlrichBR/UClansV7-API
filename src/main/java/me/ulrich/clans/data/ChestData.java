package me.ulrich.clans.data;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class ChestData {

	private UUID clanid;
	private HashMap<Integer, List<ChestDataObjects>> listChest;

	public ChestData(UUID clanid, HashMap<Integer, List<ChestDataObjects>> listChest) {
		this.setClanid(clanid);
		this.setListChest(listChest);

	}

	public UUID getClanid() {
		return clanid;
	}

	public void setClanid(UUID clanid) {
		this.clanid = clanid;
	}

	public HashMap<Integer, List<ChestDataObjects>> getListChest() {
		return listChest;
	}

	public void setListChest(HashMap<Integer, List<ChestDataObjects>> listChest) {
		this.listChest = listChest;
	}





}
