package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;

import org.bukkit.command.CommandSender;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.CommandData;
import me.ulrich.clans.data.CommandData_actionbar;
import me.ulrich.clans.data.CommandData_disable;
import me.ulrich.clans.data.CommandData_show;
import me.ulrich.clans.data.CommandData_sound;
import me.ulrich.clans.data.CommandData_title;
import me.ulrich.clans.data.ClanEnum.MsgUsage;
import me.ulrich.clans.interfaces.ClansCommand;
import me.ulrich.clans.interfaces.CommandAPI;

public class CommandAPIManager implements CommandAPI {


	public CommandAPIManager(Clans clans) {}
	
	@Override
	public HashMap<String, CommandData> getClanCommander() {
		return null;
	}

	@Override
	public HashMap<String, CommandData> getUClanCommander() {
		return null;
	}
	
	@Override
	public void unRegisterCommand(String command) {}
	
	@Override
	public void registerCommand(String alias, ClansCommand command) {}

	@Override
	public void insertCommand(String command, String permission, String alias, double value, int cooldown, CommandData_show data,CommandData_title title, CommandData_actionbar actionbar, CommandData_sound sound, HashMap<String, CommandData_show> subcommands, CommandData_disable disable) {}
	
	@Override
	public HashMap<String, String> getCommandAliases(){
		return null;
	}
	
	@Override
	public HashMap<String, String> getMainCommandAliases(){
		return null;
	}
	
	@Override
	public String replaceMainCmd(String string) {
		return null;
	}
	
	@Override
	public String replaceCmd(String string) {
		return null;
	}
	
	@Override
	public void showHelpSubmessage(CommandSender sender, CommandData commander) {}
	
	@Override
	public boolean findAliases(String sub, String alias) {
		return false;
	}
	
	@Override
	public String findReturnAliases(String sub) {
		return null;
	}
	
	@Override
	public String findReturnMain(String sub) {
		return null;
	}
	
	@Override
	public String findAliasesByValue(String sub) {
		return null;
	}
	
	@Override 
	public void sendCommandJson(CommandSender player, CommandData comander, MsgUsage key, List<String> data) {}
	
	@Override
	public void sendSubCommandJson(CommandSender player, CommandData comander, String sub, MsgUsage key, List<String> data) {}

}
