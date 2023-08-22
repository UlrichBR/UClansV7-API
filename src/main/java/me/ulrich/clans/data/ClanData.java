package me.ulrich.clans.data;

import java.util.List;
import java.util.UUID;

public class ClanData {
	
	private UUID id;
	private String tag;
	private String desc;
	private UUID leader;
	private boolean verified;
	private List<HomesData> home;
	private long creationDate;
	private ClanStats stats;
	private List<UUID> members;
	private List<UUID> onlineMembers;
	private boolean ff;

	private double kdr;
	private String tagNoColor;
	private List<UUID> mods;
	private ClanRivalAlly rivalAlly;
	private int bank;
	private int level;
	private ClanQuestInfoData quest;
	private SettingsData settings;
	private ChestSettingsData chestSettings;
	private String banner;
	private int maxlevel;
	private int extraSlots;
	private List<UUID> banned;
	private String patent;
	private String webhook;
	private long loadCache;

	public ClanData(UUID id, String tag, String desc, UUID leader, boolean verified, List<HomesData> home, long creationDate, ClanStats clanStats, List<UUID> members, List<UUID> onlineMembers, boolean ff, double kdr, String tagNoColor, List<UUID> mods, List<UUID> banned, ClanRivalAlly rivalAlly, int bank, int level, ClanQuestInfoData quest, SettingsData settings, ChestSettingsData chestSettings, String banner, int maxlevel, int extraSlots, String patent, String webhook, long loadCache) {
		this.setId(id);
		this.setTag(tag);
		this.setDesc(desc);
		this.setLeader(leader);
		this.setVerified(verified);
		this.setHome(home);
		this.setCreationDate(creationDate);
		this.setStats(clanStats);
		this.setMembers(members);
		this.setOnlineMembers(onlineMembers);
		this.setFf(ff);
		this.setKdr(kdr);
		this.setTagNoColor(tagNoColor);
		this.setMods(mods);
		this.setRivalAlly(rivalAlly);
		this.setBank(bank);
		this.setLevel(level);
		this.setQuest(quest);
		this.setSettings(settings);
		this.setChestSettings(chestSettings);
		this.setBanner(banner);
		this.setMaxlevel(maxlevel);
		this.setExtraSlots(extraSlots);
		this.setBanned(banned);
		this.setPatent(patent);
		this.setWebhook(webhook);
		this.setLoadCache(loadCache);
		
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public UUID getLeader() {
		return leader;
	}

	public void setLeader(UUID leader) {
		this.leader = leader;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public List<HomesData> getHome() {
		return home;
	}

	public void setHome(List<HomesData> home2) {
		this.home = home2;
	}

	public long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(long creationDate) {
		this.creationDate = creationDate;
	}

	public ClanStats getStats() {
		return stats;
	}

	public void setStats(ClanStats stats) {
		this.stats = stats;
	}

	public List<UUID> getMembers() {
		return members;
	}

	public void setMembers(List<UUID> members) {
		this.members = members;
	}

	public List<UUID> getOnlineMembers() {
		return onlineMembers;
	}

	public void setOnlineMembers(List<UUID> onlineMembers) {
		this.onlineMembers = onlineMembers;
	}

	public boolean isFf() {
		return ff;
	}

	public void setFf(boolean ff) {
		this.ff = ff;
	}

	public double getKdr() {
		return kdr;
	}

	public void setKdr(double kdr) {
		this.kdr = kdr;
	}

	public String getTagNoColor() {
		return tagNoColor;
	}

	public void setTagNoColor(String tagNoColor) {
		this.tagNoColor = tagNoColor;
	}

	public List<UUID> getMods() {
		return mods;
	}

	public void setMods(List<UUID> mods) {
		this.mods = mods;
	}

	public ClanRivalAlly getRivalAlly() {
		return rivalAlly;
	}

	public void setRivalAlly(ClanRivalAlly rivalAlly) {
		this.rivalAlly = rivalAlly;
	}

	public int getBank() {
		return bank;
	}

	public void setBank(int bank) {
		this.bank = bank;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ClanQuestInfoData getQuest() {
		return quest;
	}

	public void setQuest(ClanQuestInfoData quest) {
		this.quest = quest;
	}

	public SettingsData getSettings() {
		return settings;
	}

	public void setSettings(SettingsData settings) {
		this.settings = settings;
	}

	public ChestSettingsData getChestSettings() {
		return chestSettings;
	}

	public void setChestSettings(ChestSettingsData chestSettings) {
		this.chestSettings = chestSettings;
	}

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public int getMaxlevel() {
		return maxlevel;
	}

	public void setMaxlevel(int maxlevel) {
		this.maxlevel = maxlevel;
	}

	public int getExtraSlots() {
		return extraSlots;
	}

	public void setExtraSlots(int extraSlots) {
		this.extraSlots = extraSlots;
	}

	public List<UUID> getBanned() {
		return banned;
	}

	public void setBanned(List<UUID> banned) {
		this.banned = banned;
	}

	public String getPatent() {
		return patent;
	}

	public void setPatent(String patent) {
		this.patent = patent;
	}

	public String getWebhook() {
		return webhook;
	}

	public void setWebhook(String webhook) {
		this.webhook = webhook;
	}

	public long getLoadCache() {
		return loadCache;
	}

	public void setLoadCache(long loadCache) {
		this.loadCache = loadCache;
	}




}
