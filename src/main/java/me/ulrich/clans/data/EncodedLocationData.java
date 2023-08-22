package me.ulrich.clans.data;

public class EncodedLocationData {

	private String server;
	private String world;
	private double x;
	private double y;
	private double z;
	private float yaw;
	private float pitch;

	public EncodedLocationData(String server, String world, double x, double y, double z, float yaw, float pitch) {
		this.setServer(server);
		this.setWorld(world);
		this.setX(x);
		this.setY(y);
		this.setZ(z);
		this.setYaw(yaw);
		this.setPitch(pitch);
		
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	
}
