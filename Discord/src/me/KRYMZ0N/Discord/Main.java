package me.KRYMZ0N.Discord;

import org.bukkit.plugin.java.JavaPlugin;

import me.KRYMZ0N.Discord.Commands.Discord;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new Discord(this);
	}
}
