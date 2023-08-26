package me.ulrich.clans.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.loader.Serializer;
import me.ulrich.clans.loader.addon.AddonClassloader;

public abstract class Addon {

	public boolean isEnabled() {
		return false;
	}

	public void setEnabled(boolean enabled) {}

	public JavaPlugin getInstance() {
		return null;
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {}

	public AddonClassloader getClassLoader() {
		return null;
	}

	public void setClassLoader(AddonClassloader classLoader) {}

	public File getAddonDataFolder() {
		return null;
	}

	public void enable(JavaPlugin instance, File addonDataFolder, Serializer dataSerializer, Serializer configSerializer) {}

	protected boolean logThis(Exception e) {
		return false;
	}

	public void disable() {}

	public abstract void onEnable();

	public abstract void onDisable();

	public Serializer getDataSerializer() {
		return null;
	}

	public Serializer getConfigSerializer() {
		return null;
	}

	public String getAuthor() {
		return null;
	}

	public void setAuthor(String author) {}

	public String getVersion() {
		return null;
	}

	public void setVersion(String version) {}

	public HashMap<String, InputStream> getAddonFiles() {
		return null;
	}

	public void setAddonFiles(HashMap<String, InputStream> addonFiles) {}

	public String getRequire() {
		return null;
	}

	public void setRequire(String require) {}
}

