package me.ulrich.clans.data;

import java.util.List;

public class PaginationGui {

	private String id;
	private String invName;
	private int invRows;
	private List<GuiItemStack> items;
	private String soundOpen;
	private int maxItems;

	public PaginationGui(String id, String invName, int invRows, String soundOpen, int maxItems, List<GuiItemStack> items) {
		this.setId(id);
		this.setInvName(invName);
		this.setInvRows(invRows);
		this.setItems(items);
		this.setSoundOpen(soundOpen);
		this.setMaxItems(maxItems);
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

	public int getMaxItems() {
		return maxItems;
	}

	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}
}
