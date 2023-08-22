package me.ulrich.clans.data;

public class HomesData {

	private String server;
	private String loc;
	private String name;

	public HomesData(String server, String name, String loc) {
		this.setServer(server);
		this.setName(name);
		this.setLoc(loc);
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
