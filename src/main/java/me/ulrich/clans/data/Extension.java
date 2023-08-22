package me.ulrich.clans.data;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.manager.addon.Serializer;
import me.ulrich.clans.manager.extension.ExtensionClassloader;

public abstract class Extension {

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

	public ExtensionClassloader getClassLoader() {
		return null;
	}

	public void setClassLoader(ExtensionClassloader classLoader) {}

	public File getExtensionDataFolder() {
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

	public HashMap<String, InputStream> getExtensionFiles() {
		return null;
	}

	public void setExtensionFiles(HashMap<String, InputStream> addonFiles) {}

	public String getRequire() {
		return null;
	}

	public void setRequire(String require) {}
}

