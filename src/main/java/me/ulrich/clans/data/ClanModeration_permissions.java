package me.ulrich.clans.data;

public class ClanModeration_permissions {

	private String key;
	private boolean value;

	public ClanModeration_permissions(String key, boolean value) {
	
		this.setKey(key);
		this.setValue(value);
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
