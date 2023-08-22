package me.ulrich.clans.interfaces;

import java.util.HashMap;
import java.util.List;

import org.bukkit.command.CommandSender;

import me.ulrich.clans.data.ClanEnum.MsgUsage;
import me.ulrich.clans.data.CommandData;
import me.ulrich.clans.data.CommandData_actionbar;
import me.ulrich.clans.data.CommandData_disable;
import me.ulrich.clans.data.CommandData_show;
import me.ulrich.clans.data.CommandData_sound;
import me.ulrich.clans.data.CommandData_title;

public interface CommandAPI {

	HashMap<String, String> getCommandAliases();

	HashMap<String, String> getMainCommandAliases();

	String replaceMainCmd(String string);

	String replaceCmd(String string);

	void showHelpSubmessage(CommandSender sender, CommandData commander);

	boolean findAliases(String sub, String alias);

	String findReturnAliases(String sub);

	String findReturnMain(String sub);

	String findAliasesByValue(String sub);
	
	HashMap<String, CommandData> getClanCommander();

	HashMap<String, CommandData> getUClanCommander();
	
	void unRegisterCommand(String command);

	void insertCommand(String command, String permission, String alias, double value, int cooldown, CommandData_show data,CommandData_title title, CommandData_actionbar actionbar, CommandData_sound sound, HashMap<String, CommandData_show> subcommands, CommandData_disable disable);

	void registerCommand(String alias, ClansCommand command);

	void sendCommandJson(CommandSender player, CommandData comander, MsgUsage key, List<String> data);

	void sendSubCommandJson(CommandSender player, CommandData comander, String sub, MsgUsage key, List<String> data);
	
}
