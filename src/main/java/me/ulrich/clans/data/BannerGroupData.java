package me.ulrich.clans.data;

import java.util.HashMap;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public class BannerGroupData {

	private String id;
	private HashMap<String, ItemStack> banners;
	private HashMap<String, ItemStack> heads;
	private List<String> common;

	public BannerGroupData(String id, HashMap<String, ItemStack> banners, HashMap<String, ItemStack> heads, List<String> common) {
		this.setId(id);
		this.setBanners(banners);
		this.setHeads(heads);
		this.setCommon(common);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HashMap<String, ItemStack> getBanners() {
		return banners;
	}

	public void setBanners(HashMap<String, ItemStack> banners) {
		this.banners = banners;
	}

	public HashMap<String, ItemStack> getHeads() {
		return heads;
	}

	public void setHeads(HashMap<String, ItemStack> heads) {
		this.heads = heads;
	}

	public List<String> getCommon() {
		return common;
	}

	public void setCommon(List<String> common) {
		this.common = common;
	}


	
}
