package me.ulrich.clans.data;

public class ClanStats {

private int kills;
private int deaths;
private int souls;
private int memberJoined;
private int memberLeft;
private int warWin;
private int warLose;
private int tagChanged;
private int memberKicked;

	public ClanStats(int kills, int deaths, int souls, int memberJoined, int memberLeft, int warWin, int warLose, int tagChanged, int memberKicked) {
		this.setKills(kills);
		this.setDeaths(deaths);
		this.setSouls(souls);
		this.setMemberJoined(memberJoined);
		this.setMemberLeft(memberLeft);
		this.setWarWin(warWin);
		this.setWarLose(warLose);
		this.setTagChanged(tagChanged);
		this.setMemberKicked(memberKicked);
		
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getSouls() {
		return souls;
	}

	public void setSouls(int souls) {
		this.souls = souls;
	}

	public int getMemberJoined() {
		return memberJoined;
	}

	public void setMemberJoined(int memberJoined) {
		this.memberJoined = memberJoined;
	}

	public int getMemberLeft() {
		return memberLeft;
	}

	public void setMemberLeft(int memberLeft) {
		this.memberLeft = memberLeft;
	}

	public int getWarWin() {
		return warWin;
	}

	public void setWarWin(int warWin) {
		this.warWin = warWin;
	}

	public int getWarLose() {
		return warLose;
	}

	public void setWarLose(int warLose) {
		this.warLose = warLose;
	}

	public int getTagChanged() {
		return tagChanged;
	}

	public void setTagChanged(int tagChanged) {
		this.tagChanged = tagChanged;
	}

	public int getMemberKicked() {
		return memberKicked;
	}

	public void setMemberKicked(int memberKicked) {
		this.memberKicked = memberKicked;
	}
}
