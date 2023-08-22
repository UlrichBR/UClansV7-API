package me.ulrich.clans.data;

public class ClanQuestInfoData {

	private int points;
	private int finished;

	public ClanQuestInfoData(int points, int finished) {
		this.setPoints(points);
		this.setFinished(finished);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getFinished() {
		return finished;
	}

	public void setFinished(int finished) {
		this.finished = finished;
	}
}
