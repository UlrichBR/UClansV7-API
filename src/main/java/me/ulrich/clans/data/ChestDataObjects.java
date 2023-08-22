package me.ulrich.clans.data;

import java.util.Objects;


public class ChestDataObjects {

	private int slot;
	private String item;
	private String id;
	private int page;

	public ChestDataObjects(String id, int slot, int page, String item) {
		this.setId(id);
		this.setSlot(slot);
		this.setItem(item);
		this.setPage(page);
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChestDataObjects bag = (ChestDataObjects) o;
        return Objects.equals(id, bag.id) && Objects.equals(item, bag.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ChestDataObjects{" +
                "id=" + id +
                ", slot='" + slot + '\'' +
                ", item='" + item + '\'' +
                ", page='" + page + '\'' +
                '}';
    }
}
