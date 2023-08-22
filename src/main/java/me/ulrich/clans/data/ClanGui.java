package me.ulrich.clans.data;

import java.util.List;

public class ClanGui {

	private String id;
	private String invName;
	private int invRows;
	private List<GuiItemStack> items;
	private String soundOpen;

	public ClanGui(String id, String invName, int invRows, String soundOpen, List<GuiItemStack> items) {
		this.setId(id);
		this.setInvName(invName);
		this.setInvRows(invRows);
		this.setSoundOpen(soundOpen);
		this.setItems(items);
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvName() {
		return invName;
	}

	public void setInvName(String invName) {
		this.invName = invName;
	}

	public int getInvRows() {
		return invRows;
	}

	public void setInvRows(int invRows) {
		this.invRows = invRows;
	}
	
	public String getSoundOpen() {
		return soundOpen;
	}

	public void setSoundOpen(String soundOpen) {
		this.soundOpen = soundOpen;
	}
	
	public List<GuiItemStack> getItems() {
		return items;
	}

	public void setItems(List<GuiItemStack> items) {
		this.items = items;
	}

}
