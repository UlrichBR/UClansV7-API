package me.ulrich.clans.data;

import java.util.List;

public class PatentData {

	private String id;
	private String name;
	private int requiredlevel;
	private List<String> rewards;
	private boolean rewardsOnlyOnce;
	private List<String> rewardsDisabledWorld;

	public PatentData(String id, String name, int requiredlevel, List<String> rewards, boolean rewardsOnlyOnce, List<String> rewardsDisabledWorld) {
		this.setId(id);
		this.setName(name);
		this.setRequiredlevel(requiredlevel);
		this.setRewards(rewards);
		this.setRewardsOnlyOnce(rewardsOnlyOnce);
		this.setRewardsDisabledWorld(rewardsDisabledWorld);
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

	public int getRequiredlevel() {
		return requiredlevel;
	}

	public void setRequiredlevel(int requiredlevel) {
		this.requiredlevel = requiredlevel;
	}

	public List<String> getRewards() {
		return rewards;
	}

	public void setRewards(List<String> rewards) {
		this.rewards = rewards;
	}

	public boolean isRewardsOnlyOnce() {
		return rewardsOnlyOnce;
	}

	public void setRewardsOnlyOnce(boolean rewardsOnlyOnce) {
		this.rewardsOnlyOnce = rewardsOnlyOnce;
	}

	public List<String> getRewardsDisabledWorld() {
		return rewardsDisabledWorld;
	}

	public void setRewardsDisabledWorld(List<String> rewardsDisabledWorld) {
		this.rewardsDisabledWorld = rewardsDisabledWorld;
	}
}
