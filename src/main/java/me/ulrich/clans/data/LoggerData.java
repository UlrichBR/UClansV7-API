package me.ulrich.clans.data;

import java.util.UUID;

import org.bukkit.Material;

public class LoggerData {

	private UUID id;
	private UUID clan_id;
	private String text;
	private long date;
	private String plugin;
	private Material material;

	public LoggerData(UUID id, UUID clan_id, String text, long date, String plugin, Material material) {
		this.setId(id);
		this.setClan_id(clan_id);
		this.setText(text);
		this.setDate(date);
		this.setPlugin(plugin);
		this.setMaterial(material);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getClan_id() {
		return clan_id;
	}

	public void setClan_id(UUID clan_id) {
		this.clan_id = clan_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getPlugin() {
		return plugin;
	}

	public void setPlugin(String plugin) {
		this.plugin = plugin;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
}
