package me.ulrich.clans.interfaces;

import java.util.EnumMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.Flag;

public interface ClansCommand {

    boolean execute(final Clans plugin, final CommandSender sender, final Command command, final String label, String[] args, EnumMap<Flag, String> info);

}
