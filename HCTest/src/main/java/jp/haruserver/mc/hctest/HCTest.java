package jp.haruserver.mc.hctest;

import org.bukkit.plugin.java.JavaPlugin;

import jp.haruserver.mc.hctest.commands.CommandExecuter;
import jp.haruserver.mc.hctest.customitems.MachtElytra;

public class HCTest extends JavaPlugin{
	public void onLoad(){

	}

	public void onEnable() {
		MachtElytra.init();
		CommandExecuter CommandExecuter = new CommandExecuter();
		getCommand("hctest").setExecutor(CommandExecuter);
		getCommand("hctest2").setExecutor(CommandExecuter);
	}

	public void onDisable() {

	}
}
