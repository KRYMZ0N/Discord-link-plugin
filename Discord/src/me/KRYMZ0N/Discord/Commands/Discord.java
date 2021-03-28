package me.KRYMZ0N.Discord.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.KRYMZ0N.Discord.Main;
import me.KRYMZ0N.Discord.utils.Utils;

public class Discord implements CommandExecutor {
	
	private Main plugin;
	
	public Discord(me.KRYMZ0N.Discord.Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("Discord").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//return statement
		if (!(sender instanceof Player)) {
			
			sender.sendMessage(Utils.chat("&4this Command is meant to be executed by players only!"));
			return true;
		}
		Player p = (Player) sender;
		if (p.hasPermission("Discord.use")) {
			p.sendMessage(Utils.chat("&6Join the Discord! &8https://discord.gg/UJgdqV93SU"));
			return true;
		} else {
			p.sendMessage(Utils.chat("&4Sorry, you do not have permission to execute this command!"));
		}
		return false;
	}
}
