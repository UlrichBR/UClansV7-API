package me.ulrich.clans.data;

import org.bukkit.Location;

public class MapData {

	private String borderColor;
	private double borderOpacity;
	private String fillColor;
	private String finalDescription;
	private double fillOpacity;
	private Object[] objects;
	private String markName;
	private Location loc1;
	private Location loc2;

	public MapData(String markName, Location loc1, Location loc2, String borderColor, double borderOpacity, String fillColor, double fillOpacity, String finalDescription, Object... objects) {
		this.setMarkName(markName);
		this.setBorderColor(borderColor);
		this.setBorderOpacity(borderOpacity);
		this.setFillColor(fillColor);
		this.setFillOpacity(fillOpacity);
		this.setFinalDescription(finalDescription);
		this.setObjects(objects);
		this.setLoc1(loc1);
		this.setLoc2(loc2);
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public double getBorderOpacity() {
		return borderOpacity;
	}

	public void setBorderOpacity(double borderOpacity) {
		this.borderOpacity = borderOpacity;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getFinalDescription() {
		return finalDescription;
	}

	public void setFinalDescription(String finalDescription) {
		this.finalDescription = finalDescription;
	}

	public double getFillOpacity() {
		return fillOpacity;
	}

	public void setFillOpacity(double fillOpacity) {
		this.fillOpacity = fillOpacity;
	}

	public Object[] getObjects() {
		return objects;
	}

	public void setObjects(Object[] objects) {
		this.objects = objects;
	}

	public String getMarkName() {
		return markName;
	}

	public void setMarkName(String markName) {
		this.markName = markName;
	}

	public Location getLoc1() {
		return loc1;
	}

	public void setLoc1(Location loc1) {
		this.loc1 = loc1;
	}

	public Location getLoc2() {
		return loc2;
	}

	public void setLoc2(Location loc2) {
		this.loc2 = loc2;
	}
}
