package me.ulrich.clans.data;

import java.util.List;

public class GuiItemsData_fill {

	private List<Integer> slots;
	private boolean top;
	private boolean bottom;
	private boolean all;
	private boolean border;

	public GuiItemsData_fill(List<Integer> slots, boolean top, boolean bottom, boolean all, boolean border) {
		this.setSlots(slots);
		this.setTop(top);
		this.setBottom(bottom);
		this.setAll(all);
		this.setBorder(border);
	}

	public List<Integer> getSlots() {
		return slots;
	}

	public void setSlots(List<Integer> slots) {
		this.slots = slots;
	}

	public boolean isTop() {
		return top;
	}

	public void setTop(boolean top) {
		this.top = top;
	}

	public boolean isBottom() {
		return bottom;
	}

	public void setBottom(boolean bottom) {
		this.bottom = bottom;
	}

	public boolean isAll() {
		return all;
	}

	public void setAll(boolean all) {
		this.all = all;
	}

	public boolean isBorder() {
		return border;
	}

	public void setBorder(boolean border) {
		this.border = border;
	}
}
