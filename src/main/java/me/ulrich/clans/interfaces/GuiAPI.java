package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.PaginatedGui;
import me.ulrich.clans.data.GuiData;

public interface GuiAPI {

	HashMap<String, GuiData> getInsertGui();

	List<Player> getOpenedGuiPlayers();

	void closeAllOpened();

	void insertItens(Gui gui, String string, String string2, Player player);

	void insertItens(PaginatedGui gui, String string, String string2, Player player);

	void close(Player player);

}
