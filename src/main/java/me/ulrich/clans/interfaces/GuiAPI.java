package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import me.ulrich.clans.data.GuiData;

public interface GuiAPI {

	HashMap<String, GuiData> getInsertGui();

	List<Player> getOpenedGuiPlayers();

	void closeAllOpened();

}
