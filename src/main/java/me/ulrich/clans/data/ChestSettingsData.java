package me.ulrich.clans.data;

import java.util.List;

public class ChestSettingsData {

	private int extraChest;
	private List<Integer> lockedPages;

	public ChestSettingsData(int extraChest, List<Integer> lockedPages) {
		this.setExtraChest(extraChest);
		this.setLockedPages(lockedPages);
	}

	public int getExtraChest() {
		return extraChest;
	}

	public void setExtraChest(int extraChest) {
		this.extraChest = extraChest;
	}

	public List<Integer> getLockedPages() {
		return lockedPages;
	}

	public void setLockedPages(List<Integer> lockedPages) {
		this.lockedPages = lockedPages;
	}
}
