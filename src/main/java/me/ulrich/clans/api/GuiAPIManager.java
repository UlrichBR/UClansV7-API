package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.PaginatedGui;
import me.ulrich.clans.Clans;
import me.ulrich.clans.data.GuiData;
import me.ulrich.clans.interfaces.GuiAPI;

public class GuiAPIManager implements GuiAPI {
	
	public GuiAPIManager(Clans clans) {}
	
	@Override
	public HashMap<String, GuiData> getInsertGui() {
		return null;
	}
	
	@Override
	public List<Player> getOpenedGuiPlayers() {
		return null;
	}
	
	@Override
	public void closeAllOpened() {}

	@Override
	public void insertItens(Gui gui, String string, String string2, Player player) {
		
	}

	@Override
	public void insertItens(PaginatedGui gui, String string, String string2, Player player) {
		
	}

	@Override
	public void close(Player player) {
		
	}
}
