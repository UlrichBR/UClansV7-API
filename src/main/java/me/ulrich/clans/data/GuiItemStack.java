package me.ulrich.clans.data;

import java.util.List;

public class GuiItemStack {

	private String id;
	private String itemstack;
	private String skullOwner;
	private String texture;
	private int data;
	private int amount;
	private int slot;
	private String name;
	private List<String> lore;
	private List<String> enchants;
	private List<String> flags;
	private List<String> leftAction;
	private List<String> rightAction;
	private String soundClick;
	private String banner;
	private NbtData nbt;
	private List<Integer> imitate;

	public GuiItemStack(String id, String itemstack, String skullOwner, String texture, int data, int amount, int slot, String name, List<String> lore, List<String> enchants, List<String> flags, List<String> leftAction, List<String> rightAction, String soundClick, String banner, NbtData nbt, List<Integer> imitate) {
		this.setId(id);
		this.setItemstack(itemstack);
		this.setSkullOwner(skullOwner);
		this.setTexture(texture);
		this.setData(data);
		this.setAmount(amount);
		this.setSlot(slot);
		this.setName(name);
		this.setLore(lore);
		this.setEnchants(enchants);
		this.setFlags(flags);
		this.setLeftAction(leftAction);
		this.setRightAction(rightAction);
		this.setSoundClick(soundClick);
		this.setBanner(banner);
		this.setNbt(nbt);
		this.setImitate(imitate);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemstack() {
		return itemstack;
	}

	public void setItemstack(String itemstack) {
		this.itemstack = itemstack;
	}

	public String getSkullOwner() {
		return skullOwner;
	}

	public void setSkullOwner(String skullOwner) {
		this.skullOwner = skullOwner;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLore() {
		return lore;
	}

	public void setLore(List<String> lore) {
		this.lore = lore;
	}

	public List<String> getEnchants() {
		return enchants;
	}

	public void setEnchants(List<String> enchants) {
		this.enchants = enchants;
	}

	public List<String> getFlags() {
		return flags;
	}

	public void setFlags(List<String> flags) {
		this.flags = flags;
	}

	public List<String> getLeftAction() {
		return leftAction;
	}

	public void setLeftAction(List<String> leftAction) {
		this.leftAction = leftAction;
	}

	public List<String> getRightAction() {
		return rightAction;
	}

	public void setRightAction(List<String> rightAction) {
		this.rightAction = rightAction;
	}

	public String getSoundClick() {
		return soundClick;
	}

	public void setSoundClick(String soundClick) {
		this.soundClick = soundClick;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public NbtData getNbt() {
		return nbt;
	}

	public void setNbt(NbtData nbt) {
		this.nbt = nbt;
	}

	public List<Integer> getImitate() {
		return imitate;
	}

	public void setImitate(List<Integer> imitate) {
		this.imitate = imitate;
	}
}
