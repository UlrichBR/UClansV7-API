package me.ulrich.clans.data;

import java.util.HashMap;

public class ModerationData {

	private String id;
	private String name;
	private int priority;
	private HashMap<String, Boolean> permissionList;
	private boolean editable;
	private boolean upgradable;
	private GuiItemsData icon;

	public ModerationData(String id, String name, int priority, HashMap<String, Boolean> permissionList, boolean editable, boolean upgradable, GuiItemsData icon ) {

		this.setId(id);
		this.setName(name);
		this.setPriority(priority);
		this.setPermissionList(permissionList);
		this.setEditable(editable);
		this.setUpgradable(upgradable);
		this.setIcon(icon);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public HashMap<String, Boolean> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(HashMap<String, Boolean> permissionList) {
		this.permissionList = permissionList;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public boolean isUpgradable() {
		return upgradable;
	}

	public void setUpgradable(boolean upgradable) {
		this.upgradable = upgradable;
	}

	public GuiItemsData getIcon() {
		return icon;
	}

	public void setIcon(GuiItemsData icon) {
		this.icon = icon;
	}
}
