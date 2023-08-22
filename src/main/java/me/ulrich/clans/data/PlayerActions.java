package me.ulrich.clans.data;

public class PlayerActions {

	private int id;
	private String name;
	private String Uui;
	private String returns;

	public PlayerActions(int id, String name, String Uuid, String returns) {
		this.setId(id);
		this.setName(name);
		this.setUui(Uuid);
		this.setReturns(returns);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUui() {
		return Uui;
	}

	public void setUui(String uui) {
		Uui = uui;
	}

	public String getReturns() {
		return returns;
	}

	public void setReturns(String returns) {
		this.returns = returns;
	}
	
}
