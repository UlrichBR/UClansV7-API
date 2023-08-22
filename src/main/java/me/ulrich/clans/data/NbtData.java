package me.ulrich.clans.data;

import java.util.List;

public class NbtData {

	private List<String> string;
	private int model;

	public NbtData(List<String> string, int model) {
		this.setString(string);
		this.setModel(model);
	}

	public List<String> getString() {
		return string;
	}

	public void setString(List<String> string) {
		this.string = string;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}


}
